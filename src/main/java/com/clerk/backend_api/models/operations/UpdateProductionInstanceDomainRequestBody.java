/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class UpdateProductionInstanceDomainRequestBody {

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("home_url")
    private Optional<? extends String> homeUrl;

    @JsonCreator
    public UpdateProductionInstanceDomainRequestBody(
            @JsonProperty("home_url") Optional<? extends String> homeUrl) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        this.homeUrl = homeUrl;
    }
    
    public UpdateProductionInstanceDomainRequestBody() {
        this(Optional.empty());
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> homeUrl() {
        return (Optional<String>) homeUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    public UpdateProductionInstanceDomainRequestBody withHomeUrl(String homeUrl) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        this.homeUrl = Optional.ofNullable(homeUrl);
        return this;
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    public UpdateProductionInstanceDomainRequestBody withHomeUrl(Optional<? extends String> homeUrl) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        this.homeUrl = homeUrl;
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
        UpdateProductionInstanceDomainRequestBody other = (UpdateProductionInstanceDomainRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.homeUrl, other.homeUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            homeUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateProductionInstanceDomainRequestBody.class,
                "homeUrl", homeUrl);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> homeUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The new home URL of the production instance e.g. https://www.example.com
         */
        public Builder homeUrl(String homeUrl) {
            Utils.checkNotNull(homeUrl, "homeUrl");
            this.homeUrl = Optional.ofNullable(homeUrl);
            return this;
        }

        /**
         * The new home URL of the production instance e.g. https://www.example.com
         */
        public Builder homeUrl(Optional<? extends String> homeUrl) {
            Utils.checkNotNull(homeUrl, "homeUrl");
            this.homeUrl = homeUrl;
            return this;
        }
        
        public UpdateProductionInstanceDomainRequestBody build() {
            return new UpdateProductionInstanceDomainRequestBody(
                homeUrl);
        }
    }
}

