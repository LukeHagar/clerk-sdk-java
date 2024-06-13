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


public class GetPublicInterstitialRequestBuilder {

    private Optional<? extends String> frontendApi = Optional.empty();
    private Optional<? extends String> publishableKey = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPublicInterstitial sdk;

    public GetPublicInterstitialRequestBuilder(SDKMethodInterfaces.MethodCallGetPublicInterstitial sdk) {
        this.sdk = sdk;
    }
                
    public GetPublicInterstitialRequestBuilder frontendApi(String frontendApi) {
        Utils.checkNotNull(frontendApi, "frontendApi");
        this.frontendApi = Optional.of(frontendApi);
        return this;
    }

    public GetPublicInterstitialRequestBuilder frontendApi(Optional<? extends String> frontendApi) {
        Utils.checkNotNull(frontendApi, "frontendApi");
        this.frontendApi = frontendApi;
        return this;
    }
                
    public GetPublicInterstitialRequestBuilder publishableKey(String publishableKey) {
        Utils.checkNotNull(publishableKey, "publishableKey");
        this.publishableKey = Optional.of(publishableKey);
        return this;
    }

    public GetPublicInterstitialRequestBuilder publishableKey(Optional<? extends String> publishableKey) {
        Utils.checkNotNull(publishableKey, "publishableKey");
        this.publishableKey = publishableKey;
        return this;
    }

    public GetPublicInterstitialResponse call() throws Exception {

        return sdk.getPublicInterstitial(
            frontendApi,
            publishableKey);
    }
}
