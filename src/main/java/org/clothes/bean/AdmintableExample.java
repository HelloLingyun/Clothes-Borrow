package org.clothes.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdmintableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdmintableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNull() {
            addCriterion("adminPass is null");
            return (Criteria) this;
        }

        public Criteria andAdminpassIsNotNull() {
            addCriterion("adminPass is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpassEqualTo(String value) {
            addCriterion("adminPass =", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotEqualTo(String value) {
            addCriterion("adminPass <>", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThan(String value) {
            addCriterion("adminPass >", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassGreaterThanOrEqualTo(String value) {
            addCriterion("adminPass >=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThan(String value) {
            addCriterion("adminPass <", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLessThanOrEqualTo(String value) {
            addCriterion("adminPass <=", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassLike(String value) {
            addCriterion("adminPass like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotLike(String value) {
            addCriterion("adminPass not like", value, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassIn(List<String> values) {
            addCriterion("adminPass in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotIn(List<String> values) {
            addCriterion("adminPass not in", values, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassBetween(String value1, String value2) {
            addCriterion("adminPass between", value1, value2, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminpassNotBetween(String value1, String value2) {
            addCriterion("adminPass not between", value1, value2, "adminpass");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameIsNull() {
            addCriterion("adminNickName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameIsNotNull() {
            addCriterion("adminNickName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameEqualTo(String value) {
            addCriterion("adminNickName =", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameNotEqualTo(String value) {
            addCriterion("adminNickName <>", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameGreaterThan(String value) {
            addCriterion("adminNickName >", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("adminNickName >=", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameLessThan(String value) {
            addCriterion("adminNickName <", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameLessThanOrEqualTo(String value) {
            addCriterion("adminNickName <=", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameLike(String value) {
            addCriterion("adminNickName like", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameNotLike(String value) {
            addCriterion("adminNickName not like", value, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameIn(List<String> values) {
            addCriterion("adminNickName in", values, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameNotIn(List<String> values) {
            addCriterion("adminNickName not in", values, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameBetween(String value1, String value2) {
            addCriterion("adminNickName between", value1, value2, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdminnicknameNotBetween(String value1, String value2) {
            addCriterion("adminNickName not between", value1, value2, "adminnickname");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeIsNull() {
            addCriterion("adminCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeIsNotNull() {
            addCriterion("adminCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeEqualTo(Date value) {
            addCriterion("adminCreateTime =", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeNotEqualTo(Date value) {
            addCriterion("adminCreateTime <>", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeGreaterThan(Date value) {
            addCriterion("adminCreateTime >", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adminCreateTime >=", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeLessThan(Date value) {
            addCriterion("adminCreateTime <", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("adminCreateTime <=", value, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeIn(List<Date> values) {
            addCriterion("adminCreateTime in", values, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeNotIn(List<Date> values) {
            addCriterion("adminCreateTime not in", values, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeBetween(Date value1, Date value2) {
            addCriterion("adminCreateTime between", value1, value2, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdmincreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("adminCreateTime not between", value1, value2, "admincreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminlevelIsNull() {
            addCriterion("adminLevel is null");
            return (Criteria) this;
        }

        public Criteria andAdminlevelIsNotNull() {
            addCriterion("adminLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlevelEqualTo(String value) {
            addCriterion("adminLevel =", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelNotEqualTo(String value) {
            addCriterion("adminLevel <>", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelGreaterThan(String value) {
            addCriterion("adminLevel >", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelGreaterThanOrEqualTo(String value) {
            addCriterion("adminLevel >=", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelLessThan(String value) {
            addCriterion("adminLevel <", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelLessThanOrEqualTo(String value) {
            addCriterion("adminLevel <=", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelLike(String value) {
            addCriterion("adminLevel like", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelNotLike(String value) {
            addCriterion("adminLevel not like", value, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelIn(List<String> values) {
            addCriterion("adminLevel in", values, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelNotIn(List<String> values) {
            addCriterion("adminLevel not in", values, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelBetween(String value1, String value2) {
            addCriterion("adminLevel between", value1, value2, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminlevelNotBetween(String value1, String value2) {
            addCriterion("adminLevel not between", value1, value2, "adminlevel");
            return (Criteria) this;
        }

        public Criteria andAdminspare1IsNull() {
            addCriterion("adminSpare1 is null");
            return (Criteria) this;
        }

        public Criteria andAdminspare1IsNotNull() {
            addCriterion("adminSpare1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdminspare1EqualTo(String value) {
            addCriterion("adminSpare1 =", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1NotEqualTo(String value) {
            addCriterion("adminSpare1 <>", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1GreaterThan(String value) {
            addCriterion("adminSpare1 >", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1GreaterThanOrEqualTo(String value) {
            addCriterion("adminSpare1 >=", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1LessThan(String value) {
            addCriterion("adminSpare1 <", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1LessThanOrEqualTo(String value) {
            addCriterion("adminSpare1 <=", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1Like(String value) {
            addCriterion("adminSpare1 like", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1NotLike(String value) {
            addCriterion("adminSpare1 not like", value, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1In(List<String> values) {
            addCriterion("adminSpare1 in", values, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1NotIn(List<String> values) {
            addCriterion("adminSpare1 not in", values, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1Between(String value1, String value2) {
            addCriterion("adminSpare1 between", value1, value2, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare1NotBetween(String value1, String value2) {
            addCriterion("adminSpare1 not between", value1, value2, "adminspare1");
            return (Criteria) this;
        }

        public Criteria andAdminspare2IsNull() {
            addCriterion("adminSpare2 is null");
            return (Criteria) this;
        }

        public Criteria andAdminspare2IsNotNull() {
            addCriterion("adminSpare2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdminspare2EqualTo(String value) {
            addCriterion("adminSpare2 =", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2NotEqualTo(String value) {
            addCriterion("adminSpare2 <>", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2GreaterThan(String value) {
            addCriterion("adminSpare2 >", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2GreaterThanOrEqualTo(String value) {
            addCriterion("adminSpare2 >=", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2LessThan(String value) {
            addCriterion("adminSpare2 <", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2LessThanOrEqualTo(String value) {
            addCriterion("adminSpare2 <=", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2Like(String value) {
            addCriterion("adminSpare2 like", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2NotLike(String value) {
            addCriterion("adminSpare2 not like", value, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2In(List<String> values) {
            addCriterion("adminSpare2 in", values, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2NotIn(List<String> values) {
            addCriterion("adminSpare2 not in", values, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2Between(String value1, String value2) {
            addCriterion("adminSpare2 between", value1, value2, "adminspare2");
            return (Criteria) this;
        }

        public Criteria andAdminspare2NotBetween(String value1, String value2) {
            addCriterion("adminSpare2 not between", value1, value2, "adminspare2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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