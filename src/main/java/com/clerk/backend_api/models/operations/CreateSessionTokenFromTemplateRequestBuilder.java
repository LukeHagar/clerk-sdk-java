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


public class CreateSessionTokenFromTemplateRequestBuilder {

    private String sessionId;
    private String templateName;
    private final SDKMethodInterfaces.MethodCallCreateSessionTokenFromTemplate sdk;

    public CreateSessionTokenFromTemplateRequestBuilder(SDKMethodInterfaces.MethodCallCreateSessionTokenFromTemplate sdk) {
        this.sdk = sdk;
    }

    public CreateSessionTokenFromTemplateRequestBuilder sessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
        return this;
    }

    public CreateSessionTokenFromTemplateRequestBuilder templateName(String templateName) {
        Utils.checkNotNull(templateName, "templateName");
        this.templateName = templateName;
        return this;
    }

    public CreateSessionTokenFromTemplateResponse call() throws Exception {

        return sdk.createTokenFromTemplate(
            sessionId,
            templateName);
    }
}
