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

public class GetTemplateListRequest {

    /**
     * The type of templates to list (email or SMS)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_type")
    private TemplateType templateType;

    @JsonCreator
    public GetTemplateListRequest(
            TemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
    }

    /**
     * The type of templates to list (email or SMS)
     */
    @JsonIgnore
    public TemplateType templateType() {
        return templateType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of templates to list (email or SMS)
     */
    public GetTemplateListRequest withTemplateType(TemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
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
        GetTemplateListRequest other = (GetTemplateListRequest) o;
        return 
            java.util.Objects.deepEquals(this.templateType, other.templateType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            templateType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTemplateListRequest.class,
                "templateType", templateType);
    }
    
    public final static class Builder {
 
        private TemplateType templateType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of templates to list (email or SMS)
         */
        public Builder templateType(TemplateType templateType) {
            Utils.checkNotNull(templateType, "templateType");
            this.templateType = templateType;
            return this;
        }
        
        public GetTemplateListRequest build() {
            return new GetTemplateListRequest(
                templateType);
        }
    }
}

