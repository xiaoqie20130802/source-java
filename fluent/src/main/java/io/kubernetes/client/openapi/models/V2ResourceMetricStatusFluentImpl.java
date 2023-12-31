package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2ResourceMetricStatusFluentImpl<A extends V2ResourceMetricStatusFluent<A>> extends BaseFluent<A> implements V2ResourceMetricStatusFluent<A>{
  public V2ResourceMetricStatusFluentImpl() {
  }
  public V2ResourceMetricStatusFluentImpl(V2ResourceMetricStatus instance) {
    if (instance != null) {
      this.withCurrent(instance.getCurrent());
      this.withName(instance.getName());
    }
  }
  private V2MetricValueStatusBuilder current;
  private String name;
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public V2MetricValueStatus buildCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public A withCurrent(V2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current!=null){ this.current= new V2MetricValueStatusBuilder(current); _visitables.get("current").add(this.current);} else { this.current = null; _visitables.get("current").remove(this.current); } return (A) this;
  }
  public Boolean hasCurrent() {
    return this.current != null;
  }
  public V2ResourceMetricStatusFluentImpl.CurrentNested<A> withNewCurrent() {
    return new V2ResourceMetricStatusFluentImpl.CurrentNestedImpl();
  }
  public V2ResourceMetricStatusFluentImpl.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item) {
    return new V2ResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
  }
  public V2ResourceMetricStatusFluentImpl.CurrentNested<A> editCurrent() {
    return withNewCurrentLike(getCurrent());
  }
  public V2ResourceMetricStatusFluentImpl.CurrentNested<A> editOrNewCurrent() {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): new V2MetricValueStatusBuilder().build());
  }
  public V2ResourceMetricStatusFluentImpl.CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): item);
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ResourceMetricStatusFluentImpl that = (V2ResourceMetricStatusFluentImpl) o;
    if (!java.util.Objects.equals(current, that.current)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(current,  name,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) { sb.append("current:"); sb.append(current + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  class CurrentNestedImpl<N> extends V2MetricValueStatusFluentImpl<V2ResourceMetricStatusFluentImpl.CurrentNested<N>> implements V2ResourceMetricStatusFluentImpl.CurrentNested<N>,Nested<N>{
    CurrentNestedImpl(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
    CurrentNestedImpl() {
      this.builder = new V2MetricValueStatusBuilder(this);
    }
    V2MetricValueStatusBuilder builder;
    public N and() {
      return (N) V2ResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }
    public N endCurrent() {
      return and();
    }
    
  }
  
}