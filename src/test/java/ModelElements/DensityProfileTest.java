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
 * 3. Neither the name of the University nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
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

package ModelElements;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

import edu.berkeley.path.ModelElements.*;

public class DensityProfileTest {
  Network nw;
  Network.Builder nwb;
  
  DensityProfile dp;
  DensityProfile.Builder dpb;
  
  @Before
  public void setup() {
    nwb = Network.newBuilder();
    nwb.setName("test network"); // there's no default for this
    nw = nwb.build(); // applies the defaults
    
    dpb = DensityProfile.newBuilder();
    dpb.setId("2");
    
    dp = dpb.build();
    
    Map<CharSequence,List<Double>> vpm =
      new HashMap<CharSequence,List<Double>>();
          
    dp.setVehiclesPerMeter(vpm);
    
    List<Double> row = new ArrayList();
    row.add(1.0);
    row.add(2.0);
    row.add(3.0);
    
    vpm.put("1", row);
  }

  @Test
  public void testDensityProfile() {
    assertEquals((Double)2.0, dp.getVehiclesPerMeter().get("1").get(1));
  }
}
