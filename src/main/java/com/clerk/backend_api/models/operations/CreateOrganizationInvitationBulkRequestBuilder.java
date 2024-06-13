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


public class CreateOrganizationInvitationBulkRequestBuilder {

    private String organizationId;
    private java.util.List<RequestBody> requestBody;
    private final SDKMethodInterfaces.MethodCallCreateOrganizationInvitationBulk sdk;

    public CreateOrganizationInvitationBulkRequestBuilder(SDKMethodInterfaces.MethodCallCreateOrganizationInvitationBulk sdk) {
        this.sdk = sdk;
    }

    public CreateOrganizationInvitationBulkRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public CreateOrganizationInvitationBulkRequestBuilder requestBody(java.util.List<RequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateOrganizationInvitationBulkResponse call() throws Exception {

        return sdk.createBulk(
            organizationId,
            requestBody);
    }
}
