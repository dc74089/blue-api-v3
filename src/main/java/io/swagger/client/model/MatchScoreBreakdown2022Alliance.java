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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MatchScoreBreakdown2022Alliance
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-26T16:01:43.676Z[GMT]")
public class MatchScoreBreakdown2022Alliance {
  /**
   * Gets or Sets taxiRobot1
   */
  @JsonAdapter(TaxiRobot1Enum.Adapter.class)
  public enum TaxiRobot1Enum {
    YES("Yes"),
    NO("No");

    private String value;

    TaxiRobot1Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TaxiRobot1Enum fromValue(String input) {
      for (TaxiRobot1Enum b : TaxiRobot1Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TaxiRobot1Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxiRobot1Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TaxiRobot1Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TaxiRobot1Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("taxiRobot1")
  private TaxiRobot1Enum taxiRobot1 = null;

  /**
   * Gets or Sets endgameRobot1
   */
  @JsonAdapter(EndgameRobot1Enum.Adapter.class)
  public enum EndgameRobot1Enum {
    TRAVERSAL("Traversal"),
    HIGH("High"),
    MID("Mid"),
    LOW("Low"),
    NONE("None");

    private String value;

    EndgameRobot1Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EndgameRobot1Enum fromValue(String input) {
      for (EndgameRobot1Enum b : EndgameRobot1Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EndgameRobot1Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndgameRobot1Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EndgameRobot1Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EndgameRobot1Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("endgameRobot1")
  private EndgameRobot1Enum endgameRobot1 = null;

  /**
   * Gets or Sets taxiRobot2
   */
  @JsonAdapter(TaxiRobot2Enum.Adapter.class)
  public enum TaxiRobot2Enum {
    YES("Yes"),
    NO("No");

    private String value;

    TaxiRobot2Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TaxiRobot2Enum fromValue(String input) {
      for (TaxiRobot2Enum b : TaxiRobot2Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TaxiRobot2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxiRobot2Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TaxiRobot2Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TaxiRobot2Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("taxiRobot2")
  private TaxiRobot2Enum taxiRobot2 = null;

  /**
   * Gets or Sets endgameRobot2
   */
  @JsonAdapter(EndgameRobot2Enum.Adapter.class)
  public enum EndgameRobot2Enum {
    TRAVERSAL("Traversal"),
    HIGH("High"),
    MID("Mid"),
    LOW("Low"),
    NONE("None");

    private String value;

    EndgameRobot2Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EndgameRobot2Enum fromValue(String input) {
      for (EndgameRobot2Enum b : EndgameRobot2Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EndgameRobot2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndgameRobot2Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EndgameRobot2Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EndgameRobot2Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("endgameRobot2")
  private EndgameRobot2Enum endgameRobot2 = null;

  /**
   * Gets or Sets taxiRobot3
   */
  @JsonAdapter(TaxiRobot3Enum.Adapter.class)
  public enum TaxiRobot3Enum {
    YES("Yes"),
    NO("No");

    private String value;

    TaxiRobot3Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TaxiRobot3Enum fromValue(String input) {
      for (TaxiRobot3Enum b : TaxiRobot3Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TaxiRobot3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxiRobot3Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TaxiRobot3Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TaxiRobot3Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("taxiRobot3")
  private TaxiRobot3Enum taxiRobot3 = null;

  /**
   * Gets or Sets endgameRobot3
   */
  @JsonAdapter(EndgameRobot3Enum.Adapter.class)
  public enum EndgameRobot3Enum {
    TRAVERSAL("Traversal"),
    HIGH("High"),
    MID("Mid"),
    LOW("Low"),
    NONE("None");

    private String value;

    EndgameRobot3Enum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EndgameRobot3Enum fromValue(String input) {
      for (EndgameRobot3Enum b : EndgameRobot3Enum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EndgameRobot3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndgameRobot3Enum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EndgameRobot3Enum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EndgameRobot3Enum.fromValue((String)(value));
      }
    }
  }  @SerializedName("endgameRobot3")
  private EndgameRobot3Enum endgameRobot3 = null;

  @SerializedName("autoCargoLowerNear")
  private Integer autoCargoLowerNear = null;

  @SerializedName("autoCargoLowerFar")
  private Integer autoCargoLowerFar = null;

  @SerializedName("autoCargoLowerBlue")
  private Integer autoCargoLowerBlue = null;

  @SerializedName("autoCargoLowerRed")
  private Integer autoCargoLowerRed = null;

  @SerializedName("autoCargoUpperNear")
  private Integer autoCargoUpperNear = null;

  @SerializedName("autoCargoUpperFar")
  private Integer autoCargoUpperFar = null;

  @SerializedName("autoCargoUpperBlue")
  private Integer autoCargoUpperBlue = null;

  @SerializedName("autoCargoUpperRed")
  private Integer autoCargoUpperRed = null;

  @SerializedName("autoCargoTotal")
  private Integer autoCargoTotal = null;

  @SerializedName("teleopCargoLowerNear")
  private Integer teleopCargoLowerNear = null;

  @SerializedName("teleopCargoLowerFar")
  private Integer teleopCargoLowerFar = null;

  @SerializedName("teleopCargoLowerBlue")
  private Integer teleopCargoLowerBlue = null;

  @SerializedName("teleopCargoLowerRed")
  private Integer teleopCargoLowerRed = null;

  @SerializedName("teleopCargoUpperNear")
  private Integer teleopCargoUpperNear = null;

  @SerializedName("teleopCargoUpperFar")
  private Integer teleopCargoUpperFar = null;

  @SerializedName("teleopCargoUpperBlue")
  private Integer teleopCargoUpperBlue = null;

  @SerializedName("teleopCargoUpperRed")
  private Integer teleopCargoUpperRed = null;

  @SerializedName("teleopCargoTotal")
  private Integer teleopCargoTotal = null;

  @SerializedName("matchCargoTotal")
  private Integer matchCargoTotal = null;

  @SerializedName("autoTaxiPoints")
  private Integer autoTaxiPoints = null;

  @SerializedName("autoCargoPoints")
  private Integer autoCargoPoints = null;

  @SerializedName("autoPoints")
  private Integer autoPoints = null;

  @SerializedName("quintetAchieved")
  private Boolean quintetAchieved = null;

  @SerializedName("teleopCargoPoints")
  private Integer teleopCargoPoints = null;

  @SerializedName("endgamePoints")
  private Integer endgamePoints = null;

  @SerializedName("teleopPoints")
  private Integer teleopPoints = null;

  @SerializedName("cargoBonusRankingPoint")
  private Boolean cargoBonusRankingPoint = null;

  @SerializedName("hangarBonusRankingPoint")
  private Boolean hangarBonusRankingPoint = null;

  @SerializedName("foulCount")
  private Integer foulCount = null;

  @SerializedName("techFoulCount")
  private Integer techFoulCount = null;

  @SerializedName("adjustPoints")
  private Integer adjustPoints = null;

  @SerializedName("foulPoints")
  private Integer foulPoints = null;

  @SerializedName("rp")
  private Integer rp = null;

  @SerializedName("totalPoints")
  private Integer totalPoints = null;

  public MatchScoreBreakdown2022Alliance taxiRobot1(TaxiRobot1Enum taxiRobot1) {
    this.taxiRobot1 = taxiRobot1;
    return this;
  }

   /**
   * Get taxiRobot1
   * @return taxiRobot1
  **/
  @Schema(description = "")
  public TaxiRobot1Enum getTaxiRobot1() {
    return taxiRobot1;
  }

  public void setTaxiRobot1(TaxiRobot1Enum taxiRobot1) {
    this.taxiRobot1 = taxiRobot1;
  }

  public MatchScoreBreakdown2022Alliance endgameRobot1(EndgameRobot1Enum endgameRobot1) {
    this.endgameRobot1 = endgameRobot1;
    return this;
  }

   /**
   * Get endgameRobot1
   * @return endgameRobot1
  **/
  @Schema(description = "")
  public EndgameRobot1Enum getEndgameRobot1() {
    return endgameRobot1;
  }

  public void setEndgameRobot1(EndgameRobot1Enum endgameRobot1) {
    this.endgameRobot1 = endgameRobot1;
  }

  public MatchScoreBreakdown2022Alliance taxiRobot2(TaxiRobot2Enum taxiRobot2) {
    this.taxiRobot2 = taxiRobot2;
    return this;
  }

   /**
   * Get taxiRobot2
   * @return taxiRobot2
  **/
  @Schema(description = "")
  public TaxiRobot2Enum getTaxiRobot2() {
    return taxiRobot2;
  }

  public void setTaxiRobot2(TaxiRobot2Enum taxiRobot2) {
    this.taxiRobot2 = taxiRobot2;
  }

  public MatchScoreBreakdown2022Alliance endgameRobot2(EndgameRobot2Enum endgameRobot2) {
    this.endgameRobot2 = endgameRobot2;
    return this;
  }

   /**
   * Get endgameRobot2
   * @return endgameRobot2
  **/
  @Schema(description = "")
  public EndgameRobot2Enum getEndgameRobot2() {
    return endgameRobot2;
  }

  public void setEndgameRobot2(EndgameRobot2Enum endgameRobot2) {
    this.endgameRobot2 = endgameRobot2;
  }

  public MatchScoreBreakdown2022Alliance taxiRobot3(TaxiRobot3Enum taxiRobot3) {
    this.taxiRobot3 = taxiRobot3;
    return this;
  }

   /**
   * Get taxiRobot3
   * @return taxiRobot3
  **/
  @Schema(description = "")
  public TaxiRobot3Enum getTaxiRobot3() {
    return taxiRobot3;
  }

  public void setTaxiRobot3(TaxiRobot3Enum taxiRobot3) {
    this.taxiRobot3 = taxiRobot3;
  }

  public MatchScoreBreakdown2022Alliance endgameRobot3(EndgameRobot3Enum endgameRobot3) {
    this.endgameRobot3 = endgameRobot3;
    return this;
  }

   /**
   * Get endgameRobot3
   * @return endgameRobot3
  **/
  @Schema(description = "")
  public EndgameRobot3Enum getEndgameRobot3() {
    return endgameRobot3;
  }

  public void setEndgameRobot3(EndgameRobot3Enum endgameRobot3) {
    this.endgameRobot3 = endgameRobot3;
  }

  public MatchScoreBreakdown2022Alliance autoCargoLowerNear(Integer autoCargoLowerNear) {
    this.autoCargoLowerNear = autoCargoLowerNear;
    return this;
  }

   /**
   * Get autoCargoLowerNear
   * @return autoCargoLowerNear
  **/
  @Schema(description = "")
  public Integer getAutoCargoLowerNear() {
    return autoCargoLowerNear;
  }

  public void setAutoCargoLowerNear(Integer autoCargoLowerNear) {
    this.autoCargoLowerNear = autoCargoLowerNear;
  }

  public MatchScoreBreakdown2022Alliance autoCargoLowerFar(Integer autoCargoLowerFar) {
    this.autoCargoLowerFar = autoCargoLowerFar;
    return this;
  }

   /**
   * Get autoCargoLowerFar
   * @return autoCargoLowerFar
  **/
  @Schema(description = "")
  public Integer getAutoCargoLowerFar() {
    return autoCargoLowerFar;
  }

  public void setAutoCargoLowerFar(Integer autoCargoLowerFar) {
    this.autoCargoLowerFar = autoCargoLowerFar;
  }

  public MatchScoreBreakdown2022Alliance autoCargoLowerBlue(Integer autoCargoLowerBlue) {
    this.autoCargoLowerBlue = autoCargoLowerBlue;
    return this;
  }

   /**
   * Get autoCargoLowerBlue
   * @return autoCargoLowerBlue
  **/
  @Schema(description = "")
  public Integer getAutoCargoLowerBlue() {
    return autoCargoLowerBlue;
  }

  public void setAutoCargoLowerBlue(Integer autoCargoLowerBlue) {
    this.autoCargoLowerBlue = autoCargoLowerBlue;
  }

  public MatchScoreBreakdown2022Alliance autoCargoLowerRed(Integer autoCargoLowerRed) {
    this.autoCargoLowerRed = autoCargoLowerRed;
    return this;
  }

   /**
   * Get autoCargoLowerRed
   * @return autoCargoLowerRed
  **/
  @Schema(description = "")
  public Integer getAutoCargoLowerRed() {
    return autoCargoLowerRed;
  }

  public void setAutoCargoLowerRed(Integer autoCargoLowerRed) {
    this.autoCargoLowerRed = autoCargoLowerRed;
  }

  public MatchScoreBreakdown2022Alliance autoCargoUpperNear(Integer autoCargoUpperNear) {
    this.autoCargoUpperNear = autoCargoUpperNear;
    return this;
  }

   /**
   * Get autoCargoUpperNear
   * @return autoCargoUpperNear
  **/
  @Schema(description = "")
  public Integer getAutoCargoUpperNear() {
    return autoCargoUpperNear;
  }

  public void setAutoCargoUpperNear(Integer autoCargoUpperNear) {
    this.autoCargoUpperNear = autoCargoUpperNear;
  }

  public MatchScoreBreakdown2022Alliance autoCargoUpperFar(Integer autoCargoUpperFar) {
    this.autoCargoUpperFar = autoCargoUpperFar;
    return this;
  }

   /**
   * Get autoCargoUpperFar
   * @return autoCargoUpperFar
  **/
  @Schema(description = "")
  public Integer getAutoCargoUpperFar() {
    return autoCargoUpperFar;
  }

  public void setAutoCargoUpperFar(Integer autoCargoUpperFar) {
    this.autoCargoUpperFar = autoCargoUpperFar;
  }

  public MatchScoreBreakdown2022Alliance autoCargoUpperBlue(Integer autoCargoUpperBlue) {
    this.autoCargoUpperBlue = autoCargoUpperBlue;
    return this;
  }

   /**
   * Get autoCargoUpperBlue
   * @return autoCargoUpperBlue
  **/
  @Schema(description = "")
  public Integer getAutoCargoUpperBlue() {
    return autoCargoUpperBlue;
  }

  public void setAutoCargoUpperBlue(Integer autoCargoUpperBlue) {
    this.autoCargoUpperBlue = autoCargoUpperBlue;
  }

  public MatchScoreBreakdown2022Alliance autoCargoUpperRed(Integer autoCargoUpperRed) {
    this.autoCargoUpperRed = autoCargoUpperRed;
    return this;
  }

   /**
   * Get autoCargoUpperRed
   * @return autoCargoUpperRed
  **/
  @Schema(description = "")
  public Integer getAutoCargoUpperRed() {
    return autoCargoUpperRed;
  }

  public void setAutoCargoUpperRed(Integer autoCargoUpperRed) {
    this.autoCargoUpperRed = autoCargoUpperRed;
  }

  public MatchScoreBreakdown2022Alliance autoCargoTotal(Integer autoCargoTotal) {
    this.autoCargoTotal = autoCargoTotal;
    return this;
  }

   /**
   * Get autoCargoTotal
   * @return autoCargoTotal
  **/
  @Schema(description = "")
  public Integer getAutoCargoTotal() {
    return autoCargoTotal;
  }

  public void setAutoCargoTotal(Integer autoCargoTotal) {
    this.autoCargoTotal = autoCargoTotal;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoLowerNear(Integer teleopCargoLowerNear) {
    this.teleopCargoLowerNear = teleopCargoLowerNear;
    return this;
  }

   /**
   * Get teleopCargoLowerNear
   * @return teleopCargoLowerNear
  **/
  @Schema(description = "")
  public Integer getTeleopCargoLowerNear() {
    return teleopCargoLowerNear;
  }

  public void setTeleopCargoLowerNear(Integer teleopCargoLowerNear) {
    this.teleopCargoLowerNear = teleopCargoLowerNear;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoLowerFar(Integer teleopCargoLowerFar) {
    this.teleopCargoLowerFar = teleopCargoLowerFar;
    return this;
  }

   /**
   * Get teleopCargoLowerFar
   * @return teleopCargoLowerFar
  **/
  @Schema(description = "")
  public Integer getTeleopCargoLowerFar() {
    return teleopCargoLowerFar;
  }

  public void setTeleopCargoLowerFar(Integer teleopCargoLowerFar) {
    this.teleopCargoLowerFar = teleopCargoLowerFar;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoLowerBlue(Integer teleopCargoLowerBlue) {
    this.teleopCargoLowerBlue = teleopCargoLowerBlue;
    return this;
  }

   /**
   * Get teleopCargoLowerBlue
   * @return teleopCargoLowerBlue
  **/
  @Schema(description = "")
  public Integer getTeleopCargoLowerBlue() {
    return teleopCargoLowerBlue;
  }

  public void setTeleopCargoLowerBlue(Integer teleopCargoLowerBlue) {
    this.teleopCargoLowerBlue = teleopCargoLowerBlue;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoLowerRed(Integer teleopCargoLowerRed) {
    this.teleopCargoLowerRed = teleopCargoLowerRed;
    return this;
  }

   /**
   * Get teleopCargoLowerRed
   * @return teleopCargoLowerRed
  **/
  @Schema(description = "")
  public Integer getTeleopCargoLowerRed() {
    return teleopCargoLowerRed;
  }

  public void setTeleopCargoLowerRed(Integer teleopCargoLowerRed) {
    this.teleopCargoLowerRed = teleopCargoLowerRed;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoUpperNear(Integer teleopCargoUpperNear) {
    this.teleopCargoUpperNear = teleopCargoUpperNear;
    return this;
  }

   /**
   * Get teleopCargoUpperNear
   * @return teleopCargoUpperNear
  **/
  @Schema(description = "")
  public Integer getTeleopCargoUpperNear() {
    return teleopCargoUpperNear;
  }

  public void setTeleopCargoUpperNear(Integer teleopCargoUpperNear) {
    this.teleopCargoUpperNear = teleopCargoUpperNear;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoUpperFar(Integer teleopCargoUpperFar) {
    this.teleopCargoUpperFar = teleopCargoUpperFar;
    return this;
  }

   /**
   * Get teleopCargoUpperFar
   * @return teleopCargoUpperFar
  **/
  @Schema(description = "")
  public Integer getTeleopCargoUpperFar() {
    return teleopCargoUpperFar;
  }

  public void setTeleopCargoUpperFar(Integer teleopCargoUpperFar) {
    this.teleopCargoUpperFar = teleopCargoUpperFar;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoUpperBlue(Integer teleopCargoUpperBlue) {
    this.teleopCargoUpperBlue = teleopCargoUpperBlue;
    return this;
  }

   /**
   * Get teleopCargoUpperBlue
   * @return teleopCargoUpperBlue
  **/
  @Schema(description = "")
  public Integer getTeleopCargoUpperBlue() {
    return teleopCargoUpperBlue;
  }

  public void setTeleopCargoUpperBlue(Integer teleopCargoUpperBlue) {
    this.teleopCargoUpperBlue = teleopCargoUpperBlue;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoUpperRed(Integer teleopCargoUpperRed) {
    this.teleopCargoUpperRed = teleopCargoUpperRed;
    return this;
  }

   /**
   * Get teleopCargoUpperRed
   * @return teleopCargoUpperRed
  **/
  @Schema(description = "")
  public Integer getTeleopCargoUpperRed() {
    return teleopCargoUpperRed;
  }

  public void setTeleopCargoUpperRed(Integer teleopCargoUpperRed) {
    this.teleopCargoUpperRed = teleopCargoUpperRed;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoTotal(Integer teleopCargoTotal) {
    this.teleopCargoTotal = teleopCargoTotal;
    return this;
  }

   /**
   * Get teleopCargoTotal
   * @return teleopCargoTotal
  **/
  @Schema(description = "")
  public Integer getTeleopCargoTotal() {
    return teleopCargoTotal;
  }

  public void setTeleopCargoTotal(Integer teleopCargoTotal) {
    this.teleopCargoTotal = teleopCargoTotal;
  }

  public MatchScoreBreakdown2022Alliance matchCargoTotal(Integer matchCargoTotal) {
    this.matchCargoTotal = matchCargoTotal;
    return this;
  }

   /**
   * Get matchCargoTotal
   * @return matchCargoTotal
  **/
  @Schema(description = "")
  public Integer getMatchCargoTotal() {
    return matchCargoTotal;
  }

  public void setMatchCargoTotal(Integer matchCargoTotal) {
    this.matchCargoTotal = matchCargoTotal;
  }

  public MatchScoreBreakdown2022Alliance autoTaxiPoints(Integer autoTaxiPoints) {
    this.autoTaxiPoints = autoTaxiPoints;
    return this;
  }

   /**
   * Get autoTaxiPoints
   * @return autoTaxiPoints
  **/
  @Schema(description = "")
  public Integer getAutoTaxiPoints() {
    return autoTaxiPoints;
  }

  public void setAutoTaxiPoints(Integer autoTaxiPoints) {
    this.autoTaxiPoints = autoTaxiPoints;
  }

  public MatchScoreBreakdown2022Alliance autoCargoPoints(Integer autoCargoPoints) {
    this.autoCargoPoints = autoCargoPoints;
    return this;
  }

   /**
   * Get autoCargoPoints
   * @return autoCargoPoints
  **/
  @Schema(description = "")
  public Integer getAutoCargoPoints() {
    return autoCargoPoints;
  }

  public void setAutoCargoPoints(Integer autoCargoPoints) {
    this.autoCargoPoints = autoCargoPoints;
  }

  public MatchScoreBreakdown2022Alliance autoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
    return this;
  }

   /**
   * Get autoPoints
   * @return autoPoints
  **/
  @Schema(description = "")
  public Integer getAutoPoints() {
    return autoPoints;
  }

  public void setAutoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
  }

  public MatchScoreBreakdown2022Alliance quintetAchieved(Boolean quintetAchieved) {
    this.quintetAchieved = quintetAchieved;
    return this;
  }

   /**
   * Get quintetAchieved
   * @return quintetAchieved
  **/
  @Schema(description = "")
  public Boolean isQuintetAchieved() {
    return quintetAchieved;
  }

  public void setQuintetAchieved(Boolean quintetAchieved) {
    this.quintetAchieved = quintetAchieved;
  }

  public MatchScoreBreakdown2022Alliance teleopCargoPoints(Integer teleopCargoPoints) {
    this.teleopCargoPoints = teleopCargoPoints;
    return this;
  }

   /**
   * Get teleopCargoPoints
   * @return teleopCargoPoints
  **/
  @Schema(description = "")
  public Integer getTeleopCargoPoints() {
    return teleopCargoPoints;
  }

  public void setTeleopCargoPoints(Integer teleopCargoPoints) {
    this.teleopCargoPoints = teleopCargoPoints;
  }

  public MatchScoreBreakdown2022Alliance endgamePoints(Integer endgamePoints) {
    this.endgamePoints = endgamePoints;
    return this;
  }

   /**
   * Get endgamePoints
   * @return endgamePoints
  **/
  @Schema(description = "")
  public Integer getEndgamePoints() {
    return endgamePoints;
  }

  public void setEndgamePoints(Integer endgamePoints) {
    this.endgamePoints = endgamePoints;
  }

  public MatchScoreBreakdown2022Alliance teleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
    return this;
  }

   /**
   * Get teleopPoints
   * @return teleopPoints
  **/
  @Schema(description = "")
  public Integer getTeleopPoints() {
    return teleopPoints;
  }

  public void setTeleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
  }

  public MatchScoreBreakdown2022Alliance cargoBonusRankingPoint(Boolean cargoBonusRankingPoint) {
    this.cargoBonusRankingPoint = cargoBonusRankingPoint;
    return this;
  }

   /**
   * Get cargoBonusRankingPoint
   * @return cargoBonusRankingPoint
  **/
  @Schema(description = "")
  public Boolean isCargoBonusRankingPoint() {
    return cargoBonusRankingPoint;
  }

  public void setCargoBonusRankingPoint(Boolean cargoBonusRankingPoint) {
    this.cargoBonusRankingPoint = cargoBonusRankingPoint;
  }

  public MatchScoreBreakdown2022Alliance hangarBonusRankingPoint(Boolean hangarBonusRankingPoint) {
    this.hangarBonusRankingPoint = hangarBonusRankingPoint;
    return this;
  }

   /**
   * Get hangarBonusRankingPoint
   * @return hangarBonusRankingPoint
  **/
  @Schema(description = "")
  public Boolean isHangarBonusRankingPoint() {
    return hangarBonusRankingPoint;
  }

  public void setHangarBonusRankingPoint(Boolean hangarBonusRankingPoint) {
    this.hangarBonusRankingPoint = hangarBonusRankingPoint;
  }

  public MatchScoreBreakdown2022Alliance foulCount(Integer foulCount) {
    this.foulCount = foulCount;
    return this;
  }

   /**
   * Get foulCount
   * @return foulCount
  **/
  @Schema(description = "")
  public Integer getFoulCount() {
    return foulCount;
  }

  public void setFoulCount(Integer foulCount) {
    this.foulCount = foulCount;
  }

  public MatchScoreBreakdown2022Alliance techFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
    return this;
  }

   /**
   * Get techFoulCount
   * @return techFoulCount
  **/
  @Schema(description = "")
  public Integer getTechFoulCount() {
    return techFoulCount;
  }

  public void setTechFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
  }

  public MatchScoreBreakdown2022Alliance adjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
    return this;
  }

   /**
   * Get adjustPoints
   * @return adjustPoints
  **/
  @Schema(description = "")
  public Integer getAdjustPoints() {
    return adjustPoints;
  }

  public void setAdjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
  }

  public MatchScoreBreakdown2022Alliance foulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
    return this;
  }

   /**
   * Get foulPoints
   * @return foulPoints
  **/
  @Schema(description = "")
  public Integer getFoulPoints() {
    return foulPoints;
  }

  public void setFoulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
  }

  public MatchScoreBreakdown2022Alliance rp(Integer rp) {
    this.rp = rp;
    return this;
  }

   /**
   * Get rp
   * @return rp
  **/
  @Schema(description = "")
  public Integer getRp() {
    return rp;
  }

  public void setRp(Integer rp) {
    this.rp = rp;
  }

  public MatchScoreBreakdown2022Alliance totalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
    return this;
  }

   /**
   * Get totalPoints
   * @return totalPoints
  **/
  @Schema(description = "")
  public Integer getTotalPoints() {
    return totalPoints;
  }

  public void setTotalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2022Alliance matchScoreBreakdown2022Alliance = (MatchScoreBreakdown2022Alliance) o;
    return Objects.equals(this.taxiRobot1, matchScoreBreakdown2022Alliance.taxiRobot1) &&
        Objects.equals(this.endgameRobot1, matchScoreBreakdown2022Alliance.endgameRobot1) &&
        Objects.equals(this.taxiRobot2, matchScoreBreakdown2022Alliance.taxiRobot2) &&
        Objects.equals(this.endgameRobot2, matchScoreBreakdown2022Alliance.endgameRobot2) &&
        Objects.equals(this.taxiRobot3, matchScoreBreakdown2022Alliance.taxiRobot3) &&
        Objects.equals(this.endgameRobot3, matchScoreBreakdown2022Alliance.endgameRobot3) &&
        Objects.equals(this.autoCargoLowerNear, matchScoreBreakdown2022Alliance.autoCargoLowerNear) &&
        Objects.equals(this.autoCargoLowerFar, matchScoreBreakdown2022Alliance.autoCargoLowerFar) &&
        Objects.equals(this.autoCargoLowerBlue, matchScoreBreakdown2022Alliance.autoCargoLowerBlue) &&
        Objects.equals(this.autoCargoLowerRed, matchScoreBreakdown2022Alliance.autoCargoLowerRed) &&
        Objects.equals(this.autoCargoUpperNear, matchScoreBreakdown2022Alliance.autoCargoUpperNear) &&
        Objects.equals(this.autoCargoUpperFar, matchScoreBreakdown2022Alliance.autoCargoUpperFar) &&
        Objects.equals(this.autoCargoUpperBlue, matchScoreBreakdown2022Alliance.autoCargoUpperBlue) &&
        Objects.equals(this.autoCargoUpperRed, matchScoreBreakdown2022Alliance.autoCargoUpperRed) &&
        Objects.equals(this.autoCargoTotal, matchScoreBreakdown2022Alliance.autoCargoTotal) &&
        Objects.equals(this.teleopCargoLowerNear, matchScoreBreakdown2022Alliance.teleopCargoLowerNear) &&
        Objects.equals(this.teleopCargoLowerFar, matchScoreBreakdown2022Alliance.teleopCargoLowerFar) &&
        Objects.equals(this.teleopCargoLowerBlue, matchScoreBreakdown2022Alliance.teleopCargoLowerBlue) &&
        Objects.equals(this.teleopCargoLowerRed, matchScoreBreakdown2022Alliance.teleopCargoLowerRed) &&
        Objects.equals(this.teleopCargoUpperNear, matchScoreBreakdown2022Alliance.teleopCargoUpperNear) &&
        Objects.equals(this.teleopCargoUpperFar, matchScoreBreakdown2022Alliance.teleopCargoUpperFar) &&
        Objects.equals(this.teleopCargoUpperBlue, matchScoreBreakdown2022Alliance.teleopCargoUpperBlue) &&
        Objects.equals(this.teleopCargoUpperRed, matchScoreBreakdown2022Alliance.teleopCargoUpperRed) &&
        Objects.equals(this.teleopCargoTotal, matchScoreBreakdown2022Alliance.teleopCargoTotal) &&
        Objects.equals(this.matchCargoTotal, matchScoreBreakdown2022Alliance.matchCargoTotal) &&
        Objects.equals(this.autoTaxiPoints, matchScoreBreakdown2022Alliance.autoTaxiPoints) &&
        Objects.equals(this.autoCargoPoints, matchScoreBreakdown2022Alliance.autoCargoPoints) &&
        Objects.equals(this.autoPoints, matchScoreBreakdown2022Alliance.autoPoints) &&
        Objects.equals(this.quintetAchieved, matchScoreBreakdown2022Alliance.quintetAchieved) &&
        Objects.equals(this.teleopCargoPoints, matchScoreBreakdown2022Alliance.teleopCargoPoints) &&
        Objects.equals(this.endgamePoints, matchScoreBreakdown2022Alliance.endgamePoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2022Alliance.teleopPoints) &&
        Objects.equals(this.cargoBonusRankingPoint, matchScoreBreakdown2022Alliance.cargoBonusRankingPoint) &&
        Objects.equals(this.hangarBonusRankingPoint, matchScoreBreakdown2022Alliance.hangarBonusRankingPoint) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2022Alliance.foulCount) &&
        Objects.equals(this.techFoulCount, matchScoreBreakdown2022Alliance.techFoulCount) &&
        Objects.equals(this.adjustPoints, matchScoreBreakdown2022Alliance.adjustPoints) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2022Alliance.foulPoints) &&
        Objects.equals(this.rp, matchScoreBreakdown2022Alliance.rp) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2022Alliance.totalPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxiRobot1, endgameRobot1, taxiRobot2, endgameRobot2, taxiRobot3, endgameRobot3, autoCargoLowerNear, autoCargoLowerFar, autoCargoLowerBlue, autoCargoLowerRed, autoCargoUpperNear, autoCargoUpperFar, autoCargoUpperBlue, autoCargoUpperRed, autoCargoTotal, teleopCargoLowerNear, teleopCargoLowerFar, teleopCargoLowerBlue, teleopCargoLowerRed, teleopCargoUpperNear, teleopCargoUpperFar, teleopCargoUpperBlue, teleopCargoUpperRed, teleopCargoTotal, matchCargoTotal, autoTaxiPoints, autoCargoPoints, autoPoints, quintetAchieved, teleopCargoPoints, endgamePoints, teleopPoints, cargoBonusRankingPoint, hangarBonusRankingPoint, foulCount, techFoulCount, adjustPoints, foulPoints, rp, totalPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2022Alliance {\n");
    
    sb.append("    taxiRobot1: ").append(toIndentedString(taxiRobot1)).append("\n");
    sb.append("    endgameRobot1: ").append(toIndentedString(endgameRobot1)).append("\n");
    sb.append("    taxiRobot2: ").append(toIndentedString(taxiRobot2)).append("\n");
    sb.append("    endgameRobot2: ").append(toIndentedString(endgameRobot2)).append("\n");
    sb.append("    taxiRobot3: ").append(toIndentedString(taxiRobot3)).append("\n");
    sb.append("    endgameRobot3: ").append(toIndentedString(endgameRobot3)).append("\n");
    sb.append("    autoCargoLowerNear: ").append(toIndentedString(autoCargoLowerNear)).append("\n");
    sb.append("    autoCargoLowerFar: ").append(toIndentedString(autoCargoLowerFar)).append("\n");
    sb.append("    autoCargoLowerBlue: ").append(toIndentedString(autoCargoLowerBlue)).append("\n");
    sb.append("    autoCargoLowerRed: ").append(toIndentedString(autoCargoLowerRed)).append("\n");
    sb.append("    autoCargoUpperNear: ").append(toIndentedString(autoCargoUpperNear)).append("\n");
    sb.append("    autoCargoUpperFar: ").append(toIndentedString(autoCargoUpperFar)).append("\n");
    sb.append("    autoCargoUpperBlue: ").append(toIndentedString(autoCargoUpperBlue)).append("\n");
    sb.append("    autoCargoUpperRed: ").append(toIndentedString(autoCargoUpperRed)).append("\n");
    sb.append("    autoCargoTotal: ").append(toIndentedString(autoCargoTotal)).append("\n");
    sb.append("    teleopCargoLowerNear: ").append(toIndentedString(teleopCargoLowerNear)).append("\n");
    sb.append("    teleopCargoLowerFar: ").append(toIndentedString(teleopCargoLowerFar)).append("\n");
    sb.append("    teleopCargoLowerBlue: ").append(toIndentedString(teleopCargoLowerBlue)).append("\n");
    sb.append("    teleopCargoLowerRed: ").append(toIndentedString(teleopCargoLowerRed)).append("\n");
    sb.append("    teleopCargoUpperNear: ").append(toIndentedString(teleopCargoUpperNear)).append("\n");
    sb.append("    teleopCargoUpperFar: ").append(toIndentedString(teleopCargoUpperFar)).append("\n");
    sb.append("    teleopCargoUpperBlue: ").append(toIndentedString(teleopCargoUpperBlue)).append("\n");
    sb.append("    teleopCargoUpperRed: ").append(toIndentedString(teleopCargoUpperRed)).append("\n");
    sb.append("    teleopCargoTotal: ").append(toIndentedString(teleopCargoTotal)).append("\n");
    sb.append("    matchCargoTotal: ").append(toIndentedString(matchCargoTotal)).append("\n");
    sb.append("    autoTaxiPoints: ").append(toIndentedString(autoTaxiPoints)).append("\n");
    sb.append("    autoCargoPoints: ").append(toIndentedString(autoCargoPoints)).append("\n");
    sb.append("    autoPoints: ").append(toIndentedString(autoPoints)).append("\n");
    sb.append("    quintetAchieved: ").append(toIndentedString(quintetAchieved)).append("\n");
    sb.append("    teleopCargoPoints: ").append(toIndentedString(teleopCargoPoints)).append("\n");
    sb.append("    endgamePoints: ").append(toIndentedString(endgamePoints)).append("\n");
    sb.append("    teleopPoints: ").append(toIndentedString(teleopPoints)).append("\n");
    sb.append("    cargoBonusRankingPoint: ").append(toIndentedString(cargoBonusRankingPoint)).append("\n");
    sb.append("    hangarBonusRankingPoint: ").append(toIndentedString(hangarBonusRankingPoint)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    techFoulCount: ").append(toIndentedString(techFoulCount)).append("\n");
    sb.append("    adjustPoints: ").append(toIndentedString(adjustPoints)).append("\n");
    sb.append("    foulPoints: ").append(toIndentedString(foulPoints)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
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
