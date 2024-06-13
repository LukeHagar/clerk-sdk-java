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
import org.openapitools.jackson.nullable.JsonNullable;

public class Session {

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonProperty("object")
    private SessionObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("client_id")
    private String clientId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actor")
    private JsonNullable<? extends Actor> actor;

    @JsonProperty("status")
    private Status status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_active_organization_id")
    private JsonNullable<? extends String> lastActiveOrganizationId;

    @JsonProperty("last_active_at")
    private long lastActiveAt;

    @JsonProperty("expire_at")
    private long expireAt;

    @JsonProperty("abandon_at")
    private long abandonAt;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    @JsonCreator
    public Session(
            @JsonProperty("object") SessionObject object,
            @JsonProperty("id") String id,
            @JsonProperty("user_id") String userId,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("actor") JsonNullable<? extends Actor> actor,
            @JsonProperty("status") Status status,
            @JsonProperty("last_active_organization_id") JsonNullable<? extends String> lastActiveOrganizationId,
            @JsonProperty("last_active_at") long lastActiveAt,
            @JsonProperty("expire_at") long expireAt,
            @JsonProperty("abandon_at") long abandonAt,
            @JsonProperty("updated_at") long updatedAt,
            @JsonProperty("created_at") long createdAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(actor, "actor");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(lastActiveOrganizationId, "lastActiveOrganizationId");
        Utils.checkNotNull(lastActiveAt, "lastActiveAt");
        Utils.checkNotNull(expireAt, "expireAt");
        Utils.checkNotNull(abandonAt, "abandonAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        this.object = object;
        this.id = id;
        this.userId = userId;
        this.clientId = clientId;
        this.actor = actor;
        this.status = status;
        this.lastActiveOrganizationId = lastActiveOrganizationId;
        this.lastActiveAt = lastActiveAt;
        this.expireAt = expireAt;
        this.abandonAt = abandonAt;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }
    
    public Session(
            SessionObject object,
            String id,
            String userId,
            String clientId,
            Status status,
            long lastActiveAt,
            long expireAt,
            long abandonAt,
            long updatedAt,
            long createdAt) {
        this(object, id, userId, clientId, JsonNullable.undefined(), status, JsonNullable.undefined(), lastActiveAt, expireAt, abandonAt, updatedAt, createdAt);
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonIgnore
    public SessionObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Actor> actor() {
        return (JsonNullable<Actor>) actor;
    }

    @JsonIgnore
    public Status status() {
        return status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> lastActiveOrganizationId() {
        return (JsonNullable<String>) lastActiveOrganizationId;
    }

    @JsonIgnore
    public long lastActiveAt() {
        return lastActiveAt;
    }

    @JsonIgnore
    public long expireAt() {
        return expireAt;
    }

    @JsonIgnore
    public long abandonAt() {
        return abandonAt;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    public Session withObject(SessionObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public Session withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Session withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public Session withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public Session withActor(Actor actor) {
        Utils.checkNotNull(actor, "actor");
        this.actor = JsonNullable.of(actor);
        return this;
    }

    public Session withActor(JsonNullable<? extends Actor> actor) {
        Utils.checkNotNull(actor, "actor");
        this.actor = actor;
        return this;
    }

    public Session withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Session withLastActiveOrganizationId(String lastActiveOrganizationId) {
        Utils.checkNotNull(lastActiveOrganizationId, "lastActiveOrganizationId");
        this.lastActiveOrganizationId = JsonNullable.of(lastActiveOrganizationId);
        return this;
    }

    public Session withLastActiveOrganizationId(JsonNullable<? extends String> lastActiveOrganizationId) {
        Utils.checkNotNull(lastActiveOrganizationId, "lastActiveOrganizationId");
        this.lastActiveOrganizationId = lastActiveOrganizationId;
        return this;
    }

    public Session withLastActiveAt(long lastActiveAt) {
        Utils.checkNotNull(lastActiveAt, "lastActiveAt");
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    public Session withExpireAt(long expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = expireAt;
        return this;
    }

    public Session withAbandonAt(long abandonAt) {
        Utils.checkNotNull(abandonAt, "abandonAt");
        this.abandonAt = abandonAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public Session withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public Session withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        Session other = (Session) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.actor, other.actor) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.lastActiveOrganizationId, other.lastActiveOrganizationId) &&
            java.util.Objects.deepEquals(this.lastActiveAt, other.lastActiveAt) &&
            java.util.Objects.deepEquals(this.expireAt, other.expireAt) &&
            java.util.Objects.deepEquals(this.abandonAt, other.abandonAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            userId,
            clientId,
            actor,
            status,
            lastActiveOrganizationId,
            lastActiveAt,
            expireAt,
            abandonAt,
            updatedAt,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Session.class,
                "object", object,
                "id", id,
                "userId", userId,
                "clientId", clientId,
                "actor", actor,
                "status", status,
                "lastActiveOrganizationId", lastActiveOrganizationId,
                "lastActiveAt", lastActiveAt,
                "expireAt", expireAt,
                "abandonAt", abandonAt,
                "updatedAt", updatedAt,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private SessionObject object;
 
        private String id;
 
        private String userId;
 
        private String clientId;
 
        private JsonNullable<? extends Actor> actor = JsonNullable.undefined();
 
        private Status status;
 
        private JsonNullable<? extends String> lastActiveOrganizationId = JsonNullable.undefined();
 
        private Long lastActiveAt;
 
        private Long expireAt;
 
        private Long abandonAt;
 
        private Long updatedAt;
 
        private Long createdAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * String representing the object's type. Objects of the same type share the same value.
         * 
         */
        public Builder object(SessionObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder actor(Actor actor) {
            Utils.checkNotNull(actor, "actor");
            this.actor = JsonNullable.of(actor);
            return this;
        }

        public Builder actor(JsonNullable<? extends Actor> actor) {
            Utils.checkNotNull(actor, "actor");
            this.actor = actor;
            return this;
        }

        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder lastActiveOrganizationId(String lastActiveOrganizationId) {
            Utils.checkNotNull(lastActiveOrganizationId, "lastActiveOrganizationId");
            this.lastActiveOrganizationId = JsonNullable.of(lastActiveOrganizationId);
            return this;
        }

        public Builder lastActiveOrganizationId(JsonNullable<? extends String> lastActiveOrganizationId) {
            Utils.checkNotNull(lastActiveOrganizationId, "lastActiveOrganizationId");
            this.lastActiveOrganizationId = lastActiveOrganizationId;
            return this;
        }

        public Builder lastActiveAt(long lastActiveAt) {
            Utils.checkNotNull(lastActiveAt, "lastActiveAt");
            this.lastActiveAt = lastActiveAt;
            return this;
        }

        public Builder expireAt(long expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = expireAt;
            return this;
        }

        public Builder abandonAt(long abandonAt) {
            Utils.checkNotNull(abandonAt, "abandonAt");
            this.abandonAt = abandonAt;
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

        /**
         * Unix timestamp of creation.
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public Session build() {
            return new Session(
                object,
                id,
                userId,
                clientId,
                actor,
                status,
                lastActiveOrganizationId,
                lastActiveAt,
                expireAt,
                abandonAt,
                updatedAt,
                createdAt);
        }
    }
}

