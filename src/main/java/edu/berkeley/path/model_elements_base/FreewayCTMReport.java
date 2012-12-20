/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class FreewayCTMReport extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreewayCTMReport\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"runID\",\"type\":\"long\"},{\"name\":\"time\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},\"doc\":\"Model time, of course\"},{\"name\":\"mean\",\"type\":{\"type\":\"record\",\"name\":\"FreewayCTMState\",\"doc\":\"* State of entire CTM, comprising:\\n   * state of each link,\\n   * state of each origin queue, and\\n   * optionally the in- and out-flows of each link.\",\"fields\":[{\"name\":\"linkState\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FreewayLinkState\",\"doc\":\"* State of one link at one time.\\n   *\\n   * May contain density, velocity, or both.\",\"fields\":[{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"velocity\",\"type\":[\"double\",\"null\"]}]}},\"doc\":\"map key is link id\"},{\"name\":\"queueLength\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is origin link id\"},{\"name\":\"linkFlowState\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FreewayLinkFlowState\",\"doc\":\"* In- and out-flow state of one link at one time.\\n   *\\n   * The in- and out-flows are a quantity of interest computed by a CTM,\\n   * though not needed for either estimation of future time steps of a CTM.\",\"fields\":[{\"name\":\"inFlow\",\"type\":\"double\"},{\"name\":\"outFlow\",\"type\":\"double\"}]}}],\"doc\":\"map key is link id\"}]}},{\"name\":\"stdDev\",\"type\":\"FreewayCTMState\"},{\"name\":\"fd\",\"type\":{\"type\":\"record\",\"name\":\"FDMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\n   * This is sliced off of FDSet at a given time.\\n   *\\n   * Not part of Scenario; can be used interchangeably for\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\\n   * Flow and density values are per lane in SI units.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"criticalSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStd\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStd\",\"type\":\"double\"},{\"name\":\"capacityStd\",\"type\":\"double\"}]}},\"doc\":\"* map of FDs at a given time;\\n     * map key is linkId\"}]}},{\"name\":\"includesFlows\",\"type\":\"boolean\"}]}");
  @Deprecated public long runID;
  /** Model time, of course */
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime time;
  @Deprecated public edu.berkeley.path.model_elements_base.FreewayCTMState mean;
  @Deprecated public edu.berkeley.path.model_elements_base.FreewayCTMState stdDev;
  @Deprecated public edu.berkeley.path.model_elements_base.FDMap fd;
  @Deprecated public boolean includesFlows;

  /**
   * Default constructor.
   */
  public FreewayCTMReport() {}

  /**
   * All-args constructor.
   */
  public FreewayCTMReport(java.lang.Long runID, edu.berkeley.path.model_elements_base.DateTime time, edu.berkeley.path.model_elements_base.FreewayCTMState mean, edu.berkeley.path.model_elements_base.FreewayCTMState stdDev, edu.berkeley.path.model_elements_base.FDMap fd, java.lang.Boolean includesFlows) {
    this.runID = runID;
    this.time = time;
    this.mean = mean;
    this.stdDev = stdDev;
    this.fd = fd;
    this.includesFlows = includesFlows;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return runID;
    case 1: return time;
    case 2: return mean;
    case 3: return stdDev;
    case 4: return fd;
    case 5: return includesFlows;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: runID = (java.lang.Long)value$; break;
    case 1: time = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 2: mean = (edu.berkeley.path.model_elements_base.FreewayCTMState)value$; break;
    case 3: stdDev = (edu.berkeley.path.model_elements_base.FreewayCTMState)value$; break;
    case 4: fd = (edu.berkeley.path.model_elements_base.FDMap)value$; break;
    case 5: includesFlows = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'runID' field.
   */
  public java.lang.Long getRunID() {
    return runID;
  }

  /**
   * Sets the value of the 'runID' field.
   * @param value the value to set.
   */
  public void setRunID(java.lang.Long value) {
    this.runID = value;
  }

  /**
   * Gets the value of the 'time' field.
   * Model time, of course   */
  public edu.berkeley.path.model_elements_base.DateTime getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * Model time, of course   * @param value the value to set.
   */
  public void setTime(edu.berkeley.path.model_elements_base.DateTime value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'mean' field.
   */
  public edu.berkeley.path.model_elements_base.FreewayCTMState getMean() {
    return mean;
  }

  /**
   * Sets the value of the 'mean' field.
   * @param value the value to set.
   */
  public void setMean(edu.berkeley.path.model_elements_base.FreewayCTMState value) {
    this.mean = value;
  }

  /**
   * Gets the value of the 'stdDev' field.
   */
  public edu.berkeley.path.model_elements_base.FreewayCTMState getStdDev() {
    return stdDev;
  }

  /**
   * Sets the value of the 'stdDev' field.
   * @param value the value to set.
   */
  public void setStdDev(edu.berkeley.path.model_elements_base.FreewayCTMState value) {
    this.stdDev = value;
  }

  /**
   * Gets the value of the 'fd' field.
   */
  public edu.berkeley.path.model_elements_base.FDMap getFd() {
    return fd;
  }

  /**
   * Sets the value of the 'fd' field.
   * @param value the value to set.
   */
  public void setFd(edu.berkeley.path.model_elements_base.FDMap value) {
    this.fd = value;
  }

  /**
   * Gets the value of the 'includesFlows' field.
   */
  public java.lang.Boolean getIncludesFlows() {
    return includesFlows;
  }

  /**
   * Sets the value of the 'includesFlows' field.
   * @param value the value to set.
   */
  public void setIncludesFlows(java.lang.Boolean value) {
    this.includesFlows = value;
  }

  /** Creates a new FreewayCTMReport RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder();
  }
  
  /** Creates a new FreewayCTMReport RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder other) {
    return new edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder(other);
  }
  
  /** Creates a new FreewayCTMReport RecordBuilder by copying an existing FreewayCTMReport instance */
  public static edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayCTMReport other) {
    return new edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder(other);
  }
  
  /**
   * RecordBuilder for FreewayCTMReport instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreewayCTMReport>
    implements org.apache.avro.data.RecordBuilder<FreewayCTMReport> {

    private long runID;
    private edu.berkeley.path.model_elements_base.DateTime time;
    private edu.berkeley.path.model_elements_base.FreewayCTMState mean;
    private edu.berkeley.path.model_elements_base.FreewayCTMState stdDev;
    private edu.berkeley.path.model_elements_base.FDMap fd;
    private boolean includesFlows;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FreewayCTMReport.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FreewayCTMReport instance */
    private Builder(edu.berkeley.path.model_elements_base.FreewayCTMReport other) {
            super(edu.berkeley.path.model_elements_base.FreewayCTMReport.SCHEMA$);
      if (isValidValue(fields()[0], other.runID)) {
        this.runID = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.runID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mean)) {
        this.mean = (edu.berkeley.path.model_elements_base.FreewayCTMState) data().deepCopy(fields()[2].schema(), other.mean);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.stdDev)) {
        this.stdDev = (edu.berkeley.path.model_elements_base.FreewayCTMState) data().deepCopy(fields()[3].schema(), other.stdDev);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.fd)) {
        this.fd = (edu.berkeley.path.model_elements_base.FDMap) data().deepCopy(fields()[4].schema(), other.fd);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.includesFlows)) {
        this.includesFlows = (java.lang.Boolean) data().deepCopy(fields()[5].schema(), other.includesFlows);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'runID' field */
    public java.lang.Long getRunID() {
      return runID;
    }
    
    /** Sets the value of the 'runID' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setRunID(long value) {
      validate(fields()[0], value);
      this.runID = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'runID' field has been set */
    public boolean hasRunID() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'runID' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearRunID() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'time' field */
    public edu.berkeley.path.model_elements_base.DateTime getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setTime(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[1], value);
      this.time = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'time' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearTime() {
      time = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'mean' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMState getMean() {
      return mean;
    }
    
    /** Sets the value of the 'mean' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setMean(edu.berkeley.path.model_elements_base.FreewayCTMState value) {
      validate(fields()[2], value);
      this.mean = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'mean' field has been set */
    public boolean hasMean() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'mean' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearMean() {
      mean = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'stdDev' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMState getStdDev() {
      return stdDev;
    }
    
    /** Sets the value of the 'stdDev' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setStdDev(edu.berkeley.path.model_elements_base.FreewayCTMState value) {
      validate(fields()[3], value);
      this.stdDev = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'stdDev' field has been set */
    public boolean hasStdDev() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'stdDev' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearStdDev() {
      stdDev = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'fd' field */
    public edu.berkeley.path.model_elements_base.FDMap getFd() {
      return fd;
    }
    
    /** Sets the value of the 'fd' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setFd(edu.berkeley.path.model_elements_base.FDMap value) {
      validate(fields()[4], value);
      this.fd = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'fd' field has been set */
    public boolean hasFd() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'fd' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearFd() {
      fd = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'includesFlows' field */
    public java.lang.Boolean getIncludesFlows() {
      return includesFlows;
    }
    
    /** Sets the value of the 'includesFlows' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder setIncludesFlows(boolean value) {
      validate(fields()[5], value);
      this.includesFlows = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'includesFlows' field has been set */
    public boolean hasIncludesFlows() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'includesFlows' field */
    public edu.berkeley.path.model_elements_base.FreewayCTMReport.Builder clearIncludesFlows() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public FreewayCTMReport build() {
      try {
        FreewayCTMReport record = new FreewayCTMReport();
        record.runID = fieldSetFlags()[0] ? this.runID : (java.lang.Long) defaultValue(fields()[0]);
        record.time = fieldSetFlags()[1] ? this.time : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[1]);
        record.mean = fieldSetFlags()[2] ? this.mean : (edu.berkeley.path.model_elements_base.FreewayCTMState) defaultValue(fields()[2]);
        record.stdDev = fieldSetFlags()[3] ? this.stdDev : (edu.berkeley.path.model_elements_base.FreewayCTMState) defaultValue(fields()[3]);
        record.fd = fieldSetFlags()[4] ? this.fd : (edu.berkeley.path.model_elements_base.FDMap) defaultValue(fields()[4]);
        record.includesFlows = fieldSetFlags()[5] ? this.includesFlows : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
