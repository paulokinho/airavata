/**
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
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.messaging.event;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-2")
public class TaskOutputChangeEvent implements org.apache.thrift.TBase<TaskOutputChangeEvent, TaskOutputChangeEvent._Fields>, java.io.Serializable, Cloneable, Comparable<TaskOutputChangeEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskOutputChangeEvent");

  private static final org.apache.thrift.protocol.TField OUTPUT_FIELD_DESC = new org.apache.thrift.protocol.TField("output", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_IDENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("taskIdentity", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskOutputChangeEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskOutputChangeEventTupleSchemeFactory());
  }

  public List<org.apache.airavata.model.application.io.OutputDataObjectType> output; // required
  public TaskIdentifier taskIdentity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OUTPUT((short)1, "output"),
    TASK_IDENTITY((short)2, "taskIdentity");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OUTPUT
          return OUTPUT;
        case 2: // TASK_IDENTITY
          return TASK_IDENTITY;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OUTPUT, new org.apache.thrift.meta_data.FieldMetaData("output", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.airavata.model.application.io.OutputDataObjectType.class))));
    tmpMap.put(_Fields.TASK_IDENTITY, new org.apache.thrift.meta_data.FieldMetaData("taskIdentity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskIdentifier.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskOutputChangeEvent.class, metaDataMap);
  }

  public TaskOutputChangeEvent() {
  }

  public TaskOutputChangeEvent(
    List<org.apache.airavata.model.application.io.OutputDataObjectType> output,
    TaskIdentifier taskIdentity)
  {
    this();
    this.output = output;
    this.taskIdentity = taskIdentity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskOutputChangeEvent(TaskOutputChangeEvent other) {
    if (other.isSetOutput()) {
      List<org.apache.airavata.model.application.io.OutputDataObjectType> __this__output = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(other.output.size());
      for (org.apache.airavata.model.application.io.OutputDataObjectType other_element : other.output) {
        __this__output.add(new org.apache.airavata.model.application.io.OutputDataObjectType(other_element));
      }
      this.output = __this__output;
    }
    if (other.isSetTaskIdentity()) {
      this.taskIdentity = new TaskIdentifier(other.taskIdentity);
    }
  }

  public TaskOutputChangeEvent deepCopy() {
    return new TaskOutputChangeEvent(this);
  }

  @Override
  public void clear() {
    this.output = null;
    this.taskIdentity = null;
  }

  public int getOutputSize() {
    return (this.output == null) ? 0 : this.output.size();
  }

  public java.util.Iterator<org.apache.airavata.model.application.io.OutputDataObjectType> getOutputIterator() {
    return (this.output == null) ? null : this.output.iterator();
  }

  public void addToOutput(org.apache.airavata.model.application.io.OutputDataObjectType elem) {
    if (this.output == null) {
      this.output = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>();
    }
    this.output.add(elem);
  }

  public List<org.apache.airavata.model.application.io.OutputDataObjectType> getOutput() {
    return this.output;
  }

  public TaskOutputChangeEvent setOutput(List<org.apache.airavata.model.application.io.OutputDataObjectType> output) {
    this.output = output;
    return this;
  }

  public void unsetOutput() {
    this.output = null;
  }

  /** Returns true if field output is set (has been assigned a value) and false otherwise */
  public boolean isSetOutput() {
    return this.output != null;
  }

  public void setOutputIsSet(boolean value) {
    if (!value) {
      this.output = null;
    }
  }

  public TaskIdentifier getTaskIdentity() {
    return this.taskIdentity;
  }

  public TaskOutputChangeEvent setTaskIdentity(TaskIdentifier taskIdentity) {
    this.taskIdentity = taskIdentity;
    return this;
  }

  public void unsetTaskIdentity() {
    this.taskIdentity = null;
  }

  /** Returns true if field taskIdentity is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskIdentity() {
    return this.taskIdentity != null;
  }

  public void setTaskIdentityIsSet(boolean value) {
    if (!value) {
      this.taskIdentity = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OUTPUT:
      if (value == null) {
        unsetOutput();
      } else {
        setOutput((List<org.apache.airavata.model.application.io.OutputDataObjectType>)value);
      }
      break;

    case TASK_IDENTITY:
      if (value == null) {
        unsetTaskIdentity();
      } else {
        setTaskIdentity((TaskIdentifier)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OUTPUT:
      return getOutput();

    case TASK_IDENTITY:
      return getTaskIdentity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OUTPUT:
      return isSetOutput();
    case TASK_IDENTITY:
      return isSetTaskIdentity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskOutputChangeEvent)
      return this.equals((TaskOutputChangeEvent)that);
    return false;
  }

  public boolean equals(TaskOutputChangeEvent that) {
    if (that == null)
      return false;

    boolean this_present_output = true && this.isSetOutput();
    boolean that_present_output = true && that.isSetOutput();
    if (this_present_output || that_present_output) {
      if (!(this_present_output && that_present_output))
        return false;
      if (!this.output.equals(that.output))
        return false;
    }

    boolean this_present_taskIdentity = true && this.isSetTaskIdentity();
    boolean that_present_taskIdentity = true && that.isSetTaskIdentity();
    if (this_present_taskIdentity || that_present_taskIdentity) {
      if (!(this_present_taskIdentity && that_present_taskIdentity))
        return false;
      if (!this.taskIdentity.equals(that.taskIdentity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_output = true && (isSetOutput());
    list.add(present_output);
    if (present_output)
      list.add(output);

    boolean present_taskIdentity = true && (isSetTaskIdentity());
    list.add(present_taskIdentity);
    if (present_taskIdentity)
      list.add(taskIdentity);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskOutputChangeEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOutput()).compareTo(other.isSetOutput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutput()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output, other.output);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskIdentity()).compareTo(other.isSetTaskIdentity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskIdentity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskIdentity, other.taskIdentity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskOutputChangeEvent(");
    boolean first = true;

    sb.append("output:");
    if (this.output == null) {
      sb.append("null");
    } else {
      sb.append(this.output);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskIdentity:");
    if (this.taskIdentity == null) {
      sb.append("null");
    } else {
      sb.append(this.taskIdentity);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (output == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'output' was not present! Struct: " + toString());
    }
    if (taskIdentity == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskIdentity' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (taskIdentity != null) {
      taskIdentity.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskOutputChangeEventStandardSchemeFactory implements SchemeFactory {
    public TaskOutputChangeEventStandardScheme getScheme() {
      return new TaskOutputChangeEventStandardScheme();
    }
  }

  private static class TaskOutputChangeEventStandardScheme extends StandardScheme<TaskOutputChangeEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OUTPUT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.output = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list0.size);
                org.apache.airavata.model.application.io.OutputDataObjectType _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.airavata.model.application.io.OutputDataObjectType();
                  _elem1.read(iprot);
                  struct.output.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setOutputIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_IDENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskIdentity = new TaskIdentifier();
              struct.taskIdentity.read(iprot);
              struct.setTaskIdentityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.output != null) {
        oprot.writeFieldBegin(OUTPUT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.output.size()));
          for (org.apache.airavata.model.application.io.OutputDataObjectType _iter3 : struct.output)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.taskIdentity != null) {
        oprot.writeFieldBegin(TASK_IDENTITY_FIELD_DESC);
        struct.taskIdentity.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskOutputChangeEventTupleSchemeFactory implements SchemeFactory {
    public TaskOutputChangeEventTupleScheme getScheme() {
      return new TaskOutputChangeEventTupleScheme();
    }
  }

  private static class TaskOutputChangeEventTupleScheme extends TupleScheme<TaskOutputChangeEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.output.size());
        for (org.apache.airavata.model.application.io.OutputDataObjectType _iter4 : struct.output)
        {
          _iter4.write(oprot);
        }
      }
      struct.taskIdentity.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.output = new ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list5.size);
        org.apache.airavata.model.application.io.OutputDataObjectType _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new org.apache.airavata.model.application.io.OutputDataObjectType();
          _elem6.read(iprot);
          struct.output.add(_elem6);
        }
      }
      struct.setOutputIsSet(true);
      struct.taskIdentity = new TaskIdentifier();
      struct.taskIdentity.read(iprot);
      struct.setTaskIdentityIsSet(true);
    }
  }

}

