/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Manages the parsing of an InputStream in SSE (Server Sent Events) format.
 * 
 * @param <T> the type that the SSE {@code data} field is deserialized into
 */
/**
 * @param <T>
 */
public final class EventStream<T> implements AutoCloseable {

    private final EventStreamReader reader;
    private final TypeReference<T> typeReference;
    private final ObjectMapper mapper;

    // Internal use only
    public EventStream(InputStream in, TypeReference<T> typeReference, ObjectMapper mapper) {
        this.reader = new EventStreamReader(in);
        this.typeReference = typeReference;
        this.mapper = mapper;
    }

    /**
     * Returns the next message. If another message does not exist returns
     * {@code Optional.empty()}.
     *
     * @return the next message or {@code Optional.empty()} if no more messages
     * @throws IOException
     */
    public Optional<T> next() throws IOException {
        return reader.readMessage() //
                .map(x -> Utils.asType(x, mapper, typeReference));
    }

    /**
     * Reads all events and returns them as a {@code List}. This method calls
     * {@code close()}.
     * 
     * @return list of events
     */
    public List<T> toList() {
        try {
            return stream().collect(Collectors.toList());
        } finally {
            try {
                close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Returns a {@link Stream} of events. Must be closed after use!
     * 
     * @return streamed events
     */
    public Stream<T> stream() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new Iterator<T>() {
            Optional<T> next = null;

            public T next() {
                load();
                if (!next.isPresent()) {
                    throw new NoSuchElementException();
                }
                T v = next.get();
                next = null;
                return v;
            }

            public boolean hasNext() {
                load();
                return next.isPresent();
            }

            private void load() {
                if (next == null) {
                    try {
                        next = EventStream.this.next();
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                }
            }

        }, Spliterator.ORDERED), false).onClose(() -> {
            try {
                EventStream.this.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }

}
