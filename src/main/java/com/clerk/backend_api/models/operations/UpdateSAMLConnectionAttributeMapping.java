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
/**
 * UpdateSAMLConnectionAttributeMapping - Define the atrtibute name mapping between Identity Provider and Clerk's user properties
 */

public class UpdateSAMLConnectionAttributeMapping {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<? extends String> userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_address")
    private Optional<? extends String> emailAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<? extends String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<? extends String> lastName;

    @JsonCreator
    public UpdateSAMLConnectionAttributeMapping(
            @JsonProperty("user_id") Optional<? extends String> userId,
            @JsonProperty("email_address") Optional<? extends String> emailAddress,
            @JsonProperty("first_name") Optional<? extends String> firstName,
            @JsonProperty("last_name") Optional<? extends String> lastName) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        this.userId = userId;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public UpdateSAMLConnectionAttributeMapping() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> emailAddress() {
        return (Optional<String>) emailAddress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> firstName() {
        return (Optional<String>) firstName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastName() {
        return (Optional<String>) lastName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateSAMLConnectionAttributeMapping withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = Optional.ofNullable(emailAddress);
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withEmailAddress(Optional<? extends String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withFirstName(Optional<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public UpdateSAMLConnectionAttributeMapping withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
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
        UpdateSAMLConnectionAttributeMapping other = (UpdateSAMLConnectionAttributeMapping) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            emailAddress,
            firstName,
            lastName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSAMLConnectionAttributeMapping.class,
                "userId", userId,
                "emailAddress", emailAddress,
                "firstName", firstName,
                "lastName", lastName);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends String> emailAddress = Optional.empty();
 
        private Optional<? extends String> firstName = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = Optional.ofNullable(emailAddress);
            return this;
        }

        public Builder emailAddress(Optional<? extends String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }
        
        public UpdateSAMLConnectionAttributeMapping build() {
            return new UpdateSAMLConnectionAttributeMapping(
                userId,
                emailAddress,
                firstName,
                lastName);
        }
    }
}

