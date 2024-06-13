/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class ListOrganizationInvitationsRequestBuilder {

    private String organizationId;
    private Optional<? extends Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "10",
                            new TypeReference<Optional<? extends Long>>() {});
    private Optional<? extends Long> offset = Utils.readDefaultOrConstValue(
                            "offset",
                            "0",
                            new TypeReference<Optional<? extends Long>>() {});
    private Optional<? extends ListOrganizationInvitationsQueryParamStatus> status = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListOrganizationInvitations sdk;

    public ListOrganizationInvitationsRequestBuilder(SDKMethodInterfaces.MethodCallListOrganizationInvitations sdk) {
        this.sdk = sdk;
    }

    public ListOrganizationInvitationsRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }
                
    public ListOrganizationInvitationsRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ListOrganizationInvitationsRequestBuilder limit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ListOrganizationInvitationsRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.of(offset);
        return this;
    }

    public ListOrganizationInvitationsRequestBuilder offset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }
                
    public ListOrganizationInvitationsRequestBuilder status(ListOrganizationInvitationsQueryParamStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.of(status);
        return this;
    }

    public ListOrganizationInvitationsRequestBuilder status(Optional<? extends ListOrganizationInvitationsQueryParamStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ListOrganizationInvitationsResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }
        if (offset == null) {
            offset = _SINGLETON_VALUE_Offset.value();
        }

        return sdk.list(
            organizationId,
            limit,
            offset,
            status);
    }
    
    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. Unlike the {@link #call()} method this method will
     * throw an {@link SDKError} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link SDKError} if HTTP status code >= 300 is encountered
     **/  
    public Stream<ListOrganizationInvitationsResponse> callAsStream() {
        return Utils.stream(() -> Optional.of(call()), x -> {
            if (x.statusCode() >= 300) {
                byte[] body = Utils.toByteArrayAndClose(x.rawResponse().body());
                throw new SDKError(x.rawResponse(), x.statusCode(), x.contentType(), body);
            } else {
                return x.next();
            }
        });
    }

    private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "10",
                    new TypeReference<Optional<? extends Long>>() {});

    private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Offset =
            new LazySingletonValue<>(
                    "offset",
                    "0",
                    new TypeReference<Optional<? extends Long>>() {});
}
