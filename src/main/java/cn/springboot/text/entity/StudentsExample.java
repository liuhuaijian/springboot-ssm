package cn.springboot.text.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIsNull() {
            addCriterion("gmt_creat is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIsNotNull() {
            addCriterion("gmt_creat is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatEqualTo(Date value) {
            addCriterion("gmt_creat =", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotEqualTo(Date value) {
            addCriterion("gmt_creat <>", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatGreaterThan(Date value) {
            addCriterion("gmt_creat >", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_creat >=", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatLessThan(Date value) {
            addCriterion("gmt_creat <", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatLessThanOrEqualTo(Date value) {
            addCriterion("gmt_creat <=", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIn(List<Date> values) {
            addCriterion("gmt_creat in", values, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotIn(List<Date> values) {
            addCriterion("gmt_creat not in", values, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatBetween(Date value1, Date value2) {
            addCriterion("gmt_creat between", value1, value2, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotBetween(Date value1, Date value2) {
            addCriterion("gmt_creat not between", value1, value2, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("delete is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("delete is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("delete =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("delete <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("delete >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("delete <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("delete <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("delete in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("delete not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("delete between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("delete not between", value1, value2, "delete");
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