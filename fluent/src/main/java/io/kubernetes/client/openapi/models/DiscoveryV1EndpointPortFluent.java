package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface DiscoveryV1EndpointPortFluent<A extends DiscoveryV1EndpointPortFluent<A>> extends Fluent<A>{
  public String getAppProtocol();
  public A withAppProtocol(String appProtocol);
  public Boolean hasAppProtocol();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  public String getProtocol();
  public A withProtocol(String protocol);
  public Boolean hasProtocol();
  
}