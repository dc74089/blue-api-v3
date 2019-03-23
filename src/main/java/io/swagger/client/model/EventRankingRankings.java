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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EventRankingRankings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-23T11:52:56.009-04:00")
public class EventRankingRankings {
    @SerializedName("dq")
    private Integer dq = null;

    @SerializedName("matches_played")
    private Integer matchesPlayed = null;

    @SerializedName("qual_average")
    private Integer qualAverage = null;

    @SerializedName("rank")
    private Integer rank = null;

    @SerializedName("record")
    private WLTRecord record = null;

    @SerializedName("extra_stats")
    private List<BigDecimal> extraStats = null;

    @SerializedName("sort_orders")
    private List<BigDecimal> sortOrders = null;

    @SerializedName("team_key")
    private String teamKey = null;

    public EventRankingRankings dq(Integer dq) {
        this.dq = dq;
        return this;
    }

    /**
     * Number of times disqualified.
     *
     * @return dq
     **/
    @ApiModelProperty(required = true, value = "Number of times disqualified.")
    public Integer getDq() {
        return dq;
    }

    public void setDq(Integer dq) {
        this.dq = dq;
    }

    public EventRankingRankings matchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
        return this;
    }

    /**
     * Number of matches played by this team.
     *
     * @return matchesPlayed
     **/
    @ApiModelProperty(required = true, value = "Number of matches played by this team.")
    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public EventRankingRankings qualAverage(Integer qualAverage) {
        this.qualAverage = qualAverage;
        return this;
    }

    /**
     * The average match score during qualifications. Year specific. May be null if not relevant for a given year.
     *
     * @return qualAverage
     **/
    @ApiModelProperty(value = "The average match score during qualifications. Year specific. May be null if not relevant for a given year.")
    public Integer getQualAverage() {
        return qualAverage;
    }

    public void setQualAverage(Integer qualAverage) {
        this.qualAverage = qualAverage;
    }

    public EventRankingRankings rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * The team&#39;s rank at the event as provided by FIRST.
     *
     * @return rank
     **/
    @ApiModelProperty(required = true, value = "The team's rank at the event as provided by FIRST.")
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public EventRankingRankings record(WLTRecord record) {
        this.record = record;
        return this;
    }

    /**
     * Get record
     *
     * @return record
     **/
    @ApiModelProperty(required = true, value = "")
    public WLTRecord getRecord() {
        return record;
    }

    public void setRecord(WLTRecord record) {
        this.record = record;
    }

    public EventRankingRankings extraStats(List<BigDecimal> extraStats) {
        this.extraStats = extraStats;
        return this;
    }

    public EventRankingRankings addExtraStatsItem(BigDecimal extraStatsItem) {
        if (this.extraStats == null) {
            this.extraStats = new ArrayList<BigDecimal>();
        }
        this.extraStats.add(extraStatsItem);
        return this;
    }

    /**
     * Additional special data on the team&#39;s performance calculated by TBA.
     *
     * @return extraStats
     **/
    @ApiModelProperty(value = "Additional special data on the team's performance calculated by TBA.")
    public List<BigDecimal> getExtraStats() {
        return extraStats;
    }

    public void setExtraStats(List<BigDecimal> extraStats) {
        this.extraStats = extraStats;
    }

    public EventRankingRankings sortOrders(List<BigDecimal> sortOrders) {
        this.sortOrders = sortOrders;
        return this;
    }

    public EventRankingRankings addSortOrdersItem(BigDecimal sortOrdersItem) {
        if (this.sortOrders == null) {
            this.sortOrders = new ArrayList<BigDecimal>();
        }
        this.sortOrders.add(sortOrdersItem);
        return this;
    }

    /**
     * Additional year-specific information, may be null. See parent &#x60;sort_order_info&#x60; for details.
     *
     * @return sortOrders
     **/
    @ApiModelProperty(value = "Additional year-specific information, may be null. See parent `sort_order_info` for details.")
    public List<BigDecimal> getSortOrders() {
        return sortOrders;
    }

    public void setSortOrders(List<BigDecimal> sortOrders) {
        this.sortOrders = sortOrders;
    }

    public EventRankingRankings teamKey(String teamKey) {
        this.teamKey = teamKey;
        return this;
    }

    /**
     * The team with this rank.
     *
     * @return teamKey
     **/
    @ApiModelProperty(required = true, value = "The team with this rank.")
    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventRankingRankings eventRankingRankings = (EventRankingRankings) o;
        return Objects.equals(this.dq, eventRankingRankings.dq) &&
                Objects.equals(this.matchesPlayed, eventRankingRankings.matchesPlayed) &&
                Objects.equals(this.qualAverage, eventRankingRankings.qualAverage) &&
                Objects.equals(this.rank, eventRankingRankings.rank) &&
                Objects.equals(this.record, eventRankingRankings.record) &&
                Objects.equals(this.extraStats, eventRankingRankings.extraStats) &&
                Objects.equals(this.sortOrders, eventRankingRankings.sortOrders) &&
                Objects.equals(this.teamKey, eventRankingRankings.teamKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dq, matchesPlayed, qualAverage, rank, record, extraStats, sortOrders, teamKey);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventRankingRankings {\n");

        sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
        sb.append("    matchesPlayed: ").append(toIndentedString(matchesPlayed)).append("\n");
        sb.append("    qualAverage: ").append(toIndentedString(qualAverage)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    extraStats: ").append(toIndentedString(extraStats)).append("\n");
        sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
        sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

