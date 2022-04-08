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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1CronJobFluentImpl<A extends V1beta1CronJobFluent<A>> extends BaseFluent<A>
    implements V1beta1CronJobFluent<A> {
  public V1beta1CronJobFluentImpl() {}

  public V1beta1CronJobFluentImpl(io.kubernetes.client.openapi.models.V1beta1CronJob instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());
  }

  private String apiVersion;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;
  private V1beta1CronJobSpecBuilder spec;
  private V1beta1CronJobStatusBuilder status;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1beta1CronJobFluent.MetadataNested<A> withNewMetadata() {
    return new V1beta1CronJobFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1beta1CronJobFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1CronJobSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1beta1CronJobSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new io.kubernetes.client.openapi.models.V1beta1CronJobSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public V1beta1CronJobFluent.SpecNested<A> withNewSpec() {
    return new V1beta1CronJobFluentImpl.SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1beta1CronJobSpec item) {
    return new io.kubernetes.client.openapi.models.V1beta1CronJobFluentImpl.SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1beta1CronJobSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.SpecNested<A> editOrNewSpecLike(
      io.kubernetes.client.openapi.models.V1beta1CronJobSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1CronJobStatus getStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public A withStatus(io.kubernetes.client.openapi.models.V1beta1CronJobStatus status) {
    _visitables.get("status").remove(this.status);
    if (status != null) {
      this.status = new V1beta1CronJobStatusBuilder(status);
      _visitables.get("status").add(this.status);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public V1beta1CronJobFluent.StatusNested<A> withNewStatus() {
    return new V1beta1CronJobFluentImpl.StatusNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.StatusNested<A> withNewStatusLike(
      io.kubernetes.client.openapi.models.V1beta1CronJobStatus item) {
    return new io.kubernetes.client.openapi.models.V1beta1CronJobFluentImpl.StatusNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.StatusNested<A>
      editOrNewStatus() {
    return withNewStatusLike(
        getStatus() != null
            ? getStatus()
            : new io.kubernetes.client.openapi.models.V1beta1CronJobStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1CronJobFluent.StatusNested<A>
      editOrNewStatusLike(io.kubernetes.client.openapi.models.V1beta1CronJobStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1CronJobFluentImpl that = (V1beta1CronJobFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, spec, status, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (spec != null) {
      sb.append("spec:");
      sb.append(spec + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1beta1CronJobFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1CronJobFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1beta1CronJobFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N> extends V1beta1CronJobSpecFluentImpl<V1beta1CronJobFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1CronJobFluent.SpecNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(io.kubernetes.client.openapi.models.V1beta1CronJobSpec item) {
      this.builder = new V1beta1CronJobSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1CronJobSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1CronJobSpecBuilder builder;

    public N and() {
      return (N) V1beta1CronJobFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }

  class StatusNestedImpl<N>
      extends V1beta1CronJobStatusFluentImpl<V1beta1CronJobFluent.StatusNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1CronJobFluent.StatusNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StatusNestedImpl(V1beta1CronJobStatus item) {
      this.builder = new V1beta1CronJobStatusBuilder(this, item);
    }

    StatusNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1CronJobStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1CronJobStatusBuilder builder;

    public N and() {
      return (N) V1beta1CronJobFluentImpl.this.withStatus(builder.build());
    }

    public N endStatus() {
      return and();
    }
  }
}
