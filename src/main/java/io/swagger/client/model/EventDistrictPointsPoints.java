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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * EventDistrictPointsPoints
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-05T12:05:14.488-05:00")
public class EventDistrictPointsPoints {
    @SerializedName("alliance_points")
    private Integer alliancePoints = null;

    @SerializedName("award_points")
    private Integer awardPoints = null;

    @SerializedName("qual_points")
    private Integer qualPoints = null;

    @SerializedName("elim_points")
    private Integer elimPoints = null;

    @SerializedName("total")
    private Integer total = null;

    public EventDistrictPointsPoints alliancePoints(Integer alliancePoints) {
        this.alliancePoints = alliancePoints;
        return this;
    }

    /**
     * Points awarded for alliance selection
     *
     * @return alliancePoints
     **/
    @ApiModelProperty(required = true, value = "Points awarded for alliance selection")
    public Integer getAlliancePoints() {
        return alliancePoints;
    }

    public void setAlliancePoints(Integer alliancePoints) {
        this.alliancePoints = alliancePoints;
    }

    public EventDistrictPointsPoints awardPoints(Integer awardPoints) {
        this.awardPoints = awardPoints;
        return this;
    }

    /**
     * Points awarded for event awards.
     *
     * @return awardPoints
     **/
    @ApiModelProperty(required = true, value = "Points awarded for event awards.")
    public Integer getAwardPoints() {
        return awardPoints;
    }

    public void setAwardPoints(Integer awardPoints) {
        this.awardPoints = awardPoints;
    }

    public EventDistrictPointsPoints qualPoints(Integer qualPoints) {
        this.qualPoints = qualPoints;
        return this;
    }

    /**
     * Points awarded for qualification match performance.
     *
     * @return qualPoints
     **/
    @ApiModelProperty(required = true, value = "Points awarded for qualification match performance.")
    public Integer getQualPoints() {
        return qualPoints;
    }

    public void setQualPoints(Integer qualPoints) {
        this.qualPoints = qualPoints;
    }

    public EventDistrictPointsPoints elimPoints(Integer elimPoints) {
        this.elimPoints = elimPoints;
        return this;
    }

    /**
     * Points awarded for elimination match performance.
     *
     * @return elimPoints
     **/
    @ApiModelProperty(required = true, value = "Points awarded for elimination match performance.")
    public Integer getElimPoints() {
        return elimPoints;
    }

    public void setElimPoints(Integer elimPoints) {
        this.elimPoints = elimPoints;
    }

    public EventDistrictPointsPoints total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Total points awarded at this event.
     *
     * @return total
     **/
    @ApiModelProperty(required = true, value = "Total points awarded at this event.")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventDistrictPointsPoints eventDistrictPointsPoints = (EventDistrictPointsPoints) o;
        return Objects.equals(this.alliancePoints, eventDistrictPointsPoints.alliancePoints) &&
                Objects.equals(this.awardPoints, eventDistrictPointsPoints.awardPoints) &&
                Objects.equals(this.qualPoints, eventDistrictPointsPoints.qualPoints) &&
                Objects.equals(this.elimPoints, eventDistrictPointsPoints.elimPoints) &&
                Objects.equals(this.total, eventDistrictPointsPoints.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alliancePoints, awardPoints, qualPoints, elimPoints, total);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDistrictPointsPoints {\n");

        sb.append("    alliancePoints: ").append(toIndentedString(alliancePoints)).append("\n");
        sb.append("    awardPoints: ").append(toIndentedString(awardPoints)).append("\n");
        sb.append("    qualPoints: ").append(toIndentedString(qualPoints)).append("\n");
        sb.append("    elimPoints: ").append(toIndentedString(elimPoints)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

