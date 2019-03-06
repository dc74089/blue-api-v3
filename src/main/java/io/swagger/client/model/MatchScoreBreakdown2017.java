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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * See the 2017 FMS API documentation for a description of each value.
 */
@ApiModel(description = "See the 2017 FMS API documentation for a description of each value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-05T12:05:14.488-05:00")
public class MatchScoreBreakdown2017 {
    @SerializedName("blue")
    private MatchScoreBreakdown2017Alliance blue = null;

    @SerializedName("red")
    private MatchScoreBreakdown2017Alliance red = null;

    public MatchScoreBreakdown2017 blue(MatchScoreBreakdown2017Alliance blue) {
        this.blue = blue;
        return this;
    }

    /**
     * Get blue
     *
     * @return blue
     **/
    @ApiModelProperty(value = "")
    public MatchScoreBreakdown2017Alliance getBlue() {
        return blue;
    }

    public void setBlue(MatchScoreBreakdown2017Alliance blue) {
        this.blue = blue;
    }

    public MatchScoreBreakdown2017 red(MatchScoreBreakdown2017Alliance red) {
        this.red = red;
        return this;
    }

    /**
     * Get red
     *
     * @return red
     **/
    @ApiModelProperty(value = "")
    public MatchScoreBreakdown2017Alliance getRed() {
        return red;
    }

    public void setRed(MatchScoreBreakdown2017Alliance red) {
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
        MatchScoreBreakdown2017 matchScoreBreakdown2017 = (MatchScoreBreakdown2017) o;
        return Objects.equals(this.blue, matchScoreBreakdown2017.blue) &&
                Objects.equals(this.red, matchScoreBreakdown2017.red);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blue, red);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MatchScoreBreakdown2017 {\n");

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

