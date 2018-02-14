package org.clothes.bean;

import java.util.ArrayList;
import java.util.List;

public class MajortableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajortableExample() {
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

        public Criteria andDepidIsNull() {
            addCriterion("depId is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("depId is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(Integer value) {
            addCriterion("depId =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(Integer value) {
            addCriterion("depId <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(Integer value) {
            addCriterion("depId >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("depId >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(Integer value) {
            addCriterion("depId <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(Integer value) {
            addCriterion("depId <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<Integer> values) {
            addCriterion("depId in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<Integer> values) {
            addCriterion("depId not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(Integer value1, Integer value2) {
            addCriterion("depId between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(Integer value1, Integer value2) {
            addCriterion("depId not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("depName is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("depName is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("depName =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("depName <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("depName >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("depName >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("depName <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("depName <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("depName like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("depName not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("depName in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("depName not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("depName between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("depName not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("majorId is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorId is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(Integer value) {
            addCriterion("majorId =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(Integer value) {
            addCriterion("majorId <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(Integer value) {
            addCriterion("majorId >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("majorId >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(Integer value) {
            addCriterion("majorId <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(Integer value) {
            addCriterion("majorId <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<Integer> values) {
            addCriterion("majorId in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<Integer> values) {
            addCriterion("majorId not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(Integer value1, Integer value2) {
            addCriterion("majorId between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(Integer value1, Integer value2) {
            addCriterion("majorId not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("className like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("className not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("className not between", value1, value2, "classname");
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