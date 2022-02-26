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
import io.swagger.client.model.MatchAlliance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * A list of alliances, the teams on the alliances, and their score.
 */
@Schema(description = "A list of alliances, the teams on the alliances, and their score.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-26T16:01:43.676Z[GMT]")
public class MatchSimpleAlliances {
  @SerializedName("red")
  private MatchAlliance red = null;

  @SerializedName("blue")
  private MatchAlliance blue = null;

  public MatchSimpleAlliances red(MatchAlliance red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @Schema(description = "")
  public MatchAlliance getRed() {
    return red;
  }

  public void setRed(MatchAlliance red) {
    this.red = red;
  }

  public MatchSimpleAlliances blue(MatchAlliance blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @Schema(description = "")
  public MatchAlliance getBlue() {
    return blue;
  }

  public void setBlue(MatchAlliance blue) {
    this.blue = blue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchSimpleAlliances matchSimpleAlliances = (MatchSimpleAlliances) o;
    return Objects.equals(this.red, matchSimpleAlliances.red) &&
        Objects.equals(this.blue, matchSimpleAlliances.blue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, blue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchSimpleAlliances {\n");
    
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
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
