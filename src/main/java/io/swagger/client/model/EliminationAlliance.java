/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.8.0
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
import io.swagger.client.model.EliminationAllianceBackup;
import io.swagger.client.model.EliminationAllianceStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EliminationAlliance
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-26T16:01:43.676Z[GMT]")
public class EliminationAlliance {
  @SerializedName("name")
  private String name = null;

  @SerializedName("backup")
  private EliminationAllianceBackup backup = null;

  @SerializedName("declines")
  private List<String> declines = null;

  @SerializedName("picks")
  private List<String> picks = new ArrayList<String>();

  @SerializedName("status")
  private EliminationAllianceStatus status = null;

  public EliminationAlliance name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Alliance name, may be null.
   * @return name
  **/
  @Schema(description = "Alliance name, may be null.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EliminationAlliance backup(EliminationAllianceBackup backup) {
    this.backup = backup;
    return this;
  }

   /**
   * Get backup
   * @return backup
  **/
  @Schema(description = "")
  public EliminationAllianceBackup getBackup() {
    return backup;
  }

  public void setBackup(EliminationAllianceBackup backup) {
    this.backup = backup;
  }

  public EliminationAlliance declines(List<String> declines) {
    this.declines = declines;
    return this;
  }

  public EliminationAlliance addDeclinesItem(String declinesItem) {
    if (this.declines == null) {
      this.declines = new ArrayList<String>();
    }
    this.declines.add(declinesItem);
    return this;
  }

   /**
   * List of teams that declined the alliance.
   * @return declines
  **/
  @Schema(description = "List of teams that declined the alliance.")
  public List<String> getDeclines() {
    return declines;
  }

  public void setDeclines(List<String> declines) {
    this.declines = declines;
  }

  public EliminationAlliance picks(List<String> picks) {
    this.picks = picks;
    return this;
  }

  public EliminationAlliance addPicksItem(String picksItem) {
    this.picks.add(picksItem);
    return this;
  }

   /**
   * List of team keys picked for the alliance. First pick is captain.
   * @return picks
  **/
  @Schema(required = true, description = "List of team keys picked for the alliance. First pick is captain.")
  public List<String> getPicks() {
    return picks;
  }

  public void setPicks(List<String> picks) {
    this.picks = picks;
  }

  public EliminationAlliance status(EliminationAllianceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public EliminationAllianceStatus getStatus() {
    return status;
  }

  public void setStatus(EliminationAllianceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EliminationAlliance eliminationAlliance = (EliminationAlliance) o;
    return Objects.equals(this.name, eliminationAlliance.name) &&
        Objects.equals(this.backup, eliminationAlliance.backup) &&
        Objects.equals(this.declines, eliminationAlliance.declines) &&
        Objects.equals(this.picks, eliminationAlliance.picks) &&
        Objects.equals(this.status, eliminationAlliance.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, backup, declines, picks, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EliminationAlliance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    declines: ").append(toIndentedString(declines)).append("\n");
    sb.append("    picks: ").append(toIndentedString(picks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
