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


public class UpdateInstanceRestrictionsRequestBuilder {

    private Optional<? extends UpdateInstanceRestrictionsRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateInstanceRestrictions sdk;

    public UpdateInstanceRestrictionsRequestBuilder(SDKMethodInterfaces.MethodCallUpdateInstanceRestrictions sdk) {
        this.sdk = sdk;
    }
                
    public UpdateInstanceRestrictionsRequestBuilder request(UpdateInstanceRestrictionsRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public UpdateInstanceRestrictionsRequestBuilder request(Optional<? extends UpdateInstanceRestrictionsRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateInstanceRestrictionsResponse call() throws Exception {

        return sdk.updateRestrictions(
            request);
    }
}
