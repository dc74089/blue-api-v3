/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events. If you are looking for the old version (v2) of the API, documentation can be found [here](/apidocs/v2).   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.0.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Backup status, may be null.
 */
@ApiModel(description = "Backup status, may be null.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-29T11:53:00.335-05:00")
public class TeamEventStatusAllianceBackup {
  @SerializedName("out")
  private String out = null;

  @SerializedName("in")
  private String in = null;

  public TeamEventStatusAllianceBackup out(String out) {
    this.out = out;
    return this;
  }

   /**
   * TBA key for the team replaced by the backup.
   * @return out
  **/
  @ApiModelProperty(value = "TBA key for the team replaced by the backup.")
  public String getOut() {
    return out;
  }

  public void setOut(String out) {
    this.out = out;
  }

  public TeamEventStatusAllianceBackup in(String in) {
    this.in = in;
    return this;
  }

   /**
   * TBA key for the backup team called in.
   * @return in
  **/
  @ApiModelProperty(value = "TBA key for the backup team called in.")
  public String getIn() {
    return in;
  }

  public void setIn(String in) {
    this.in = in;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusAllianceBackup teamEventStatusAllianceBackup = (TeamEventStatusAllianceBackup) o;
    return Objects.equals(this.out, teamEventStatusAllianceBackup.out) &&
        Objects.equals(this.in, teamEventStatusAllianceBackup.in);
  }

  @Override
  public int hashCode() {
    return Objects.hash(out, in);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusAllianceBackup {\n");
    
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
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

