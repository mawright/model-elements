/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import java.util.*;

public class DemandProfile extends edu.berkeley.path.model_elements_base.DemandProfile {
  public void addFlowAt(Long vehTypeID, Double flow) {
    addFlowAt(vehTypeID.toString(), flow);
  }
  
  public void addFlowAt(String vehTypeID, Double flow) {
    Map<String, List<Double>> flowMap = getFlow();
    
    if (flowMap == null) {
      flowMap = new HashMap<String ,List<Double>>();
      setFlow(flowMap);
    }
    
    addFlowToMapAt(flowMap, vehTypeID, flow);
  }

  public static void addFlowToMapAt(
      Map<String, List<Double>> flowMap,
      Long vehTypeID, Double flow) {
    addFlowToMapAt(flowMap, vehTypeID.toString(), flow);
  }
  
  public static void addFlowToMapAt(
      Map<String ,List<Double>> flowMap,
      String vehTypeID, Double flow) {
    
    List<Double> vehTypeList =
      flowMap.get(vehTypeID);
    
    if (vehTypeList == null) {
      vehTypeList = new ArrayList<Double>();
      flowMap.put(vehTypeID, vehTypeList);
    }
    
    vehTypeList.add(flow);
  }
  
  /**
   * Get the flow map. Never returns null (creates the map if it doesn't exist).
   */
  @Override
  public Map<String,List<Double>> getFlow() {
    if (null == super.getFlow()) {
      setFlow(new HashMap<java.lang.String,List<Double>>());
    }
    return super.getFlow();
  }

  public Long getDestinationNetworkLongId() {
    if (null != getDestinationNetworkId()) {
      return Long.parseLong(getDestinationNetworkId().toString());
    }
    return null;
  }
  
  public void setDestinationNetworkLongId(Long id) {
    setDestinationNetworkId(id.toString());
  }
}
