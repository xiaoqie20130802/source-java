package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressClassParametersReferenceFluentImpl<A extends V1IngressClassParametersReferenceFluent<A>> extends BaseFluent<A> implements V1IngressClassParametersReferenceFluent<A>{
  public V1IngressClassParametersReferenceFluentImpl() {
  }
  public V1IngressClassParametersReferenceFluentImpl(V1IngressClassParametersReference instance) {
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withKind(instance.getKind());
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
      this.withScope(instance.getScope());
    }
  }
  private String apiGroup;
  private String kind;
  private String name;
  private String namespace;
  private String scope;
  public String getApiGroup() {
    return this.apiGroup;
  }
  public A withApiGroup(String apiGroup) {
    this.apiGroup=apiGroup; return (A) this;
  }
  public Boolean hasApiGroup() {
    return this.apiGroup != null;
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
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public Boolean hasNamespace() {
    return this.namespace != null;
  }
  public String getScope() {
    return this.scope;
  }
  public A withScope(String scope) {
    this.scope=scope; return (A) this;
  }
  public Boolean hasScope() {
    return this.scope != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressClassParametersReferenceFluentImpl that = (V1IngressClassParametersReferenceFluentImpl) o;
    if (!java.util.Objects.equals(apiGroup, that.apiGroup)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(namespace, that.namespace)) return false;

    if (!java.util.Objects.equals(scope, that.scope)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiGroup,  kind,  name,  namespace,  scope,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroup != null) { sb.append("apiGroup:"); sb.append(apiGroup + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (scope != null) { sb.append("scope:"); sb.append(scope); }
    sb.append("}");
    return sb.toString();
  }
  
}