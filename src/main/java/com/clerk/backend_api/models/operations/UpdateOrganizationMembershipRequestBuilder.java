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


public class UpdateOrganizationMembershipRequestBuilder {

    private String organizationId;
    private String userId;
    private UpdateOrganizationMembershipRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateOrganizationMembership sdk;

    public UpdateOrganizationMembershipRequestBuilder(SDKMethodInterfaces.MethodCallUpdateOrganizationMembership sdk) {
        this.sdk = sdk;
    }

    public UpdateOrganizationMembershipRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public UpdateOrganizationMembershipRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateOrganizationMembershipRequestBuilder requestBody(UpdateOrganizationMembershipRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateOrganizationMembershipResponse call() throws Exception {

        return sdk.update(
            organizationId,
            userId,
            requestBody);
    }
}
