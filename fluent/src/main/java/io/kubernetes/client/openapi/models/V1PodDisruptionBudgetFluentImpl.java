package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodDisruptionBudgetFluentImpl<A extends V1PodDisruptionBudgetFluent<A>> extends BaseFluent<A> implements V1PodDisruptionBudgetFluent<A>{
  public V1PodDisruptionBudgetFluentImpl() {
  }
  public V1PodDisruptionBudgetFluentImpl(V1PodDisruptionBudget instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1PodDisruptionBudgetSpecBuilder spec;
  private V1PodDisruptionBudgetStatusBuilder status;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1PodDisruptionBudgetFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1PodDisruptionBudgetFluentImpl.MetadataNestedImpl();
  }
  public V1PodDisruptionBudgetFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1PodDisruptionBudgetFluentImpl.MetadataNestedImpl(item);
  }
  public V1PodDisruptionBudgetFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1PodDisruptionBudgetFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1PodDisruptionBudgetFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodDisruptionBudgetSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1PodDisruptionBudgetSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1PodDisruptionBudgetSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1PodDisruptionBudgetSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1PodDisruptionBudgetFluentImpl.SpecNested<A> withNewSpec() {
    return new V1PodDisruptionBudgetFluentImpl.SpecNestedImpl();
  }
  public V1PodDisruptionBudgetFluentImpl.SpecNested<A> withNewSpecLike(V1PodDisruptionBudgetSpec item) {
    return new V1PodDisruptionBudgetFluentImpl.SpecNestedImpl(item);
  }
  public V1PodDisruptionBudgetFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1PodDisruptionBudgetFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1PodDisruptionBudgetSpecBuilder().build());
  }
  public V1PodDisruptionBudgetFluentImpl.SpecNested<A> editOrNewSpecLike(V1PodDisruptionBudgetSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodDisruptionBudgetStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1PodDisruptionBudgetStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1PodDisruptionBudgetStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1PodDisruptionBudgetStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1PodDisruptionBudgetFluentImpl.StatusNested<A> withNewStatus() {
    return new V1PodDisruptionBudgetFluentImpl.StatusNestedImpl();
  }
  public V1PodDisruptionBudgetFluentImpl.StatusNested<A> withNewStatusLike(V1PodDisruptionBudgetStatus item) {
    return new V1PodDisruptionBudgetFluentImpl.StatusNestedImpl(item);
  }
  public V1PodDisruptionBudgetFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1PodDisruptionBudgetFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1PodDisruptionBudgetStatusBuilder().build());
  }
  public V1PodDisruptionBudgetFluentImpl.StatusNested<A> editOrNewStatusLike(V1PodDisruptionBudgetStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDisruptionBudgetFluentImpl that = (V1PodDisruptionBudgetFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    if (!java.util.Objects.equals(status, that.status)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1PodDisruptionBudgetFluentImpl.MetadataNested<N>> implements V1PodDisruptionBudgetFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1PodDisruptionBudgetFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1PodDisruptionBudgetSpecFluentImpl<V1PodDisruptionBudgetFluentImpl.SpecNested<N>> implements V1PodDisruptionBudgetFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1PodDisruptionBudgetSpec item) {
      this.builder = new V1PodDisruptionBudgetSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1PodDisruptionBudgetSpecBuilder(this);
    }
    V1PodDisruptionBudgetSpecBuilder builder;
    public N and() {
      return (N) V1PodDisruptionBudgetFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1PodDisruptionBudgetStatusFluentImpl<V1PodDisruptionBudgetFluentImpl.StatusNested<N>> implements V1PodDisruptionBudgetFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1PodDisruptionBudgetStatus item) {
      this.builder = new V1PodDisruptionBudgetStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1PodDisruptionBudgetStatusBuilder(this);
    }
    V1PodDisruptionBudgetStatusBuilder builder;
    public N and() {
      return (N) V1PodDisruptionBudgetFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}