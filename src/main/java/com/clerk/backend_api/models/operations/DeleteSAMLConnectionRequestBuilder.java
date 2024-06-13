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


public class DeleteSAMLConnectionRequestBuilder {

    private String samlConnectionId;
    private final SDKMethodInterfaces.MethodCallDeleteSAMLConnection sdk;

    public DeleteSAMLConnectionRequestBuilder(SDKMethodInterfaces.MethodCallDeleteSAMLConnection sdk) {
        this.sdk = sdk;
    }

    public DeleteSAMLConnectionRequestBuilder samlConnectionId(String samlConnectionId) {
        Utils.checkNotNull(samlConnectionId, "samlConnectionId");
        this.samlConnectionId = samlConnectionId;
        return this;
    }

    public DeleteSAMLConnectionResponse call() throws Exception {

        return sdk.delete(
            samlConnectionId);
    }
}
