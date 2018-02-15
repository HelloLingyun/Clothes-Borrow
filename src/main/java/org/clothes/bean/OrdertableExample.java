package org.clothes.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdertableExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andClothesidIsNull() {
            addCriterion("clothesId is null");
            return (Criteria) this;
        }

        public Criteria andClothesidIsNotNull() {
            addCriterion("clothesId is not null");
            return (Criteria) this;
        }

        public Criteria andClothesidEqualTo(Integer value) {
            addCriterion("clothesId =", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidNotEqualTo(Integer value) {
            addCriterion("clothesId <>", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidGreaterThan(Integer value) {
            addCriterion("clothesId >", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clothesId >=", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidLessThan(Integer value) {
            addCriterion("clothesId <", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidLessThanOrEqualTo(Integer value) {
            addCriterion("clothesId <=", value, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidIn(List<Integer> values) {
            addCriterion("clothesId in", values, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidNotIn(List<Integer> values) {
            addCriterion("clothesId not in", values, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidBetween(Integer value1, Integer value2) {
            addCriterion("clothesId between", value1, value2, "clothesid");
            return (Criteria) this;
        }

        public Criteria andClothesidNotBetween(Integer value1, Integer value2) {
            addCriterion("clothesId not between", value1, value2, "clothesid");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("clientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientdepIsNull() {
            addCriterion("clientDep is null");
            return (Criteria) this;
        }

        public Criteria andClientdepIsNotNull() {
            addCriterion("clientDep is not null");
            return (Criteria) this;
        }

        public Criteria andClientdepEqualTo(String value) {
            addCriterion("clientDep =", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepNotEqualTo(String value) {
            addCriterion("clientDep <>", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepGreaterThan(String value) {
            addCriterion("clientDep >", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepGreaterThanOrEqualTo(String value) {
            addCriterion("clientDep >=", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepLessThan(String value) {
            addCriterion("clientDep <", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepLessThanOrEqualTo(String value) {
            addCriterion("clientDep <=", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepLike(String value) {
            addCriterion("clientDep like", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepNotLike(String value) {
            addCriterion("clientDep not like", value, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepIn(List<String> values) {
            addCriterion("clientDep in", values, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepNotIn(List<String> values) {
            addCriterion("clientDep not in", values, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepBetween(String value1, String value2) {
            addCriterion("clientDep between", value1, value2, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientdepNotBetween(String value1, String value2) {
            addCriterion("clientDep not between", value1, value2, "clientdep");
            return (Criteria) this;
        }

        public Criteria andClientmajIsNull() {
            addCriterion("clientMaj is null");
            return (Criteria) this;
        }

        public Criteria andClientmajIsNotNull() {
            addCriterion("clientMaj is not null");
            return (Criteria) this;
        }

        public Criteria andClientmajEqualTo(String value) {
            addCriterion("clientMaj =", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajNotEqualTo(String value) {
            addCriterion("clientMaj <>", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajGreaterThan(String value) {
            addCriterion("clientMaj >", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajGreaterThanOrEqualTo(String value) {
            addCriterion("clientMaj >=", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajLessThan(String value) {
            addCriterion("clientMaj <", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajLessThanOrEqualTo(String value) {
            addCriterion("clientMaj <=", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajLike(String value) {
            addCriterion("clientMaj like", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajNotLike(String value) {
            addCriterion("clientMaj not like", value, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajIn(List<String> values) {
            addCriterion("clientMaj in", values, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajNotIn(List<String> values) {
            addCriterion("clientMaj not in", values, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajBetween(String value1, String value2) {
            addCriterion("clientMaj between", value1, value2, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientmajNotBetween(String value1, String value2) {
            addCriterion("clientMaj not between", value1, value2, "clientmaj");
            return (Criteria) this;
        }

        public Criteria andClientclassIsNull() {
            addCriterion("clientClass is null");
            return (Criteria) this;
        }

        public Criteria andClientclassIsNotNull() {
            addCriterion("clientClass is not null");
            return (Criteria) this;
        }

        public Criteria andClientclassEqualTo(String value) {
            addCriterion("clientClass =", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassNotEqualTo(String value) {
            addCriterion("clientClass <>", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassGreaterThan(String value) {
            addCriterion("clientClass >", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassGreaterThanOrEqualTo(String value) {
            addCriterion("clientClass >=", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassLessThan(String value) {
            addCriterion("clientClass <", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassLessThanOrEqualTo(String value) {
            addCriterion("clientClass <=", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassLike(String value) {
            addCriterion("clientClass like", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassNotLike(String value) {
            addCriterion("clientClass not like", value, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassIn(List<String> values) {
            addCriterion("clientClass in", values, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassNotIn(List<String> values) {
            addCriterion("clientClass not in", values, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassBetween(String value1, String value2) {
            addCriterion("clientClass between", value1, value2, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientclassNotBetween(String value1, String value2) {
            addCriterion("clientClass not between", value1, value2, "clientclass");
            return (Criteria) this;
        }

        public Criteria andClientnumIsNull() {
            addCriterion("clientNum is null");
            return (Criteria) this;
        }

        public Criteria andClientnumIsNotNull() {
            addCriterion("clientNum is not null");
            return (Criteria) this;
        }

        public Criteria andClientnumEqualTo(String value) {
            addCriterion("clientNum =", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotEqualTo(String value) {
            addCriterion("clientNum <>", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThan(String value) {
            addCriterion("clientNum >", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumGreaterThanOrEqualTo(String value) {
            addCriterion("clientNum >=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThan(String value) {
            addCriterion("clientNum <", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLessThanOrEqualTo(String value) {
            addCriterion("clientNum <=", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumLike(String value) {
            addCriterion("clientNum like", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotLike(String value) {
            addCriterion("clientNum not like", value, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumIn(List<String> values) {
            addCriterion("clientNum in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotIn(List<String> values) {
            addCriterion("clientNum not in", values, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumBetween(String value1, String value2) {
            addCriterion("clientNum between", value1, value2, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClientnumNotBetween(String value1, String value2) {
            addCriterion("clientNum not between", value1, value2, "clientnum");
            return (Criteria) this;
        }

        public Criteria andClienttelIsNull() {
            addCriterion("clientTel is null");
            return (Criteria) this;
        }

        public Criteria andClienttelIsNotNull() {
            addCriterion("clientTel is not null");
            return (Criteria) this;
        }

        public Criteria andClienttelEqualTo(String value) {
            addCriterion("clientTel =", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelNotEqualTo(String value) {
            addCriterion("clientTel <>", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelGreaterThan(String value) {
            addCriterion("clientTel >", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelGreaterThanOrEqualTo(String value) {
            addCriterion("clientTel >=", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelLessThan(String value) {
            addCriterion("clientTel <", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelLessThanOrEqualTo(String value) {
            addCriterion("clientTel <=", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelLike(String value) {
            addCriterion("clientTel like", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelNotLike(String value) {
            addCriterion("clientTel not like", value, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelIn(List<String> values) {
            addCriterion("clientTel in", values, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelNotIn(List<String> values) {
            addCriterion("clientTel not in", values, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelBetween(String value1, String value2) {
            addCriterion("clientTel between", value1, value2, "clienttel");
            return (Criteria) this;
        }

        public Criteria andClienttelNotBetween(String value1, String value2) {
            addCriterion("clientTel not between", value1, value2, "clienttel");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeIsNull() {
            addCriterion("orderStartTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeIsNotNull() {
            addCriterion("orderStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeEqualTo(Date value) {
            addCriterion("orderStartTime =", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeNotEqualTo(Date value) {
            addCriterion("orderStartTime <>", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeGreaterThan(Date value) {
            addCriterion("orderStartTime >", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderStartTime >=", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeLessThan(Date value) {
            addCriterion("orderStartTime <", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("orderStartTime <=", value, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeIn(List<Date> values) {
            addCriterion("orderStartTime in", values, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeNotIn(List<Date> values) {
            addCriterion("orderStartTime not in", values, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeBetween(Date value1, Date value2) {
            addCriterion("orderStartTime between", value1, value2, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("orderStartTime not between", value1, value2, "orderstarttime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIsNull() {
            addCriterion("orderEndTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIsNotNull() {
            addCriterion("orderEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeEqualTo(Date value) {
            addCriterion("orderEndTime =", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotEqualTo(Date value) {
            addCriterion("orderEndTime <>", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeGreaterThan(Date value) {
            addCriterion("orderEndTime >", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderEndTime >=", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeLessThan(Date value) {
            addCriterion("orderEndTime <", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeLessThanOrEqualTo(Date value) {
            addCriterion("orderEndTime <=", value, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeIn(List<Date> values) {
            addCriterion("orderEndTime in", values, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotIn(List<Date> values) {
            addCriterion("orderEndTime not in", values, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeBetween(Date value1, Date value2) {
            addCriterion("orderEndTime between", value1, value2, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderendtimeNotBetween(Date value1, Date value2) {
            addCriterion("orderEndTime not between", value1, value2, "orderendtime");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderflagIsNull() {
            addCriterion("orderFlag is null");
            return (Criteria) this;
        }

        public Criteria andOrderflagIsNotNull() {
            addCriterion("orderFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderflagEqualTo(Integer value) {
            addCriterion("orderFlag =", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotEqualTo(Integer value) {
            addCriterion("orderFlag <>", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagGreaterThan(Integer value) {
            addCriterion("orderFlag >", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderFlag >=", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagLessThan(Integer value) {
            addCriterion("orderFlag <", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagLessThanOrEqualTo(Integer value) {
            addCriterion("orderFlag <=", value, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagIn(List<Integer> values) {
            addCriterion("orderFlag in", values, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotIn(List<Integer> values) {
            addCriterion("orderFlag not in", values, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagBetween(Integer value1, Integer value2) {
            addCriterion("orderFlag between", value1, value2, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrderflagNotBetween(Integer value1, Integer value2) {
            addCriterion("orderFlag not between", value1, value2, "orderflag");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIsNull() {
            addCriterion("orderCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIsNotNull() {
            addCriterion("orderCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeEqualTo(Date value) {
            addCriterion("orderCreateTime =", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotEqualTo(Date value) {
            addCriterion("orderCreateTime <>", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThan(Date value) {
            addCriterion("orderCreateTime >", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderCreateTime >=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThan(Date value) {
            addCriterion("orderCreateTime <", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("orderCreateTime <=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIn(List<Date> values) {
            addCriterion("orderCreateTime in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotIn(List<Date> values) {
            addCriterion("orderCreateTime not in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeBetween(Date value1, Date value2) {
            addCriterion("orderCreateTime between", value1, value2, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("orderCreateTime not between", value1, value2, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNull() {
            addCriterion("orderRemark is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIsNotNull() {
            addCriterion("orderRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarkEqualTo(String value) {
            addCriterion("orderRemark =", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotEqualTo(String value) {
            addCriterion("orderRemark <>", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThan(String value) {
            addCriterion("orderRemark >", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkGreaterThanOrEqualTo(String value) {
            addCriterion("orderRemark >=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThan(String value) {
            addCriterion("orderRemark <", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLessThanOrEqualTo(String value) {
            addCriterion("orderRemark <=", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkLike(String value) {
            addCriterion("orderRemark like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotLike(String value) {
            addCriterion("orderRemark not like", value, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkIn(List<String> values) {
            addCriterion("orderRemark in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotIn(List<String> values) {
            addCriterion("orderRemark not in", values, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkBetween(String value1, String value2) {
            addCriterion("orderRemark between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOrderremarkNotBetween(String value1, String value2) {
            addCriterion("orderRemark not between", value1, value2, "orderremark");
            return (Criteria) this;
        }

        public Criteria andOperationerIsNull() {
            addCriterion("operationer is null");
            return (Criteria) this;
        }

        public Criteria andOperationerIsNotNull() {
            addCriterion("operationer is not null");
            return (Criteria) this;
        }

        public Criteria andOperationerEqualTo(String value) {
            addCriterion("operationer =", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerNotEqualTo(String value) {
            addCriterion("operationer <>", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerGreaterThan(String value) {
            addCriterion("operationer >", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerGreaterThanOrEqualTo(String value) {
            addCriterion("operationer >=", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerLessThan(String value) {
            addCriterion("operationer <", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerLessThanOrEqualTo(String value) {
            addCriterion("operationer <=", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerLike(String value) {
            addCriterion("operationer like", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerNotLike(String value) {
            addCriterion("operationer not like", value, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerIn(List<String> values) {
            addCriterion("operationer in", values, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerNotIn(List<String> values) {
            addCriterion("operationer not in", values, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerBetween(String value1, String value2) {
            addCriterion("operationer between", value1, value2, "operationer");
            return (Criteria) this;
        }

        public Criteria andOperationerNotBetween(String value1, String value2) {
            addCriterion("operationer not between", value1, value2, "operationer");
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