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

public class Invitation {

    @JsonProperty("object")
    private InvitationObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_metadata")
    private Optional<? extends InvitationPublicMetadata> publicMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revoked")
    private Optional<? extends Boolean> revoked;

    @JsonProperty("status")
    private InvitationStatus status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<? extends String> url;

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
    public Invitation(
            @JsonProperty("object") InvitationObject object,
            @JsonProperty("id") String id,
            @JsonProperty("email_address") String emailAddress,
            @JsonProperty("public_metadata") Optional<? extends InvitationPublicMetadata> publicMetadata,
            @JsonProperty("revoked") Optional<? extends Boolean> revoked,
            @JsonProperty("status") InvitationStatus status,
            @JsonProperty("url") JsonNullable<? extends String> url,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(revoked, "revoked");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.emailAddress = emailAddress;
        this.publicMetadata = publicMetadata;
        this.revoked = revoked;
        this.status = status;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Invitation(
            InvitationObject object,
            String id,
            String emailAddress,
            InvitationStatus status,
            long createdAt,
            long updatedAt) {
        this(object, id, emailAddress, Optional.empty(), Optional.empty(), status, JsonNullable.undefined(), createdAt, updatedAt);
    }

    @JsonIgnore
    public InvitationObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String emailAddress() {
        return emailAddress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvitationPublicMetadata> publicMetadata() {
        return (Optional<InvitationPublicMetadata>) publicMetadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> revoked() {
        return (Optional<Boolean>) revoked;
    }

    @JsonIgnore
    public InvitationStatus status() {
        return status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> url() {
        return (JsonNullable<String>) url;
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

    public Invitation withObject(InvitationObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public Invitation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Invitation withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    public Invitation withPublicMetadata(InvitationPublicMetadata publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = Optional.ofNullable(publicMetadata);
        return this;
    }

    public Invitation withPublicMetadata(Optional<? extends InvitationPublicMetadata> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    public Invitation withRevoked(boolean revoked) {
        Utils.checkNotNull(revoked, "revoked");
        this.revoked = Optional.ofNullable(revoked);
        return this;
    }

    public Invitation withRevoked(Optional<? extends Boolean> revoked) {
        Utils.checkNotNull(revoked, "revoked");
        this.revoked = revoked;
        return this;
    }

    public Invitation withStatus(InvitationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Invitation withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    public Invitation withUrl(JsonNullable<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public Invitation withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public Invitation withUpdatedAt(long updatedAt) {
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
        Invitation other = (Invitation) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            java.util.Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            java.util.Objects.deepEquals(this.revoked, other.revoked) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.url, other.url) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            emailAddress,
            publicMetadata,
            revoked,
            status,
            url,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Invitation.class,
                "object", object,
                "id", id,
                "emailAddress", emailAddress,
                "publicMetadata", publicMetadata,
                "revoked", revoked,
                "status", status,
                "url", url,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private InvitationObject object;
 
        private String id;
 
        private String emailAddress;
 
        private Optional<? extends InvitationPublicMetadata> publicMetadata = Optional.empty();
 
        private Optional<? extends Boolean> revoked = Optional.empty();
 
        private InvitationStatus status;
 
        private JsonNullable<? extends String> url = JsonNullable.undefined();
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(InvitationObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder publicMetadata(InvitationPublicMetadata publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = Optional.ofNullable(publicMetadata);
            return this;
        }

        public Builder publicMetadata(Optional<? extends InvitationPublicMetadata> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        public Builder revoked(boolean revoked) {
            Utils.checkNotNull(revoked, "revoked");
            this.revoked = Optional.ofNullable(revoked);
            return this;
        }

        public Builder revoked(Optional<? extends Boolean> revoked) {
            Utils.checkNotNull(revoked, "revoked");
            this.revoked = revoked;
            return this;
        }

        public Builder status(InvitationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        public Builder url(JsonNullable<? extends String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
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
        
        public Invitation build() {
            return new Invitation(
                object,
                id,
                emailAddress,
                publicMetadata,
                revoked,
                status,
                url,
                createdAt,
                updatedAt);
        }
    }
}

