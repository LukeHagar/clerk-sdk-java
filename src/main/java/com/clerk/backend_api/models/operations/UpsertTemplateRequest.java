/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

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

public class UpsertTemplateRequest {

    /**
     * The type of template to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_type")
    private UpsertTemplatePathParamTemplateType templateType;

    /**
     * The slug of the template to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    private String slug;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends UpsertTemplateRequestBody> requestBody;

    @JsonCreator
    public UpsertTemplateRequest(
            UpsertTemplatePathParamTemplateType templateType,
            String slug,
            Optional<? extends UpsertTemplateRequestBody> requestBody) {
        Utils.checkNotNull(templateType, "templateType");
        Utils.checkNotNull(slug, "slug");
        Utils.checkNotNull(requestBody, "requestBody");
        this.templateType = templateType;
        this.slug = slug;
        this.requestBody = requestBody;
    }
    
    public UpsertTemplateRequest(
            UpsertTemplatePathParamTemplateType templateType,
            String slug) {
        this(templateType, slug, Optional.empty());
    }

    /**
     * The type of template to update
     */
    @JsonIgnore
    public UpsertTemplatePathParamTemplateType templateType() {
        return templateType;
    }

    /**
     * The slug of the template to update
     */
    @JsonIgnore
    public String slug() {
        return slug;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpsertTemplateRequestBody> requestBody() {
        return (Optional<UpsertTemplateRequestBody>) requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of template to update
     */
    public UpsertTemplateRequest withTemplateType(UpsertTemplatePathParamTemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
        return this;
    }

    /**
     * The slug of the template to update
     */
    public UpsertTemplateRequest withSlug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }

    public UpsertTemplateRequest withRequestBody(UpsertTemplateRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public UpsertTemplateRequest withRequestBody(Optional<? extends UpsertTemplateRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        UpsertTemplateRequest other = (UpsertTemplateRequest) o;
        return 
            java.util.Objects.deepEquals(this.templateType, other.templateType) &&
            java.util.Objects.deepEquals(this.slug, other.slug) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            templateType,
            slug,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpsertTemplateRequest.class,
                "templateType", templateType,
                "slug", slug,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private UpsertTemplatePathParamTemplateType templateType;
 
        private String slug;
 
        private Optional<? extends UpsertTemplateRequestBody> requestBody = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of template to update
         */
        public Builder templateType(UpsertTemplatePathParamTemplateType templateType) {
            Utils.checkNotNull(templateType, "templateType");
            this.templateType = templateType;
            return this;
        }

        /**
         * The slug of the template to update
         */
        public Builder slug(String slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = slug;
            return this;
        }

        public Builder requestBody(UpsertTemplateRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends UpsertTemplateRequestBody> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpsertTemplateRequest build() {
            return new UpsertTemplateRequest(
                templateType,
                slug,
                requestBody);
        }
    }
}

