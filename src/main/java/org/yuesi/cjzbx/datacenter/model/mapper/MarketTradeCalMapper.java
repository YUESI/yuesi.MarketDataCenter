package org.yuesi.cjzbx.datacenter.model.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.yuesi.cjzbx.datacenter.model.MarketTradeCal;
import org.yuesi.cjzbx.datacenter.model.MarketTradeCalCriteria;

public interface MarketTradeCalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @SelectProvider(type=MarketTradeCalSqlProvider.class, method="countByExample")
    long countByExample(MarketTradeCalCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @DeleteProvider(type=MarketTradeCalSqlProvider.class, method="deleteByExample")
    int deleteByExample(MarketTradeCalCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @Delete({
        "delete from market_tradecal",
        "where exchangeCD = #{exchangecd,jdbcType=VARCHAR}",
          "and calendarDate = #{calendardate,jdbcType=DATE}"
    })
    int deleteByPrimaryKey(@Param("exchangecd") String exchangecd, @Param("calendardate") Date calendardate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @Insert({
        "insert into market_tradecal (exchangeCD, calendarDate, ",
        "isOpen, isWeekEnd, isMonthEnd, ",
        "isQuarterEnd, isYearEnd)",
        "values (#{exchangecd,jdbcType=VARCHAR}, #{calendardate,jdbcType=DATE}, ",
        "#{isopen,jdbcType=BIT}, #{isweekend,jdbcType=BIT}, #{ismonthend,jdbcType=BIT}, ",
        "#{isquarterend,jdbcType=BIT}, #{isyearend,jdbcType=BIT})"
    })
    int insert(MarketTradeCal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @InsertProvider(type=MarketTradeCalSqlProvider.class, method="insertSelective")
    int insertSelective(MarketTradeCal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @SelectProvider(type=MarketTradeCalSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="exchangeCD", property="exchangecd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendarDate", property="calendardate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="isOpen", property="isopen", jdbcType=JdbcType.BIT),
        @Result(column="isWeekEnd", property="isweekend", jdbcType=JdbcType.BIT),
        @Result(column="isMonthEnd", property="ismonthend", jdbcType=JdbcType.BIT),
        @Result(column="isQuarterEnd", property="isquarterend", jdbcType=JdbcType.BIT),
        @Result(column="isYearEnd", property="isyearend", jdbcType=JdbcType.BIT)
    })
    List<MarketTradeCal> selectByExample(MarketTradeCalCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @Select({
        "select",
        "exchangeCD, calendarDate, isOpen, isWeekEnd, isMonthEnd, isQuarterEnd, isYearEnd",
        "from market_tradecal",
        "where exchangeCD = #{exchangecd,jdbcType=VARCHAR}",
          "and calendarDate = #{calendardate,jdbcType=DATE}"
    })
    @Results({
        @Result(column="exchangeCD", property="exchangecd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="calendarDate", property="calendardate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="isOpen", property="isopen", jdbcType=JdbcType.BIT),
        @Result(column="isWeekEnd", property="isweekend", jdbcType=JdbcType.BIT),
        @Result(column="isMonthEnd", property="ismonthend", jdbcType=JdbcType.BIT),
        @Result(column="isQuarterEnd", property="isquarterend", jdbcType=JdbcType.BIT),
        @Result(column="isYearEnd", property="isyearend", jdbcType=JdbcType.BIT)
    })
    MarketTradeCal selectByPrimaryKey(@Param("exchangecd") String exchangecd, @Param("calendardate") Date calendardate);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @UpdateProvider(type=MarketTradeCalSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MarketTradeCal record, @Param("example") MarketTradeCalCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @UpdateProvider(type=MarketTradeCalSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MarketTradeCal record, @Param("example") MarketTradeCalCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @UpdateProvider(type=MarketTradeCalSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MarketTradeCal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Tue Jun 06 22:15:20 CST 2017
     */
    @Update({
        "update market_tradecal",
        "set isOpen = #{isopen,jdbcType=BIT},",
          "isWeekEnd = #{isweekend,jdbcType=BIT},",
          "isMonthEnd = #{ismonthend,jdbcType=BIT},",
          "isQuarterEnd = #{isquarterend,jdbcType=BIT},",
          "isYearEnd = #{isyearend,jdbcType=BIT}",
        "where exchangeCD = #{exchangecd,jdbcType=VARCHAR}",
          "and calendarDate = #{calendardate,jdbcType=DATE}"
    })
    int updateByPrimaryKey(MarketTradeCal record);
}