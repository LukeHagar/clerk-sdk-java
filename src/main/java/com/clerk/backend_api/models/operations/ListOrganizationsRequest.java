/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ListOrganizationsRequest {

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<? extends Long> offset;

    /**
     * Flag to denote whether the member counts of each organization should be included in the response or not.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_members_count")
    private Optional<? extends Boolean> includeMembersCount;

    /**
     * Returns organizations with ID, name, or slug that match the given query.
     * Uses exact match for organization ID and partial match for name and slug.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<? extends String> query;

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     * Defaults to `-created_at`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order_by")
    private Optional<? extends String> orderBy;

    @JsonCreator
    public ListOrganizationsRequest(
            Optional<? extends Long> limit,
            Optional<? extends Long> offset,
            Optional<? extends Boolean> includeMembersCount,
            Optional<? extends String> query,
            Optional<? extends String> orderBy) {
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(orderBy, "orderBy");
        this.limit = limit;
        this.offset = offset;
        this.includeMembersCount = includeMembersCount;
        this.query = query;
        this.orderBy = orderBy;
    }
    
    public ListOrganizationsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> limit() {
        return (Optional<Long>) limit;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> offset() {
        return (Optional<Long>) offset;
    }

    /**
     * Flag to denote whether the member counts of each organization should be included in the response or not.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includeMembersCount() {
        return (Optional<Boolean>) includeMembersCount;
    }

    /**
     * Returns organizations with ID, name, or slug that match the given query.
     * Uses exact match for organization ID and partial match for name and slug.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> query() {
        return (Optional<String>) query;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     * Defaults to `-created_at`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> orderBy() {
        return (Optional<String>) orderBy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationsRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationsRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationsRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationsRequest withOffset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * Flag to denote whether the member counts of each organization should be included in the response or not.
     */
    public ListOrganizationsRequest withIncludeMembersCount(boolean includeMembersCount) {
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        this.includeMembersCount = Optional.ofNullable(includeMembersCount);
        return this;
    }

    /**
     * Flag to denote whether the member counts of each organization should be included in the response or not.
     */
    public ListOrganizationsRequest withIncludeMembersCount(Optional<? extends Boolean> includeMembersCount) {
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        this.includeMembersCount = includeMembersCount;
        return this;
    }

    /**
     * Returns organizations with ID, name, or slug that match the given query.
     * Uses exact match for organization ID and partial match for name and slug.
     */
    public ListOrganizationsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Returns organizations with ID, name, or slug that match the given query.
     * Uses exact match for organization ID and partial match for name and slug.
     */
    public ListOrganizationsRequest withQuery(Optional<? extends String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     * Defaults to `-created_at`.
     */
    public ListOrganizationsRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     * Defaults to `-created_at`.
     */
    public ListOrganizationsRequest withOrderBy(Optional<? extends String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
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
        ListOrganizationsRequest other = (ListOrganizationsRequest) o;
        return 
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset) &&
            java.util.Objects.deepEquals(this.includeMembersCount, other.includeMembersCount) &&
            java.util.Objects.deepEquals(this.query, other.query) &&
            java.util.Objects.deepEquals(this.orderBy, other.orderBy);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            limit,
            offset,
            includeMembersCount,
            query,
            orderBy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListOrganizationsRequest.class,
                "limit", limit,
                "offset", offset,
                "includeMembersCount", includeMembersCount,
                "query", query,
                "orderBy", orderBy);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> limit;
 
        private Optional<? extends Long> offset;
 
        private Optional<? extends Boolean> includeMembersCount = Optional.empty();
 
        private Optional<? extends String> query = Optional.empty();
 
        private Optional<? extends String> orderBy;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(Optional<? extends Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * Flag to denote whether the member counts of each organization should be included in the response or not.
         */
        public Builder includeMembersCount(boolean includeMembersCount) {
            Utils.checkNotNull(includeMembersCount, "includeMembersCount");
            this.includeMembersCount = Optional.ofNullable(includeMembersCount);
            return this;
        }

        /**
         * Flag to denote whether the member counts of each organization should be included in the response or not.
         */
        public Builder includeMembersCount(Optional<? extends Boolean> includeMembersCount) {
            Utils.checkNotNull(includeMembersCount, "includeMembersCount");
            this.includeMembersCount = includeMembersCount;
            return this;
        }

        /**
         * Returns organizations with ID, name, or slug that match the given query.
         * Uses exact match for organization ID and partial match for name and slug.
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Returns organizations with ID, name, or slug that match the given query.
         * Uses exact match for organization ID and partial match for name and slug.
         */
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * Allows to return organizations in a particular order.
         * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
         * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
         * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
         * If you don't use `+` or `-`, then `+` is implied.
         * Defaults to `-created_at`.
         */
        public Builder orderBy(String orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        /**
         * Allows to return organizations in a particular order.
         * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
         * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
         * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
         * If you don't use `+` or `-`, then `+` is implied.
         * Defaults to `-created_at`.
         */
        public Builder orderBy(Optional<? extends String> orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = orderBy;
            return this;
        }
        
        public ListOrganizationsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }
            if (orderBy == null) {
                orderBy = _SINGLETON_VALUE_OrderBy.value();
            }
            return new ListOrganizationsRequest(
                limit,
                offset,
                includeMembersCount,
                query,
                orderBy);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Offset =
                new LazySingletonValue<>(
                        "offset",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_OrderBy =
                new LazySingletonValue<>(
                        "order_by",
                        "\"-created_at\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

