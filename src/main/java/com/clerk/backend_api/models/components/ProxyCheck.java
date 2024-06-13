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

public class ProxyCheck {

    @JsonProperty("object")
    private ProxyCheckObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("domain_id")
    private String domainId;

    @JsonProperty("last_run_at")
    private long lastRunAt;

    @JsonProperty("proxy_url")
    private String proxyUrl;

    @JsonProperty("successful")
    private boolean successful;

    @JsonProperty("created_at")
    private long createdAt;

    @JsonProperty("updated_at")
    private long updatedAt;

    @JsonCreator
    public ProxyCheck(
            @JsonProperty("object") ProxyCheckObject object,
            @JsonProperty("id") String id,
            @JsonProperty("domain_id") String domainId,
            @JsonProperty("last_run_at") long lastRunAt,
            @JsonProperty("proxy_url") String proxyUrl,
            @JsonProperty("successful") boolean successful,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(domainId, "domainId");
        Utils.checkNotNull(lastRunAt, "lastRunAt");
        Utils.checkNotNull(proxyUrl, "proxyUrl");
        Utils.checkNotNull(successful, "successful");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.domainId = domainId;
        this.lastRunAt = lastRunAt;
        this.proxyUrl = proxyUrl;
        this.successful = successful;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonIgnore
    public ProxyCheckObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String domainId() {
        return domainId;
    }

    @JsonIgnore
    public long lastRunAt() {
        return lastRunAt;
    }

    @JsonIgnore
    public String proxyUrl() {
        return proxyUrl;
    }

    @JsonIgnore
    public boolean successful() {
        return successful;
    }

    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProxyCheck withObject(ProxyCheckObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public ProxyCheck withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ProxyCheck withDomainId(String domainId) {
        Utils.checkNotNull(domainId, "domainId");
        this.domainId = domainId;
        return this;
    }

    public ProxyCheck withLastRunAt(long lastRunAt) {
        Utils.checkNotNull(lastRunAt, "lastRunAt");
        this.lastRunAt = lastRunAt;
        return this;
    }

    public ProxyCheck withProxyUrl(String proxyUrl) {
        Utils.checkNotNull(proxyUrl, "proxyUrl");
        this.proxyUrl = proxyUrl;
        return this;
    }

    public ProxyCheck withSuccessful(boolean successful) {
        Utils.checkNotNull(successful, "successful");
        this.successful = successful;
        return this;
    }

    public ProxyCheck withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public ProxyCheck withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        ProxyCheck other = (ProxyCheck) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.domainId, other.domainId) &&
            java.util.Objects.deepEquals(this.lastRunAt, other.lastRunAt) &&
            java.util.Objects.deepEquals(this.proxyUrl, other.proxyUrl) &&
            java.util.Objects.deepEquals(this.successful, other.successful) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            domainId,
            lastRunAt,
            proxyUrl,
            successful,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProxyCheck.class,
                "object", object,
                "id", id,
                "domainId", domainId,
                "lastRunAt", lastRunAt,
                "proxyUrl", proxyUrl,
                "successful", successful,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private ProxyCheckObject object;
 
        private String id;
 
        private String domainId;
 
        private Long lastRunAt;
 
        private String proxyUrl;
 
        private Boolean successful;
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(ProxyCheckObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder domainId(String domainId) {
            Utils.checkNotNull(domainId, "domainId");
            this.domainId = domainId;
            return this;
        }

        public Builder lastRunAt(long lastRunAt) {
            Utils.checkNotNull(lastRunAt, "lastRunAt");
            this.lastRunAt = lastRunAt;
            return this;
        }

        public Builder proxyUrl(String proxyUrl) {
            Utils.checkNotNull(proxyUrl, "proxyUrl");
            this.proxyUrl = proxyUrl;
            return this;
        }

        public Builder successful(boolean successful) {
            Utils.checkNotNull(successful, "successful");
            this.successful = successful;
            return this;
        }

        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public ProxyCheck build() {
            return new ProxyCheck(
                object,
                id,
                domainId,
                lastRunAt,
                proxyUrl,
                successful,
                createdAt,
                updatedAt);
        }
    }
}

