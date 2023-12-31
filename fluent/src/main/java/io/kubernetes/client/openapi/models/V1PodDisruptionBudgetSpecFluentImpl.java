package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
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
  public class V1PodDisruptionBudgetSpecFluentImpl<A extends V1PodDisruptionBudgetSpecFluent<A>> extends BaseFluent<A> implements V1PodDisruptionBudgetSpecFluent<A>{
  public V1PodDisruptionBudgetSpecFluentImpl() {
  }
  public V1PodDisruptionBudgetSpecFluentImpl(V1PodDisruptionBudgetSpec instance) {
    if (instance != null) {
      this.withMaxUnavailable(instance.getMaxUnavailable());
      this.withMinAvailable(instance.getMinAvailable());
      this.withSelector(instance.getSelector());
      this.withUnhealthyPodEvictionPolicy(instance.getUnhealthyPodEvictionPolicy());
    }
  }
  private IntOrString maxUnavailable;
  private IntOrString minAvailable;
  private V1LabelSelectorBuilder selector;
  private String unhealthyPodEvictionPolicy;
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable=maxUnavailable; return (A) this;
  }
  public Boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  public A withNewMaxUnavailable(int value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public A withNewMaxUnavailable(String value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public IntOrString getMinAvailable() {
    return this.minAvailable;
  }
  public A withMinAvailable(IntOrString minAvailable) {
    this.minAvailable=minAvailable; return (A) this;
  }
  public Boolean hasMinAvailable() {
    return this.minAvailable != null;
  }
  public A withNewMinAvailable(int value) {
    return (A)withMinAvailable(new IntOrString(value));
  }
  public A withNewMinAvailable(String value) {
    return (A)withMinAvailable(new IntOrString(value));
  }
  
  /**
   * This method has been deprecated, please use method buildSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public V1LabelSelector buildSelector() {
    return this.selector!=null ?this.selector.build():null;
  }
  public A withSelector(V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector!=null){ this.selector= new V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} else { this.selector = null; _visitables.get("selector").remove(this.selector); } return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  public V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<A> withNewSelector() {
    return new V1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl();
  }
  public V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<A> withNewSelectorLike(V1LabelSelector item) {
    return new V1PodDisruptionBudgetSpecFluentImpl.SelectorNestedImpl(item);
  }
  public V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }
  public V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(getSelector() != null ? getSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<A> editOrNewSelectorLike(V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector(): item);
  }
  public String getUnhealthyPodEvictionPolicy() {
    return this.unhealthyPodEvictionPolicy;
  }
  public A withUnhealthyPodEvictionPolicy(String unhealthyPodEvictionPolicy) {
    this.unhealthyPodEvictionPolicy=unhealthyPodEvictionPolicy; return (A) this;
  }
  public Boolean hasUnhealthyPodEvictionPolicy() {
    return this.unhealthyPodEvictionPolicy != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDisruptionBudgetSpecFluentImpl that = (V1PodDisruptionBudgetSpecFluentImpl) o;
    if (!java.util.Objects.equals(maxUnavailable, that.maxUnavailable)) return false;

    if (!java.util.Objects.equals(minAvailable, that.minAvailable)) return false;

    if (!java.util.Objects.equals(selector, that.selector)) return false;

    if (!java.util.Objects.equals(unhealthyPodEvictionPolicy, that.unhealthyPodEvictionPolicy)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(maxUnavailable,  minAvailable,  selector,  unhealthyPodEvictionPolicy,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxUnavailable != null) { sb.append("maxUnavailable:"); sb.append(maxUnavailable + ","); }
    if (minAvailable != null) { sb.append("minAvailable:"); sb.append(minAvailable + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector + ","); }
    if (unhealthyPodEvictionPolicy != null) { sb.append("unhealthyPodEvictionPolicy:"); sb.append(unhealthyPodEvictionPolicy); }
    sb.append("}");
    return sb.toString();
  }
  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<N>> implements V1PodDisruptionBudgetSpecFluentImpl.SelectorNested<N>,Nested<N>{
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    SelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1PodDisruptionBudgetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector() {
      return and();
    }
    
  }
  
}