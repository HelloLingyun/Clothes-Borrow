package org.clothes.bean;

import java.util.ArrayList;
import java.util.List;

public class ClothestableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClothestableExample() {
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

        public Criteria andClothesnumIsNull() {
            addCriterion("clothesNum is null");
            return (Criteria) this;
        }

        public Criteria andClothesnumIsNotNull() {
            addCriterion("clothesNum is not null");
            return (Criteria) this;
        }

        public Criteria andClothesnumEqualTo(Integer value) {
            addCriterion("clothesNum =", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumNotEqualTo(Integer value) {
            addCriterion("clothesNum <>", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumGreaterThan(Integer value) {
            addCriterion("clothesNum >", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clothesNum >=", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumLessThan(Integer value) {
            addCriterion("clothesNum <", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumLessThanOrEqualTo(Integer value) {
            addCriterion("clothesNum <=", value, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumIn(List<Integer> values) {
            addCriterion("clothesNum in", values, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumNotIn(List<Integer> values) {
            addCriterion("clothesNum not in", values, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumBetween(Integer value1, Integer value2) {
            addCriterion("clothesNum between", value1, value2, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andClothesnumNotBetween(Integer value1, Integer value2) {
            addCriterion("clothesNum not between", value1, value2, "clothesnum");
            return (Criteria) this;
        }

        public Criteria andCothesnameIsNull() {
            addCriterion("cothesName is null");
            return (Criteria) this;
        }

        public Criteria andCothesnameIsNotNull() {
            addCriterion("cothesName is not null");
            return (Criteria) this;
        }

        public Criteria andCothesnameEqualTo(String value) {
            addCriterion("cothesName =", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameNotEqualTo(String value) {
            addCriterion("cothesName <>", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameGreaterThan(String value) {
            addCriterion("cothesName >", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameGreaterThanOrEqualTo(String value) {
            addCriterion("cothesName >=", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameLessThan(String value) {
            addCriterion("cothesName <", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameLessThanOrEqualTo(String value) {
            addCriterion("cothesName <=", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameLike(String value) {
            addCriterion("cothesName like", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameNotLike(String value) {
            addCriterion("cothesName not like", value, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameIn(List<String> values) {
            addCriterion("cothesName in", values, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameNotIn(List<String> values) {
            addCriterion("cothesName not in", values, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameBetween(String value1, String value2) {
            addCriterion("cothesName between", value1, value2, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesnameNotBetween(String value1, String value2) {
            addCriterion("cothesName not between", value1, value2, "cothesname");
            return (Criteria) this;
        }

        public Criteria andCothesdescIsNull() {
            addCriterion("cothesDesc is null");
            return (Criteria) this;
        }

        public Criteria andCothesdescIsNotNull() {
            addCriterion("cothesDesc is not null");
            return (Criteria) this;
        }

        public Criteria andCothesdescEqualTo(String value) {
            addCriterion("cothesDesc =", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescNotEqualTo(String value) {
            addCriterion("cothesDesc <>", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescGreaterThan(String value) {
            addCriterion("cothesDesc >", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescGreaterThanOrEqualTo(String value) {
            addCriterion("cothesDesc >=", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescLessThan(String value) {
            addCriterion("cothesDesc <", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescLessThanOrEqualTo(String value) {
            addCriterion("cothesDesc <=", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescLike(String value) {
            addCriterion("cothesDesc like", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescNotLike(String value) {
            addCriterion("cothesDesc not like", value, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescIn(List<String> values) {
            addCriterion("cothesDesc in", values, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescNotIn(List<String> values) {
            addCriterion("cothesDesc not in", values, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescBetween(String value1, String value2) {
            addCriterion("cothesDesc between", value1, value2, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andCothesdescNotBetween(String value1, String value2) {
            addCriterion("cothesDesc not between", value1, value2, "cothesdesc");
            return (Criteria) this;
        }

        public Criteria andClothespicIsNull() {
            addCriterion("clothesPic is null");
            return (Criteria) this;
        }

        public Criteria andClothespicIsNotNull() {
            addCriterion("clothesPic is not null");
            return (Criteria) this;
        }

        public Criteria andClothespicEqualTo(String value) {
            addCriterion("clothesPic =", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicNotEqualTo(String value) {
            addCriterion("clothesPic <>", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicGreaterThan(String value) {
            addCriterion("clothesPic >", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicGreaterThanOrEqualTo(String value) {
            addCriterion("clothesPic >=", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicLessThan(String value) {
            addCriterion("clothesPic <", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicLessThanOrEqualTo(String value) {
            addCriterion("clothesPic <=", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicLike(String value) {
            addCriterion("clothesPic like", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicNotLike(String value) {
            addCriterion("clothesPic not like", value, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicIn(List<String> values) {
            addCriterion("clothesPic in", values, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicNotIn(List<String> values) {
            addCriterion("clothesPic not in", values, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicBetween(String value1, String value2) {
            addCriterion("clothesPic between", value1, value2, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothespicNotBetween(String value1, String value2) {
            addCriterion("clothesPic not between", value1, value2, "clothespic");
            return (Criteria) this;
        }

        public Criteria andClothessizeIsNull() {
            addCriterion("clothesSize is null");
            return (Criteria) this;
        }

        public Criteria andClothessizeIsNotNull() {
            addCriterion("clothesSize is not null");
            return (Criteria) this;
        }

        public Criteria andClothessizeEqualTo(String value) {
            addCriterion("clothesSize =", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotEqualTo(String value) {
            addCriterion("clothesSize <>", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeGreaterThan(String value) {
            addCriterion("clothesSize >", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeGreaterThanOrEqualTo(String value) {
            addCriterion("clothesSize >=", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLessThan(String value) {
            addCriterion("clothesSize <", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLessThanOrEqualTo(String value) {
            addCriterion("clothesSize <=", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeLike(String value) {
            addCriterion("clothesSize like", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotLike(String value) {
            addCriterion("clothesSize not like", value, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeIn(List<String> values) {
            addCriterion("clothesSize in", values, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotIn(List<String> values) {
            addCriterion("clothesSize not in", values, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeBetween(String value1, String value2) {
            addCriterion("clothesSize between", value1, value2, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothessizeNotBetween(String value1, String value2) {
            addCriterion("clothesSize not between", value1, value2, "clothessize");
            return (Criteria) this;
        }

        public Criteria andClothespriceIsNull() {
            addCriterion("clothesPrice is null");
            return (Criteria) this;
        }

        public Criteria andClothespriceIsNotNull() {
            addCriterion("clothesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andClothespriceEqualTo(Float value) {
            addCriterion("clothesPrice =", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceNotEqualTo(Float value) {
            addCriterion("clothesPrice <>", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceGreaterThan(Float value) {
            addCriterion("clothesPrice >", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceGreaterThanOrEqualTo(Float value) {
            addCriterion("clothesPrice >=", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceLessThan(Float value) {
            addCriterion("clothesPrice <", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceLessThanOrEqualTo(Float value) {
            addCriterion("clothesPrice <=", value, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceIn(List<Float> values) {
            addCriterion("clothesPrice in", values, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceNotIn(List<Float> values) {
            addCriterion("clothesPrice not in", values, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceBetween(Float value1, Float value2) {
            addCriterion("clothesPrice between", value1, value2, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothespriceNotBetween(Float value1, Float value2) {
            addCriterion("clothesPrice not between", value1, value2, "clothesprice");
            return (Criteria) this;
        }

        public Criteria andClothesflagIsNull() {
            addCriterion("clothesFlag is null");
            return (Criteria) this;
        }

        public Criteria andClothesflagIsNotNull() {
            addCriterion("clothesFlag is not null");
            return (Criteria) this;
        }

        public Criteria andClothesflagEqualTo(String value) {
            addCriterion("clothesFlag =", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagNotEqualTo(String value) {
            addCriterion("clothesFlag <>", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagGreaterThan(String value) {
            addCriterion("clothesFlag >", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagGreaterThanOrEqualTo(String value) {
            addCriterion("clothesFlag >=", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagLessThan(String value) {
            addCriterion("clothesFlag <", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagLessThanOrEqualTo(String value) {
            addCriterion("clothesFlag <=", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagLike(String value) {
            addCriterion("clothesFlag like", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagNotLike(String value) {
            addCriterion("clothesFlag not like", value, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagIn(List<String> values) {
            addCriterion("clothesFlag in", values, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagNotIn(List<String> values) {
            addCriterion("clothesFlag not in", values, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagBetween(String value1, String value2) {
            addCriterion("clothesFlag between", value1, value2, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesflagNotBetween(String value1, String value2) {
            addCriterion("clothesFlag not between", value1, value2, "clothesflag");
            return (Criteria) this;
        }

        public Criteria andClothesremarkIsNull() {
            addCriterion("clothesRemark is null");
            return (Criteria) this;
        }

        public Criteria andClothesremarkIsNotNull() {
            addCriterion("clothesRemark is not null");
            return (Criteria) this;
        }

        public Criteria andClothesremarkEqualTo(String value) {
            addCriterion("clothesRemark =", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkNotEqualTo(String value) {
            addCriterion("clothesRemark <>", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkGreaterThan(String value) {
            addCriterion("clothesRemark >", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkGreaterThanOrEqualTo(String value) {
            addCriterion("clothesRemark >=", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkLessThan(String value) {
            addCriterion("clothesRemark <", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkLessThanOrEqualTo(String value) {
            addCriterion("clothesRemark <=", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkLike(String value) {
            addCriterion("clothesRemark like", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkNotLike(String value) {
            addCriterion("clothesRemark not like", value, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkIn(List<String> values) {
            addCriterion("clothesRemark in", values, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkNotIn(List<String> values) {
            addCriterion("clothesRemark not in", values, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkBetween(String value1, String value2) {
            addCriterion("clothesRemark between", value1, value2, "clothesremark");
            return (Criteria) this;
        }

        public Criteria andClothesremarkNotBetween(String value1, String value2) {
            addCriterion("clothesRemark not between", value1, value2, "clothesremark");
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