package web.model;

import java.util.ArrayList;
import java.util.List;

public class SmSyllabusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmSyllabusExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andSyllabusoidIsNull() {
            addCriterion("SyllabusOID is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidIsNotNull() {
            addCriterion("SyllabusOID is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidEqualTo(String value) {
            addCriterion("SyllabusOID =", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidNotEqualTo(String value) {
            addCriterion("SyllabusOID <>", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidGreaterThan(String value) {
            addCriterion("SyllabusOID >", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidGreaterThanOrEqualTo(String value) {
            addCriterion("SyllabusOID >=", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidLessThan(String value) {
            addCriterion("SyllabusOID <", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidLessThanOrEqualTo(String value) {
            addCriterion("SyllabusOID <=", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidLike(String value) {
            addCriterion("SyllabusOID like", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidNotLike(String value) {
            addCriterion("SyllabusOID not like", value, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidIn(List<String> values) {
            addCriterion("SyllabusOID in", values, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidNotIn(List<String> values) {
            addCriterion("SyllabusOID not in", values, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidBetween(String value1, String value2) {
            addCriterion("SyllabusOID between", value1, value2, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSyllabusoidNotBetween(String value1, String value2) {
            addCriterion("SyllabusOID not between", value1, value2, "syllabusoid");
            return (Criteria) this;
        }

        public Criteria andSynameIsNull() {
            addCriterion("SyName is null");
            return (Criteria) this;
        }

        public Criteria andSynameIsNotNull() {
            addCriterion("SyName is not null");
            return (Criteria) this;
        }

        public Criteria andSynameEqualTo(String value) {
            addCriterion("SyName =", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameNotEqualTo(String value) {
            addCriterion("SyName <>", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameGreaterThan(String value) {
            addCriterion("SyName >", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameGreaterThanOrEqualTo(String value) {
            addCriterion("SyName >=", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameLessThan(String value) {
            addCriterion("SyName <", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameLessThanOrEqualTo(String value) {
            addCriterion("SyName <=", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameLike(String value) {
            addCriterion("SyName like", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameNotLike(String value) {
            addCriterion("SyName not like", value, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameIn(List<String> values) {
            addCriterion("SyName in", values, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameNotIn(List<String> values) {
            addCriterion("SyName not in", values, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameBetween(String value1, String value2) {
            addCriterion("SyName between", value1, value2, "syname");
            return (Criteria) this;
        }

        public Criteria andSynameNotBetween(String value1, String value2) {
            addCriterion("SyName not between", value1, value2, "syname");
            return (Criteria) this;
        }

        public Criteria andSydurationIsNull() {
            addCriterion("SyDuration is null");
            return (Criteria) this;
        }

        public Criteria andSydurationIsNotNull() {
            addCriterion("SyDuration is not null");
            return (Criteria) this;
        }

        public Criteria andSydurationEqualTo(String value) {
            addCriterion("SyDuration =", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationNotEqualTo(String value) {
            addCriterion("SyDuration <>", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationGreaterThan(String value) {
            addCriterion("SyDuration >", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationGreaterThanOrEqualTo(String value) {
            addCriterion("SyDuration >=", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationLessThan(String value) {
            addCriterion("SyDuration <", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationLessThanOrEqualTo(String value) {
            addCriterion("SyDuration <=", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationLike(String value) {
            addCriterion("SyDuration like", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationNotLike(String value) {
            addCriterion("SyDuration not like", value, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationIn(List<String> values) {
            addCriterion("SyDuration in", values, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationNotIn(List<String> values) {
            addCriterion("SyDuration not in", values, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationBetween(String value1, String value2) {
            addCriterion("SyDuration between", value1, value2, "syduration");
            return (Criteria) this;
        }

        public Criteria andSydurationNotBetween(String value1, String value2) {
            addCriterion("SyDuration not between", value1, value2, "syduration");
            return (Criteria) this;
        }

        public Criteria andSystartweekIsNull() {
            addCriterion("SyStartweek is null");
            return (Criteria) this;
        }

        public Criteria andSystartweekIsNotNull() {
            addCriterion("SyStartweek is not null");
            return (Criteria) this;
        }

        public Criteria andSystartweekEqualTo(Integer value) {
            addCriterion("SyStartweek =", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekNotEqualTo(Integer value) {
            addCriterion("SyStartweek <>", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekGreaterThan(Integer value) {
            addCriterion("SyStartweek >", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyStartweek >=", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekLessThan(Integer value) {
            addCriterion("SyStartweek <", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekLessThanOrEqualTo(Integer value) {
            addCriterion("SyStartweek <=", value, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekIn(List<Integer> values) {
            addCriterion("SyStartweek in", values, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekNotIn(List<Integer> values) {
            addCriterion("SyStartweek not in", values, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekBetween(Integer value1, Integer value2) {
            addCriterion("SyStartweek between", value1, value2, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSystartweekNotBetween(Integer value1, Integer value2) {
            addCriterion("SyStartweek not between", value1, value2, "systartweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekIsNull() {
            addCriterion("SyEndweek is null");
            return (Criteria) this;
        }

        public Criteria andSyendweekIsNotNull() {
            addCriterion("SyEndweek is not null");
            return (Criteria) this;
        }

        public Criteria andSyendweekEqualTo(Integer value) {
            addCriterion("SyEndweek =", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekNotEqualTo(Integer value) {
            addCriterion("SyEndweek <>", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekGreaterThan(Integer value) {
            addCriterion("SyEndweek >", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyEndweek >=", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekLessThan(Integer value) {
            addCriterion("SyEndweek <", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekLessThanOrEqualTo(Integer value) {
            addCriterion("SyEndweek <=", value, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekIn(List<Integer> values) {
            addCriterion("SyEndweek in", values, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekNotIn(List<Integer> values) {
            addCriterion("SyEndweek not in", values, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekBetween(Integer value1, Integer value2) {
            addCriterion("SyEndweek between", value1, value2, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyendweekNotBetween(Integer value1, Integer value2) {
            addCriterion("SyEndweek not between", value1, value2, "syendweek");
            return (Criteria) this;
        }

        public Criteria andSyteacherIsNull() {
            addCriterion("SyTeacher is null");
            return (Criteria) this;
        }

        public Criteria andSyteacherIsNotNull() {
            addCriterion("SyTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andSyteacherEqualTo(String value) {
            addCriterion("SyTeacher =", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherNotEqualTo(String value) {
            addCriterion("SyTeacher <>", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherGreaterThan(String value) {
            addCriterion("SyTeacher >", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherGreaterThanOrEqualTo(String value) {
            addCriterion("SyTeacher >=", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherLessThan(String value) {
            addCriterion("SyTeacher <", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherLessThanOrEqualTo(String value) {
            addCriterion("SyTeacher <=", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherLike(String value) {
            addCriterion("SyTeacher like", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherNotLike(String value) {
            addCriterion("SyTeacher not like", value, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherIn(List<String> values) {
            addCriterion("SyTeacher in", values, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherNotIn(List<String> values) {
            addCriterion("SyTeacher not in", values, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherBetween(String value1, String value2) {
            addCriterion("SyTeacher between", value1, value2, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSyteacherNotBetween(String value1, String value2) {
            addCriterion("SyTeacher not between", value1, value2, "syteacher");
            return (Criteria) this;
        }

        public Criteria andSystartclassIsNull() {
            addCriterion("SyStartclass is null");
            return (Criteria) this;
        }

        public Criteria andSystartclassIsNotNull() {
            addCriterion("SyStartclass is not null");
            return (Criteria) this;
        }

        public Criteria andSystartclassEqualTo(Integer value) {
            addCriterion("SyStartclass =", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassNotEqualTo(Integer value) {
            addCriterion("SyStartclass <>", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassGreaterThan(Integer value) {
            addCriterion("SyStartclass >", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyStartclass >=", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassLessThan(Integer value) {
            addCriterion("SyStartclass <", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassLessThanOrEqualTo(Integer value) {
            addCriterion("SyStartclass <=", value, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassIn(List<Integer> values) {
            addCriterion("SyStartclass in", values, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassNotIn(List<Integer> values) {
            addCriterion("SyStartclass not in", values, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassBetween(Integer value1, Integer value2) {
            addCriterion("SyStartclass between", value1, value2, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSystartclassNotBetween(Integer value1, Integer value2) {
            addCriterion("SyStartclass not between", value1, value2, "systartclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassIsNull() {
            addCriterion("SyEndclass is null");
            return (Criteria) this;
        }

        public Criteria andSyendclassIsNotNull() {
            addCriterion("SyEndclass is not null");
            return (Criteria) this;
        }

        public Criteria andSyendclassEqualTo(Integer value) {
            addCriterion("SyEndclass =", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassNotEqualTo(Integer value) {
            addCriterion("SyEndclass <>", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassGreaterThan(Integer value) {
            addCriterion("SyEndclass >", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyEndclass >=", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassLessThan(Integer value) {
            addCriterion("SyEndclass <", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassLessThanOrEqualTo(Integer value) {
            addCriterion("SyEndclass <=", value, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassIn(List<Integer> values) {
            addCriterion("SyEndclass in", values, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassNotIn(List<Integer> values) {
            addCriterion("SyEndclass not in", values, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassBetween(Integer value1, Integer value2) {
            addCriterion("SyEndclass between", value1, value2, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyendclassNotBetween(Integer value1, Integer value2) {
            addCriterion("SyEndclass not between", value1, value2, "syendclass");
            return (Criteria) this;
        }

        public Criteria andSyowneridIsNull() {
            addCriterion("SyOwnerID is null");
            return (Criteria) this;
        }

        public Criteria andSyowneridIsNotNull() {
            addCriterion("SyOwnerID is not null");
            return (Criteria) this;
        }

        public Criteria andSyowneridEqualTo(String value) {
            addCriterion("SyOwnerID =", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridNotEqualTo(String value) {
            addCriterion("SyOwnerID <>", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridGreaterThan(String value) {
            addCriterion("SyOwnerID >", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridGreaterThanOrEqualTo(String value) {
            addCriterion("SyOwnerID >=", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridLessThan(String value) {
            addCriterion("SyOwnerID <", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridLessThanOrEqualTo(String value) {
            addCriterion("SyOwnerID <=", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridLike(String value) {
            addCriterion("SyOwnerID like", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridNotLike(String value) {
            addCriterion("SyOwnerID not like", value, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridIn(List<String> values) {
            addCriterion("SyOwnerID in", values, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridNotIn(List<String> values) {
            addCriterion("SyOwnerID not in", values, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridBetween(String value1, String value2) {
            addCriterion("SyOwnerID between", value1, value2, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyowneridNotBetween(String value1, String value2) {
            addCriterion("SyOwnerID not between", value1, value2, "syownerid");
            return (Criteria) this;
        }

        public Criteria andSyownernameIsNull() {
            addCriterion("SyOwnerName is null");
            return (Criteria) this;
        }

        public Criteria andSyownernameIsNotNull() {
            addCriterion("SyOwnerName is not null");
            return (Criteria) this;
        }

        public Criteria andSyownernameEqualTo(String value) {
            addCriterion("SyOwnerName =", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameNotEqualTo(String value) {
            addCriterion("SyOwnerName <>", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameGreaterThan(String value) {
            addCriterion("SyOwnerName >", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameGreaterThanOrEqualTo(String value) {
            addCriterion("SyOwnerName >=", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameLessThan(String value) {
            addCriterion("SyOwnerName <", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameLessThanOrEqualTo(String value) {
            addCriterion("SyOwnerName <=", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameLike(String value) {
            addCriterion("SyOwnerName like", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameNotLike(String value) {
            addCriterion("SyOwnerName not like", value, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameIn(List<String> values) {
            addCriterion("SyOwnerName in", values, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameNotIn(List<String> values) {
            addCriterion("SyOwnerName not in", values, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameBetween(String value1, String value2) {
            addCriterion("SyOwnerName between", value1, value2, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyownernameNotBetween(String value1, String value2) {
            addCriterion("SyOwnerName not between", value1, value2, "syownername");
            return (Criteria) this;
        }

        public Criteria andSyowneryearIsNull() {
            addCriterion("SyOwnerYear is null");
            return (Criteria) this;
        }

        public Criteria andSyowneryearIsNotNull() {
            addCriterion("SyOwnerYear is not null");
            return (Criteria) this;
        }

        public Criteria andSyowneryearEqualTo(String value) {
            addCriterion("SyOwnerYear =", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearNotEqualTo(String value) {
            addCriterion("SyOwnerYear <>", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearGreaterThan(String value) {
            addCriterion("SyOwnerYear >", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearGreaterThanOrEqualTo(String value) {
            addCriterion("SyOwnerYear >=", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearLessThan(String value) {
            addCriterion("SyOwnerYear <", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearLessThanOrEqualTo(String value) {
            addCriterion("SyOwnerYear <=", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearLike(String value) {
            addCriterion("SyOwnerYear like", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearNotLike(String value) {
            addCriterion("SyOwnerYear not like", value, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearIn(List<String> values) {
            addCriterion("SyOwnerYear in", values, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearNotIn(List<String> values) {
            addCriterion("SyOwnerYear not in", values, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearBetween(String value1, String value2) {
            addCriterion("SyOwnerYear between", value1, value2, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyowneryearNotBetween(String value1, String value2) {
            addCriterion("SyOwnerYear not between", value1, value2, "syowneryear");
            return (Criteria) this;
        }

        public Criteria andSyownertermIsNull() {
            addCriterion("SyOwnerTerm is null");
            return (Criteria) this;
        }

        public Criteria andSyownertermIsNotNull() {
            addCriterion("SyOwnerTerm is not null");
            return (Criteria) this;
        }

        public Criteria andSyownertermEqualTo(String value) {
            addCriterion("SyOwnerTerm =", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermNotEqualTo(String value) {
            addCriterion("SyOwnerTerm <>", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermGreaterThan(String value) {
            addCriterion("SyOwnerTerm >", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermGreaterThanOrEqualTo(String value) {
            addCriterion("SyOwnerTerm >=", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermLessThan(String value) {
            addCriterion("SyOwnerTerm <", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermLessThanOrEqualTo(String value) {
            addCriterion("SyOwnerTerm <=", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermLike(String value) {
            addCriterion("SyOwnerTerm like", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermNotLike(String value) {
            addCriterion("SyOwnerTerm not like", value, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermIn(List<String> values) {
            addCriterion("SyOwnerTerm in", values, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermNotIn(List<String> values) {
            addCriterion("SyOwnerTerm not in", values, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermBetween(String value1, String value2) {
            addCriterion("SyOwnerTerm between", value1, value2, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyownertermNotBetween(String value1, String value2) {
            addCriterion("SyOwnerTerm not between", value1, value2, "syownerterm");
            return (Criteria) this;
        }

        public Criteria andSyaddressIsNull() {
            addCriterion("SyAddress is null");
            return (Criteria) this;
        }

        public Criteria andSyaddressIsNotNull() {
            addCriterion("SyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSyaddressEqualTo(String value) {
            addCriterion("SyAddress =", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressNotEqualTo(String value) {
            addCriterion("SyAddress <>", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressGreaterThan(String value) {
            addCriterion("SyAddress >", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SyAddress >=", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressLessThan(String value) {
            addCriterion("SyAddress <", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressLessThanOrEqualTo(String value) {
            addCriterion("SyAddress <=", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressLike(String value) {
            addCriterion("SyAddress like", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressNotLike(String value) {
            addCriterion("SyAddress not like", value, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressIn(List<String> values) {
            addCriterion("SyAddress in", values, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressNotIn(List<String> values) {
            addCriterion("SyAddress not in", values, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressBetween(String value1, String value2) {
            addCriterion("SyAddress between", value1, value2, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSyaddressNotBetween(String value1, String value2) {
            addCriterion("SyAddress not between", value1, value2, "syaddress");
            return (Criteria) this;
        }

        public Criteria andSystateIsNull() {
            addCriterion("SyState is null");
            return (Criteria) this;
        }

        public Criteria andSystateIsNotNull() {
            addCriterion("SyState is not null");
            return (Criteria) this;
        }

        public Criteria andSystateEqualTo(Integer value) {
            addCriterion("SyState =", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateNotEqualTo(Integer value) {
            addCriterion("SyState <>", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateGreaterThan(Integer value) {
            addCriterion("SyState >", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyState >=", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateLessThan(Integer value) {
            addCriterion("SyState <", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateLessThanOrEqualTo(Integer value) {
            addCriterion("SyState <=", value, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateIn(List<Integer> values) {
            addCriterion("SyState in", values, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateNotIn(List<Integer> values) {
            addCriterion("SyState not in", values, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateBetween(Integer value1, Integer value2) {
            addCriterion("SyState between", value1, value2, "systate");
            return (Criteria) this;
        }

        public Criteria andSystateNotBetween(Integer value1, Integer value2) {
            addCriterion("SyState not between", value1, value2, "systate");
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