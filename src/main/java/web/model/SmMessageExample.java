package web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmMessageExample() {
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

        public Criteria andMessageoidIsNull() {
            addCriterion("MessageOID is null");
            return (Criteria) this;
        }

        public Criteria andMessageoidIsNotNull() {
            addCriterion("MessageOID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageoidEqualTo(String value) {
            addCriterion("MessageOID =", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidNotEqualTo(String value) {
            addCriterion("MessageOID <>", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidGreaterThan(String value) {
            addCriterion("MessageOID >", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidGreaterThanOrEqualTo(String value) {
            addCriterion("MessageOID >=", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidLessThan(String value) {
            addCriterion("MessageOID <", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidLessThanOrEqualTo(String value) {
            addCriterion("MessageOID <=", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidLike(String value) {
            addCriterion("MessageOID like", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidNotLike(String value) {
            addCriterion("MessageOID not like", value, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidIn(List<String> values) {
            addCriterion("MessageOID in", values, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidNotIn(List<String> values) {
            addCriterion("MessageOID not in", values, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidBetween(String value1, String value2) {
            addCriterion("MessageOID between", value1, value2, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMessageoidNotBetween(String value1, String value2) {
            addCriterion("MessageOID not between", value1, value2, "messageoid");
            return (Criteria) this;
        }

        public Criteria andMeuseridIsNull() {
            addCriterion("MeUserID is null");
            return (Criteria) this;
        }

        public Criteria andMeuseridIsNotNull() {
            addCriterion("MeUserID is not null");
            return (Criteria) this;
        }

        public Criteria andMeuseridEqualTo(String value) {
            addCriterion("MeUserID =", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridNotEqualTo(String value) {
            addCriterion("MeUserID <>", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridGreaterThan(String value) {
            addCriterion("MeUserID >", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridGreaterThanOrEqualTo(String value) {
            addCriterion("MeUserID >=", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridLessThan(String value) {
            addCriterion("MeUserID <", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridLessThanOrEqualTo(String value) {
            addCriterion("MeUserID <=", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridLike(String value) {
            addCriterion("MeUserID like", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridNotLike(String value) {
            addCriterion("MeUserID not like", value, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridIn(List<String> values) {
            addCriterion("MeUserID in", values, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridNotIn(List<String> values) {
            addCriterion("MeUserID not in", values, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridBetween(String value1, String value2) {
            addCriterion("MeUserID between", value1, value2, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeuseridNotBetween(String value1, String value2) {
            addCriterion("MeUserID not between", value1, value2, "meuserid");
            return (Criteria) this;
        }

        public Criteria andMeusernameIsNull() {
            addCriterion("MeUserName is null");
            return (Criteria) this;
        }

        public Criteria andMeusernameIsNotNull() {
            addCriterion("MeUserName is not null");
            return (Criteria) this;
        }

        public Criteria andMeusernameEqualTo(String value) {
            addCriterion("MeUserName =", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameNotEqualTo(String value) {
            addCriterion("MeUserName <>", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameGreaterThan(String value) {
            addCriterion("MeUserName >", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameGreaterThanOrEqualTo(String value) {
            addCriterion("MeUserName >=", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameLessThan(String value) {
            addCriterion("MeUserName <", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameLessThanOrEqualTo(String value) {
            addCriterion("MeUserName <=", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameLike(String value) {
            addCriterion("MeUserName like", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameNotLike(String value) {
            addCriterion("MeUserName not like", value, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameIn(List<String> values) {
            addCriterion("MeUserName in", values, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameNotIn(List<String> values) {
            addCriterion("MeUserName not in", values, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameBetween(String value1, String value2) {
            addCriterion("MeUserName between", value1, value2, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeusernameNotBetween(String value1, String value2) {
            addCriterion("MeUserName not between", value1, value2, "meusername");
            return (Criteria) this;
        }

        public Criteria andMeinfoIsNull() {
            addCriterion("MeInfo is null");
            return (Criteria) this;
        }

        public Criteria andMeinfoIsNotNull() {
            addCriterion("MeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMeinfoEqualTo(String value) {
            addCriterion("MeInfo =", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoNotEqualTo(String value) {
            addCriterion("MeInfo <>", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoGreaterThan(String value) {
            addCriterion("MeInfo >", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("MeInfo >=", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoLessThan(String value) {
            addCriterion("MeInfo <", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoLessThanOrEqualTo(String value) {
            addCriterion("MeInfo <=", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoLike(String value) {
            addCriterion("MeInfo like", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoNotLike(String value) {
            addCriterion("MeInfo not like", value, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoIn(List<String> values) {
            addCriterion("MeInfo in", values, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoNotIn(List<String> values) {
            addCriterion("MeInfo not in", values, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoBetween(String value1, String value2) {
            addCriterion("MeInfo between", value1, value2, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMeinfoNotBetween(String value1, String value2) {
            addCriterion("MeInfo not between", value1, value2, "meinfo");
            return (Criteria) this;
        }

        public Criteria andMelevelIsNull() {
            addCriterion("MeLevel is null");
            return (Criteria) this;
        }

        public Criteria andMelevelIsNotNull() {
            addCriterion("MeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMelevelEqualTo(String value) {
            addCriterion("MeLevel =", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelNotEqualTo(String value) {
            addCriterion("MeLevel <>", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelGreaterThan(String value) {
            addCriterion("MeLevel >", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelGreaterThanOrEqualTo(String value) {
            addCriterion("MeLevel >=", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelLessThan(String value) {
            addCriterion("MeLevel <", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelLessThanOrEqualTo(String value) {
            addCriterion("MeLevel <=", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelLike(String value) {
            addCriterion("MeLevel like", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelNotLike(String value) {
            addCriterion("MeLevel not like", value, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelIn(List<String> values) {
            addCriterion("MeLevel in", values, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelNotIn(List<String> values) {
            addCriterion("MeLevel not in", values, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelBetween(String value1, String value2) {
            addCriterion("MeLevel between", value1, value2, "melevel");
            return (Criteria) this;
        }

        public Criteria andMelevelNotBetween(String value1, String value2) {
            addCriterion("MeLevel not between", value1, value2, "melevel");
            return (Criteria) this;
        }

        public Criteria andMenews1IsNull() {
            addCriterion("MeNews1 is null");
            return (Criteria) this;
        }

        public Criteria andMenews1IsNotNull() {
            addCriterion("MeNews1 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews1EqualTo(Integer value) {
            addCriterion("MeNews1 =", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1NotEqualTo(Integer value) {
            addCriterion("MeNews1 <>", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1GreaterThan(Integer value) {
            addCriterion("MeNews1 >", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews1 >=", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1LessThan(Integer value) {
            addCriterion("MeNews1 <", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews1 <=", value, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1In(List<Integer> values) {
            addCriterion("MeNews1 in", values, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1NotIn(List<Integer> values) {
            addCriterion("MeNews1 not in", values, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1Between(Integer value1, Integer value2) {
            addCriterion("MeNews1 between", value1, value2, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews1NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews1 not between", value1, value2, "menews1");
            return (Criteria) this;
        }

        public Criteria andMenews2IsNull() {
            addCriterion("MeNews2 is null");
            return (Criteria) this;
        }

        public Criteria andMenews2IsNotNull() {
            addCriterion("MeNews2 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews2EqualTo(Integer value) {
            addCriterion("MeNews2 =", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2NotEqualTo(Integer value) {
            addCriterion("MeNews2 <>", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2GreaterThan(Integer value) {
            addCriterion("MeNews2 >", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews2 >=", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2LessThan(Integer value) {
            addCriterion("MeNews2 <", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews2 <=", value, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2In(List<Integer> values) {
            addCriterion("MeNews2 in", values, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2NotIn(List<Integer> values) {
            addCriterion("MeNews2 not in", values, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2Between(Integer value1, Integer value2) {
            addCriterion("MeNews2 between", value1, value2, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews2NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews2 not between", value1, value2, "menews2");
            return (Criteria) this;
        }

        public Criteria andMenews3IsNull() {
            addCriterion("MeNews3 is null");
            return (Criteria) this;
        }

        public Criteria andMenews3IsNotNull() {
            addCriterion("MeNews3 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews3EqualTo(Integer value) {
            addCriterion("MeNews3 =", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3NotEqualTo(Integer value) {
            addCriterion("MeNews3 <>", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3GreaterThan(Integer value) {
            addCriterion("MeNews3 >", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews3 >=", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3LessThan(Integer value) {
            addCriterion("MeNews3 <", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews3 <=", value, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3In(List<Integer> values) {
            addCriterion("MeNews3 in", values, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3NotIn(List<Integer> values) {
            addCriterion("MeNews3 not in", values, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3Between(Integer value1, Integer value2) {
            addCriterion("MeNews3 between", value1, value2, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews3NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews3 not between", value1, value2, "menews3");
            return (Criteria) this;
        }

        public Criteria andMenews4IsNull() {
            addCriterion("MeNews4 is null");
            return (Criteria) this;
        }

        public Criteria andMenews4IsNotNull() {
            addCriterion("MeNews4 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews4EqualTo(Integer value) {
            addCriterion("MeNews4 =", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4NotEqualTo(Integer value) {
            addCriterion("MeNews4 <>", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4GreaterThan(Integer value) {
            addCriterion("MeNews4 >", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews4 >=", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4LessThan(Integer value) {
            addCriterion("MeNews4 <", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews4 <=", value, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4In(List<Integer> values) {
            addCriterion("MeNews4 in", values, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4NotIn(List<Integer> values) {
            addCriterion("MeNews4 not in", values, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4Between(Integer value1, Integer value2) {
            addCriterion("MeNews4 between", value1, value2, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews4NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews4 not between", value1, value2, "menews4");
            return (Criteria) this;
        }

        public Criteria andMenews5IsNull() {
            addCriterion("MeNews5 is null");
            return (Criteria) this;
        }

        public Criteria andMenews5IsNotNull() {
            addCriterion("MeNews5 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews5EqualTo(Integer value) {
            addCriterion("MeNews5 =", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5NotEqualTo(Integer value) {
            addCriterion("MeNews5 <>", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5GreaterThan(Integer value) {
            addCriterion("MeNews5 >", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews5 >=", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5LessThan(Integer value) {
            addCriterion("MeNews5 <", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews5 <=", value, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5In(List<Integer> values) {
            addCriterion("MeNews5 in", values, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5NotIn(List<Integer> values) {
            addCriterion("MeNews5 not in", values, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5Between(Integer value1, Integer value2) {
            addCriterion("MeNews5 between", value1, value2, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews5NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews5 not between", value1, value2, "menews5");
            return (Criteria) this;
        }

        public Criteria andMenews6IsNull() {
            addCriterion("MeNews6 is null");
            return (Criteria) this;
        }

        public Criteria andMenews6IsNotNull() {
            addCriterion("MeNews6 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews6EqualTo(Integer value) {
            addCriterion("MeNews6 =", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6NotEqualTo(Integer value) {
            addCriterion("MeNews6 <>", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6GreaterThan(Integer value) {
            addCriterion("MeNews6 >", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews6 >=", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6LessThan(Integer value) {
            addCriterion("MeNews6 <", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews6 <=", value, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6In(List<Integer> values) {
            addCriterion("MeNews6 in", values, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6NotIn(List<Integer> values) {
            addCriterion("MeNews6 not in", values, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6Between(Integer value1, Integer value2) {
            addCriterion("MeNews6 between", value1, value2, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews6NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews6 not between", value1, value2, "menews6");
            return (Criteria) this;
        }

        public Criteria andMenews7IsNull() {
            addCriterion("MeNews7 is null");
            return (Criteria) this;
        }

        public Criteria andMenews7IsNotNull() {
            addCriterion("MeNews7 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews7EqualTo(Integer value) {
            addCriterion("MeNews7 =", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7NotEqualTo(Integer value) {
            addCriterion("MeNews7 <>", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7GreaterThan(Integer value) {
            addCriterion("MeNews7 >", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews7 >=", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7LessThan(Integer value) {
            addCriterion("MeNews7 <", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews7 <=", value, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7In(List<Integer> values) {
            addCriterion("MeNews7 in", values, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7NotIn(List<Integer> values) {
            addCriterion("MeNews7 not in", values, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7Between(Integer value1, Integer value2) {
            addCriterion("MeNews7 between", value1, value2, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews7NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews7 not between", value1, value2, "menews7");
            return (Criteria) this;
        }

        public Criteria andMenews8IsNull() {
            addCriterion("MeNews8 is null");
            return (Criteria) this;
        }

        public Criteria andMenews8IsNotNull() {
            addCriterion("MeNews8 is not null");
            return (Criteria) this;
        }

        public Criteria andMenews8EqualTo(Integer value) {
            addCriterion("MeNews8 =", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8NotEqualTo(Integer value) {
            addCriterion("MeNews8 <>", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8GreaterThan(Integer value) {
            addCriterion("MeNews8 >", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8GreaterThanOrEqualTo(Integer value) {
            addCriterion("MeNews8 >=", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8LessThan(Integer value) {
            addCriterion("MeNews8 <", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8LessThanOrEqualTo(Integer value) {
            addCriterion("MeNews8 <=", value, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8In(List<Integer> values) {
            addCriterion("MeNews8 in", values, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8NotIn(List<Integer> values) {
            addCriterion("MeNews8 not in", values, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8Between(Integer value1, Integer value2) {
            addCriterion("MeNews8 between", value1, value2, "menews8");
            return (Criteria) this;
        }

        public Criteria andMenews8NotBetween(Integer value1, Integer value2) {
            addCriterion("MeNews8 not between", value1, value2, "menews8");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidIsNull() {
            addCriterion("MeSyllabusID is null");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidIsNotNull() {
            addCriterion("MeSyllabusID is not null");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidEqualTo(String value) {
            addCriterion("MeSyllabusID =", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidNotEqualTo(String value) {
            addCriterion("MeSyllabusID <>", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidGreaterThan(String value) {
            addCriterion("MeSyllabusID >", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidGreaterThanOrEqualTo(String value) {
            addCriterion("MeSyllabusID >=", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidLessThan(String value) {
            addCriterion("MeSyllabusID <", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidLessThanOrEqualTo(String value) {
            addCriterion("MeSyllabusID <=", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidLike(String value) {
            addCriterion("MeSyllabusID like", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidNotLike(String value) {
            addCriterion("MeSyllabusID not like", value, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidIn(List<String> values) {
            addCriterion("MeSyllabusID in", values, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidNotIn(List<String> values) {
            addCriterion("MeSyllabusID not in", values, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidBetween(String value1, String value2) {
            addCriterion("MeSyllabusID between", value1, value2, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMesyllabusidNotBetween(String value1, String value2) {
            addCriterion("MeSyllabusID not between", value1, value2, "mesyllabusid");
            return (Criteria) this;
        }

        public Criteria andMedatetimeIsNull() {
            addCriterion("MeDateTime is null");
            return (Criteria) this;
        }

        public Criteria andMedatetimeIsNotNull() {
            addCriterion("MeDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andMedatetimeEqualTo(Date value) {
            addCriterion("MeDateTime =", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeNotEqualTo(Date value) {
            addCriterion("MeDateTime <>", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeGreaterThan(Date value) {
            addCriterion("MeDateTime >", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MeDateTime >=", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeLessThan(Date value) {
            addCriterion("MeDateTime <", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeLessThanOrEqualTo(Date value) {
            addCriterion("MeDateTime <=", value, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeIn(List<Date> values) {
            addCriterion("MeDateTime in", values, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeNotIn(List<Date> values) {
            addCriterion("MeDateTime not in", values, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeBetween(Date value1, Date value2) {
            addCriterion("MeDateTime between", value1, value2, "medatetime");
            return (Criteria) this;
        }

        public Criteria andMedatetimeNotBetween(Date value1, Date value2) {
            addCriterion("MeDateTime not between", value1, value2, "medatetime");
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