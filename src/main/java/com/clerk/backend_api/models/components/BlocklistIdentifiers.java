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

public class BlocklistIdentifiers {

    @JsonProperty("data")
    private java.util.List<BlocklistIdentifier> data;

    /**
     * Total number of blocklist identifiers
     * 
     */
    @JsonProperty("total_count")
    private long totalCount;

    @JsonCreator
    public BlocklistIdentifiers(
            @JsonProperty("data") java.util.List<BlocklistIdentifier> data,
            @JsonProperty("total_count") long totalCount) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(totalCount, "totalCount");
        this.data = data;
        this.totalCount = totalCount;
    }

    @JsonIgnore
    public java.util.List<BlocklistIdentifier> data() {
        return data;
    }

    /**
     * Total number of blocklist identifiers
     * 
     */
    @JsonIgnore
    public long totalCount() {
        return totalCount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BlocklistIdentifiers withData(java.util.List<BlocklistIdentifier> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Total number of blocklist identifiers
     * 
     */
    public BlocklistIdentifiers withTotalCount(long totalCount) {
        Utils.checkNotNull(totalCount, "totalCount");
        this.totalCount = totalCount;
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
        BlocklistIdentifiers other = (BlocklistIdentifiers) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.totalCount, other.totalCount);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            totalCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BlocklistIdentifiers.class,
                "data", data,
                "totalCount", totalCount);
    }
    
    public final static class Builder {
 
        private java.util.List<BlocklistIdentifier> data;
 
        private Long totalCount;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<BlocklistIdentifier> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Total number of blocklist identifiers
         * 
         */
        public Builder totalCount(long totalCount) {
            Utils.checkNotNull(totalCount, "totalCount");
            this.totalCount = totalCount;
            return this;
        }
        
        public BlocklistIdentifiers build() {
            return new BlocklistIdentifiers(
                data,
                totalCount);
        }
    }
}
