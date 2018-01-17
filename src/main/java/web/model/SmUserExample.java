package web.model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Resource
public class SmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SmUserExample() {
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

        public Criteria andUseroidIsNull() {
            addCriterion("UserOID is null");
            return (Criteria) this;
        }

        public Criteria andUseroidIsNotNull() {
            addCriterion("UserOID is not null");
            return (Criteria) this;
        }

        public Criteria andUseroidEqualTo(String value) {
            addCriterion("UserOID =", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidNotEqualTo(String value) {
            addCriterion("UserOID <>", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidGreaterThan(String value) {
            addCriterion("UserOID >", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidGreaterThanOrEqualTo(String value) {
            addCriterion("UserOID >=", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidLessThan(String value) {
            addCriterion("UserOID <", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidLessThanOrEqualTo(String value) {
            addCriterion("UserOID <=", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidLike(String value) {
            addCriterion("UserOID like", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidNotLike(String value) {
            addCriterion("UserOID not like", value, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidIn(List<String> values) {
            addCriterion("UserOID in", values, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidNotIn(List<String> values) {
            addCriterion("UserOID not in", values, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidBetween(String value1, String value2) {
            addCriterion("UserOID between", value1, value2, "useroid");
            return (Criteria) this;
        }

        public Criteria andUseroidNotBetween(String value1, String value2) {
            addCriterion("UserOID not between", value1, value2, "useroid");
            return (Criteria) this;
        }

        public Criteria andUsnumIsNull() {
            addCriterion("UsNum is null");
            return (Criteria) this;
        }

        public Criteria andUsnumIsNotNull() {
            addCriterion("UsNum is not null");
            return (Criteria) this;
        }

        public Criteria andUsnumEqualTo(String value) {
            addCriterion("UsNum =", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumNotEqualTo(String value) {
            addCriterion("UsNum <>", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumGreaterThan(String value) {
            addCriterion("UsNum >", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumGreaterThanOrEqualTo(String value) {
            addCriterion("UsNum >=", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumLessThan(String value) {
            addCriterion("UsNum <", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumLessThanOrEqualTo(String value) {
            addCriterion("UsNum <=", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumLike(String value) {
            addCriterion("UsNum like", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumNotLike(String value) {
            addCriterion("UsNum not like", value, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumIn(List<String> values) {
            addCriterion("UsNum in", values, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumNotIn(List<String> values) {
            addCriterion("UsNum not in", values, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumBetween(String value1, String value2) {
            addCriterion("UsNum between", value1, value2, "usnum");
            return (Criteria) this;
        }

        public Criteria andUsnumNotBetween(String value1, String value2) {
            addCriterion("UsNum not between", value1, value2, "usnum");
            return (Criteria) this;
        }

        public Criteria andUspasswordIsNull() {
            addCriterion("UsPassword is null");
            return (Criteria) this;
        }

        public Criteria andUspasswordIsNotNull() {
            addCriterion("UsPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUspasswordEqualTo(String value) {
            addCriterion("UsPassword =", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordNotEqualTo(String value) {
            addCriterion("UsPassword <>", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordGreaterThan(String value) {
            addCriterion("UsPassword >", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UsPassword >=", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordLessThan(String value) {
            addCriterion("UsPassword <", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordLessThanOrEqualTo(String value) {
            addCriterion("UsPassword <=", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordLike(String value) {
            addCriterion("UsPassword like", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordNotLike(String value) {
            addCriterion("UsPassword not like", value, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordIn(List<String> values) {
            addCriterion("UsPassword in", values, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordNotIn(List<String> values) {
            addCriterion("UsPassword not in", values, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordBetween(String value1, String value2) {
            addCriterion("UsPassword between", value1, value2, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUspasswordNotBetween(String value1, String value2) {
            addCriterion("UsPassword not between", value1, value2, "uspassword");
            return (Criteria) this;
        }

        public Criteria andUslimitIsNull() {
            addCriterion("UsLimit is null");
            return (Criteria) this;
        }

        public Criteria andUslimitIsNotNull() {
            addCriterion("UsLimit is not null");
            return (Criteria) this;
        }

        public Criteria andUslimitEqualTo(Integer value) {
            addCriterion("UsLimit =", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitNotEqualTo(Integer value) {
            addCriterion("UsLimit <>", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitGreaterThan(Integer value) {
            addCriterion("UsLimit >", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsLimit >=", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitLessThan(Integer value) {
            addCriterion("UsLimit <", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitLessThanOrEqualTo(Integer value) {
            addCriterion("UsLimit <=", value, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitIn(List<Integer> values) {
            addCriterion("UsLimit in", values, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitNotIn(List<Integer> values) {
            addCriterion("UsLimit not in", values, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitBetween(Integer value1, Integer value2) {
            addCriterion("UsLimit between", value1, value2, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUslimitNotBetween(Integer value1, Integer value2) {
            addCriterion("UsLimit not between", value1, value2, "uslimit");
            return (Criteria) this;
        }

        public Criteria andUscollegeIsNull() {
            addCriterion("UsCollege is null");
            return (Criteria) this;
        }

        public Criteria andUscollegeIsNotNull() {
            addCriterion("UsCollege is not null");
            return (Criteria) this;
        }

        public Criteria andUscollegeEqualTo(String value) {
            addCriterion("UsCollege =", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeNotEqualTo(String value) {
            addCriterion("UsCollege <>", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeGreaterThan(String value) {
            addCriterion("UsCollege >", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeGreaterThanOrEqualTo(String value) {
            addCriterion("UsCollege >=", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeLessThan(String value) {
            addCriterion("UsCollege <", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeLessThanOrEqualTo(String value) {
            addCriterion("UsCollege <=", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeLike(String value) {
            addCriterion("UsCollege like", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeNotLike(String value) {
            addCriterion("UsCollege not like", value, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeIn(List<String> values) {
            addCriterion("UsCollege in", values, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeNotIn(List<String> values) {
            addCriterion("UsCollege not in", values, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeBetween(String value1, String value2) {
            addCriterion("UsCollege between", value1, value2, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUscollegeNotBetween(String value1, String value2) {
            addCriterion("UsCollege not between", value1, value2, "uscollege");
            return (Criteria) this;
        }

        public Criteria andUsschoolIsNull() {
            addCriterion("UsSchool is null");
            return (Criteria) this;
        }

        public Criteria andUsschoolIsNotNull() {
            addCriterion("UsSchool is not null");
            return (Criteria) this;
        }

        public Criteria andUsschoolEqualTo(String value) {
            addCriterion("UsSchool =", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolNotEqualTo(String value) {
            addCriterion("UsSchool <>", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolGreaterThan(String value) {
            addCriterion("UsSchool >", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolGreaterThanOrEqualTo(String value) {
            addCriterion("UsSchool >=", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolLessThan(String value) {
            addCriterion("UsSchool <", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolLessThanOrEqualTo(String value) {
            addCriterion("UsSchool <=", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolLike(String value) {
            addCriterion("UsSchool like", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolNotLike(String value) {
            addCriterion("UsSchool not like", value, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolIn(List<String> values) {
            addCriterion("UsSchool in", values, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolNotIn(List<String> values) {
            addCriterion("UsSchool not in", values, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolBetween(String value1, String value2) {
            addCriterion("UsSchool between", value1, value2, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsschoolNotBetween(String value1, String value2) {
            addCriterion("UsSchool not between", value1, value2, "usschool");
            return (Criteria) this;
        }

        public Criteria andUsstateIsNull() {
            addCriterion("UsState is null");
            return (Criteria) this;
        }

        public Criteria andUsstateIsNotNull() {
            addCriterion("UsState is not null");
            return (Criteria) this;
        }

        public Criteria andUsstateEqualTo(Integer value) {
            addCriterion("UsState =", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateNotEqualTo(Integer value) {
            addCriterion("UsState <>", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateGreaterThan(Integer value) {
            addCriterion("UsState >", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsState >=", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateLessThan(Integer value) {
            addCriterion("UsState <", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateLessThanOrEqualTo(Integer value) {
            addCriterion("UsState <=", value, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateIn(List<Integer> values) {
            addCriterion("UsState in", values, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateNotIn(List<Integer> values) {
            addCriterion("UsState not in", values, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateBetween(Integer value1, Integer value2) {
            addCriterion("UsState between", value1, value2, "usstate");
            return (Criteria) this;
        }

        public Criteria andUsstateNotBetween(Integer value1, Integer value2) {
            addCriterion("UsState not between", value1, value2, "usstate");
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