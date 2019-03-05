/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.04.0
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
 * MatchScoreBreakdown2018Alliance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-05T12:05:14.488-05:00")
public class MatchScoreBreakdown2018Alliance {
  @SerializedName("adjustPoints")
  private Integer adjustPoints = null;

  @SerializedName("autoOwnershipPoints")
  private Integer autoOwnershipPoints = null;

  @SerializedName("autoPoints")
  private Integer autoPoints = null;

  @SerializedName("autoQuestRankingPoint")
  private Boolean autoQuestRankingPoint = null;

  @SerializedName("autoRobot1")
  private String autoRobot1 = null;

  @SerializedName("autoRobot2")
  private String autoRobot2 = null;

  @SerializedName("autoRobot3")
  private String autoRobot3 = null;

  @SerializedName("autoRunPoints")
  private Integer autoRunPoints = null;

  @SerializedName("autoScaleOwnershipSec")
  private Integer autoScaleOwnershipSec = null;

  @SerializedName("autoSwitchAtZero")
  private Boolean autoSwitchAtZero = null;

  @SerializedName("autoSwitchOwnershipSec")
  private Integer autoSwitchOwnershipSec = null;

  @SerializedName("endgamePoints")
  private Integer endgamePoints = null;

  @SerializedName("endgameRobot1")
  private String endgameRobot1 = null;

  @SerializedName("endgameRobot2")
  private String endgameRobot2 = null;

  @SerializedName("endgameRobot3")
  private String endgameRobot3 = null;

  @SerializedName("faceTheBossRankingPoint")
  private Boolean faceTheBossRankingPoint = null;

  @SerializedName("foulCount")
  private Integer foulCount = null;

  @SerializedName("foulPoints")
  private Integer foulPoints = null;

  @SerializedName("rp")
  private Integer rp = null;

  @SerializedName("techFoulCount")
  private Integer techFoulCount = null;

  @SerializedName("teleopOwnershipPoints")
  private Integer teleopOwnershipPoints = null;

  @SerializedName("teleopPoints")
  private Integer teleopPoints = null;

  @SerializedName("teleopScaleBoostSec")
  private Integer teleopScaleBoostSec = null;

  @SerializedName("teleopScaleForceSec")
  private Integer teleopScaleForceSec = null;

  @SerializedName("teleopScaleOwnershipSec")
  private Integer teleopScaleOwnershipSec = null;

  @SerializedName("teleopSwitchBoostSec")
  private Integer teleopSwitchBoostSec = null;

  @SerializedName("teleopSwitchForceSec")
  private Integer teleopSwitchForceSec = null;

  @SerializedName("teleopSwitchOwnershipSec")
  private Integer teleopSwitchOwnershipSec = null;

  @SerializedName("totalPoints")
  private Integer totalPoints = null;

  @SerializedName("vaultBoostPlayed")
  private Integer vaultBoostPlayed = null;

  @SerializedName("vaultBoostTotal")
  private Integer vaultBoostTotal = null;

  @SerializedName("vaultForcePlayed")
  private Integer vaultForcePlayed = null;

  @SerializedName("vaultForceTotal")
  private Integer vaultForceTotal = null;

  @SerializedName("vaultLevitatePlayed")
  private Integer vaultLevitatePlayed = null;

  @SerializedName("vaultLevitateTotal")
  private Integer vaultLevitateTotal = null;

  @SerializedName("vaultPoints")
  private Integer vaultPoints = null;

  @SerializedName("tba_gameData")
  private String tbaGameData = null;

