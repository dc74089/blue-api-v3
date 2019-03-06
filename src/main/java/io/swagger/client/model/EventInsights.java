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
 * A year-specific event insight object expressed as a JSON string, separated in to &#x60;qual&#x60; and &#x60;playoff&#x60; fields. See also Event_Insights_2016, Event_Insights_2017, etc.
 */
@ApiModel(description = "A year-specific event insight object expressed as a JSON string, separated in to `qual` and `playoff` fields. See also Event_Insights_2016, Event_Insights_2017, etc.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-05T12:05:14.488-05:00")
public class EventInsights {
    @SerializedName("qual")
    private Object qual = null;

    @SerializedName("playoff")
    private Object playoff = null;

    public EventInsights qual(Object qual) {
        this.qual = qual;
        return this;
    }

    /**
     * Inights for the qualification round of an event
     *
     * @return qual
     **/
    @ApiModelProperty(value = "Inights for the qualification round of an event")
    public Object getQual() {
        return qual;
    }

    public void setQual(Object qual) {
        this.qual = qual;
    }

    public EventInsights playoff(Object playoff) {
        this.playoff = playoff;
        return this;
    }

    /**
     * Insights for the playoff round of an event
     *
     * @return playoff
     **/
    @ApiModelProperty(value = "Insights for the playoff round of an event")
    public Object getPlayoff() {
        return playoff;
    }

    public void setPlayoff(Object playoff) {
        this.playoff = playoff;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventInsights eventInsights = (EventInsights) o;
        return Objects.equals(this.qual, eventInsights.qual) &&
                Objects.equals(this.playoff, eventInsights.playoff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qual, playoff);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventInsights {\n");

        sb.append("    qual: ").append(toIndentedString(qual)).append("\n");
        sb.append("    playoff: ").append(toIndentedString(playoff)).append("\n");
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

