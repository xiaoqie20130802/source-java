/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
 */
@ApiModel(description = "AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class ExtensionsV1beta1AllowedCSIDriver {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public ExtensionsV1beta1AllowedCSIDriver name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the registered name of the CSI driver
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the registered name of the CSI driver")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsV1beta1AllowedCSIDriver extensionsV1beta1AllowedCSIDriver = (ExtensionsV1beta1AllowedCSIDriver) o;
    return Objects.equals(this.name, extensionsV1beta1AllowedCSIDriver.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1AllowedCSIDriver {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

