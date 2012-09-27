/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements;  
@SuppressWarnings("all")
/** Velocity on each link and cell at a point in time */
public class VelocityProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VelocityProfile\",\"namespace\":\"edu.berkeley.path.model_elements\",\"doc\":\"Velocity on each link and cell at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId\",\"default\":{}}]}");
  @Deprecated public java.lang.CharSequence id;
  /** map key is linkId */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> metersPerSecond;

  /**
   * Default constructor.
   */
  public VelocityProfile() {}

  /**
   * All-args constructor.
   */
  public VelocityProfile(java.lang.CharSequence id, java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> metersPerSecond) {
    this.id = id;
    this.metersPerSecond = metersPerSecond;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return metersPerSecond;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: metersPerSecond = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'metersPerSecond' field.
   * map key is linkId   */
  public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getMetersPerSecond() {
    return metersPerSecond;
  }

  /**
   * Sets the value of the 'metersPerSecond' field.
   * map key is linkId   * @param value the value to set.
   */
  public void setMetersPerSecond(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
    this.metersPerSecond = value;
  }

  /** Creates a new VelocityProfile RecordBuilder */
  public static edu.berkeley.path.model_elements.VelocityProfile.Builder newBuilder() {
    return new edu.berkeley.path.model_elements.VelocityProfile.Builder();
  }
  
  /** Creates a new VelocityProfile RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements.VelocityProfile.Builder newBuilder(edu.berkeley.path.model_elements.VelocityProfile.Builder other) {
    return new edu.berkeley.path.model_elements.VelocityProfile.Builder(other);
  }
  
  /** Creates a new VelocityProfile RecordBuilder by copying an existing VelocityProfile instance */
  public static edu.berkeley.path.model_elements.VelocityProfile.Builder newBuilder(edu.berkeley.path.model_elements.VelocityProfile other) {
    return new edu.berkeley.path.model_elements.VelocityProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for VelocityProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VelocityProfile>
    implements org.apache.avro.data.RecordBuilder<VelocityProfile> {

    private java.lang.CharSequence id;
    private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> metersPerSecond;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements.VelocityProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements.VelocityProfile.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing VelocityProfile instance */
    private Builder(edu.berkeley.path.model_elements.VelocityProfile other) {
            super(edu.berkeley.path.model_elements.VelocityProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.metersPerSecond)) {
        this.metersPerSecond = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>) data().deepCopy(fields()[1].schema(), other.metersPerSecond);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements.VelocityProfile.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements.VelocityProfile.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'metersPerSecond' field */
    public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> getMetersPerSecond() {
      return metersPerSecond;
    }
    
    /** Sets the value of the 'metersPerSecond' field */
    public edu.berkeley.path.model_elements.VelocityProfile.Builder setMetersPerSecond(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>> value) {
      validate(fields()[1], value);
      this.metersPerSecond = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'metersPerSecond' field has been set */
    public boolean hasMetersPerSecond() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'metersPerSecond' field */
    public edu.berkeley.path.model_elements.VelocityProfile.Builder clearMetersPerSecond() {
      metersPerSecond = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public VelocityProfile build() {
      try {
        VelocityProfile record = new VelocityProfile();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.metersPerSecond = fieldSetFlags()[1] ? this.metersPerSecond : (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.Double>>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
