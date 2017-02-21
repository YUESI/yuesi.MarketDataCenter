package org.yuesi.cjzbx.datacenter.domain.mapper;

import org.apache.ibatis.jdbc.SQL;
import org.yuesi.cjzbx.datacenter.domain.MarketTradeCal;

public class MarketTradeCalSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated
     */
    public String insertSelective(MarketTradeCal record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("market_tradecal");
        
        if (record.getExchangecd() != null) {
            sql.VALUES("exchangeCD", "#{exchangecd,jdbcType=VARCHAR}");
        }
        
        if (record.getCalendardate() != null) {
            sql.VALUES("calendarDate", "#{calendardate,jdbcType=DATE}");
        }
        
        if (record.getIsopen() != null) {
            sql.VALUES("isOpen", "#{isopen,jdbcType=BIT}");
        }
        
        if (record.getIsweekend() != null) {
            sql.VALUES("isWeekEnd", "#{isweekend,jdbcType=BIT}");
        }
        
        if (record.getIsmonthend() != null) {
            sql.VALUES("isMonthEnd", "#{ismonthend,jdbcType=BIT}");
        }
        
        if (record.getIsquarterend() != null) {
            sql.VALUES("isQuarterEnd", "#{isquarterend,jdbcType=BIT}");
        }
        
        if (record.getIsyearend() != null) {
            sql.VALUES("isYearEnd", "#{isyearend,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(MarketTradeCal record) {
        SQL sql = new SQL();
        sql.UPDATE("market_tradecal");
        
        if (record.getIsopen() != null) {
            sql.SET("isOpen = #{isopen,jdbcType=BIT}");
        }
        
        if (record.getIsweekend() != null) {
            sql.SET("isWeekEnd = #{isweekend,jdbcType=BIT}");
        }
        
        if (record.getIsmonthend() != null) {
            sql.SET("isMonthEnd = #{ismonthend,jdbcType=BIT}");
        }
        
        if (record.getIsquarterend() != null) {
            sql.SET("isQuarterEnd = #{isquarterend,jdbcType=BIT}");
        }
        
        if (record.getIsyearend() != null) {
            sql.SET("isYearEnd = #{isyearend,jdbcType=BIT}");
        }
        
        sql.WHERE("exchangeCD = #{exchangecd,jdbcType=VARCHAR}");
        sql.WHERE("calendarDate = #{calendardate,jdbcType=DATE}");
        
        return sql.toString();
    }
}