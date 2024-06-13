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


public class GetOAuthAccessTokenRequestBuilder {

    private String userId;
    private String provider;
    private final SDKMethodInterfaces.MethodCallGetOAuthAccessToken sdk;

    public GetOAuthAccessTokenRequestBuilder(SDKMethodInterfaces.MethodCallGetOAuthAccessToken sdk) {
        this.sdk = sdk;
    }

    public GetOAuthAccessTokenRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public GetOAuthAccessTokenRequestBuilder provider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public GetOAuthAccessTokenResponse call() throws Exception {

        return sdk.getOAuthAccessToken(
            userId,
            provider);
    }
}
