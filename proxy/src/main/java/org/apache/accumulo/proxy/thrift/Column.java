/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Column implements org.apache.thrift.TBase<Column, Column._Fields>, java.io.Serializable, Cloneable, Comparable<Column> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Column");

  private static final org.apache.thrift.protocol.TField COL_FAMILY_FIELD_DESC = new org.apache.thrift.protocol.TField("colFamily", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COL_QUALIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("colQualifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COL_VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("colVisibility", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ColumnStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ColumnTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colFamily; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colQualifier; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colVisibility; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_FAMILY((short)1, "colFamily"),
    COL_QUALIFIER((short)2, "colQualifier"),
    COL_VISIBILITY((short)3, "colVisibility");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COL_FAMILY
          return COL_FAMILY;
        case 2: // COL_QUALIFIER
          return COL_QUALIFIER;
        case 3: // COL_VISIBILITY
          return COL_VISIBILITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL_FAMILY, new org.apache.thrift.meta_data.FieldMetaData("colFamily", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COL_QUALIFIER, new org.apache.thrift.meta_data.FieldMetaData("colQualifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COL_VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("colVisibility", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Column.class, metaDataMap);
  }

  public Column() {
  }

  public Column(
    java.nio.ByteBuffer colFamily,
    java.nio.ByteBuffer colQualifier,
    java.nio.ByteBuffer colVisibility)
  {
    this();
    this.colFamily = org.apache.thrift.TBaseHelper.copyBinary(colFamily);
    this.colQualifier = org.apache.thrift.TBaseHelper.copyBinary(colQualifier);
    this.colVisibility = org.apache.thrift.TBaseHelper.copyBinary(colVisibility);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Column(Column other) {
    if (other.isSetColFamily()) {
      this.colFamily = org.apache.thrift.TBaseHelper.copyBinary(other.colFamily);
    }
    if (other.isSetColQualifier()) {
      this.colQualifier = org.apache.thrift.TBaseHelper.copyBinary(other.colQualifier);
    }
    if (other.isSetColVisibility()) {
      this.colVisibility = org.apache.thrift.TBaseHelper.copyBinary(other.colVisibility);
    }
  }

  public Column deepCopy() {
    return new Column(this);
  }

  @Override
  public void clear() {
    this.colFamily = null;
    this.colQualifier = null;
    this.colVisibility = null;
  }

  public byte[] getColFamily() {
    setColFamily(org.apache.thrift.TBaseHelper.rightSize(colFamily));
    return colFamily == null ? null : colFamily.array();
  }

  public java.nio.ByteBuffer bufferForColFamily() {
    return org.apache.thrift.TBaseHelper.copyBinary(colFamily);
  }

  public Column setColFamily(byte[] colFamily) {
    this.colFamily = colFamily == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(colFamily.clone());
    return this;
  }

  public Column setColFamily(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colFamily) {
    this.colFamily = org.apache.thrift.TBaseHelper.copyBinary(colFamily);
    return this;
  }

  public void unsetColFamily() {
    this.colFamily = null;
  }

  /** Returns true if field colFamily is set (has been assigned a value) and false otherwise */
  public boolean isSetColFamily() {
    return this.colFamily != null;
  }

  public void setColFamilyIsSet(boolean value) {
    if (!value) {
      this.colFamily = null;
    }
  }

  public byte[] getColQualifier() {
    setColQualifier(org.apache.thrift.TBaseHelper.rightSize(colQualifier));
    return colQualifier == null ? null : colQualifier.array();
  }

  public java.nio.ByteBuffer bufferForColQualifier() {
    return org.apache.thrift.TBaseHelper.copyBinary(colQualifier);
  }

  public Column setColQualifier(byte[] colQualifier) {
    this.colQualifier = colQualifier == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(colQualifier.clone());
    return this;
  }

  public Column setColQualifier(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colQualifier) {
    this.colQualifier = org.apache.thrift.TBaseHelper.copyBinary(colQualifier);
    return this;
  }

  public void unsetColQualifier() {
    this.colQualifier = null;
  }

  /** Returns true if field colQualifier is set (has been assigned a value) and false otherwise */
  public boolean isSetColQualifier() {
    return this.colQualifier != null;
  }

  public void setColQualifierIsSet(boolean value) {
    if (!value) {
      this.colQualifier = null;
    }
  }

  public byte[] getColVisibility() {
    setColVisibility(org.apache.thrift.TBaseHelper.rightSize(colVisibility));
    return colVisibility == null ? null : colVisibility.array();
  }

  public java.nio.ByteBuffer bufferForColVisibility() {
    return org.apache.thrift.TBaseHelper.copyBinary(colVisibility);
  }

  public Column setColVisibility(byte[] colVisibility) {
    this.colVisibility = colVisibility == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(colVisibility.clone());
    return this;
  }

  public Column setColVisibility(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer colVisibility) {
    this.colVisibility = org.apache.thrift.TBaseHelper.copyBinary(colVisibility);
    return this;
  }

  public void unsetColVisibility() {
    this.colVisibility = null;
  }

  /** Returns true if field colVisibility is set (has been assigned a value) and false otherwise */
  public boolean isSetColVisibility() {
    return this.colVisibility != null;
  }

  public void setColVisibilityIsSet(boolean value) {
    if (!value) {
      this.colVisibility = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COL_FAMILY:
      if (value == null) {
        unsetColFamily();
      } else {
        if (value instanceof byte[]) {
          setColFamily((byte[])value);
        } else {
          setColFamily((java.nio.ByteBuffer)value);
        }
      }
      break;

    case COL_QUALIFIER:
      if (value == null) {
        unsetColQualifier();
      } else {
        if (value instanceof byte[]) {
          setColQualifier((byte[])value);
        } else {
          setColQualifier((java.nio.ByteBuffer)value);
        }
      }
      break;

    case COL_VISIBILITY:
      if (value == null) {
        unsetColVisibility();
      } else {
        if (value instanceof byte[]) {
          setColVisibility((byte[])value);
        } else {
          setColVisibility((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_FAMILY:
      return getColFamily();

    case COL_QUALIFIER:
      return getColQualifier();

    case COL_VISIBILITY:
      return getColVisibility();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COL_FAMILY:
      return isSetColFamily();
    case COL_QUALIFIER:
      return isSetColQualifier();
    case COL_VISIBILITY:
      return isSetColVisibility();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Column)
      return this.equals((Column)that);
    return false;
  }

  public boolean equals(Column that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_colFamily = true && this.isSetColFamily();
    boolean that_present_colFamily = true && that.isSetColFamily();
    if (this_present_colFamily || that_present_colFamily) {
      if (!(this_present_colFamily && that_present_colFamily))
        return false;
      if (!this.colFamily.equals(that.colFamily))
        return false;
    }

    boolean this_present_colQualifier = true && this.isSetColQualifier();
    boolean that_present_colQualifier = true && that.isSetColQualifier();
    if (this_present_colQualifier || that_present_colQualifier) {
      if (!(this_present_colQualifier && that_present_colQualifier))
        return false;
      if (!this.colQualifier.equals(that.colQualifier))
        return false;
    }

    boolean this_present_colVisibility = true && this.isSetColVisibility();
    boolean that_present_colVisibility = true && that.isSetColVisibility();
    if (this_present_colVisibility || that_present_colVisibility) {
      if (!(this_present_colVisibility && that_present_colVisibility))
        return false;
      if (!this.colVisibility.equals(that.colVisibility))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColFamily()) ? 131071 : 524287);
    if (isSetColFamily())
      hashCode = hashCode * 8191 + colFamily.hashCode();

    hashCode = hashCode * 8191 + ((isSetColQualifier()) ? 131071 : 524287);
    if (isSetColQualifier())
      hashCode = hashCode * 8191 + colQualifier.hashCode();

    hashCode = hashCode * 8191 + ((isSetColVisibility()) ? 131071 : 524287);
    if (isSetColVisibility())
      hashCode = hashCode * 8191 + colVisibility.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Column other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetColFamily()).compareTo(other.isSetColFamily());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColFamily()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colFamily, other.colFamily);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetColQualifier()).compareTo(other.isSetColQualifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColQualifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colQualifier, other.colQualifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetColVisibility()).compareTo(other.isSetColVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colVisibility, other.colVisibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Column(");
    boolean first = true;

    sb.append("colFamily:");
    if (this.colFamily == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.colFamily, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colQualifier:");
    if (this.colQualifier == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.colQualifier, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colVisibility:");
    if (this.colVisibility == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.colVisibility, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ColumnStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ColumnStandardScheme getScheme() {
      return new ColumnStandardScheme();
    }
  }

  private static class ColumnStandardScheme extends org.apache.thrift.scheme.StandardScheme<Column> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Column struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_FAMILY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colFamily = iprot.readBinary();
              struct.setColFamilyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COL_QUALIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colQualifier = iprot.readBinary();
              struct.setColQualifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COL_VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colVisibility = iprot.readBinary();
              struct.setColVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Column struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colFamily != null) {
        oprot.writeFieldBegin(COL_FAMILY_FIELD_DESC);
        oprot.writeBinary(struct.colFamily);
        oprot.writeFieldEnd();
      }
      if (struct.colQualifier != null) {
        oprot.writeFieldBegin(COL_QUALIFIER_FIELD_DESC);
        oprot.writeBinary(struct.colQualifier);
        oprot.writeFieldEnd();
      }
      if (struct.colVisibility != null) {
        oprot.writeFieldBegin(COL_VISIBILITY_FIELD_DESC);
        oprot.writeBinary(struct.colVisibility);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ColumnTupleScheme getScheme() {
      return new ColumnTupleScheme();
    }
  }

  private static class ColumnTupleScheme extends org.apache.thrift.scheme.TupleScheme<Column> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Column struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColFamily()) {
        optionals.set(0);
      }
      if (struct.isSetColQualifier()) {
        optionals.set(1);
      }
      if (struct.isSetColVisibility()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetColFamily()) {
        oprot.writeBinary(struct.colFamily);
      }
      if (struct.isSetColQualifier()) {
        oprot.writeBinary(struct.colQualifier);
      }
      if (struct.isSetColVisibility()) {
        oprot.writeBinary(struct.colVisibility);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Column struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.colFamily = iprot.readBinary();
        struct.setColFamilyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.colQualifier = iprot.readBinary();
        struct.setColQualifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.colVisibility = iprot.readBinary();
        struct.setColVisibilityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