  public MatchScoreBreakdown2018Alliance adjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
    return this;
  }

   /**
   * Get adjustPoints
   * @return adjustPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAdjustPoints() {
    return adjustPoints;
  }

  public void setAdjustPoints(Integer adjustPoints) {
    this.adjustPoints = adjustPoints;
  }

  public MatchScoreBreakdown2018Alliance autoOwnershipPoints(Integer autoOwnershipPoints) {
    this.autoOwnershipPoints = autoOwnershipPoints;
    return this;
  }

   /**
   * Get autoOwnershipPoints
   * @return autoOwnershipPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoOwnershipPoints() {
    return autoOwnershipPoints;
  }

  public void setAutoOwnershipPoints(Integer autoOwnershipPoints) {
    this.autoOwnershipPoints = autoOwnershipPoints;
  }

  public MatchScoreBreakdown2018Alliance autoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
    return this;
  }

   /**
   * Get autoPoints
   * @return autoPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoPoints() {
    return autoPoints;
  }

  public void setAutoPoints(Integer autoPoints) {
    this.autoPoints = autoPoints;
  }

  public MatchScoreBreakdown2018Alliance autoQuestRankingPoint(Boolean autoQuestRankingPoint) {
    this.autoQuestRankingPoint = autoQuestRankingPoint;
    return this;
  }

   /**
   * Get autoQuestRankingPoint
   * @return autoQuestRankingPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoQuestRankingPoint() {
    return autoQuestRankingPoint;
  }

  public void setAutoQuestRankingPoint(Boolean autoQuestRankingPoint) {
    this.autoQuestRankingPoint = autoQuestRankingPoint;
  }

  public MatchScoreBreakdown2018Alliance autoRobot1(String autoRobot1) {
    this.autoRobot1 = autoRobot1;
    return this;
  }

   /**
   * Get autoRobot1
   * @return autoRobot1
  **/
  @ApiModelProperty(value = "")
  public String getAutoRobot1() {
    return autoRobot1;
  }

  public void setAutoRobot1(String autoRobot1) {
    this.autoRobot1 = autoRobot1;
  }

  public MatchScoreBreakdown2018Alliance autoRobot2(String autoRobot2) {
    this.autoRobot2 = autoRobot2;
    return this;
  }

   /**
   * Get autoRobot2
   * @return autoRobot2
  **/
  @ApiModelProperty(value = "")
  public String getAutoRobot2() {
    return autoRobot2;
  }

  public void setAutoRobot2(String autoRobot2) {
    this.autoRobot2 = autoRobot2;
  }

  public MatchScoreBreakdown2018Alliance autoRobot3(String autoRobot3) {
    this.autoRobot3 = autoRobot3;
    return this;
  }

   /**
   * Get autoRobot3
   * @return autoRobot3
  **/
  @ApiModelProperty(value = "")
  public String getAutoRobot3() {
    return autoRobot3;
  }

  public void setAutoRobot3(String autoRobot3) {
    this.autoRobot3 = autoRobot3;
  }

  public MatchScoreBreakdown2018Alliance autoRunPoints(Integer autoRunPoints) {
    this.autoRunPoints = autoRunPoints;
    return this;
  }

   /**
   * Get autoRunPoints
   * @return autoRunPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoRunPoints() {
    return autoRunPoints;
  }

  public void setAutoRunPoints(Integer autoRunPoints) {
    this.autoRunPoints = autoRunPoints;
  }

  public MatchScoreBreakdown2018Alliance autoScaleOwnershipSec(Integer autoScaleOwnershipSec) {
    this.autoScaleOwnershipSec = autoScaleOwnershipSec;
    return this;
  }

   /**
   * Get autoScaleOwnershipSec
   * @return autoScaleOwnershipSec
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoScaleOwnershipSec() {
    return autoScaleOwnershipSec;
  }

  public void setAutoScaleOwnershipSec(Integer autoScaleOwnershipSec) {
    this.autoScaleOwnershipSec = autoScaleOwnershipSec;
  }

  public MatchScoreBreakdown2018Alliance autoSwitchAtZero(Boolean autoSwitchAtZero) {
    this.autoSwitchAtZero = autoSwitchAtZero;
    return this;
  }

   /**
   * Get autoSwitchAtZero
   * @return autoSwitchAtZero
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoSwitchAtZero() {
    return autoSwitchAtZero;
  }

  public void setAutoSwitchAtZero(Boolean autoSwitchAtZero) {
    this.autoSwitchAtZero = autoSwitchAtZero;
  }

  public MatchScoreBreakdown2018Alliance autoSwitchOwnershipSec(Integer autoSwitchOwnershipSec) {
    this.autoSwitchOwnershipSec = autoSwitchOwnershipSec;
    return this;
  }

   /**
   * Get autoSwitchOwnershipSec
   * @return autoSwitchOwnershipSec
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoSwitchOwnershipSec() {
    return autoSwitchOwnershipSec;
  }

  public void setAutoSwitchOwnershipSec(Integer autoSwitchOwnershipSec) {
    this.autoSwitchOwnershipSec = autoSwitchOwnershipSec;
  }

  public MatchScoreBreakdown2018Alliance endgamePoints(Integer endgamePoints) {
    this.endgamePoints = endgamePoints;
    return this;
  }

   /**
   * Get endgamePoints
   * @return endgamePoints
  **/
  @ApiModelProperty(value = "")
  public Integer getEndgamePoints() {
    return endgamePoints;
  }

  public void setEndgamePoints(Integer endgamePoints) {
    this.endgamePoints = endgamePoints;
  }

  public MatchScoreBreakdown2018Alliance endgameRobot1(String endgameRobot1) {
    this.endgameRobot1 = endgameRobot1;
    return this;
  }

   /**
   * Get endgameRobot1
   * @return endgameRobot1
  **/
  @ApiModelProperty(value = "")
  public String getEndgameRobot1() {
    return endgameRobot1;
  }

  public void setEndgameRobot1(String endgameRobot1) {
    this.endgameRobot1 = endgameRobot1;
  }

  public MatchScoreBreakdown2018Alliance endgameRobot2(String endgameRobot2) {
    this.endgameRobot2 = endgameRobot2;
    return this;
  }

   /**
   * Get endgameRobot2
   * @return endgameRobot2
  **/
  @ApiModelProperty(value = "")
  public String getEndgameRobot2() {
    return endgameRobot2;
  }

  public void setEndgameRobot2(String endgameRobot2) {
    this.endgameRobot2 = endgameRobot2;
  }

  public MatchScoreBreakdown2018Alliance endgameRobot3(String endgameRobot3) {
    this.endgameRobot3 = endgameRobot3;
    return this;
  }

   /**
   * Get endgameRobot3
   * @return endgameRobot3
  **/
  @ApiModelProperty(value = "")
  public String getEndgameRobot3() {
    return endgameRobot3;
  }

  public void setEndgameRobot3(String endgameRobot3) {
    this.endgameRobot3 = endgameRobot3;
  }

  public MatchScoreBreakdown2018Alliance faceTheBossRankingPoint(Boolean faceTheBossRankingPoint) {
    this.faceTheBossRankingPoint = faceTheBossRankingPoint;
    return this;
  }

   /**
   * Get faceTheBossRankingPoint
   * @return faceTheBossRankingPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean isFaceTheBossRankingPoint() {
    return faceTheBossRankingPoint;
  }

  public void setFaceTheBossRankingPoint(Boolean faceTheBossRankingPoint) {
    this.faceTheBossRankingPoint = faceTheBossRankingPoint;
  }

  public MatchScoreBreakdown2018Alliance foulCount(Integer foulCount) {
    this.foulCount = foulCount;
    return this;
  }

   /**
   * Get foulCount
   * @return foulCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFoulCount() {
    return foulCount;
  }

  public void setFoulCount(Integer foulCount) {
    this.foulCount = foulCount;
  }

  public MatchScoreBreakdown2018Alliance foulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
    return this;
  }

   /**
   * Get foulPoints
   * @return foulPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getFoulPoints() {
    return foulPoints;
  }

  public void setFoulPoints(Integer foulPoints) {
    this.foulPoints = foulPoints;
  }

  public MatchScoreBreakdown2018Alliance rp(Integer rp) {
    this.rp = rp;
    return this;
  }

   /**
   * Get rp
   * @return rp
  **/
  @ApiModelProperty(value = "")
  public Integer getRp() {
    return rp;
  }

  public void setRp(Integer rp) {
    this.rp = rp;
  }

  public MatchScoreBreakdown2018Alliance techFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
    return this;
  }

   /**
   * Get techFoulCount
   * @return techFoulCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTechFoulCount() {
    return techFoulCount;
  }

  public void setTechFoulCount(Integer techFoulCount) {
    this.techFoulCount = techFoulCount;
  }

  public MatchScoreBreakdown2018Alliance teleopOwnershipPoints(Integer teleopOwnershipPoints) {
    this.teleopOwnershipPoints = teleopOwnershipPoints;
    return this;
  }

   /**
   * Get teleopOwnershipPoints
   * @return teleopOwnershipPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopOwnershipPoints() {
    return teleopOwnershipPoints;
  }

  public void setTeleopOwnershipPoints(Integer teleopOwnershipPoints) {
    this.teleopOwnershipPoints = teleopOwnershipPoints;
  }

  public MatchScoreBreakdown2018Alliance teleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
    return this;
  }

   /**
   * Get teleopPoints
   * @return teleopPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopPoints() {
    return teleopPoints;
  }

  public void setTeleopPoints(Integer teleopPoints) {
    this.teleopPoints = teleopPoints;
  }

  public MatchScoreBreakdown2018Alliance teleopScaleBoostSec(Integer teleopScaleBoostSec) {
    this.teleopScaleBoostSec = teleopScaleBoostSec;
    return this;
  }

   /**
   * Get teleopScaleBoostSec
   * @return teleopScaleBoostSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopScaleBoostSec() {
    return teleopScaleBoostSec;
  }

  public void setTeleopScaleBoostSec(Integer teleopScaleBoostSec) {
    this.teleopScaleBoostSec = teleopScaleBoostSec;
  }

  public MatchScoreBreakdown2018Alliance teleopScaleForceSec(Integer teleopScaleForceSec) {
    this.teleopScaleForceSec = teleopScaleForceSec;
    return this;
  }

   /**
   * Get teleopScaleForceSec
   * @return teleopScaleForceSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopScaleForceSec() {
    return teleopScaleForceSec;
  }

  public void setTeleopScaleForceSec(Integer teleopScaleForceSec) {
    this.teleopScaleForceSec = teleopScaleForceSec;
  }

  public MatchScoreBreakdown2018Alliance teleopScaleOwnershipSec(Integer teleopScaleOwnershipSec) {
    this.teleopScaleOwnershipSec = teleopScaleOwnershipSec;
    return this;
  }

   /**
   * Get teleopScaleOwnershipSec
   * @return teleopScaleOwnershipSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopScaleOwnershipSec() {
    return teleopScaleOwnershipSec;
  }

  public void setTeleopScaleOwnershipSec(Integer teleopScaleOwnershipSec) {
    this.teleopScaleOwnershipSec = teleopScaleOwnershipSec;
  }

  public MatchScoreBreakdown2018Alliance teleopSwitchBoostSec(Integer teleopSwitchBoostSec) {
    this.teleopSwitchBoostSec = teleopSwitchBoostSec;
    return this;
  }

   /**
   * Get teleopSwitchBoostSec
   * @return teleopSwitchBoostSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopSwitchBoostSec() {
    return teleopSwitchBoostSec;
  }

  public void setTeleopSwitchBoostSec(Integer teleopSwitchBoostSec) {
    this.teleopSwitchBoostSec = teleopSwitchBoostSec;
  }

  public MatchScoreBreakdown2018Alliance teleopSwitchForceSec(Integer teleopSwitchForceSec) {
    this.teleopSwitchForceSec = teleopSwitchForceSec;
    return this;
  }

   /**
   * Get teleopSwitchForceSec
   * @return teleopSwitchForceSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopSwitchForceSec() {
    return teleopSwitchForceSec;
  }

  public void setTeleopSwitchForceSec(Integer teleopSwitchForceSec) {
    this.teleopSwitchForceSec = teleopSwitchForceSec;
  }

  public MatchScoreBreakdown2018Alliance teleopSwitchOwnershipSec(Integer teleopSwitchOwnershipSec) {
    this.teleopSwitchOwnershipSec = teleopSwitchOwnershipSec;
    return this;
  }

   /**
   * Get teleopSwitchOwnershipSec
   * @return teleopSwitchOwnershipSec
  **/
  @ApiModelProperty(value = "")
  public Integer getTeleopSwitchOwnershipSec() {
    return teleopSwitchOwnershipSec;
  }

  public void setTeleopSwitchOwnershipSec(Integer teleopSwitchOwnershipSec) {
    this.teleopSwitchOwnershipSec = teleopSwitchOwnershipSec;
  }

  public MatchScoreBreakdown2018Alliance totalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
    return this;
  }

   /**
   * Get totalPoints
   * @return totalPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPoints() {
    return totalPoints;
  }

  public void setTotalPoints(Integer totalPoints) {
    this.totalPoints = totalPoints;
  }

  public MatchScoreBreakdown2018Alliance vaultBoostPlayed(Integer vaultBoostPlayed) {
    this.vaultBoostPlayed = vaultBoostPlayed;
    return this;
  }

   /**
   * Get vaultBoostPlayed
   * @return vaultBoostPlayed
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultBoostPlayed() {
    return vaultBoostPlayed;
  }

  public void setVaultBoostPlayed(Integer vaultBoostPlayed) {
    this.vaultBoostPlayed = vaultBoostPlayed;
  }

  public MatchScoreBreakdown2018Alliance vaultBoostTotal(Integer vaultBoostTotal) {
    this.vaultBoostTotal = vaultBoostTotal;
    return this;
  }

   /**
   * Get vaultBoostTotal
   * @return vaultBoostTotal
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultBoostTotal() {
    return vaultBoostTotal;
  }

  public void setVaultBoostTotal(Integer vaultBoostTotal) {
    this.vaultBoostTotal = vaultBoostTotal;
  }

  public MatchScoreBreakdown2018Alliance vaultForcePlayed(Integer vaultForcePlayed) {
    this.vaultForcePlayed = vaultForcePlayed;
    return this;
  }

   /**
   * Get vaultForcePlayed
   * @return vaultForcePlayed
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultForcePlayed() {
    return vaultForcePlayed;
  }

  public void setVaultForcePlayed(Integer vaultForcePlayed) {
    this.vaultForcePlayed = vaultForcePlayed;
  }

  public MatchScoreBreakdown2018Alliance vaultForceTotal(Integer vaultForceTotal) {
    this.vaultForceTotal = vaultForceTotal;
    return this;
  }

   /**
   * Get vaultForceTotal
   * @return vaultForceTotal
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultForceTotal() {
    return vaultForceTotal;
  }

  public void setVaultForceTotal(Integer vaultForceTotal) {
    this.vaultForceTotal = vaultForceTotal;
  }

  public MatchScoreBreakdown2018Alliance vaultLevitatePlayed(Integer vaultLevitatePlayed) {
    this.vaultLevitatePlayed = vaultLevitatePlayed;
    return this;
  }

   /**
   * Get vaultLevitatePlayed
   * @return vaultLevitatePlayed
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultLevitatePlayed() {
    return vaultLevitatePlayed;
  }

  public void setVaultLevitatePlayed(Integer vaultLevitatePlayed) {
    this.vaultLevitatePlayed = vaultLevitatePlayed;
  }

  public MatchScoreBreakdown2018Alliance vaultLevitateTotal(Integer vaultLevitateTotal) {
    this.vaultLevitateTotal = vaultLevitateTotal;
    return this;
  }

   /**
   * Get vaultLevitateTotal
   * @return vaultLevitateTotal
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultLevitateTotal() {
    return vaultLevitateTotal;
  }

  public void setVaultLevitateTotal(Integer vaultLevitateTotal) {
    this.vaultLevitateTotal = vaultLevitateTotal;
  }

  public MatchScoreBreakdown2018Alliance vaultPoints(Integer vaultPoints) {
    this.vaultPoints = vaultPoints;
    return this;
  }

   /**
   * Get vaultPoints
   * @return vaultPoints
  **/
  @ApiModelProperty(value = "")
  public Integer getVaultPoints() {
    return vaultPoints;
  }

  public void setVaultPoints(Integer vaultPoints) {
    this.vaultPoints = vaultPoints;
  }

  public MatchScoreBreakdown2018Alliance tbaGameData(String tbaGameData) {
    this.tbaGameData = tbaGameData;
    return this;
  }

   /**
   * Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing &#x60;L&#x60; and &#x60;R&#x60; only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance&#39;s perspective. An &#x60;L&#x60; in a position indicates the platform on the left will be lit for the alliance while an &#x60;R&#x60; will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).
   * @return tbaGameData
  **/
  @ApiModelProperty(value = "Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).")
  public String getTbaGameData() {
    return tbaGameData;
  }

  public void setTbaGameData(String tbaGameData) {
    this.tbaGameData = tbaGameData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchScoreBreakdown2018Alliance matchScoreBreakdown2018Alliance = (MatchScoreBreakdown2018Alliance) o;
    return Objects.equals(this.adjustPoints, matchScoreBreakdown2018Alliance.adjustPoints) &&
        Objects.equals(this.autoOwnershipPoints, matchScoreBreakdown2018Alliance.autoOwnershipPoints) &&
        Objects.equals(this.autoPoints, matchScoreBreakdown2018Alliance.autoPoints) &&
        Objects.equals(this.autoQuestRankingPoint, matchScoreBreakdown2018Alliance.autoQuestRankingPoint) &&
        Objects.equals(this.autoRobot1, matchScoreBreakdown2018Alliance.autoRobot1) &&
        Objects.equals(this.autoRobot2, matchScoreBreakdown2018Alliance.autoRobot2) &&
        Objects.equals(this.autoRobot3, matchScoreBreakdown2018Alliance.autoRobot3) &&
        Objects.equals(this.autoRunPoints, matchScoreBreakdown2018Alliance.autoRunPoints) &&
        Objects.equals(this.autoScaleOwnershipSec, matchScoreBreakdown2018Alliance.autoScaleOwnershipSec) &&
        Objects.equals(this.autoSwitchAtZero, matchScoreBreakdown2018Alliance.autoSwitchAtZero) &&
        Objects.equals(this.autoSwitchOwnershipSec, matchScoreBreakdown2018Alliance.autoSwitchOwnershipSec) &&
        Objects.equals(this.endgamePoints, matchScoreBreakdown2018Alliance.endgamePoints) &&
        Objects.equals(this.endgameRobot1, matchScoreBreakdown2018Alliance.endgameRobot1) &&
        Objects.equals(this.endgameRobot2, matchScoreBreakdown2018Alliance.endgameRobot2) &&
        Objects.equals(this.endgameRobot3, matchScoreBreakdown2018Alliance.endgameRobot3) &&
        Objects.equals(this.faceTheBossRankingPoint, matchScoreBreakdown2018Alliance.faceTheBossRankingPoint) &&
        Objects.equals(this.foulCount, matchScoreBreakdown2018Alliance.foulCount) &&
        Objects.equals(this.foulPoints, matchScoreBreakdown2018Alliance.foulPoints) &&
        Objects.equals(this.rp, matchScoreBreakdown2018Alliance.rp) &&
        Objects.equals(this.techFoulCount, matchScoreBreakdown2018Alliance.techFoulCount) &&
        Objects.equals(this.teleopOwnershipPoints, matchScoreBreakdown2018Alliance.teleopOwnershipPoints) &&
        Objects.equals(this.teleopPoints, matchScoreBreakdown2018Alliance.teleopPoints) &&
        Objects.equals(this.teleopScaleBoostSec, matchScoreBreakdown2018Alliance.teleopScaleBoostSec) &&
        Objects.equals(this.teleopScaleForceSec, matchScoreBreakdown2018Alliance.teleopScaleForceSec) &&
        Objects.equals(this.teleopScaleOwnershipSec, matchScoreBreakdown2018Alliance.teleopScaleOwnershipSec) &&
        Objects.equals(this.teleopSwitchBoostSec, matchScoreBreakdown2018Alliance.teleopSwitchBoostSec) &&
        Objects.equals(this.teleopSwitchForceSec, matchScoreBreakdown2018Alliance.teleopSwitchForceSec) &&
        Objects.equals(this.teleopSwitchOwnershipSec, matchScoreBreakdown2018Alliance.teleopSwitchOwnershipSec) &&
        Objects.equals(this.totalPoints, matchScoreBreakdown2018Alliance.totalPoints) &&
        Objects.equals(this.vaultBoostPlayed, matchScoreBreakdown2018Alliance.vaultBoostPlayed) &&
        Objects.equals(this.vaultBoostTotal, matchScoreBreakdown2018Alliance.vaultBoostTotal) &&
        Objects.equals(this.vaultForcePlayed, matchScoreBreakdown2018Alliance.vaultForcePlayed) &&
        Objects.equals(this.vaultForceTotal, matchScoreBreakdown2018Alliance.vaultForceTotal) &&
        Objects.equals(this.vaultLevitatePlayed, matchScoreBreakdown2018Alliance.vaultLevitatePlayed) &&
        Objects.equals(this.vaultLevitateTotal, matchScoreBreakdown2018Alliance.vaultLevitateTotal) &&
        Objects.equals(this.vaultPoints, matchScoreBreakdown2018Alliance.vaultPoints) &&
        Objects.equals(this.tbaGameData, matchScoreBreakdown2018Alliance.tbaGameData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustPoints, autoOwnershipPoints, autoPoints, autoQuestRankingPoint, autoRobot1, autoRobot2, autoRobot3, autoRunPoints, autoScaleOwnershipSec, autoSwitchAtZero, autoSwitchOwnershipSec, endgamePoints, endgameRobot1, endgameRobot2, endgameRobot3, faceTheBossRankingPoint, foulCount, foulPoints, rp, techFoulCount, teleopOwnershipPoints, teleopPoints, teleopScaleBoostSec, teleopScaleForceSec, teleopScaleOwnershipSec, teleopSwitchBoostSec, teleopSwitchForceSec, teleopSwitchOwnershipSec, totalPoints, vaultBoostPlayed, vaultBoostTotal, vaultForcePlayed, vaultForceTotal, vaultLevitatePlayed, vaultLevitateTotal, vaultPoints, tbaGameData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchScoreBreakdown2018Alliance {\n");
    
    sb.append("    adjustPoints: ").append(toIndentedString(adjustPoints)).append("\n");
    sb.append("    autoOwnershipPoints: ").append(toIndentedString(autoOwnershipPoints)).append("\n");
    sb.append("    autoPoints: ").append(toIndentedString(autoPoints)).append("\n");
    sb.append("    autoQuestRankingPoint: ").append(toIndentedString(autoQuestRankingPoint)).append("\n");
    sb.append("    autoRobot1: ").append(toIndentedString(autoRobot1)).append("\n");
    sb.append("    autoRobot2: ").append(toIndentedString(autoRobot2)).append("\n");
    sb.append("    autoRobot3: ").append(toIndentedString(autoRobot3)).append("\n");
    sb.append("    autoRunPoints: ").append(toIndentedString(autoRunPoints)).append("\n");
    sb.append("    autoScaleOwnershipSec: ").append(toIndentedString(autoScaleOwnershipSec)).append("\n");
    sb.append("    autoSwitchAtZero: ").append(toIndentedString(autoSwitchAtZero)).append("\n");
    sb.append("    autoSwitchOwnershipSec: ").append(toIndentedString(autoSwitchOwnershipSec)).append("\n");
    sb.append("    endgamePoints: ").append(toIndentedString(endgamePoints)).append("\n");
    sb.append("    endgameRobot1: ").append(toIndentedString(endgameRobot1)).append("\n");
    sb.append("    endgameRobot2: ").append(toIndentedString(endgameRobot2)).append("\n");
    sb.append("    endgameRobot3: ").append(toIndentedString(endgameRobot3)).append("\n");
    sb.append("    faceTheBossRankingPoint: ").append(toIndentedString(faceTheBossRankingPoint)).append("\n");
    sb.append("    foulCount: ").append(toIndentedString(foulCount)).append("\n");
    sb.append("    foulPoints: ").append(toIndentedString(foulPoints)).append("\n");
    sb.append("    rp: ").append(toIndentedString(rp)).append("\n");
    sb.append("    techFoulCount: ").append(toIndentedString(techFoulCount)).append("\n");
    sb.append("    teleopOwnershipPoints: ").append(toIndentedString(teleopOwnershipPoints)).append("\n");
    sb.append("    teleopPoints: ").append(toIndentedString(teleopPoints)).append("\n");
    sb.append("    teleopScaleBoostSec: ").append(toIndentedString(teleopScaleBoostSec)).append("\n");
    sb.append("    teleopScaleForceSec: ").append(toIndentedString(teleopScaleForceSec)).append("\n");
    sb.append("    teleopScaleOwnershipSec: ").append(toIndentedString(teleopScaleOwnershipSec)).append("\n");
    sb.append("    teleopSwitchBoostSec: ").append(toIndentedString(teleopSwitchBoostSec)).append("\n");
    sb.append("    teleopSwitchForceSec: ").append(toIndentedString(teleopSwitchForceSec)).append("\n");
    sb.append("    teleopSwitchOwnershipSec: ").append(toIndentedString(teleopSwitchOwnershipSec)).append("\n");
    sb.append("    totalPoints: ").append(toIndentedString(totalPoints)).append("\n");
    sb.append("    vaultBoostPlayed: ").append(toIndentedString(vaultBoostPlayed)).append("\n");
    sb.append("    vaultBoostTotal: ").append(toIndentedString(vaultBoostTotal)).append("\n");
    sb.append("    vaultForcePlayed: ").append(toIndentedString(vaultForcePlayed)).append("\n");
    sb.append("    vaultForceTotal: ").append(toIndentedString(vaultForceTotal)).append("\n");
    sb.append("    vaultLevitatePlayed: ").append(toIndentedString(vaultLevitatePlayed)).append("\n");
    sb.append("    vaultLevitateTotal: ").append(toIndentedString(vaultLevitateTotal)).append("\n");
    sb.append("    vaultPoints: ").append(toIndentedString(vaultPoints)).append("\n");
    sb.append("    tbaGameData: ").append(toIndentedString(tbaGameData)).append("\n");
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
