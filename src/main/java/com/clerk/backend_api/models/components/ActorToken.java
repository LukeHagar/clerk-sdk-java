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

public class ActorToken {

    @JsonProperty("object")
    private ActorTokenObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private ActorTokenStatus status;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("actor")
    private ActorTokenActor actor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private JsonNullable<? extends String> token;

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
    public ActorToken(
            @JsonProperty("object") ActorTokenObject object,
            @JsonProperty("id") String id,
            @JsonProperty("status") ActorTokenStatus status,
            @JsonProperty("user_id") String userId,
            @JsonProperty("actor") ActorTokenActor actor,
            @JsonProperty("token") JsonNullable<? extends String> token,
            @JsonProperty("url") JsonNullable<? extends String> url,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(actor, "actor");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.status = status;
        this.userId = userId;
        this.actor = actor;
        this.token = token;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public ActorToken(
            ActorTokenObject object,
            String id,
            ActorTokenStatus status,
            String userId,
            ActorTokenActor actor,
            long createdAt,
            long updatedAt) {
        this(object, id, status, userId, actor, JsonNullable.undefined(), JsonNullable.undefined(), createdAt, updatedAt);
    }

    @JsonIgnore
    public ActorTokenObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public ActorTokenStatus status() {
        return status;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    @JsonIgnore
    public ActorTokenActor actor() {
        return actor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> token() {
        return (JsonNullable<String>) token;
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

    public ActorToken withObject(ActorTokenObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public ActorToken withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ActorToken withStatus(ActorTokenStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ActorToken withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public ActorToken withActor(ActorTokenActor actor) {
        Utils.checkNotNull(actor, "actor");
        this.actor = actor;
        return this;
    }

    public ActorToken withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = JsonNullable.of(token);
        return this;
    }

    public ActorToken withToken(JsonNullable<? extends String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    public ActorToken withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    public ActorToken withUrl(JsonNullable<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public ActorToken withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public ActorToken withUpdatedAt(long updatedAt) {
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
        ActorToken other = (ActorToken) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.actor, other.actor) &&
            java.util.Objects.deepEquals(this.token, other.token) &&
            java.util.Objects.deepEquals(this.url, other.url) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            status,
            userId,
            actor,
            token,
            url,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActorToken.class,
                "object", object,
                "id", id,
                "status", status,
                "userId", userId,
                "actor", actor,
                "token", token,
                "url", url,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private ActorTokenObject object;
 
        private String id;
 
        private ActorTokenStatus status;
 
        private String userId;
 
        private ActorTokenActor actor;
 
        private JsonNullable<? extends String> token = JsonNullable.undefined();
 
        private JsonNullable<? extends String> url = JsonNullable.undefined();
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(ActorTokenObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder status(ActorTokenStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder actor(ActorTokenActor actor) {
            Utils.checkNotNull(actor, "actor");
            this.actor = actor;
            return this;
        }

        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = JsonNullable.of(token);
            return this;
        }

        public Builder token(JsonNullable<? extends String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
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
        
        public ActorToken build() {
            return new ActorToken(
                object,
                id,
                status,
                userId,
                actor,
                token,
                url,
                createdAt,
                updatedAt);
        }
    }
}

