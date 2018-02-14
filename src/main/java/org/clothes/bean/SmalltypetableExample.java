package org.clothes.bean;

import java.util.ArrayList;
import java.util.List;

public class SmalltypetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmalltypetableExample() {
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

        public Criteria andSmalltypeidIsNull() {
            addCriterion("smallTypeId is null");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidIsNotNull() {
            addCriterion("smallTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidEqualTo(Integer value) {
            addCriterion("smallTypeId =", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidNotEqualTo(Integer value) {
            addCriterion("smallTypeId <>", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidGreaterThan(Integer value) {
            addCriterion("smallTypeId >", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallTypeId >=", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidLessThan(Integer value) {
            addCriterion("smallTypeId <", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidLessThanOrEqualTo(Integer value) {
            addCriterion("smallTypeId <=", value, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidIn(List<Integer> values) {
            addCriterion("smallTypeId in", values, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidNotIn(List<Integer> values) {
            addCriterion("smallTypeId not in", values, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidBetween(Integer value1, Integer value2) {
            addCriterion("smallTypeId between", value1, value2, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("smallTypeId not between", value1, value2, "smalltypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidIsNull() {
            addCriterion("bigTypeId is null");
            return (Criteria) this;
        }

        public Criteria andBigtypeidIsNotNull() {
            addCriterion("bigTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andBigtypeidEqualTo(Integer value) {
            addCriterion("bigTypeId =", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotEqualTo(Integer value) {
            addCriterion("bigTypeId <>", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidGreaterThan(Integer value) {
            addCriterion("bigTypeId >", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigTypeId >=", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidLessThan(Integer value) {
            addCriterion("bigTypeId <", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("bigTypeId <=", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidIn(List<Integer> values) {
            addCriterion("bigTypeId in", values, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotIn(List<Integer> values) {
            addCriterion("bigTypeId not in", values, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidBetween(Integer value1, Integer value2) {
            addCriterion("bigTypeId between", value1, value2, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("bigTypeId not between", value1, value2, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameIsNull() {
            addCriterion("smallTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameIsNotNull() {
            addCriterion("smallTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameEqualTo(String value) {
            addCriterion("smallTypeName =", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameNotEqualTo(String value) {
            addCriterion("smallTypeName <>", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameGreaterThan(String value) {
            addCriterion("smallTypeName >", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameGreaterThanOrEqualTo(String value) {
            addCriterion("smallTypeName >=", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameLessThan(String value) {
            addCriterion("smallTypeName <", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameLessThanOrEqualTo(String value) {
            addCriterion("smallTypeName <=", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameLike(String value) {
            addCriterion("smallTypeName like", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameNotLike(String value) {
            addCriterion("smallTypeName not like", value, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameIn(List<String> values) {
            addCriterion("smallTypeName in", values, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameNotIn(List<String> values) {
            addCriterion("smallTypeName not in", values, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameBetween(String value1, String value2) {
            addCriterion("smallTypeName between", value1, value2, "smalltypename");
            return (Criteria) this;
        }

        public Criteria andSmalltypenameNotBetween(String value1, String value2) {
            addCriterion("smallTypeName not between", value1, value2, "smalltypename");
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