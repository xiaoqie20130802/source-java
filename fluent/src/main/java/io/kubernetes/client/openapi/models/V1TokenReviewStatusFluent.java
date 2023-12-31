package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TokenReviewStatusFluent<A extends V1TokenReviewStatusFluent<A>> extends Fluent<A>{
  public A addToAudiences(int index,String item);
  public A setToAudiences(int index,String item);
  public A addToAudiences(java.lang.String... items);
  public A addAllToAudiences(Collection<String> items);
  public A removeFromAudiences(java.lang.String... items);
  public A removeAllFromAudiences(Collection<String> items);
  public List<String> getAudiences();
  public String getAudience(int index);
  public String getFirstAudience();
  public String getLastAudience();
  public String getMatchingAudience(Predicate<String> predicate);
  public Boolean hasMatchingAudience(Predicate<String> predicate);
  public A withAudiences(List<String> audiences);
  public A withAudiences(java.lang.String... audiences);
  public Boolean hasAudiences();
  public Boolean getAuthenticated();
  public A withAuthenticated(Boolean authenticated);
  public Boolean hasAuthenticated();
  public String getError();
  public A withError(String error);
  public Boolean hasError();
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UserInfo getUser();
  public V1UserInfo buildUser();
  public A withUser(V1UserInfo user);
  public Boolean hasUser();
  public V1TokenReviewStatusFluent.UserNested<A> withNewUser();
  public V1TokenReviewStatusFluent.UserNested<A> withNewUserLike(V1UserInfo item);
  public V1TokenReviewStatusFluent.UserNested<A> editUser();
  public V1TokenReviewStatusFluent.UserNested<A> editOrNewUser();
  public V1TokenReviewStatusFluent.UserNested<A> editOrNewUserLike(V1UserInfo item);
  public A withAuthenticated();
  public interface UserNested<N> extends Nested<N>,V1UserInfoFluent<V1TokenReviewStatusFluent.UserNested<N>>{
    public N and();
    public N endUser();
    
  }
  
}