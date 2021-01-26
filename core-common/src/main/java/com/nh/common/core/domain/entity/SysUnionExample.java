package com.nh.common.core.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUnionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUnionExample() {
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

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(Long value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(Long value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(Long value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(Long value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(Long value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<Long> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<Long> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(Long value1, Long value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(Long value1, Long value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdIsNull() {
            addCriterion("parent_union_id is null");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdIsNotNull() {
            addCriterion("parent_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdEqualTo(Long value) {
            addCriterion("parent_union_id =", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdNotEqualTo(Long value) {
            addCriterion("parent_union_id <>", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdGreaterThan(Long value) {
            addCriterion("parent_union_id >", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_union_id >=", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdLessThan(Long value) {
            addCriterion("parent_union_id <", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_union_id <=", value, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdIn(List<Long> values) {
            addCriterion("parent_union_id in", values, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdNotIn(List<Long> values) {
            addCriterion("parent_union_id not in", values, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdBetween(Long value1, Long value2) {
            addCriterion("parent_union_id between", value1, value2, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andParentUnionIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_union_id not between", value1, value2, "parentUnionId");
            return (Criteria) this;
        }

        public Criteria andAncestorsIsNull() {
            addCriterion("ancestors is null");
            return (Criteria) this;
        }

        public Criteria andAncestorsIsNotNull() {
            addCriterion("ancestors is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorsEqualTo(String value) {
            addCriterion("ancestors =", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsNotEqualTo(String value) {
            addCriterion("ancestors <>", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsGreaterThan(String value) {
            addCriterion("ancestors >", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsGreaterThanOrEqualTo(String value) {
            addCriterion("ancestors >=", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsLessThan(String value) {
            addCriterion("ancestors <", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsLessThanOrEqualTo(String value) {
            addCriterion("ancestors <=", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsLike(String value) {
            addCriterion("ancestors like", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsNotLike(String value) {
            addCriterion("ancestors not like", value, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsIn(List<String> values) {
            addCriterion("ancestors in", values, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsNotIn(List<String> values) {
            addCriterion("ancestors not in", values, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsBetween(String value1, String value2) {
            addCriterion("ancestors between", value1, value2, "ancestors");
            return (Criteria) this;
        }

        public Criteria andAncestorsNotBetween(String value1, String value2) {
            addCriterion("ancestors not between", value1, value2, "ancestors");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNull() {
            addCriterion("union_name is null");
            return (Criteria) this;
        }

        public Criteria andUnionNameIsNotNull() {
            addCriterion("union_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnionNameEqualTo(String value) {
            addCriterion("union_name =", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotEqualTo(String value) {
            addCriterion("union_name <>", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThan(String value) {
            addCriterion("union_name >", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameGreaterThanOrEqualTo(String value) {
            addCriterion("union_name >=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThan(String value) {
            addCriterion("union_name <", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLessThanOrEqualTo(String value) {
            addCriterion("union_name <=", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameLike(String value) {
            addCriterion("union_name like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotLike(String value) {
            addCriterion("union_name not like", value, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameIn(List<String> values) {
            addCriterion("union_name in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotIn(List<String> values) {
            addCriterion("union_name not in", values, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameBetween(String value1, String value2) {
            addCriterion("union_name between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionNameNotBetween(String value1, String value2) {
            addCriterion("union_name not between", value1, value2, "unionName");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIsNull() {
            addCriterion("union_type is null");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIsNotNull() {
            addCriterion("union_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnionTypeEqualTo(String value) {
            addCriterion("union_type =", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotEqualTo(String value) {
            addCriterion("union_type <>", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeGreaterThan(String value) {
            addCriterion("union_type >", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("union_type >=", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeLessThan(String value) {
            addCriterion("union_type <", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeLessThanOrEqualTo(String value) {
            addCriterion("union_type <=", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeLike(String value) {
            addCriterion("union_type like", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotLike(String value) {
            addCriterion("union_type not like", value, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeIn(List<String> values) {
            addCriterion("union_type in", values, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotIn(List<String> values) {
            addCriterion("union_type not in", values, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeBetween(String value1, String value2) {
            addCriterion("union_type between", value1, value2, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionTypeNotBetween(String value1, String value2) {
            addCriterion("union_type not between", value1, value2, "unionType");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanIsNull() {
            addCriterion("union_chairman is null");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanIsNotNull() {
            addCriterion("union_chairman is not null");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanEqualTo(String value) {
            addCriterion("union_chairman =", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanNotEqualTo(String value) {
            addCriterion("union_chairman <>", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanGreaterThan(String value) {
            addCriterion("union_chairman >", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanGreaterThanOrEqualTo(String value) {
            addCriterion("union_chairman >=", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanLessThan(String value) {
            addCriterion("union_chairman <", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanLessThanOrEqualTo(String value) {
            addCriterion("union_chairman <=", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanLike(String value) {
            addCriterion("union_chairman like", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanNotLike(String value) {
            addCriterion("union_chairman not like", value, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanIn(List<String> values) {
            addCriterion("union_chairman in", values, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanNotIn(List<String> values) {
            addCriterion("union_chairman not in", values, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanBetween(String value1, String value2) {
            addCriterion("union_chairman between", value1, value2, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionChairmanNotBetween(String value1, String value2) {
            addCriterion("union_chairman not between", value1, value2, "unionChairman");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonIsNull() {
            addCriterion("union_contact_person is null");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonIsNotNull() {
            addCriterion("union_contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonEqualTo(String value) {
            addCriterion("union_contact_person =", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonNotEqualTo(String value) {
            addCriterion("union_contact_person <>", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonGreaterThan(String value) {
            addCriterion("union_contact_person >", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("union_contact_person >=", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonLessThan(String value) {
            addCriterion("union_contact_person <", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonLessThanOrEqualTo(String value) {
            addCriterion("union_contact_person <=", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonLike(String value) {
            addCriterion("union_contact_person like", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonNotLike(String value) {
            addCriterion("union_contact_person not like", value, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonIn(List<String> values) {
            addCriterion("union_contact_person in", values, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonNotIn(List<String> values) {
            addCriterion("union_contact_person not in", values, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonBetween(String value1, String value2) {
            addCriterion("union_contact_person between", value1, value2, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPersonNotBetween(String value1, String value2) {
            addCriterion("union_contact_person not between", value1, value2, "unionContactPerson");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneIsNull() {
            addCriterion("union_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneIsNotNull() {
            addCriterion("union_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneEqualTo(String value) {
            addCriterion("union_contact_phone =", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneNotEqualTo(String value) {
            addCriterion("union_contact_phone <>", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneGreaterThan(String value) {
            addCriterion("union_contact_phone >", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("union_contact_phone >=", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneLessThan(String value) {
            addCriterion("union_contact_phone <", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("union_contact_phone <=", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneLike(String value) {
            addCriterion("union_contact_phone like", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneNotLike(String value) {
            addCriterion("union_contact_phone not like", value, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneIn(List<String> values) {
            addCriterion("union_contact_phone in", values, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneNotIn(List<String> values) {
            addCriterion("union_contact_phone not in", values, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneBetween(String value1, String value2) {
            addCriterion("union_contact_phone between", value1, value2, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionContactPhoneNotBetween(String value1, String value2) {
            addCriterion("union_contact_phone not between", value1, value2, "unionContactPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneIsNull() {
            addCriterion("union_phone is null");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneIsNotNull() {
            addCriterion("union_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneEqualTo(String value) {
            addCriterion("union_phone =", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneNotEqualTo(String value) {
            addCriterion("union_phone <>", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneGreaterThan(String value) {
            addCriterion("union_phone >", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("union_phone >=", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneLessThan(String value) {
            addCriterion("union_phone <", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneLessThanOrEqualTo(String value) {
            addCriterion("union_phone <=", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneLike(String value) {
            addCriterion("union_phone like", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneNotLike(String value) {
            addCriterion("union_phone not like", value, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneIn(List<String> values) {
            addCriterion("union_phone in", values, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneNotIn(List<String> values) {
            addCriterion("union_phone not in", values, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneBetween(String value1, String value2) {
            addCriterion("union_phone between", value1, value2, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionPhoneNotBetween(String value1, String value2) {
            addCriterion("union_phone not between", value1, value2, "unionPhone");
            return (Criteria) this;
        }

        public Criteria andUnionEmailIsNull() {
            addCriterion("union_email is null");
            return (Criteria) this;
        }

        public Criteria andUnionEmailIsNotNull() {
            addCriterion("union_email is not null");
            return (Criteria) this;
        }

        public Criteria andUnionEmailEqualTo(String value) {
            addCriterion("union_email =", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailNotEqualTo(String value) {
            addCriterion("union_email <>", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailGreaterThan(String value) {
            addCriterion("union_email >", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailGreaterThanOrEqualTo(String value) {
            addCriterion("union_email >=", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailLessThan(String value) {
            addCriterion("union_email <", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailLessThanOrEqualTo(String value) {
            addCriterion("union_email <=", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailLike(String value) {
            addCriterion("union_email like", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailNotLike(String value) {
            addCriterion("union_email not like", value, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailIn(List<String> values) {
            addCriterion("union_email in", values, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailNotIn(List<String> values) {
            addCriterion("union_email not in", values, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailBetween(String value1, String value2) {
            addCriterion("union_email between", value1, value2, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionEmailNotBetween(String value1, String value2) {
            addCriterion("union_email not between", value1, value2, "unionEmail");
            return (Criteria) this;
        }

        public Criteria andUnionLevelIsNull() {
            addCriterion("union_level is null");
            return (Criteria) this;
        }

        public Criteria andUnionLevelIsNotNull() {
            addCriterion("union_level is not null");
            return (Criteria) this;
        }

        public Criteria andUnionLevelEqualTo(String value) {
            addCriterion("union_level =", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelNotEqualTo(String value) {
            addCriterion("union_level <>", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelGreaterThan(String value) {
            addCriterion("union_level >", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("union_level >=", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelLessThan(String value) {
            addCriterion("union_level <", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelLessThanOrEqualTo(String value) {
            addCriterion("union_level <=", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelLike(String value) {
            addCriterion("union_level like", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelNotLike(String value) {
            addCriterion("union_level not like", value, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelIn(List<String> values) {
            addCriterion("union_level in", values, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelNotIn(List<String> values) {
            addCriterion("union_level not in", values, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelBetween(String value1, String value2) {
            addCriterion("union_level between", value1, value2, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andUnionLevelNotBetween(String value1, String value2) {
            addCriterion("union_level not between", value1, value2, "unionLevel");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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