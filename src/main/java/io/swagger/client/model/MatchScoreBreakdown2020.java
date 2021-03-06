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
import io.swagger.client.model.MatchScoreBreakdown2020Alliance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * See the 2020 FMS API documentation for a description of each value. https://frcevents2.docs.apiary.io/#/reference/match-results/score-details
 */
@Schema(description = "See the 2020 FMS API documentation for a description of each value. https://frcevents2.docs.apiary.io/#/reference/match-results/score-details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-01T17:18:29.994708-05:00[US/Eastern]")
public class MatchScoreBreakdown2020 {
  @SerializedName("blue")
  private MatchScoreBreakdown2020Alliance blue = null;

  @SerializedName("red")
  private MatchScoreBreakdown2020Alliance red = null;

  public MatchScoreBreakdown2020 blue(MatchScoreBreakdown2020Alliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @Schema(description = "")
  public MatchScoreBreakdown2020Alliance getBlue() {
    return blue;
  }

  public void setBlue(MatchScoreBreakdown2020Alliance blue) {
    this.blue = blue;
  }

  public MatchScoreBreakdown2020 red(MatchScoreBreakdown2020Alliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @Schema(description = "")
  public MatchScoreBreakdown2020Alliance getRed() {
    return red;
  }

  public void setRed(MatchScoreBreakdown2020Alliance red) {
    this.red = red;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2020 matchScoreBreakdown2020 = (MatchScoreBreakdown2020) o;
    return Objects.equals(this.blue, matchScoreBreakdown2020.blue) &&
        Objects.equals(this.red, matchScoreBreakdown2020.red);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blue, red);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2020 {\n");
    
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
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
