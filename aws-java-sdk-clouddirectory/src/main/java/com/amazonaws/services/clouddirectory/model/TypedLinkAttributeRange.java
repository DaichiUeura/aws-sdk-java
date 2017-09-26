/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the range of attributes that are used by a specified filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/TypedLinkAttributeRange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedLinkAttributeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the typed link attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The range of attribute values that are being selected.
     * </p>
     */
    private TypedAttributeValueRange range;

    /**
     * <p>
     * The unique name of the typed link attribute.
     * </p>
     * 
     * @param attributeName
     *        The unique name of the typed link attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The unique name of the typed link attribute.
     * </p>
     * 
     * @return The unique name of the typed link attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The unique name of the typed link attribute.
     * </p>
     * 
     * @param attributeName
     *        The unique name of the typed link attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkAttributeRange withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The range of attribute values that are being selected.
     * </p>
     * 
     * @param range
     *        The range of attribute values that are being selected.
     */

    public void setRange(TypedAttributeValueRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The range of attribute values that are being selected.
     * </p>
     * 
     * @return The range of attribute values that are being selected.
     */

    public TypedAttributeValueRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range of attribute values that are being selected.
     * </p>
     * 
     * @param range
     *        The range of attribute values that are being selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedLinkAttributeRange withRange(TypedAttributeValueRange range) {
        setRange(range);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedLinkAttributeRange == false)
            return false;
        TypedLinkAttributeRange other = (TypedLinkAttributeRange) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        return hashCode;
    }

    @Override
    public TypedLinkAttributeRange clone() {
        try {
            return (TypedLinkAttributeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedLinkAttributeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}