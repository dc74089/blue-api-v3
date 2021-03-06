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
import io.swagger.client.model.ZebraAlliances;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Zebra
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-01T17:18:29.994708-05:00[US/Eastern]")
public class Zebra {
  @SerializedName("key")
  private String key = null;

  @SerializedName("times")
  private List<Double> times = new ArrayList<Double>();

  @SerializedName("alliances")
  private ZebraAlliances alliances = null;

  public Zebra key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA match key with the format &#x60;yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]&#x60;, where &#x60;yyyy&#x60; is the year, and &#x60;EVENT_CODE&#x60; is the event code of the event, &#x60;COMP_LEVEL&#x60; is (qm, ef, qf, sf, f), and &#x60;MATCH_NUMBER&#x60; is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.
   * @return key
  **/
  @Schema(required = true, description = "TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Zebra times(List<Double> times) {
    this.times = times;
    return this;
  }

  public Zebra addTimesItem(Double timesItem) {
    this.times.add(timesItem);
    return this;
  }

   /**
   * A list of relative timestamps for each data point. Each timestamp will correspond to the X and Y value at the same index in a team xs and ys arrays. &#x60;times&#x60;, all teams &#x60;xs&#x60; and all teams &#x60;ys&#x60; are guarenteed to be the same length.
   * @return times
  **/
  @Schema(required = true, description = "A list of relative timestamps for each data point. Each timestamp will correspond to the X and Y value at the same index in a team xs and ys arrays. `times`, all teams `xs` and all teams `ys` are guarenteed to be the same length.")
  public List<Double> getTimes() {
    return times;
  }

  public void setTimes(List<Double> times) {
    this.times = times;
  }

  public Zebra alliances(ZebraAlliances alliances) {
    this.alliances = alliances;
    return this;
  }

   /**
   * Get alliances
   * @return alliances
  **/
  @Schema(required = true, description = "")
  public ZebraAlliances getAlliances() {
    return alliances;
  }

  public void setAlliances(ZebraAlliances alliances) {
    this.alliances = alliances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zebra zebra = (Zebra) o;
    return Objects.equals(this.key, zebra.key) &&
        Objects.equals(this.times, zebra.times) &&
        Objects.equals(this.alliances, zebra.alliances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, times, alliances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zebra {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
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
