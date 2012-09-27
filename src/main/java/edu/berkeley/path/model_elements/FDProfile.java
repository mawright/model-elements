/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements;  
@SuppressWarnings("all")
/** Fundamental diagrams on each link as time series */
public class FDProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FDProfile\",\"namespace\":\"edu.berkeley.path.model_elements\",\"doc\":\"Fundamental diagrams on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"Fundamental diagram on one link at one time\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStdev\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStdev\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"capacityStdev\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"}]}}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]}");
  @Deprecated public double dt;
  @Deprecated public double startTime;
  /** map key is linkId, array is time series, as per dt and startTime. */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> fd;

  /**
   * Default constructor.
   */
  public FDProfile() {}

  /**
   * All-args constructor.
   */
  public FDProfile(java.lang.Double dt, java.lang.Double startTime, java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> fd) {
    this.dt = dt;
    this.startTime = startTime;
    this.fd = fd;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dt;
    case 1: return startTime;
    case 2: return fd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dt = (java.lang.Double)value$; break;
    case 1: startTime = (java.lang.Double)value$; break;
    case 2: fd = (java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'dt' field.
   */
  public java.lang.Double getDt() {
    return dt;
  }

  /**
   * Sets the value of the 'dt' field.
   * @param value the value to set.
   */
  public void setDt(java.lang.Double value) {
    this.dt = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   */
  public java.lang.Double getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Double value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'fd' field.
   * map key is linkId, array is time series, as per dt and startTime.   */
  public java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> getFd() {
    return fd;
  }

  /**
   * Sets the value of the 'fd' field.
   * map key is linkId, array is time series, as per dt and startTime.   * @param value the value to set.
   */
  public void setFd(java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> value) {
    this.fd = value;
  }

  /** Creates a new FDProfile RecordBuilder */
  public static edu.berkeley.path.model_elements.FDProfile.Builder newBuilder() {
    return new edu.berkeley.path.model_elements.FDProfile.Builder();
  }
  
  /** Creates a new FDProfile RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements.FDProfile.Builder newBuilder(edu.berkeley.path.model_elements.FDProfile.Builder other) {
    return new edu.berkeley.path.model_elements.FDProfile.Builder(other);
  }
  
  /** Creates a new FDProfile RecordBuilder by copying an existing FDProfile instance */
  public static edu.berkeley.path.model_elements.FDProfile.Builder newBuilder(edu.berkeley.path.model_elements.FDProfile other) {
    return new edu.berkeley.path.model_elements.FDProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for FDProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FDProfile>
    implements org.apache.avro.data.RecordBuilder<FDProfile> {

    private double dt;
    private double startTime;
    private java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> fd;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements.FDProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements.FDProfile.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FDProfile instance */
    private Builder(edu.berkeley.path.model_elements.FDProfile other) {
            super(edu.berkeley.path.model_elements.FDProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.dt)) {
        this.dt = (java.lang.Double) data().deepCopy(fields()[0].schema(), other.dt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startTime)) {
        this.startTime = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.startTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.fd)) {
        this.fd = (java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>>) data().deepCopy(fields()[2].schema(), other.fd);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'dt' field */
    public java.lang.Double getDt() {
      return dt;
    }
    
    /** Sets the value of the 'dt' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder setDt(double value) {
      validate(fields()[0], value);
      this.dt = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'dt' field has been set */
    public boolean hasDt() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'dt' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder clearDt() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.Double getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder setStartTime(double value) {
      validate(fields()[1], value);
      this.startTime = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'startTime' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder clearStartTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'fd' field */
    public java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> getFd() {
      return fd;
    }
    
    /** Sets the value of the 'fd' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder setFd(java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>> value) {
      validate(fields()[2], value);
      this.fd = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'fd' field has been set */
    public boolean hasFd() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'fd' field */
    public edu.berkeley.path.model_elements.FDProfile.Builder clearFd() {
      fd = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FDProfile build() {
      try {
        FDProfile record = new FDProfile();
        record.dt = fieldSetFlags()[0] ? this.dt : (java.lang.Double) defaultValue(fields()[0]);
        record.startTime = fieldSetFlags()[1] ? this.startTime : (java.lang.Double) defaultValue(fields()[1]);
        record.fd = fieldSetFlags()[2] ? this.fd : (java.util.Map<java.lang.CharSequence,java.util.List<edu.berkeley.path.model_elements.FD>>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
