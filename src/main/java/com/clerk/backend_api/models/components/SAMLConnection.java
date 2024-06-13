/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

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
import org.openapitools.jackson.nullable.JsonNullable;

public class SAMLConnection {

    @JsonProperty("object")
    private SAMLConnectionObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("domain")
    private String domain;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("idp_entity_id")
    private Optional<? extends String> idpEntityId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("idp_sso_url")
    private Optional<? extends String> idpSsoUrl;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("idp_certificate")
    private Optional<? extends String> idpCertificate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("idp_metadata_url")
    private JsonNullable<? extends String> idpMetadataUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("idp_metadata")
    private JsonNullable<? extends String> idpMetadata;

    @JsonProperty("acs_url")
    private String acsUrl;

    @JsonProperty("sp_entity_id")
    private String spEntityId;

    @JsonProperty("sp_metadata_url")
    private String spMetadataUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_mapping")
    private Optional<? extends AttributeMapping> attributeMapping;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("user_count")
    private long userCount;

    @JsonProperty("sync_user_attributes")
    private boolean syncUserAttributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_subdomains")
    private Optional<? extends Boolean> allowSubdomains;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_idp_initiated")
    private Optional<? extends Boolean> allowIdpInitiated;

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    @JsonCreator
    public SAMLConnection(
            @JsonProperty("object") SAMLConnectionObject object,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("domain") String domain,
            @JsonProperty("idp_entity_id") Optional<? extends String> idpEntityId,
            @JsonProperty("idp_sso_url") Optional<? extends String> idpSsoUrl,
            @JsonProperty("idp_certificate") Optional<? extends String> idpCertificate,
            @JsonProperty("idp_metadata_url") JsonNullable<? extends String> idpMetadataUrl,
            @JsonProperty("idp_metadata") JsonNullable<? extends String> idpMetadata,
            @JsonProperty("acs_url") String acsUrl,
            @JsonProperty("sp_entity_id") String spEntityId,
            @JsonProperty("sp_metadata_url") String spMetadataUrl,
            @JsonProperty("attribute_mapping") Optional<? extends AttributeMapping> attributeMapping,
            @JsonProperty("active") boolean active,
            @JsonProperty("provider") String provider,
            @JsonProperty("user_count") long userCount,
            @JsonProperty("sync_user_attributes") boolean syncUserAttributes,
            @JsonProperty("allow_subdomains") Optional<? extends Boolean> allowSubdomains,
            @JsonProperty("allow_idp_initiated") Optional<? extends Boolean> allowIdpInitiated,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(idpEntityId, "idpEntityId");
        Utils.checkNotNull(idpSsoUrl, "idpSsoUrl");
        Utils.checkNotNull(idpCertificate, "idpCertificate");
        Utils.checkNotNull(idpMetadataUrl, "idpMetadataUrl");
        Utils.checkNotNull(idpMetadata, "idpMetadata");
        Utils.checkNotNull(acsUrl, "acsUrl");
        Utils.checkNotNull(spEntityId, "spEntityId");
        Utils.checkNotNull(spMetadataUrl, "spMetadataUrl");
        Utils.checkNotNull(attributeMapping, "attributeMapping");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(userCount, "userCount");
        Utils.checkNotNull(syncUserAttributes, "syncUserAttributes");
        Utils.checkNotNull(allowSubdomains, "allowSubdomains");
        Utils.checkNotNull(allowIdpInitiated, "allowIdpInitiated");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.idpEntityId = idpEntityId;
        this.idpSsoUrl = idpSsoUrl;
        this.idpCertificate = idpCertificate;
        this.idpMetadataUrl = idpMetadataUrl;
        this.idpMetadata = idpMetadata;
        this.acsUrl = acsUrl;
        this.spEntityId = spEntityId;
        this.spMetadataUrl = spMetadataUrl;
        this.attributeMapping = attributeMapping;
        this.active = active;
        this.provider = provider;
        this.userCount = userCount;
        this.syncUserAttributes = syncUserAttributes;
        this.allowSubdomains = allowSubdomains;
        this.allowIdpInitiated = allowIdpInitiated;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public SAMLConnection(
            SAMLConnectionObject object,
            String id,
            String name,
            String domain,
            String acsUrl,
            String spEntityId,
            String spMetadataUrl,
            boolean active,
            String provider,
            long userCount,
            boolean syncUserAttributes,
            long createdAt,
            long updatedAt) {
        this(object, id, name, domain, Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), acsUrl, spEntityId, spMetadataUrl, Optional.empty(), active, provider, userCount, syncUserAttributes, Optional.empty(), Optional.empty(), createdAt, updatedAt);
    }

