/*
 * Robot service 3.0
 * API сервис управления роботом - пылесосм.
 *
 * OpenAPI spec version: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-26T09:40:40.213012065Z[GMT]")

public class User {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("passHash")
  private Long passHash = null;

  @SerializedName("robotSNHash")
  private Long robotSNHash = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "10", description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "somemail@mail.ru", required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User passHash(Long passHash) {
    this.passHash = passHash;
    return this;
  }

   /**
   * Get passHash
   * @return passHash
  **/
  @Schema(example = "23412", required = true, description = "")
  public Long getPassHash() {
    return passHash;
  }

  public void setPassHash(Long passHash) {
    this.passHash = passHash;
  }

  public User robotSNHash(Long robotSNHash) {
    this.robotSNHash = robotSNHash;
    return this;
  }

   /**
   * Get robotSNHash
   * @return robotSNHash
  **/
  @Schema(example = "23412", required = true, description = "")
  public Long getRobotSNHash() {
    return robotSNHash;
  }

  public void setRobotSNHash(Long robotSNHash) {
    this.robotSNHash = robotSNHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.passHash, user.passHash) &&
        Objects.equals(this.robotSNHash, user.robotSNHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, passHash, robotSNHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passHash: ").append(toIndentedString(passHash)).append("\n");
    sb.append("    robotSNHash: ").append(toIndentedString(robotSNHash)).append("\n");
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
