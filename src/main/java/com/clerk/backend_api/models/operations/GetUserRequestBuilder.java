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


public class GetUserRequestBuilder {

    private String userId;
    private final SDKMethodInterfaces.MethodCallGetUser sdk;

    public GetUserRequestBuilder(SDKMethodInterfaces.MethodCallGetUser sdk) {
        this.sdk = sdk;
    }

    public GetUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public GetUserResponse call() throws Exception {

        return sdk.get(
            userId);
    }
}