    @JsonIgnore
    public SAMLConnectionObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String domain() {
        return domain;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> idpEntityId() {
        return (Optional<String>) idpEntityId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> idpSsoUrl() {
        return (Optional<String>) idpSsoUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> idpCertificate() {
        return (Optional<String>) idpCertificate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> idpMetadataUrl() {
        return (JsonNullable<String>) idpMetadataUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> idpMetadata() {
        return (JsonNullable<String>) idpMetadata;
    }

    @JsonIgnore
    public String acsUrl() {
        return acsUrl;
    }

    @JsonIgnore
    public String spEntityId() {
        return spEntityId;
    }

    @JsonIgnore
    public String spMetadataUrl() {
        return spMetadataUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttributeMapping> attributeMapping() {
        return (Optional<AttributeMapping>) attributeMapping;
    }

    @JsonIgnore
    public boolean active() {
        return active;
    }

    @JsonIgnore
    public String provider() {
        return provider;
    }

    @JsonIgnore
    public long userCount() {
        return userCount;
    }

    @JsonIgnore
    public boolean syncUserAttributes() {
        return syncUserAttributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> allowSubdomains() {
        return (Optional<Boolean>) allowSubdomains;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> allowIdpInitiated() {
        return (Optional<Boolean>) allowIdpInitiated;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SAMLConnection withObject(SAMLConnectionObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public SAMLConnection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public SAMLConnection withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public SAMLConnection withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    public SAMLConnection withIdpEntityId(String idpEntityId) {
        Utils.checkNotNull(idpEntityId, "idpEntityId");
        this.idpEntityId = Optional.ofNullable(idpEntityId);
        return this;
    }

    public SAMLConnection withIdpEntityId(Optional<? extends String> idpEntityId) {
        Utils.checkNotNull(idpEntityId, "idpEntityId");
        this.idpEntityId = idpEntityId;
        return this;
    }

    public SAMLConnection withIdpSsoUrl(String idpSsoUrl) {
        Utils.checkNotNull(idpSsoUrl, "idpSsoUrl");
        this.idpSsoUrl = Optional.ofNullable(idpSsoUrl);
        return this;
    }

    public SAMLConnection withIdpSsoUrl(Optional<? extends String> idpSsoUrl) {
        Utils.checkNotNull(idpSsoUrl, "idpSsoUrl");
        this.idpSsoUrl = idpSsoUrl;
        return this;
    }

    public SAMLConnection withIdpCertificate(String idpCertificate) {
        Utils.checkNotNull(idpCertificate, "idpCertificate");
        this.idpCertificate = Optional.ofNullable(idpCertificate);
        return this;
    }

    public SAMLConnection withIdpCertificate(Optional<? extends String> idpCertificate) {
        Utils.checkNotNull(idpCertificate, "idpCertificate");
        this.idpCertificate = idpCertificate;
        return this;
    }

    public SAMLConnection withIdpMetadataUrl(String idpMetadataUrl) {
        Utils.checkNotNull(idpMetadataUrl, "idpMetadataUrl");
        this.idpMetadataUrl = JsonNullable.of(idpMetadataUrl);
        return this;
    }

    public SAMLConnection withIdpMetadataUrl(JsonNullable<? extends String> idpMetadataUrl) {
        Utils.checkNotNull(idpMetadataUrl, "idpMetadataUrl");
        this.idpMetadataUrl = idpMetadataUrl;
        return this;
    }

    public SAMLConnection withIdpMetadata(String idpMetadata) {
        Utils.checkNotNull(idpMetadata, "idpMetadata");
        this.idpMetadata = JsonNullable.of(idpMetadata);
        return this;
    }

    public SAMLConnection withIdpMetadata(JsonNullable<? extends String> idpMetadata) {
        Utils.checkNotNull(idpMetadata, "idpMetadata");
        this.idpMetadata = idpMetadata;
        return this;
    }

    public SAMLConnection withAcsUrl(String acsUrl) {
        Utils.checkNotNull(acsUrl, "acsUrl");
        this.acsUrl = acsUrl;
        return this;
    }

    public SAMLConnection withSpEntityId(String spEntityId) {
        Utils.checkNotNull(spEntityId, "spEntityId");
        this.spEntityId = spEntityId;
        return this;
    }

    public SAMLConnection withSpMetadataUrl(String spMetadataUrl) {
        Utils.checkNotNull(spMetadataUrl, "spMetadataUrl");
        this.spMetadataUrl = spMetadataUrl;
        return this;
    }

    public SAMLConnection withAttributeMapping(AttributeMapping attributeMapping) {
        Utils.checkNotNull(attributeMapping, "attributeMapping");
        this.attributeMapping = Optional.ofNullable(attributeMapping);
        return this;
    }

    public SAMLConnection withAttributeMapping(Optional<? extends AttributeMapping> attributeMapping) {
        Utils.checkNotNull(attributeMapping, "attributeMapping");
        this.attributeMapping = attributeMapping;
        return this;
    }

    public SAMLConnection withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public SAMLConnection withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public SAMLConnection withUserCount(long userCount) {
        Utils.checkNotNull(userCount, "userCount");
        this.userCount = userCount;
        return this;
    }

    public SAMLConnection withSyncUserAttributes(boolean syncUserAttributes) {
        Utils.checkNotNull(syncUserAttributes, "syncUserAttributes");
        this.syncUserAttributes = syncUserAttributes;
        return this;
    }

    public SAMLConnection withAllowSubdomains(boolean allowSubdomains) {
        Utils.checkNotNull(allowSubdomains, "allowSubdomains");
        this.allowSubdomains = Optional.ofNullable(allowSubdomains);
        return this;
    }

    public SAMLConnection withAllowSubdomains(Optional<? extends Boolean> allowSubdomains) {
        Utils.checkNotNull(allowSubdomains, "allowSubdomains");
        this.allowSubdomains = allowSubdomains;
        return this;
    }

    public SAMLConnection withAllowIdpInitiated(boolean allowIdpInitiated) {
        Utils.checkNotNull(allowIdpInitiated, "allowIdpInitiated");
        this.allowIdpInitiated = Optional.ofNullable(allowIdpInitiated);
        return this;
    }

    public SAMLConnection withAllowIdpInitiated(Optional<? extends Boolean> allowIdpInitiated) {
        Utils.checkNotNull(allowIdpInitiated, "allowIdpInitiated");
        this.allowIdpInitiated = allowIdpInitiated;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public SAMLConnection withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public SAMLConnection withUpdatedAt(long updatedAt) {
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
        SAMLConnection other = (SAMLConnection) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.domain, other.domain) &&
            java.util.Objects.deepEquals(this.idpEntityId, other.idpEntityId) &&
            java.util.Objects.deepEquals(this.idpSsoUrl, other.idpSsoUrl) &&
            java.util.Objects.deepEquals(this.idpCertificate, other.idpCertificate) &&
            java.util.Objects.deepEquals(this.idpMetadataUrl, other.idpMetadataUrl) &&
            java.util.Objects.deepEquals(this.idpMetadata, other.idpMetadata) &&
            java.util.Objects.deepEquals(this.acsUrl, other.acsUrl) &&
            java.util.Objects.deepEquals(this.spEntityId, other.spEntityId) &&
            java.util.Objects.deepEquals(this.spMetadataUrl, other.spMetadataUrl) &&
            java.util.Objects.deepEquals(this.attributeMapping, other.attributeMapping) &&
            java.util.Objects.deepEquals(this.active, other.active) &&
            java.util.Objects.deepEquals(this.provider, other.provider) &&
            java.util.Objects.deepEquals(this.userCount, other.userCount) &&
            java.util.Objects.deepEquals(this.syncUserAttributes, other.syncUserAttributes) &&
            java.util.Objects.deepEquals(this.allowSubdomains, other.allowSubdomains) &&
            java.util.Objects.deepEquals(this.allowIdpInitiated, other.allowIdpInitiated) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            name,
            domain,
            idpEntityId,
            idpSsoUrl,
            idpCertificate,
            idpMetadataUrl,
            idpMetadata,
            acsUrl,
            spEntityId,
            spMetadataUrl,
            attributeMapping,
            active,
            provider,
            userCount,
            syncUserAttributes,
            allowSubdomains,
            allowIdpInitiated,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SAMLConnection.class,
                "object", object,
                "id", id,
                "name", name,
                "domain", domain,
                "idpEntityId", idpEntityId,
                "idpSsoUrl", idpSsoUrl,
                "idpCertificate", idpCertificate,
                "idpMetadataUrl", idpMetadataUrl,
                "idpMetadata", idpMetadata,
                "acsUrl", acsUrl,
                "spEntityId", spEntityId,
                "spMetadataUrl", spMetadataUrl,
                "attributeMapping", attributeMapping,
                "active", active,
                "provider", provider,
                "userCount", userCount,
                "syncUserAttributes", syncUserAttributes,
                "allowSubdomains", allowSubdomains,
                "allowIdpInitiated", allowIdpInitiated,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private SAMLConnectionObject object;
 
        private String id;
 
        private String name;
 
        private String domain;
 
        private Optional<? extends String> idpEntityId = Optional.empty();
 
        private Optional<? extends String> idpSsoUrl = Optional.empty();
 
        private Optional<? extends String> idpCertificate = Optional.empty();
 
        private JsonNullable<? extends String> idpMetadataUrl = JsonNullable.undefined();
 
        private JsonNullable<? extends String> idpMetadata = JsonNullable.undefined();
 
        private String acsUrl;
 
        private String spEntityId;
 
        private String spMetadataUrl;
 
        private Optional<? extends AttributeMapping> attributeMapping = Optional.empty();
 
        private Boolean active;
 
        private String provider;
 
        private Long userCount;
 
        private Boolean syncUserAttributes;
 
        private Optional<? extends Boolean> allowSubdomains = Optional.empty();
 
        private Optional<? extends Boolean> allowIdpInitiated = Optional.empty();
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(SAMLConnectionObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder domain(String domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        public Builder idpEntityId(String idpEntityId) {
            Utils.checkNotNull(idpEntityId, "idpEntityId");
            this.idpEntityId = Optional.ofNullable(idpEntityId);
            return this;
        }

        public Builder idpEntityId(Optional<? extends String> idpEntityId) {
            Utils.checkNotNull(idpEntityId, "idpEntityId");
            this.idpEntityId = idpEntityId;
            return this;
        }

        public Builder idpSsoUrl(String idpSsoUrl) {
            Utils.checkNotNull(idpSsoUrl, "idpSsoUrl");
            this.idpSsoUrl = Optional.ofNullable(idpSsoUrl);
            return this;
        }

        public Builder idpSsoUrl(Optional<? extends String> idpSsoUrl) {
            Utils.checkNotNull(idpSsoUrl, "idpSsoUrl");
            this.idpSsoUrl = idpSsoUrl;
            return this;
        }

        public Builder idpCertificate(String idpCertificate) {
            Utils.checkNotNull(idpCertificate, "idpCertificate");
            this.idpCertificate = Optional.ofNullable(idpCertificate);
            return this;
        }

        public Builder idpCertificate(Optional<? extends String> idpCertificate) {
            Utils.checkNotNull(idpCertificate, "idpCertificate");
            this.idpCertificate = idpCertificate;
            return this;
        }

        public Builder idpMetadataUrl(String idpMetadataUrl) {
            Utils.checkNotNull(idpMetadataUrl, "idpMetadataUrl");
            this.idpMetadataUrl = JsonNullable.of(idpMetadataUrl);
            return this;
        }

        public Builder idpMetadataUrl(JsonNullable<? extends String> idpMetadataUrl) {
            Utils.checkNotNull(idpMetadataUrl, "idpMetadataUrl");
            this.idpMetadataUrl = idpMetadataUrl;
            return this;
        }

        public Builder idpMetadata(String idpMetadata) {
            Utils.checkNotNull(idpMetadata, "idpMetadata");
            this.idpMetadata = JsonNullable.of(idpMetadata);
            return this;
        }

        public Builder idpMetadata(JsonNullable<? extends String> idpMetadata) {
            Utils.checkNotNull(idpMetadata, "idpMetadata");
            this.idpMetadata = idpMetadata;
            return this;
        }

        public Builder acsUrl(String acsUrl) {
            Utils.checkNotNull(acsUrl, "acsUrl");
            this.acsUrl = acsUrl;
            return this;
        }

        public Builder spEntityId(String spEntityId) {
            Utils.checkNotNull(spEntityId, "spEntityId");
            this.spEntityId = spEntityId;
            return this;
        }

        public Builder spMetadataUrl(String spMetadataUrl) {
            Utils.checkNotNull(spMetadataUrl, "spMetadataUrl");
            this.spMetadataUrl = spMetadataUrl;
            return this;
        }

        public Builder attributeMapping(AttributeMapping attributeMapping) {
            Utils.checkNotNull(attributeMapping, "attributeMapping");
            this.attributeMapping = Optional.ofNullable(attributeMapping);
            return this;
        }

        public Builder attributeMapping(Optional<? extends AttributeMapping> attributeMapping) {
            Utils.checkNotNull(attributeMapping, "attributeMapping");
            this.attributeMapping = attributeMapping;
            return this;
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder userCount(long userCount) {
            Utils.checkNotNull(userCount, "userCount");
            this.userCount = userCount;
            return this;
        }

        public Builder syncUserAttributes(boolean syncUserAttributes) {
            Utils.checkNotNull(syncUserAttributes, "syncUserAttributes");
            this.syncUserAttributes = syncUserAttributes;
            return this;
        }

        public Builder allowSubdomains(boolean allowSubdomains) {
            Utils.checkNotNull(allowSubdomains, "allowSubdomains");
            this.allowSubdomains = Optional.ofNullable(allowSubdomains);
            return this;
        }

        public Builder allowSubdomains(Optional<? extends Boolean> allowSubdomains) {
            Utils.checkNotNull(allowSubdomains, "allowSubdomains");
            this.allowSubdomains = allowSubdomains;
            return this;
        }

        public Builder allowIdpInitiated(boolean allowIdpInitiated) {
            Utils.checkNotNull(allowIdpInitiated, "allowIdpInitiated");
            this.allowIdpInitiated = Optional.ofNullable(allowIdpInitiated);
            return this;
        }

        public Builder allowIdpInitiated(Optional<? extends Boolean> allowIdpInitiated) {
            Utils.checkNotNull(allowIdpInitiated, "allowIdpInitiated");
            this.allowIdpInitiated = allowIdpInitiated;
            return this;
        }

        /**
         * Unix timestamp of creation.
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Unix timestamp of last update.
         * 
         */
        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public SAMLConnection build() {
            return new SAMLConnection(
                object,
                id,
                name,
                domain,
                idpEntityId,
                idpSsoUrl,
                idpCertificate,
                idpMetadataUrl,
                idpMetadata,
                acsUrl,
                spEntityId,
                spMetadataUrl,
                attributeMapping,
                active,
                provider,
                userCount,
                syncUserAttributes,
                allowSubdomains,
                allowIdpInitiated,
                createdAt,
                updatedAt);
        }
    }
}
