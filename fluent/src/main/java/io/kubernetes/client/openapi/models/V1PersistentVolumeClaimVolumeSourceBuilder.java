/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1PersistentVolumeClaimVolumeSourceBuilder
    extends V1PersistentVolumeClaimVolumeSourceFluentImpl<
        V1PersistentVolumeClaimVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource,
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder> {
  public V1PersistentVolumeClaimVolumeSourceBuilder() {
    this(false);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      V1PersistentVolumeClaimVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withClaimName(instance.getClaimName());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
    this(instance, false);
  }

  public V1PersistentVolumeClaimVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withClaimName(instance.getClaimName());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource build() {
    V1PersistentVolumeClaimVolumeSource buildable = new V1PersistentVolumeClaimVolumeSource();
    buildable.setClaimName(fluent.getClaimName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
}
