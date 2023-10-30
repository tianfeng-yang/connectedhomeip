/*
 *
 *    Copyright (c) 2023 Project CHIP Authors
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package matter.devicecontroller.cluster.clusters

import java.util.ArrayList

class ActivatedCarbonFilterMonitoringCluster(private val endpointId: UShort) {
  class LastChangedTimeAttribute(val value: UInt?)

  class ReplacementProductListAttribute(
    val value:
      ArrayList<ChipStructs.ActivatedCarbonFilterMonitoringClusterReplacementProductStruct>?
  )

  class GeneratedCommandListAttribute(val value: ArrayList<UInt>)

  class AcceptedCommandListAttribute(val value: ArrayList<UInt>)

  class EventListAttribute(val value: ArrayList<UInt>)

  class AttributeListAttribute(val value: ArrayList<UInt>)

  suspend fun resetCondition(timedInvokeTimeoutMs: Int? = null) {
    if (timedInvokeTimeoutMs != null) {
      // Do the action with timedInvokeTimeoutMs
    } else {
      // Do the action without timedInvokeTimeoutMs
    }
  }

  suspend fun readConditionAttribute(): UByte {
    // Implementation needs to be added here
  }

  suspend fun subscribeConditionAttribute(minInterval: Int, maxInterval: Int): UByte {
    // Implementation needs to be added here
  }

  suspend fun readDegradationDirectionAttribute(): UByte {
    // Implementation needs to be added here
  }

  suspend fun subscribeDegradationDirectionAttribute(minInterval: Int, maxInterval: Int): UByte {
    // Implementation needs to be added here
  }

  suspend fun readChangeIndicationAttribute(): UByte {
    // Implementation needs to be added here
  }

  suspend fun subscribeChangeIndicationAttribute(minInterval: Int, maxInterval: Int): UByte {
    // Implementation needs to be added here
  }

  suspend fun readInPlaceIndicatorAttribute(): Boolean {
    // Implementation needs to be added here
  }

  suspend fun subscribeInPlaceIndicatorAttribute(minInterval: Int, maxInterval: Int): Boolean {
    // Implementation needs to be added here
  }

  suspend fun readLastChangedTimeAttribute(): LastChangedTimeAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeLastChangedTimeAttribute(value: UInt) {
    // Implementation needs to be added here
  }

  suspend fun writeLastChangedTimeAttribute(value: UInt, timedWriteTimeoutMs: Int) {
    // Implementation needs to be added here
  }

  suspend fun subscribeLastChangedTimeAttribute(
    minInterval: Int,
    maxInterval: Int
  ): LastChangedTimeAttribute {
    // Implementation needs to be added here
  }

  suspend fun readReplacementProductListAttribute(): ReplacementProductListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeReplacementProductListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): ReplacementProductListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readGeneratedCommandListAttribute(): GeneratedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeGeneratedCommandListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): GeneratedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readAcceptedCommandListAttribute(): AcceptedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeAcceptedCommandListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): AcceptedCommandListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readEventListAttribute(): EventListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeEventListAttribute(minInterval: Int, maxInterval: Int): EventListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readAttributeListAttribute(): AttributeListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeAttributeListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): AttributeListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readFeatureMapAttribute(): UInt {
    // Implementation needs to be added here
  }

  suspend fun subscribeFeatureMapAttribute(minInterval: Int, maxInterval: Int): UInt {
    // Implementation needs to be added here
  }

  suspend fun readClusterRevisionAttribute(): UShort {
    // Implementation needs to be added here
  }

  suspend fun subscribeClusterRevisionAttribute(minInterval: Int, maxInterval: Int): UShort {
    // Implementation needs to be added here
  }

  companion object {
    const val CLUSTER_ID: UInt = 114u
  }
}
