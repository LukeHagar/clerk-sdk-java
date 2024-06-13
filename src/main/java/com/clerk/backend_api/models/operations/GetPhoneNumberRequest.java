/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class GetPhoneNumberRequest {

    /**
     * The ID of the phone number to retrieve
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=phone_number_id")
    private String phoneNumberId;

    @JsonCreator
    public GetPhoneNumberRequest(
            String phoneNumberId) {
        Utils.checkNotNull(phoneNumberId, "phoneNumberId");
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * The ID of the phone number to retrieve
     */
    @JsonIgnore
    public String phoneNumberId() {
        return phoneNumberId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the phone number to retrieve
     */
    public GetPhoneNumberRequest withPhoneNumberId(String phoneNumberId) {
        Utils.checkNotNull(phoneNumberId, "phoneNumberId");
        this.phoneNumberId = phoneNumberId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPhoneNumberRequest other = (GetPhoneNumberRequest) o;
        return 
            java.util.Objects.deepEquals(this.phoneNumberId, other.phoneNumberId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            phoneNumberId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPhoneNumberRequest.class,
                "phoneNumberId", phoneNumberId);
    }
    
    public final static class Builder {
 
        private String phoneNumberId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the phone number to retrieve
         */
        public Builder phoneNumberId(String phoneNumberId) {
            Utils.checkNotNull(phoneNumberId, "phoneNumberId");
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        
        public GetPhoneNumberRequest build() {
            return new GetPhoneNumberRequest(
                phoneNumberId);
        }
    }
}

