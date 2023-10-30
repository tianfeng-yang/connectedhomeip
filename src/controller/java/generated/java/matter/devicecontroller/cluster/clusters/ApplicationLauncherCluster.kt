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

class ApplicationLauncherCluster(private val endpointId: UShort) {
  class LauncherResponse(val status: UInt, val data: ByteArray?)

  class CatalogListAttribute(val value: ArrayList<UShort>?)

  class CurrentAppAttribute(val value: ChipStructs.ApplicationLauncherClusterApplicationEPStruct?)

  class GeneratedCommandListAttribute(val value: ArrayList<UInt>)

  class AcceptedCommandListAttribute(val value: ArrayList<UInt>)

  class EventListAttribute(val value: ArrayList<UInt>)

  class AttributeListAttribute(val value: ArrayList<UInt>)

  suspend fun launchApp(
    application: ChipStructs.ApplicationLauncherClusterApplicationStruct?,
    data: ByteArray?,
    timedInvokeTimeoutMs: Int? = null
  ): LauncherResponse {
    if (timedInvokeTimeoutMs != null) {
      // Do the action with timedInvokeTimeoutMs
    } else {
      // Do the action without timedInvokeTimeoutMs
    }
  }

  suspend fun stopApp(
    application: ChipStructs.ApplicationLauncherClusterApplicationStruct?,
    timedInvokeTimeoutMs: Int? = null
  ): LauncherResponse {
    if (timedInvokeTimeoutMs != null) {
      // Do the action with timedInvokeTimeoutMs
    } else {
      // Do the action without timedInvokeTimeoutMs
    }
  }

  suspend fun hideApp(
    application: ChipStructs.ApplicationLauncherClusterApplicationStruct?,
    timedInvokeTimeoutMs: Int? = null
  ): LauncherResponse {
    if (timedInvokeTimeoutMs != null) {
      // Do the action with timedInvokeTimeoutMs
    } else {
      // Do the action without timedInvokeTimeoutMs
    }
  }

  suspend fun readCatalogListAttribute(): CatalogListAttribute {
    // Implementation needs to be added here
  }

  suspend fun subscribeCatalogListAttribute(
    minInterval: Int,
    maxInterval: Int
  ): CatalogListAttribute {
    // Implementation needs to be added here
  }

  suspend fun readCurrentAppAttribute(): CurrentAppAttribute {
    // Implementation needs to be added here
  }

  suspend fun writeCurrentAppAttribute(
    value: ChipStructs.ApplicationLauncherClusterApplicationEPStruct
  ) {
    // Implementation needs to be added here
  }

  suspend fun writeCurrentAppAttribute(
    value: ChipStructs.ApplicationLauncherClusterApplicationEPStruct,
    timedWriteTimeoutMs: Int
  ) {
    // Implementation needs to be added here
  }

  suspend fun subscribeCurrentAppAttribute(
    minInterval: Int,
    maxInterval: Int
  ): CurrentAppAttribute {
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
    const val CLUSTER_ID: UInt = 1292u
  }
}
