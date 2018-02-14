package org.clothes.bean;

import java.util.ArrayList;
import java.util.List;

public class BigtypetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigtypetableExample() {
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

        public Criteria andBigtypeidIsNull() {
            addCriterion("BigtypeId is null");
            return (Criteria) this;
        }

        public Criteria andBigtypeidIsNotNull() {
            addCriterion("BigtypeId is not null");
            return (Criteria) this;
        }

        public Criteria andBigtypeidEqualTo(Integer value) {
            addCriterion("BigtypeId =", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotEqualTo(Integer value) {
            addCriterion("BigtypeId <>", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidGreaterThan(Integer value) {
            addCriterion("BigtypeId >", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BigtypeId >=", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidLessThan(Integer value) {
            addCriterion("BigtypeId <", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("BigtypeId <=", value, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidIn(List<Integer> values) {
            addCriterion("BigtypeId in", values, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotIn(List<Integer> values) {
            addCriterion("BigtypeId not in", values, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidBetween(Integer value1, Integer value2) {
            addCriterion("BigtypeId between", value1, value2, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("BigtypeId not between", value1, value2, "bigtypeid");
            return (Criteria) this;
        }

        public Criteria andBigtypenameIsNull() {
            addCriterion("bigTypeName is null");
            return (Criteria) this;
        }

        public Criteria andBigtypenameIsNotNull() {
            addCriterion("bigTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andBigtypenameEqualTo(String value) {
            addCriterion("bigTypeName =", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameNotEqualTo(String value) {
            addCriterion("bigTypeName <>", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameGreaterThan(String value) {
            addCriterion("bigTypeName >", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("bigTypeName >=", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameLessThan(String value) {
            addCriterion("bigTypeName <", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameLessThanOrEqualTo(String value) {
            addCriterion("bigTypeName <=", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameLike(String value) {
            addCriterion("bigTypeName like", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameNotLike(String value) {
            addCriterion("bigTypeName not like", value, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameIn(List<String> values) {
            addCriterion("bigTypeName in", values, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameNotIn(List<String> values) {
            addCriterion("bigTypeName not in", values, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameBetween(String value1, String value2) {
            addCriterion("bigTypeName between", value1, value2, "bigtypename");
            return (Criteria) this;
        }

        public Criteria andBigtypenameNotBetween(String value1, String value2) {
            addCriterion("bigTypeName not between", value1, value2, "bigtypename");
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