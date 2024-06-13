/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class DeleteBlocklistIdentifierResponse implements com.clerk.backend_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Deleted Object
     */
    private Optional<? extends com.clerk.backend_api.models.components.DeletedObject> deletedObject;

    @JsonCreator
    public DeleteBlocklistIdentifierResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.clerk.backend_api.models.components.DeletedObject> deletedObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(deletedObject, "deletedObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.deletedObject = deletedObject;
    }
    
    public DeleteBlocklistIdentifierResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Deleted Object
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.clerk.backend_api.models.components.DeletedObject> deletedObject() {
        return (Optional<com.clerk.backend_api.models.components.DeletedObject>) deletedObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public DeleteBlocklistIdentifierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DeleteBlocklistIdentifierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DeleteBlocklistIdentifierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Deleted Object
     */
    public DeleteBlocklistIdentifierResponse withDeletedObject(com.clerk.backend_api.models.components.DeletedObject deletedObject) {
        Utils.checkNotNull(deletedObject, "deletedObject");
        this.deletedObject = Optional.ofNullable(deletedObject);
        return this;
    }

    /**
     * Deleted Object
     */
    public DeleteBlocklistIdentifierResponse withDeletedObject(Optional<? extends com.clerk.backend_api.models.components.DeletedObject> deletedObject) {
        Utils.checkNotNull(deletedObject, "deletedObject");
        this.deletedObject = deletedObject;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBlocklistIdentifierResponse other = (DeleteBlocklistIdentifierResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.deletedObject, other.deletedObject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            deletedObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteBlocklistIdentifierResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "deletedObject", deletedObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.clerk.backend_api.models.components.DeletedObject> deletedObject = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Deleted Object
         */
        public Builder deletedObject(com.clerk.backend_api.models.components.DeletedObject deletedObject) {
            Utils.checkNotNull(deletedObject, "deletedObject");
            this.deletedObject = Optional.ofNullable(deletedObject);
            return this;
        }

        /**
         * Deleted Object
         */
        public Builder deletedObject(Optional<? extends com.clerk.backend_api.models.components.DeletedObject> deletedObject) {
            Utils.checkNotNull(deletedObject, "deletedObject");
            this.deletedObject = deletedObject;
            return this;
        }
        
        public DeleteBlocklistIdentifierResponse build() {
            return new DeleteBlocklistIdentifierResponse(
                contentType,
                statusCode,
                rawResponse,
                deletedObject);
        }
    }
}

