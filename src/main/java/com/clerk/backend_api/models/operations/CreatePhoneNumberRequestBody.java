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
import org.openapitools.jackson.nullable.JsonNullable;

public class CreatePhoneNumberRequestBody {

    /**
     * The ID representing the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<? extends String> userId;

    /**
     * The new phone number. Must adhere to the E.164 standard for phone number format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private Optional<? extends String> phoneNumber;

    /**
     * When created, the phone number will be marked as verified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verified")
    private JsonNullable<? extends Boolean> verified;

    /**
     * Create this phone number as the primary phone number for the user.
     * Default: false, unless it is the first phone number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private JsonNullable<? extends Boolean> primary;

    /**
     * Create this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reserved_for_second_factor")
    private JsonNullable<? extends Boolean> reservedForSecondFactor;

    @JsonCreator
    public CreatePhoneNumberRequestBody(
            @JsonProperty("user_id") Optional<? extends String> userId,
            @JsonProperty("phone_number") Optional<? extends String> phoneNumber,
            @JsonProperty("verified") JsonNullable<? extends Boolean> verified,
            @JsonProperty("primary") JsonNullable<? extends Boolean> primary,
            @JsonProperty("reserved_for_second_factor") JsonNullable<? extends Boolean> reservedForSecondFactor) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(verified, "verified");
        Utils.checkNotNull(primary, "primary");
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.verified = verified;
        this.primary = primary;
        this.reservedForSecondFactor = reservedForSecondFactor;
    }
    
    public CreatePhoneNumberRequestBody() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID representing the user
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    /**
     * The new phone number. Must adhere to the E.164 standard for phone number format.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> phoneNumber() {
        return (Optional<String>) phoneNumber;
    }

    /**
     * When created, the phone number will be marked as verified.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Boolean> verified() {
        return (JsonNullable<Boolean>) verified;
    }

    /**
     * Create this phone number as the primary phone number for the user.
     * Default: false, unless it is the first phone number.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Boolean> primary() {
        return (JsonNullable<Boolean>) primary;
    }

    /**
     * Create this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Boolean> reservedForSecondFactor() {
        return (JsonNullable<Boolean>) reservedForSecondFactor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID representing the user
     */
    public CreatePhoneNumberRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * The ID representing the user
     */
    public CreatePhoneNumberRequestBody withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The new phone number. Must adhere to the E.164 standard for phone number format.
     */
    public CreatePhoneNumberRequestBody withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    /**
     * The new phone number. Must adhere to the E.164 standard for phone number format.
     */
    public CreatePhoneNumberRequestBody withPhoneNumber(Optional<? extends String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * When created, the phone number will be marked as verified.
     */
    public CreatePhoneNumberRequestBody withVerified(boolean verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = JsonNullable.of(verified);
        return this;
    }

    /**
     * When created, the phone number will be marked as verified.
     */
    public CreatePhoneNumberRequestBody withVerified(JsonNullable<? extends Boolean> verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = verified;
        return this;
    }

    /**
     * Create this phone number as the primary phone number for the user.
     * Default: false, unless it is the first phone number.
     */
    public CreatePhoneNumberRequestBody withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = JsonNullable.of(primary);
        return this;
    }

    /**
     * Create this phone number as the primary phone number for the user.
     * Default: false, unless it is the first phone number.
     */
    public CreatePhoneNumberRequestBody withPrimary(JsonNullable<? extends Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
        return this;
    }

    /**
     * Create this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    public CreatePhoneNumberRequestBody withReservedForSecondFactor(boolean reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = JsonNullable.of(reservedForSecondFactor);
        return this;
    }

    /**
     * Create this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    public CreatePhoneNumberRequestBody withReservedForSecondFactor(JsonNullable<? extends Boolean> reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = reservedForSecondFactor;
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
        CreatePhoneNumberRequestBody other = (CreatePhoneNumberRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            java.util.Objects.deepEquals(this.verified, other.verified) &&
            java.util.Objects.deepEquals(this.primary, other.primary) &&
            java.util.Objects.deepEquals(this.reservedForSecondFactor, other.reservedForSecondFactor);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            phoneNumber,
            verified,
            primary,
            reservedForSecondFactor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePhoneNumberRequestBody.class,
                "userId", userId,
                "phoneNumber", phoneNumber,
                "verified", verified,
                "primary", primary,
                "reservedForSecondFactor", reservedForSecondFactor);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends String> phoneNumber = Optional.empty();
 
        private JsonNullable<? extends Boolean> verified = JsonNullable.undefined();
 
        private JsonNullable<? extends Boolean> primary = JsonNullable.undefined();
 
        private JsonNullable<? extends Boolean> reservedForSecondFactor = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID representing the user
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * The ID representing the user
         */
        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The new phone number. Must adhere to the E.164 standard for phone number format.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        /**
         * The new phone number. Must adhere to the E.164 standard for phone number format.
         */
        public Builder phoneNumber(Optional<? extends String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * When created, the phone number will be marked as verified.
         */
        public Builder verified(boolean verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = JsonNullable.of(verified);
            return this;
        }

        /**
         * When created, the phone number will be marked as verified.
         */
        public Builder verified(JsonNullable<? extends Boolean> verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = verified;
            return this;
        }

        /**
         * Create this phone number as the primary phone number for the user.
         * Default: false, unless it is the first phone number.
         */
        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = JsonNullable.of(primary);
            return this;
        }

        /**
         * Create this phone number as the primary phone number for the user.
         * Default: false, unless it is the first phone number.
         */
        public Builder primary(JsonNullable<? extends Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }

        /**
         * Create this phone number as reserved for multi-factor authentication.
         * The phone number must also be verified.
         * If there are no other reserved second factors, the phone number will be set as the default second factor.
         */
        public Builder reservedForSecondFactor(boolean reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = JsonNullable.of(reservedForSecondFactor);
            return this;
        }

        /**
         * Create this phone number as reserved for multi-factor authentication.
         * The phone number must also be verified.
         * If there are no other reserved second factors, the phone number will be set as the default second factor.
         */
        public Builder reservedForSecondFactor(JsonNullable<? extends Boolean> reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = reservedForSecondFactor;
            return this;
        }
        
        public CreatePhoneNumberRequestBody build() {
            return new CreatePhoneNumberRequestBody(
                userId,
                phoneNumber,
                verified,
                primary,
                reservedForSecondFactor);
        }
    }
}

