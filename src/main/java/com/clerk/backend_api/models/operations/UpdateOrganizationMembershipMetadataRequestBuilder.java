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


public class UpdateOrganizationMembershipMetadataRequestBuilder {

    private String organizationId;
    private String userId;
    private UpdateOrganizationMembershipMetadataRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateOrganizationMembershipMetadata sdk;

    public UpdateOrganizationMembershipMetadataRequestBuilder(SDKMethodInterfaces.MethodCallUpdateOrganizationMembershipMetadata sdk) {
        this.sdk = sdk;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder requestBody(UpdateOrganizationMembershipMetadataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateOrganizationMembershipMetadataResponse call() throws Exception {

        return sdk.updateMetadata(
            organizationId,
            userId,
            requestBody);
    }
}
