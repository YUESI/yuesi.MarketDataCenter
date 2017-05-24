package org.yuesi.cjzbx.datacenter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MarketTradeCalCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public MarketTradeCalCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExchangecdIsNull() {
            addCriterion("exchangeCD is null");
            return (Criteria) this;
        }

        public Criteria andExchangecdIsNotNull() {
            addCriterion("exchangeCD is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecdEqualTo(String value) {
            addCriterion("exchangeCD =", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdNotEqualTo(String value) {
            addCriterion("exchangeCD <>", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdGreaterThan(String value) {
            addCriterion("exchangeCD >", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdGreaterThanOrEqualTo(String value) {
            addCriterion("exchangeCD >=", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdLessThan(String value) {
            addCriterion("exchangeCD <", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdLessThanOrEqualTo(String value) {
            addCriterion("exchangeCD <=", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdLike(String value) {
            addCriterion("exchangeCD like", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdNotLike(String value) {
            addCriterion("exchangeCD not like", value, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdIn(List<String> values) {
            addCriterion("exchangeCD in", values, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdNotIn(List<String> values) {
            addCriterion("exchangeCD not in", values, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdBetween(String value1, String value2) {
            addCriterion("exchangeCD between", value1, value2, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andExchangecdNotBetween(String value1, String value2) {
            addCriterion("exchangeCD not between", value1, value2, "exchangecd");
            return (Criteria) this;
        }

        public Criteria andCalendardateIsNull() {
            addCriterion("calendarDate is null");
            return (Criteria) this;
        }

        public Criteria andCalendardateIsNotNull() {
            addCriterion("calendarDate is not null");
            return (Criteria) this;
        }

        public Criteria andCalendardateEqualTo(Date value) {
            addCriterionForJDBCDate("calendarDate =", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateNotEqualTo(Date value) {
            addCriterionForJDBCDate("calendarDate <>", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateGreaterThan(Date value) {
            addCriterionForJDBCDate("calendarDate >", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("calendarDate >=", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateLessThan(Date value) {
            addCriterionForJDBCDate("calendarDate <", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("calendarDate <=", value, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateIn(List<Date> values) {
            addCriterionForJDBCDate("calendarDate in", values, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateNotIn(List<Date> values) {
            addCriterionForJDBCDate("calendarDate not in", values, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("calendarDate between", value1, value2, "calendardate");
            return (Criteria) this;
        }

        public Criteria andCalendardateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("calendarDate not between", value1, value2, "calendardate");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isOpen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isOpen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(Boolean value) {
            addCriterion("isOpen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(Boolean value) {
            addCriterion("isOpen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(Boolean value) {
            addCriterion("isOpen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isOpen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(Boolean value) {
            addCriterion("isOpen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(Boolean value) {
            addCriterion("isOpen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<Boolean> values) {
            addCriterion("isOpen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<Boolean> values) {
            addCriterion("isOpen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(Boolean value1, Boolean value2) {
            addCriterion("isOpen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isOpen not between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsweekendIsNull() {
            addCriterion("isWeekEnd is null");
            return (Criteria) this;
        }

        public Criteria andIsweekendIsNotNull() {
            addCriterion("isWeekEnd is not null");
            return (Criteria) this;
        }

        public Criteria andIsweekendEqualTo(Boolean value) {
            addCriterion("isWeekEnd =", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendNotEqualTo(Boolean value) {
            addCriterion("isWeekEnd <>", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendGreaterThan(Boolean value) {
            addCriterion("isWeekEnd >", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isWeekEnd >=", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendLessThan(Boolean value) {
            addCriterion("isWeekEnd <", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendLessThanOrEqualTo(Boolean value) {
            addCriterion("isWeekEnd <=", value, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendIn(List<Boolean> values) {
            addCriterion("isWeekEnd in", values, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendNotIn(List<Boolean> values) {
            addCriterion("isWeekEnd not in", values, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendBetween(Boolean value1, Boolean value2) {
            addCriterion("isWeekEnd between", value1, value2, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsweekendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isWeekEnd not between", value1, value2, "isweekend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendIsNull() {
            addCriterion("isMonthEnd is null");
            return (Criteria) this;
        }

        public Criteria andIsmonthendIsNotNull() {
            addCriterion("isMonthEnd is not null");
            return (Criteria) this;
        }

        public Criteria andIsmonthendEqualTo(Boolean value) {
            addCriterion("isMonthEnd =", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendNotEqualTo(Boolean value) {
            addCriterion("isMonthEnd <>", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendGreaterThan(Boolean value) {
            addCriterion("isMonthEnd >", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMonthEnd >=", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendLessThan(Boolean value) {
            addCriterion("isMonthEnd <", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendLessThanOrEqualTo(Boolean value) {
            addCriterion("isMonthEnd <=", value, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendIn(List<Boolean> values) {
            addCriterion("isMonthEnd in", values, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendNotIn(List<Boolean> values) {
            addCriterion("isMonthEnd not in", values, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendBetween(Boolean value1, Boolean value2) {
            addCriterion("isMonthEnd between", value1, value2, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsmonthendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMonthEnd not between", value1, value2, "ismonthend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendIsNull() {
            addCriterion("isQuarterEnd is null");
            return (Criteria) this;
        }

        public Criteria andIsquarterendIsNotNull() {
            addCriterion("isQuarterEnd is not null");
            return (Criteria) this;
        }

        public Criteria andIsquarterendEqualTo(Boolean value) {
            addCriterion("isQuarterEnd =", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendNotEqualTo(Boolean value) {
            addCriterion("isQuarterEnd <>", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendGreaterThan(Boolean value) {
            addCriterion("isQuarterEnd >", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isQuarterEnd >=", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendLessThan(Boolean value) {
            addCriterion("isQuarterEnd <", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendLessThanOrEqualTo(Boolean value) {
            addCriterion("isQuarterEnd <=", value, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendIn(List<Boolean> values) {
            addCriterion("isQuarterEnd in", values, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendNotIn(List<Boolean> values) {
            addCriterion("isQuarterEnd not in", values, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendBetween(Boolean value1, Boolean value2) {
            addCriterion("isQuarterEnd between", value1, value2, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsquarterendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isQuarterEnd not between", value1, value2, "isquarterend");
            return (Criteria) this;
        }

        public Criteria andIsyearendIsNull() {
            addCriterion("isYearEnd is null");
            return (Criteria) this;
        }

        public Criteria andIsyearendIsNotNull() {
            addCriterion("isYearEnd is not null");
            return (Criteria) this;
        }

        public Criteria andIsyearendEqualTo(Boolean value) {
            addCriterion("isYearEnd =", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendNotEqualTo(Boolean value) {
            addCriterion("isYearEnd <>", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendGreaterThan(Boolean value) {
            addCriterion("isYearEnd >", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isYearEnd >=", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendLessThan(Boolean value) {
            addCriterion("isYearEnd <", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendLessThanOrEqualTo(Boolean value) {
            addCriterion("isYearEnd <=", value, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendIn(List<Boolean> values) {
            addCriterion("isYearEnd in", values, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendNotIn(List<Boolean> values) {
            addCriterion("isYearEnd not in", values, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendBetween(Boolean value1, Boolean value2) {
            addCriterion("isYearEnd between", value1, value2, "isyearend");
            return (Criteria) this;
        }

        public Criteria andIsyearendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isYearEnd not between", value1, value2, "isyearend");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table market_tradecal
     *
     * @mbg.generated do_not_delete_during_merge Wed May 24 22:01:38 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table market_tradecal
     *
     * @mbg.generated Wed May 24 22:01:38 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}