/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SvixURL {

    @JsonProperty("svix_url")
    private String svixUrl;

    @JsonCreator
    public SvixURL(
            @JsonProperty("svix_url") String svixUrl) {
        Utils.checkNotNull(svixUrl, "svixUrl");
        this.svixUrl = svixUrl;
    }

    @JsonIgnore
    public String svixUrl() {
        return svixUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SvixURL withSvixUrl(String svixUrl) {
        Utils.checkNotNull(svixUrl, "svixUrl");
        this.svixUrl = svixUrl;
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
        SvixURL other = (SvixURL) o;
        return 
            java.util.Objects.deepEquals(this.svixUrl, other.svixUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            svixUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SvixURL.class,
                "svixUrl", svixUrl);
    }
    
    public final static class Builder {
 
        private String svixUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder svixUrl(String svixUrl) {
            Utils.checkNotNull(svixUrl, "svixUrl");
            this.svixUrl = svixUrl;
            return this;
        }
        
        public SvixURL build() {
            return new SvixURL(
                svixUrl);
        }
    }
}

