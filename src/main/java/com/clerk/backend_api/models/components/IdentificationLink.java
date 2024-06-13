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

public class IdentificationLink {

    @JsonProperty("type")
    private Type type;

    @JsonProperty("id")
    private String id;

    @JsonCreator
    public IdentificationLink(
            @JsonProperty("type") Type type,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }

    @JsonIgnore
    public Type type() {
        return type;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IdentificationLink withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public IdentificationLink withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        IdentificationLink other = (IdentificationLink) o;
        return 
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            type,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IdentificationLink.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private Type type;
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public IdentificationLink build() {
            return new IdentificationLink(
                type,
                id);
        }
    }
}

