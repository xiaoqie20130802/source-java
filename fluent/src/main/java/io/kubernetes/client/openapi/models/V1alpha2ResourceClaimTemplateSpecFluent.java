package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceClaimTemplateSpecFluent<A extends V1alpha2ResourceClaimTemplateSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<A> withNewMetadata();
  public V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<A> editMetadata();
  public V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
  public V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimSpec getSpec();
  public V1alpha2ResourceClaimSpec buildSpec();
  public A withSpec(V1alpha2ResourceClaimSpec spec);
  public Boolean hasSpec();
  public V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<A> withNewSpec();
  public V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<A> withNewSpecLike(V1alpha2ResourceClaimSpec item);
  public V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<A> editSpec();
  public V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<A> editOrNewSpec();
  public V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(V1alpha2ResourceClaimSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1alpha2ResourceClaimTemplateSpecFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1alpha2ResourceClaimSpecFluent<V1alpha2ResourceClaimTemplateSpecFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}