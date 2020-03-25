package cn.ncu.retest.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andKsbhIsNull() {
            addCriterion("ksbh is null");
            return (Criteria) this;
        }

        public Criteria andKsbhIsNotNull() {
            addCriterion("ksbh is not null");
            return (Criteria) this;
        }

        public Criteria andKsbhEqualTo(String value) {
            addCriterion("ksbh =", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhNotEqualTo(String value) {
            addCriterion("ksbh <>", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhGreaterThan(String value) {
            addCriterion("ksbh >", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhGreaterThanOrEqualTo(String value) {
            addCriterion("ksbh >=", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhLessThan(String value) {
            addCriterion("ksbh <", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhLessThanOrEqualTo(String value) {
            addCriterion("ksbh <=", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhLike(String value) {
            addCriterion("ksbh like", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhNotLike(String value) {
            addCriterion("ksbh not like", value, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhIn(List<String> values) {
            addCriterion("ksbh in", values, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhNotIn(List<String> values) {
            addCriterion("ksbh not in", values, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhBetween(String value1, String value2) {
            addCriterion("ksbh between", value1, value2, "ksbh");
            return (Criteria) this;
        }

        public Criteria andKsbhNotBetween(String value1, String value2) {
            addCriterion("ksbh not between", value1, value2, "ksbh");
            return (Criteria) this;
        }

        public Criteria andBmddmIsNull() {
            addCriterion("bmddm is null");
            return (Criteria) this;
        }

        public Criteria andBmddmIsNotNull() {
            addCriterion("bmddm is not null");
            return (Criteria) this;
        }

        public Criteria andBmddmEqualTo(Integer value) {
            addCriterion("bmddm =", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmNotEqualTo(Integer value) {
            addCriterion("bmddm <>", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmGreaterThan(Integer value) {
            addCriterion("bmddm >", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmGreaterThanOrEqualTo(Integer value) {
            addCriterion("bmddm >=", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmLessThan(Integer value) {
            addCriterion("bmddm <", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmLessThanOrEqualTo(Integer value) {
            addCriterion("bmddm <=", value, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmIn(List<Integer> values) {
            addCriterion("bmddm in", values, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmNotIn(List<Integer> values) {
            addCriterion("bmddm not in", values, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmBetween(Integer value1, Integer value2) {
            addCriterion("bmddm between", value1, value2, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmddmNotBetween(Integer value1, Integer value2) {
            addCriterion("bmddm not between", value1, value2, "bmddm");
            return (Criteria) this;
        }

        public Criteria andBmhIsNull() {
            addCriterion("bmh is null");
            return (Criteria) this;
        }

        public Criteria andBmhIsNotNull() {
            addCriterion("bmh is not null");
            return (Criteria) this;
        }

        public Criteria andBmhEqualTo(String value) {
            addCriterion("bmh =", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhNotEqualTo(String value) {
            addCriterion("bmh <>", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhGreaterThan(String value) {
            addCriterion("bmh >", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhGreaterThanOrEqualTo(String value) {
            addCriterion("bmh >=", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhLessThan(String value) {
            addCriterion("bmh <", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhLessThanOrEqualTo(String value) {
            addCriterion("bmh <=", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhLike(String value) {
            addCriterion("bmh like", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhNotLike(String value) {
            addCriterion("bmh not like", value, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhIn(List<String> values) {
            addCriterion("bmh in", values, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhNotIn(List<String> values) {
            addCriterion("bmh not in", values, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhBetween(String value1, String value2) {
            addCriterion("bmh between", value1, value2, "bmh");
            return (Criteria) this;
        }

        public Criteria andBmhNotBetween(String value1, String value2) {
            addCriterion("bmh not between", value1, value2, "bmh");
            return (Criteria) this;
        }

        public Criteria andBkyxsmIsNull() {
            addCriterion("bkyxsm is null");
            return (Criteria) this;
        }

        public Criteria andBkyxsmIsNotNull() {
            addCriterion("bkyxsm is not null");
            return (Criteria) this;
        }

        public Criteria andBkyxsmEqualTo(String value) {
            addCriterion("bkyxsm =", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmNotEqualTo(String value) {
            addCriterion("bkyxsm <>", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmGreaterThan(String value) {
            addCriterion("bkyxsm >", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmGreaterThanOrEqualTo(String value) {
            addCriterion("bkyxsm >=", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmLessThan(String value) {
            addCriterion("bkyxsm <", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmLessThanOrEqualTo(String value) {
            addCriterion("bkyxsm <=", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmLike(String value) {
            addCriterion("bkyxsm like", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmNotLike(String value) {
            addCriterion("bkyxsm not like", value, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmIn(List<String> values) {
            addCriterion("bkyxsm in", values, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmNotIn(List<String> values) {
            addCriterion("bkyxsm not in", values, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmBetween(String value1, String value2) {
            addCriterion("bkyxsm between", value1, value2, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmNotBetween(String value1, String value2) {
            addCriterion("bkyxsm not between", value1, value2, "bkyxsm");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcIsNull() {
            addCriterion("bkyxsmc is null");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcIsNotNull() {
            addCriterion("bkyxsmc is not null");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcEqualTo(String value) {
            addCriterion("bkyxsmc =", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcNotEqualTo(String value) {
            addCriterion("bkyxsmc <>", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcGreaterThan(String value) {
            addCriterion("bkyxsmc >", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcGreaterThanOrEqualTo(String value) {
            addCriterion("bkyxsmc >=", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcLessThan(String value) {
            addCriterion("bkyxsmc <", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcLessThanOrEqualTo(String value) {
            addCriterion("bkyxsmc <=", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcLike(String value) {
            addCriterion("bkyxsmc like", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcNotLike(String value) {
            addCriterion("bkyxsmc not like", value, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcIn(List<String> values) {
            addCriterion("bkyxsmc in", values, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcNotIn(List<String> values) {
            addCriterion("bkyxsmc not in", values, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcBetween(String value1, String value2) {
            addCriterion("bkyxsmc between", value1, value2, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkyxsmcNotBetween(String value1, String value2) {
            addCriterion("bkyxsmc not between", value1, value2, "bkyxsmc");
            return (Criteria) this;
        }

        public Criteria andBkzydmIsNull() {
            addCriterion("bkzydm is null");
            return (Criteria) this;
        }

        public Criteria andBkzydmIsNotNull() {
            addCriterion("bkzydm is not null");
            return (Criteria) this;
        }

        public Criteria andBkzydmEqualTo(String value) {
            addCriterion("bkzydm =", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmNotEqualTo(String value) {
            addCriterion("bkzydm <>", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmGreaterThan(String value) {
            addCriterion("bkzydm >", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmGreaterThanOrEqualTo(String value) {
            addCriterion("bkzydm >=", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmLessThan(String value) {
            addCriterion("bkzydm <", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmLessThanOrEqualTo(String value) {
            addCriterion("bkzydm <=", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmLike(String value) {
            addCriterion("bkzydm like", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmNotLike(String value) {
            addCriterion("bkzydm not like", value, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmIn(List<String> values) {
            addCriterion("bkzydm in", values, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmNotIn(List<String> values) {
            addCriterion("bkzydm not in", values, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmBetween(String value1, String value2) {
            addCriterion("bkzydm between", value1, value2, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzydmNotBetween(String value1, String value2) {
            addCriterion("bkzydm not between", value1, value2, "bkzydm");
            return (Criteria) this;
        }

        public Criteria andBkzymcIsNull() {
            addCriterion("bkzymc is null");
            return (Criteria) this;
        }

        public Criteria andBkzymcIsNotNull() {
            addCriterion("bkzymc is not null");
            return (Criteria) this;
        }

        public Criteria andBkzymcEqualTo(String value) {
            addCriterion("bkzymc =", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcNotEqualTo(String value) {
            addCriterion("bkzymc <>", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcGreaterThan(String value) {
            addCriterion("bkzymc >", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcGreaterThanOrEqualTo(String value) {
            addCriterion("bkzymc >=", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcLessThan(String value) {
            addCriterion("bkzymc <", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcLessThanOrEqualTo(String value) {
            addCriterion("bkzymc <=", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcLike(String value) {
            addCriterion("bkzymc like", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcNotLike(String value) {
            addCriterion("bkzymc not like", value, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcIn(List<String> values) {
            addCriterion("bkzymc in", values, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcNotIn(List<String> values) {
            addCriterion("bkzymc not in", values, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcBetween(String value1, String value2) {
            addCriterion("bkzymc between", value1, value2, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andBkzymcNotBetween(String value1, String value2) {
            addCriterion("bkzymc not between", value1, value2, "bkzymc");
            return (Criteria) this;
        }

        public Criteria andYjfxmIsNull() {
            addCriterion("yjfxm is null");
            return (Criteria) this;
        }

        public Criteria andYjfxmIsNotNull() {
            addCriterion("yjfxm is not null");
            return (Criteria) this;
        }

        public Criteria andYjfxmEqualTo(String value) {
            addCriterion("yjfxm =", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmNotEqualTo(String value) {
            addCriterion("yjfxm <>", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmGreaterThan(String value) {
            addCriterion("yjfxm >", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmGreaterThanOrEqualTo(String value) {
            addCriterion("yjfxm >=", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmLessThan(String value) {
            addCriterion("yjfxm <", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmLessThanOrEqualTo(String value) {
            addCriterion("yjfxm <=", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmLike(String value) {
            addCriterion("yjfxm like", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmNotLike(String value) {
            addCriterion("yjfxm not like", value, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmIn(List<String> values) {
            addCriterion("yjfxm in", values, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmNotIn(List<String> values) {
            addCriterion("yjfxm not in", values, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmBetween(String value1, String value2) {
            addCriterion("yjfxm between", value1, value2, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmNotBetween(String value1, String value2) {
            addCriterion("yjfxm not between", value1, value2, "yjfxm");
            return (Criteria) this;
        }

        public Criteria andYjfxmcIsNull() {
            addCriterion("yjfxmc is null");
            return (Criteria) this;
        }

        public Criteria andYjfxmcIsNotNull() {
            addCriterion("yjfxmc is not null");
            return (Criteria) this;
        }

        public Criteria andYjfxmcEqualTo(String value) {
            addCriterion("yjfxmc =", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcNotEqualTo(String value) {
            addCriterion("yjfxmc <>", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcGreaterThan(String value) {
            addCriterion("yjfxmc >", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcGreaterThanOrEqualTo(String value) {
            addCriterion("yjfxmc >=", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcLessThan(String value) {
            addCriterion("yjfxmc <", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcLessThanOrEqualTo(String value) {
            addCriterion("yjfxmc <=", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcLike(String value) {
            addCriterion("yjfxmc like", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcNotLike(String value) {
            addCriterion("yjfxmc not like", value, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcIn(List<String> values) {
            addCriterion("yjfxmc in", values, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcNotIn(List<String> values) {
            addCriterion("yjfxmc not in", values, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcBetween(String value1, String value2) {
            addCriterion("yjfxmc between", value1, value2, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andYjfxmcNotBetween(String value1, String value2) {
            addCriterion("yjfxmc not between", value1, value2, "yjfxmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcIsNull() {
            addCriterion("bkxxfsmc is null");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcIsNotNull() {
            addCriterion("bkxxfsmc is not null");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcEqualTo(String value) {
            addCriterion("bkxxfsmc =", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcNotEqualTo(String value) {
            addCriterion("bkxxfsmc <>", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcGreaterThan(String value) {
            addCriterion("bkxxfsmc >", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcGreaterThanOrEqualTo(String value) {
            addCriterion("bkxxfsmc >=", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcLessThan(String value) {
            addCriterion("bkxxfsmc <", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcLessThanOrEqualTo(String value) {
            addCriterion("bkxxfsmc <=", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcLike(String value) {
            addCriterion("bkxxfsmc like", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcNotLike(String value) {
            addCriterion("bkxxfsmc not like", value, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcIn(List<String> values) {
            addCriterion("bkxxfsmc in", values, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcNotIn(List<String> values) {
            addCriterion("bkxxfsmc not in", values, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcBetween(String value1, String value2) {
            addCriterion("bkxxfsmc between", value1, value2, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andBkxxfsmcNotBetween(String value1, String value2) {
            addCriterion("bkxxfsmc not between", value1, value2, "bkxxfsmc");
            return (Criteria) this;
        }

        public Criteria andZzllIsNull() {
            addCriterion("zzll is null");
            return (Criteria) this;
        }

        public Criteria andZzllIsNotNull() {
            addCriterion("zzll is not null");
            return (Criteria) this;
        }

        public Criteria andZzllEqualTo(Double value) {
            addCriterion("zzll =", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllNotEqualTo(Double value) {
            addCriterion("zzll <>", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllGreaterThan(Double value) {
            addCriterion("zzll >", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllGreaterThanOrEqualTo(Double value) {
            addCriterion("zzll >=", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllLessThan(Double value) {
            addCriterion("zzll <", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllLessThanOrEqualTo(Double value) {
            addCriterion("zzll <=", value, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllIn(List<Double> values) {
            addCriterion("zzll in", values, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllNotIn(List<Double> values) {
            addCriterion("zzll not in", values, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllBetween(Double value1, Double value2) {
            addCriterion("zzll between", value1, value2, "zzll");
            return (Criteria) this;
        }

        public Criteria andZzllNotBetween(Double value1, Double value2) {
            addCriterion("zzll not between", value1, value2, "zzll");
            return (Criteria) this;
        }

        public Criteria andWgyIsNull() {
            addCriterion("wgy is null");
            return (Criteria) this;
        }

        public Criteria andWgyIsNotNull() {
            addCriterion("wgy is not null");
            return (Criteria) this;
        }

        public Criteria andWgyEqualTo(Double value) {
            addCriterion("wgy =", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyNotEqualTo(Double value) {
            addCriterion("wgy <>", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyGreaterThan(Double value) {
            addCriterion("wgy >", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyGreaterThanOrEqualTo(Double value) {
            addCriterion("wgy >=", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyLessThan(Double value) {
            addCriterion("wgy <", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyLessThanOrEqualTo(Double value) {
            addCriterion("wgy <=", value, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyIn(List<Double> values) {
            addCriterion("wgy in", values, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyNotIn(List<Double> values) {
            addCriterion("wgy not in", values, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyBetween(Double value1, Double value2) {
            addCriterion("wgy between", value1, value2, "wgy");
            return (Criteria) this;
        }

        public Criteria andWgyNotBetween(Double value1, Double value2) {
            addCriterion("wgy not between", value1, value2, "wgy");
            return (Criteria) this;
        }

        public Criteria andYwk1IsNull() {
            addCriterion("ywk1 is null");
            return (Criteria) this;
        }

        public Criteria andYwk1IsNotNull() {
            addCriterion("ywk1 is not null");
            return (Criteria) this;
        }

        public Criteria andYwk1EqualTo(Double value) {
            addCriterion("ywk1 =", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1NotEqualTo(Double value) {
            addCriterion("ywk1 <>", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1GreaterThan(Double value) {
            addCriterion("ywk1 >", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1GreaterThanOrEqualTo(Double value) {
            addCriterion("ywk1 >=", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1LessThan(Double value) {
            addCriterion("ywk1 <", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1LessThanOrEqualTo(Double value) {
            addCriterion("ywk1 <=", value, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1In(List<Double> values) {
            addCriterion("ywk1 in", values, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1NotIn(List<Double> values) {
            addCriterion("ywk1 not in", values, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1Between(Double value1, Double value2) {
            addCriterion("ywk1 between", value1, value2, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk1NotBetween(Double value1, Double value2) {
            addCriterion("ywk1 not between", value1, value2, "ywk1");
            return (Criteria) this;
        }

        public Criteria andYwk2IsNull() {
            addCriterion("ywk2 is null");
            return (Criteria) this;
        }

        public Criteria andYwk2IsNotNull() {
            addCriterion("ywk2 is not null");
            return (Criteria) this;
        }

        public Criteria andYwk2EqualTo(Double value) {
            addCriterion("ywk2 =", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2NotEqualTo(Double value) {
            addCriterion("ywk2 <>", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2GreaterThan(Double value) {
            addCriterion("ywk2 >", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2GreaterThanOrEqualTo(Double value) {
            addCriterion("ywk2 >=", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2LessThan(Double value) {
            addCriterion("ywk2 <", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2LessThanOrEqualTo(Double value) {
            addCriterion("ywk2 <=", value, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2In(List<Double> values) {
            addCriterion("ywk2 in", values, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2NotIn(List<Double> values) {
            addCriterion("ywk2 not in", values, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2Between(Double value1, Double value2) {
            addCriterion("ywk2 between", value1, value2, "ywk2");
            return (Criteria) this;
        }

        public Criteria andYwk2NotBetween(Double value1, Double value2) {
            addCriterion("ywk2 not between", value1, value2, "ywk2");
            return (Criteria) this;
        }

        public Criteria andCszfIsNull() {
            addCriterion("cszf is null");
            return (Criteria) this;
        }

        public Criteria andCszfIsNotNull() {
            addCriterion("cszf is not null");
            return (Criteria) this;
        }

        public Criteria andCszfEqualTo(String value) {
            addCriterion("cszf =", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfNotEqualTo(String value) {
            addCriterion("cszf <>", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfGreaterThan(String value) {
            addCriterion("cszf >", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfGreaterThanOrEqualTo(String value) {
            addCriterion("cszf >=", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfLessThan(String value) {
            addCriterion("cszf <", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfLessThanOrEqualTo(String value) {
            addCriterion("cszf <=", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfLike(String value) {
            addCriterion("cszf like", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfNotLike(String value) {
            addCriterion("cszf not like", value, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfIn(List<String> values) {
            addCriterion("cszf in", values, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfNotIn(List<String> values) {
            addCriterion("cszf not in", values, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfBetween(String value1, String value2) {
            addCriterion("cszf between", value1, value2, "cszf");
            return (Criteria) this;
        }

        public Criteria andCszfNotBetween(String value1, String value2) {
            addCriterion("cszf not between", value1, value2, "cszf");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(String value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(String value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(String value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(String value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(String value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(String value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLike(String value) {
            addCriterion("csrq like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotLike(String value) {
            addCriterion("csrq not like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<String> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<String> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(String value1, String value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(String value1, String value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andMzmIsNull() {
            addCriterion("mzm is null");
            return (Criteria) this;
        }

        public Criteria andMzmIsNotNull() {
            addCriterion("mzm is not null");
            return (Criteria) this;
        }

        public Criteria andMzmEqualTo(String value) {
            addCriterion("mzm =", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotEqualTo(String value) {
            addCriterion("mzm <>", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThan(String value) {
            addCriterion("mzm >", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThanOrEqualTo(String value) {
            addCriterion("mzm >=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThan(String value) {
            addCriterion("mzm <", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThanOrEqualTo(String value) {
            addCriterion("mzm <=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLike(String value) {
            addCriterion("mzm like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotLike(String value) {
            addCriterion("mzm not like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmIn(List<String> values) {
            addCriterion("mzm in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotIn(List<String> values) {
            addCriterion("mzm not in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmBetween(String value1, String value2) {
            addCriterion("mzm between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotBetween(String value1, String value2) {
            addCriterion("mzm not between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andXbmIsNull() {
            addCriterion("xbm is null");
            return (Criteria) this;
        }

        public Criteria andXbmIsNotNull() {
            addCriterion("xbm is not null");
            return (Criteria) this;
        }

        public Criteria andXbmEqualTo(String value) {
            addCriterion("xbm =", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotEqualTo(String value) {
            addCriterion("xbm <>", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThan(String value) {
            addCriterion("xbm >", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThanOrEqualTo(String value) {
            addCriterion("xbm >=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThan(String value) {
            addCriterion("xbm <", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThanOrEqualTo(String value) {
            addCriterion("xbm <=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLike(String value) {
            addCriterion("xbm like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotLike(String value) {
            addCriterion("xbm not like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmIn(List<String> values) {
            addCriterion("xbm in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotIn(List<String> values) {
            addCriterion("xbm not in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmBetween(String value1, String value2) {
            addCriterion("xbm between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotBetween(String value1, String value2) {
            addCriterion("xbm not between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andDaszdwIsNull() {
            addCriterion("daszdw is null");
            return (Criteria) this;
        }

        public Criteria andDaszdwIsNotNull() {
            addCriterion("daszdw is not null");
            return (Criteria) this;
        }

        public Criteria andDaszdwEqualTo(String value) {
            addCriterion("daszdw =", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwNotEqualTo(String value) {
            addCriterion("daszdw <>", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwGreaterThan(String value) {
            addCriterion("daszdw >", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwGreaterThanOrEqualTo(String value) {
            addCriterion("daszdw >=", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwLessThan(String value) {
            addCriterion("daszdw <", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwLessThanOrEqualTo(String value) {
            addCriterion("daszdw <=", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwLike(String value) {
            addCriterion("daszdw like", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwNotLike(String value) {
            addCriterion("daszdw not like", value, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwIn(List<String> values) {
            addCriterion("daszdw in", values, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwNotIn(List<String> values) {
            addCriterion("daszdw not in", values, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwBetween(String value1, String value2) {
            addCriterion("daszdw between", value1, value2, "daszdw");
            return (Criteria) this;
        }

        public Criteria andDaszdwNotBetween(String value1, String value2) {
            addCriterion("daszdw not between", value1, value2, "daszdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwIsNull() {
            addCriterion("xxgzdw is null");
            return (Criteria) this;
        }

        public Criteria andXxgzdwIsNotNull() {
            addCriterion("xxgzdw is not null");
            return (Criteria) this;
        }

        public Criteria andXxgzdwEqualTo(String value) {
            addCriterion("xxgzdw =", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwNotEqualTo(String value) {
            addCriterion("xxgzdw <>", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwGreaterThan(String value) {
            addCriterion("xxgzdw >", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwGreaterThanOrEqualTo(String value) {
            addCriterion("xxgzdw >=", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwLessThan(String value) {
            addCriterion("xxgzdw <", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwLessThanOrEqualTo(String value) {
            addCriterion("xxgzdw <=", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwLike(String value) {
            addCriterion("xxgzdw like", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwNotLike(String value) {
            addCriterion("xxgzdw not like", value, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwIn(List<String> values) {
            addCriterion("xxgzdw in", values, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwNotIn(List<String> values) {
            addCriterion("xxgzdw not in", values, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwBetween(String value1, String value2) {
            addCriterion("xxgzdw between", value1, value2, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzdwNotBetween(String value1, String value2) {
            addCriterion("xxgzdw not between", value1, value2, "xxgzdw");
            return (Criteria) this;
        }

        public Criteria andXxgzjlIsNull() {
            addCriterion("xxgzjl is null");
            return (Criteria) this;
        }

        public Criteria andXxgzjlIsNotNull() {
            addCriterion("xxgzjl is not null");
            return (Criteria) this;
        }

        public Criteria andXxgzjlEqualTo(String value) {
            addCriterion("xxgzjl =", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlNotEqualTo(String value) {
            addCriterion("xxgzjl <>", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlGreaterThan(String value) {
            addCriterion("xxgzjl >", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlGreaterThanOrEqualTo(String value) {
            addCriterion("xxgzjl >=", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlLessThan(String value) {
            addCriterion("xxgzjl <", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlLessThanOrEqualTo(String value) {
            addCriterion("xxgzjl <=", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlLike(String value) {
            addCriterion("xxgzjl like", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlNotLike(String value) {
            addCriterion("xxgzjl not like", value, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlIn(List<String> values) {
            addCriterion("xxgzjl in", values, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlNotIn(List<String> values) {
            addCriterion("xxgzjl not in", values, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlBetween(String value1, String value2) {
            addCriterion("xxgzjl between", value1, value2, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andXxgzjlNotBetween(String value1, String value2) {
            addCriterion("xxgzjl not between", value1, value2, "xxgzjl");
            return (Criteria) this;
        }

        public Criteria andJlcfIsNull() {
            addCriterion("jlcf is null");
            return (Criteria) this;
        }

        public Criteria andJlcfIsNotNull() {
            addCriterion("jlcf is not null");
            return (Criteria) this;
        }

        public Criteria andJlcfEqualTo(String value) {
            addCriterion("jlcf =", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfNotEqualTo(String value) {
            addCriterion("jlcf <>", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfGreaterThan(String value) {
            addCriterion("jlcf >", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfGreaterThanOrEqualTo(String value) {
            addCriterion("jlcf >=", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfLessThan(String value) {
            addCriterion("jlcf <", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfLessThanOrEqualTo(String value) {
            addCriterion("jlcf <=", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfLike(String value) {
            addCriterion("jlcf like", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfNotLike(String value) {
            addCriterion("jlcf not like", value, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfIn(List<String> values) {
            addCriterion("jlcf in", values, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfNotIn(List<String> values) {
            addCriterion("jlcf not in", values, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfBetween(String value1, String value2) {
            addCriterion("jlcf between", value1, value2, "jlcf");
            return (Criteria) this;
        }

        public Criteria andJlcfNotBetween(String value1, String value2) {
            addCriterion("jlcf not between", value1, value2, "jlcf");
            return (Criteria) this;
        }

        public Criteria andKszbqkIsNull() {
            addCriterion("kszbqk is null");
            return (Criteria) this;
        }

        public Criteria andKszbqkIsNotNull() {
            addCriterion("kszbqk is not null");
            return (Criteria) this;
        }

        public Criteria andKszbqkEqualTo(String value) {
            addCriterion("kszbqk =", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkNotEqualTo(String value) {
            addCriterion("kszbqk <>", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkGreaterThan(String value) {
            addCriterion("kszbqk >", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkGreaterThanOrEqualTo(String value) {
            addCriterion("kszbqk >=", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkLessThan(String value) {
            addCriterion("kszbqk <", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkLessThanOrEqualTo(String value) {
            addCriterion("kszbqk <=", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkLike(String value) {
            addCriterion("kszbqk like", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkNotLike(String value) {
            addCriterion("kszbqk not like", value, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkIn(List<String> values) {
            addCriterion("kszbqk in", values, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkNotIn(List<String> values) {
            addCriterion("kszbqk not in", values, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkBetween(String value1, String value2) {
            addCriterion("kszbqk between", value1, value2, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andKszbqkNotBetween(String value1, String value2) {
            addCriterion("kszbqk not between", value1, value2, "kszbqk");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNull() {
            addCriterion("txdz is null");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNotNull() {
            addCriterion("txdz is not null");
            return (Criteria) this;
        }

        public Criteria andTxdzEqualTo(String value) {
            addCriterion("txdz =", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotEqualTo(String value) {
            addCriterion("txdz <>", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThan(String value) {
            addCriterion("txdz >", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThanOrEqualTo(String value) {
            addCriterion("txdz >=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThan(String value) {
            addCriterion("txdz <", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThanOrEqualTo(String value) {
            addCriterion("txdz <=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLike(String value) {
            addCriterion("txdz like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotLike(String value) {
            addCriterion("txdz not like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzIn(List<String> values) {
            addCriterion("txdz in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotIn(List<String> values) {
            addCriterion("txdz not in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzBetween(String value1, String value2) {
            addCriterion("txdz between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotBetween(String value1, String value2) {
            addCriterion("txdz not between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("yzbm is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("yzbm is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("yzbm =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("yzbm <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("yzbm >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("yzbm >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("yzbm <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("yzbm <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("yzbm like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("yzbm not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("yzbm in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("yzbm not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("yzbm between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("yzbm not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("lxdh is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("lxdh =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("lxdh <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("lxdh >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxdh >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("lxdh <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("lxdh <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("lxdh like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("lxdh not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("lxdh in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("lxdh not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("lxdh between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("lxdh not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andYddhIsNull() {
            addCriterion("yddh is null");
            return (Criteria) this;
        }

        public Criteria andYddhIsNotNull() {
            addCriterion("yddh is not null");
            return (Criteria) this;
        }

        public Criteria andYddhEqualTo(String value) {
            addCriterion("yddh =", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotEqualTo(String value) {
            addCriterion("yddh <>", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhGreaterThan(String value) {
            addCriterion("yddh >", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhGreaterThanOrEqualTo(String value) {
            addCriterion("yddh >=", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLessThan(String value) {
            addCriterion("yddh <", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLessThanOrEqualTo(String value) {
            addCriterion("yddh <=", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhLike(String value) {
            addCriterion("yddh like", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotLike(String value) {
            addCriterion("yddh not like", value, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhIn(List<String> values) {
            addCriterion("yddh in", values, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotIn(List<String> values) {
            addCriterion("yddh not in", values, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhBetween(String value1, String value2) {
            addCriterion("yddh between", value1, value2, "yddh");
            return (Criteria) this;
        }

        public Criteria andYddhNotBetween(String value1, String value2) {
            addCriterion("yddh not between", value1, value2, "yddh");
            return (Criteria) this;
        }

        public Criteria andDzxxIsNull() {
            addCriterion("dzxx is null");
            return (Criteria) this;
        }

        public Criteria andDzxxIsNotNull() {
            addCriterion("dzxx is not null");
            return (Criteria) this;
        }

        public Criteria andDzxxEqualTo(String value) {
            addCriterion("dzxx =", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotEqualTo(String value) {
            addCriterion("dzxx <>", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxGreaterThan(String value) {
            addCriterion("dzxx >", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxGreaterThanOrEqualTo(String value) {
            addCriterion("dzxx >=", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLessThan(String value) {
            addCriterion("dzxx <", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLessThanOrEqualTo(String value) {
            addCriterion("dzxx <=", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxLike(String value) {
            addCriterion("dzxx like", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotLike(String value) {
            addCriterion("dzxx not like", value, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxIn(List<String> values) {
            addCriterion("dzxx in", values, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotIn(List<String> values) {
            addCriterion("dzxx not in", values, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxBetween(String value1, String value2) {
            addCriterion("dzxx between", value1, value2, "dzxx");
            return (Criteria) this;
        }

        public Criteria andDzxxNotBetween(String value1, String value2) {
            addCriterion("dzxx not between", value1, value2, "dzxx");
            return (Criteria) this;
        }

        public Criteria andBydwmIsNull() {
            addCriterion("bydwm is null");
            return (Criteria) this;
        }

        public Criteria andBydwmIsNotNull() {
            addCriterion("bydwm is not null");
            return (Criteria) this;
        }

        public Criteria andBydwmEqualTo(String value) {
            addCriterion("bydwm =", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmNotEqualTo(String value) {
            addCriterion("bydwm <>", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmGreaterThan(String value) {
            addCriterion("bydwm >", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmGreaterThanOrEqualTo(String value) {
            addCriterion("bydwm >=", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmLessThan(String value) {
            addCriterion("bydwm <", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmLessThanOrEqualTo(String value) {
            addCriterion("bydwm <=", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmLike(String value) {
            addCriterion("bydwm like", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmNotLike(String value) {
            addCriterion("bydwm not like", value, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmIn(List<String> values) {
            addCriterion("bydwm in", values, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmNotIn(List<String> values) {
            addCriterion("bydwm not in", values, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmBetween(String value1, String value2) {
            addCriterion("bydwm between", value1, value2, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwmNotBetween(String value1, String value2) {
            addCriterion("bydwm not between", value1, value2, "bydwm");
            return (Criteria) this;
        }

        public Criteria andBydwIsNull() {
            addCriterion("bydw is null");
            return (Criteria) this;
        }

        public Criteria andBydwIsNotNull() {
            addCriterion("bydw is not null");
            return (Criteria) this;
        }

        public Criteria andBydwEqualTo(String value) {
            addCriterion("bydw =", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwNotEqualTo(String value) {
            addCriterion("bydw <>", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwGreaterThan(String value) {
            addCriterion("bydw >", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwGreaterThanOrEqualTo(String value) {
            addCriterion("bydw >=", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwLessThan(String value) {
            addCriterion("bydw <", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwLessThanOrEqualTo(String value) {
            addCriterion("bydw <=", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwLike(String value) {
            addCriterion("bydw like", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwNotLike(String value) {
            addCriterion("bydw not like", value, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwIn(List<String> values) {
            addCriterion("bydw in", values, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwNotIn(List<String> values) {
            addCriterion("bydw not in", values, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwBetween(String value1, String value2) {
            addCriterion("bydw between", value1, value2, "bydw");
            return (Criteria) this;
        }

        public Criteria andBydwNotBetween(String value1, String value2) {
            addCriterion("bydw not between", value1, value2, "bydw");
            return (Criteria) this;
        }

        public Criteria andByzydmIsNull() {
            addCriterion("byzydm is null");
            return (Criteria) this;
        }

        public Criteria andByzydmIsNotNull() {
            addCriterion("byzydm is not null");
            return (Criteria) this;
        }

        public Criteria andByzydmEqualTo(String value) {
            addCriterion("byzydm =", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmNotEqualTo(String value) {
            addCriterion("byzydm <>", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmGreaterThan(String value) {
            addCriterion("byzydm >", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmGreaterThanOrEqualTo(String value) {
            addCriterion("byzydm >=", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmLessThan(String value) {
            addCriterion("byzydm <", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmLessThanOrEqualTo(String value) {
            addCriterion("byzydm <=", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmLike(String value) {
            addCriterion("byzydm like", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmNotLike(String value) {
            addCriterion("byzydm not like", value, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmIn(List<String> values) {
            addCriterion("byzydm in", values, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmNotIn(List<String> values) {
            addCriterion("byzydm not in", values, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmBetween(String value1, String value2) {
            addCriterion("byzydm between", value1, value2, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzydmNotBetween(String value1, String value2) {
            addCriterion("byzydm not between", value1, value2, "byzydm");
            return (Criteria) this;
        }

        public Criteria andByzymcIsNull() {
            addCriterion("byzymc is null");
            return (Criteria) this;
        }

        public Criteria andByzymcIsNotNull() {
            addCriterion("byzymc is not null");
            return (Criteria) this;
        }

        public Criteria andByzymcEqualTo(String value) {
            addCriterion("byzymc =", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcNotEqualTo(String value) {
            addCriterion("byzymc <>", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcGreaterThan(String value) {
            addCriterion("byzymc >", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcGreaterThanOrEqualTo(String value) {
            addCriterion("byzymc >=", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcLessThan(String value) {
            addCriterion("byzymc <", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcLessThanOrEqualTo(String value) {
            addCriterion("byzymc <=", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcLike(String value) {
            addCriterion("byzymc like", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcNotLike(String value) {
            addCriterion("byzymc not like", value, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcIn(List<String> values) {
            addCriterion("byzymc in", values, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcNotIn(List<String> values) {
            addCriterion("byzymc not in", values, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcBetween(String value1, String value2) {
            addCriterion("byzymc between", value1, value2, "byzymc");
            return (Criteria) this;
        }

        public Criteria andByzymcNotBetween(String value1, String value2) {
            addCriterion("byzymc not between", value1, value2, "byzymc");
            return (Criteria) this;
        }

        public Criteria andXxxsIsNull() {
            addCriterion("xxxs is null");
            return (Criteria) this;
        }

        public Criteria andXxxsIsNotNull() {
            addCriterion("xxxs is not null");
            return (Criteria) this;
        }

        public Criteria andXxxsEqualTo(String value) {
            addCriterion("xxxs =", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotEqualTo(String value) {
            addCriterion("xxxs <>", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsGreaterThan(String value) {
            addCriterion("xxxs >", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsGreaterThanOrEqualTo(String value) {
            addCriterion("xxxs >=", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLessThan(String value) {
            addCriterion("xxxs <", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLessThanOrEqualTo(String value) {
            addCriterion("xxxs <=", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsLike(String value) {
            addCriterion("xxxs like", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotLike(String value) {
            addCriterion("xxxs not like", value, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsIn(List<String> values) {
            addCriterion("xxxs in", values, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotIn(List<String> values) {
            addCriterion("xxxs not in", values, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsBetween(String value1, String value2) {
            addCriterion("xxxs between", value1, value2, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXxxsNotBetween(String value1, String value2) {
            addCriterion("xxxs not between", value1, value2, "xxxs");
            return (Criteria) this;
        }

        public Criteria andXlmIsNull() {
            addCriterion("xlm is null");
            return (Criteria) this;
        }

        public Criteria andXlmIsNotNull() {
            addCriterion("xlm is not null");
            return (Criteria) this;
        }

        public Criteria andXlmEqualTo(String value) {
            addCriterion("xlm =", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmNotEqualTo(String value) {
            addCriterion("xlm <>", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmGreaterThan(String value) {
            addCriterion("xlm >", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmGreaterThanOrEqualTo(String value) {
            addCriterion("xlm >=", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmLessThan(String value) {
            addCriterion("xlm <", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmLessThanOrEqualTo(String value) {
            addCriterion("xlm <=", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmLike(String value) {
            addCriterion("xlm like", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmNotLike(String value) {
            addCriterion("xlm not like", value, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmIn(List<String> values) {
            addCriterion("xlm in", values, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmNotIn(List<String> values) {
            addCriterion("xlm not in", values, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmBetween(String value1, String value2) {
            addCriterion("xlm between", value1, value2, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlmNotBetween(String value1, String value2) {
            addCriterion("xlm not between", value1, value2, "xlm");
            return (Criteria) this;
        }

        public Criteria andXlzsbhIsNull() {
            addCriterion("xlzsbh is null");
            return (Criteria) this;
        }

        public Criteria andXlzsbhIsNotNull() {
            addCriterion("xlzsbh is not null");
            return (Criteria) this;
        }

        public Criteria andXlzsbhEqualTo(String value) {
            addCriterion("xlzsbh =", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhNotEqualTo(String value) {
            addCriterion("xlzsbh <>", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhGreaterThan(String value) {
            addCriterion("xlzsbh >", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhGreaterThanOrEqualTo(String value) {
            addCriterion("xlzsbh >=", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhLessThan(String value) {
            addCriterion("xlzsbh <", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhLessThanOrEqualTo(String value) {
            addCriterion("xlzsbh <=", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhLike(String value) {
            addCriterion("xlzsbh like", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhNotLike(String value) {
            addCriterion("xlzsbh not like", value, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhIn(List<String> values) {
            addCriterion("xlzsbh in", values, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhNotIn(List<String> values) {
            addCriterion("xlzsbh not in", values, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhBetween(String value1, String value2) {
            addCriterion("xlzsbh between", value1, value2, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andXlzsbhNotBetween(String value1, String value2) {
            addCriterion("xlzsbh not between", value1, value2, "xlzsbh");
            return (Criteria) this;
        }

        public Criteria andBynyIsNull() {
            addCriterion("byny is null");
            return (Criteria) this;
        }

        public Criteria andBynyIsNotNull() {
            addCriterion("byny is not null");
            return (Criteria) this;
        }

        public Criteria andBynyEqualTo(String value) {
            addCriterion("byny =", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyNotEqualTo(String value) {
            addCriterion("byny <>", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyGreaterThan(String value) {
            addCriterion("byny >", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyGreaterThanOrEqualTo(String value) {
            addCriterion("byny >=", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyLessThan(String value) {
            addCriterion("byny <", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyLessThanOrEqualTo(String value) {
            addCriterion("byny <=", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyLike(String value) {
            addCriterion("byny like", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyNotLike(String value) {
            addCriterion("byny not like", value, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyIn(List<String> values) {
            addCriterion("byny in", values, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyNotIn(List<String> values) {
            addCriterion("byny not in", values, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyBetween(String value1, String value2) {
            addCriterion("byny between", value1, value2, "byny");
            return (Criteria) this;
        }

        public Criteria andBynyNotBetween(String value1, String value2) {
            addCriterion("byny not between", value1, value2, "byny");
            return (Criteria) this;
        }

        public Criteria andZcxhIsNull() {
            addCriterion("zcxh is null");
            return (Criteria) this;
        }

        public Criteria andZcxhIsNotNull() {
            addCriterion("zcxh is not null");
            return (Criteria) this;
        }

        public Criteria andZcxhEqualTo(String value) {
            addCriterion("zcxh =", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhNotEqualTo(String value) {
            addCriterion("zcxh <>", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhGreaterThan(String value) {
            addCriterion("zcxh >", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhGreaterThanOrEqualTo(String value) {
            addCriterion("zcxh >=", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhLessThan(String value) {
            addCriterion("zcxh <", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhLessThanOrEqualTo(String value) {
            addCriterion("zcxh <=", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhLike(String value) {
            addCriterion("zcxh like", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhNotLike(String value) {
            addCriterion("zcxh not like", value, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhIn(List<String> values) {
            addCriterion("zcxh in", values, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhNotIn(List<String> values) {
            addCriterion("zcxh not in", values, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhBetween(String value1, String value2) {
            addCriterion("zcxh between", value1, value2, "zcxh");
            return (Criteria) this;
        }

        public Criteria andZcxhNotBetween(String value1, String value2) {
            addCriterion("zcxh not between", value1, value2, "zcxh");
            return (Criteria) this;
        }

        public Criteria andXwmIsNull() {
            addCriterion("xwm is null");
            return (Criteria) this;
        }

        public Criteria andXwmIsNotNull() {
            addCriterion("xwm is not null");
            return (Criteria) this;
        }

        public Criteria andXwmEqualTo(String value) {
            addCriterion("xwm =", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmNotEqualTo(String value) {
            addCriterion("xwm <>", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmGreaterThan(String value) {
            addCriterion("xwm >", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmGreaterThanOrEqualTo(String value) {
            addCriterion("xwm >=", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmLessThan(String value) {
            addCriterion("xwm <", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmLessThanOrEqualTo(String value) {
            addCriterion("xwm <=", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmLike(String value) {
            addCriterion("xwm like", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmNotLike(String value) {
            addCriterion("xwm not like", value, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmIn(List<String> values) {
            addCriterion("xwm in", values, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmNotIn(List<String> values) {
            addCriterion("xwm not in", values, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmBetween(String value1, String value2) {
            addCriterion("xwm between", value1, value2, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwmNotBetween(String value1, String value2) {
            addCriterion("xwm not between", value1, value2, "xwm");
            return (Criteria) this;
        }

        public Criteria andXwzsbhIsNull() {
            addCriterion("xwzsbh is null");
            return (Criteria) this;
        }

        public Criteria andXwzsbhIsNotNull() {
            addCriterion("xwzsbh is not null");
            return (Criteria) this;
        }

        public Criteria andXwzsbhEqualTo(String value) {
            addCriterion("xwzsbh =", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhNotEqualTo(String value) {
            addCriterion("xwzsbh <>", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhGreaterThan(String value) {
            addCriterion("xwzsbh >", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhGreaterThanOrEqualTo(String value) {
            addCriterion("xwzsbh >=", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhLessThan(String value) {
            addCriterion("xwzsbh <", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhLessThanOrEqualTo(String value) {
            addCriterion("xwzsbh <=", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhLike(String value) {
            addCriterion("xwzsbh like", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhNotLike(String value) {
            addCriterion("xwzsbh not like", value, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhIn(List<String> values) {
            addCriterion("xwzsbh in", values, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhNotIn(List<String> values) {
            addCriterion("xwzsbh not in", values, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhBetween(String value1, String value2) {
            addCriterion("xwzsbh between", value1, value2, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andXwzsbhNotBetween(String value1, String value2) {
            addCriterion("xwzsbh not between", value1, value2, "xwzsbh");
            return (Criteria) this;
        }

        public Criteria andBkdwdmIsNull() {
            addCriterion("bkdwdm is null");
            return (Criteria) this;
        }

        public Criteria andBkdwdmIsNotNull() {
            addCriterion("bkdwdm is not null");
            return (Criteria) this;
        }

        public Criteria andBkdwdmEqualTo(String value) {
            addCriterion("bkdwdm =", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmNotEqualTo(String value) {
            addCriterion("bkdwdm <>", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmGreaterThan(String value) {
            addCriterion("bkdwdm >", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmGreaterThanOrEqualTo(String value) {
            addCriterion("bkdwdm >=", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmLessThan(String value) {
            addCriterion("bkdwdm <", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmLessThanOrEqualTo(String value) {
            addCriterion("bkdwdm <=", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmLike(String value) {
            addCriterion("bkdwdm like", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmNotLike(String value) {
            addCriterion("bkdwdm not like", value, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmIn(List<String> values) {
            addCriterion("bkdwdm in", values, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmNotIn(List<String> values) {
            addCriterion("bkdwdm not in", values, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmBetween(String value1, String value2) {
            addCriterion("bkdwdm between", value1, value2, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andBkdwdmNotBetween(String value1, String value2) {
            addCriterion("bkdwdm not between", value1, value2, "bkdwdm");
            return (Criteria) this;
        }

        public Criteria andZxjhIsNull() {
            addCriterion("zxjh is null");
            return (Criteria) this;
        }

        public Criteria andZxjhIsNotNull() {
            addCriterion("zxjh is not null");
            return (Criteria) this;
        }

        public Criteria andZxjhEqualTo(String value) {
            addCriterion("zxjh =", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhNotEqualTo(String value) {
            addCriterion("zxjh <>", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhGreaterThan(String value) {
            addCriterion("zxjh >", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhGreaterThanOrEqualTo(String value) {
            addCriterion("zxjh >=", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhLessThan(String value) {
            addCriterion("zxjh <", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhLessThanOrEqualTo(String value) {
            addCriterion("zxjh <=", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhLike(String value) {
            addCriterion("zxjh like", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhNotLike(String value) {
            addCriterion("zxjh not like", value, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhIn(List<String> values) {
            addCriterion("zxjh in", values, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhNotIn(List<String> values) {
            addCriterion("zxjh not in", values, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhBetween(String value1, String value2) {
            addCriterion("zxjh between", value1, value2, "zxjh");
            return (Criteria) this;
        }

        public Criteria andZxjhNotBetween(String value1, String value2) {
            addCriterion("zxjh not between", value1, value2, "zxjh");
            return (Criteria) this;
        }

        public Criteria andBklbmIsNull() {
            addCriterion("bklbm is null");
            return (Criteria) this;
        }

        public Criteria andBklbmIsNotNull() {
            addCriterion("bklbm is not null");
            return (Criteria) this;
        }

        public Criteria andBklbmEqualTo(String value) {
            addCriterion("bklbm =", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmNotEqualTo(String value) {
            addCriterion("bklbm <>", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmGreaterThan(String value) {
            addCriterion("bklbm >", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmGreaterThanOrEqualTo(String value) {
            addCriterion("bklbm >=", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmLessThan(String value) {
            addCriterion("bklbm <", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmLessThanOrEqualTo(String value) {
            addCriterion("bklbm <=", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmLike(String value) {
            addCriterion("bklbm like", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmNotLike(String value) {
            addCriterion("bklbm not like", value, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmIn(List<String> values) {
            addCriterion("bklbm in", values, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmNotIn(List<String> values) {
            addCriterion("bklbm not in", values, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmBetween(String value1, String value2) {
            addCriterion("bklbm between", value1, value2, "bklbm");
            return (Criteria) this;
        }

        public Criteria andBklbmNotBetween(String value1, String value2) {
            addCriterion("bklbm not between", value1, value2, "bklbm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmIsNull() {
            addCriterion("dxwpdwszdm is null");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmIsNotNull() {
            addCriterion("dxwpdwszdm is not null");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmEqualTo(String value) {
            addCriterion("dxwpdwszdm =", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmNotEqualTo(String value) {
            addCriterion("dxwpdwszdm <>", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmGreaterThan(String value) {
            addCriterion("dxwpdwszdm >", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmGreaterThanOrEqualTo(String value) {
            addCriterion("dxwpdwszdm >=", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmLessThan(String value) {
            addCriterion("dxwpdwszdm <", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmLessThanOrEqualTo(String value) {
            addCriterion("dxwpdwszdm <=", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmLike(String value) {
            addCriterion("dxwpdwszdm like", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmNotLike(String value) {
            addCriterion("dxwpdwszdm not like", value, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmIn(List<String> values) {
            addCriterion("dxwpdwszdm in", values, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmNotIn(List<String> values) {
            addCriterion("dxwpdwszdm not in", values, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmBetween(String value1, String value2) {
            addCriterion("dxwpdwszdm between", value1, value2, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwszdmNotBetween(String value1, String value2) {
            addCriterion("dxwpdwszdm not between", value1, value2, "dxwpdwszdm");
            return (Criteria) this;
        }

        public Criteria andDxwpdwIsNull() {
            addCriterion("dxwpdw is null");
            return (Criteria) this;
        }

        public Criteria andDxwpdwIsNotNull() {
            addCriterion("dxwpdw is not null");
            return (Criteria) this;
        }

        public Criteria andDxwpdwEqualTo(String value) {
            addCriterion("dxwpdw =", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwNotEqualTo(String value) {
            addCriterion("dxwpdw <>", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwGreaterThan(String value) {
            addCriterion("dxwpdw >", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwGreaterThanOrEqualTo(String value) {
            addCriterion("dxwpdw >=", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwLessThan(String value) {
            addCriterion("dxwpdw <", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwLessThanOrEqualTo(String value) {
            addCriterion("dxwpdw <=", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwLike(String value) {
            addCriterion("dxwpdw like", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwNotLike(String value) {
            addCriterion("dxwpdw not like", value, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwIn(List<String> values) {
            addCriterion("dxwpdw in", values, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwNotIn(List<String> values) {
            addCriterion("dxwpdw not in", values, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwBetween(String value1, String value2) {
            addCriterion("dxwpdw between", value1, value2, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andDxwpdwNotBetween(String value1, String value2) {
            addCriterion("dxwpdw not between", value1, value2, "dxwpdw");
            return (Criteria) this;
        }

        public Criteria andZzllmIsNull() {
            addCriterion("zzllm is null");
            return (Criteria) this;
        }

        public Criteria andZzllmIsNotNull() {
            addCriterion("zzllm is not null");
            return (Criteria) this;
        }

        public Criteria andZzllmEqualTo(String value) {
            addCriterion("zzllm =", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmNotEqualTo(String value) {
            addCriterion("zzllm <>", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmGreaterThan(String value) {
            addCriterion("zzllm >", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmGreaterThanOrEqualTo(String value) {
            addCriterion("zzllm >=", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmLessThan(String value) {
            addCriterion("zzllm <", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmLessThanOrEqualTo(String value) {
            addCriterion("zzllm <=", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmLike(String value) {
            addCriterion("zzllm like", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmNotLike(String value) {
            addCriterion("zzllm not like", value, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmIn(List<String> values) {
            addCriterion("zzllm in", values, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmNotIn(List<String> values) {
            addCriterion("zzllm not in", values, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmBetween(String value1, String value2) {
            addCriterion("zzllm between", value1, value2, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmNotBetween(String value1, String value2) {
            addCriterion("zzllm not between", value1, value2, "zzllm");
            return (Criteria) this;
        }

        public Criteria andZzllmcIsNull() {
            addCriterion("zzllmc is null");
            return (Criteria) this;
        }

        public Criteria andZzllmcIsNotNull() {
            addCriterion("zzllmc is not null");
            return (Criteria) this;
        }

        public Criteria andZzllmcEqualTo(String value) {
            addCriterion("zzllmc =", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcNotEqualTo(String value) {
            addCriterion("zzllmc <>", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcGreaterThan(String value) {
            addCriterion("zzllmc >", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcGreaterThanOrEqualTo(String value) {
            addCriterion("zzllmc >=", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcLessThan(String value) {
            addCriterion("zzllmc <", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcLessThanOrEqualTo(String value) {
            addCriterion("zzllmc <=", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcLike(String value) {
            addCriterion("zzllmc like", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcNotLike(String value) {
            addCriterion("zzllmc not like", value, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcIn(List<String> values) {
            addCriterion("zzllmc in", values, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcNotIn(List<String> values) {
            addCriterion("zzllmc not in", values, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcBetween(String value1, String value2) {
            addCriterion("zzllmc between", value1, value2, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andZzllmcNotBetween(String value1, String value2) {
            addCriterion("zzllmc not between", value1, value2, "zzllmc");
            return (Criteria) this;
        }

        public Criteria andWgymIsNull() {
            addCriterion("wgym is null");
            return (Criteria) this;
        }

        public Criteria andWgymIsNotNull() {
            addCriterion("wgym is not null");
            return (Criteria) this;
        }

        public Criteria andWgymEqualTo(String value) {
            addCriterion("wgym =", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymNotEqualTo(String value) {
            addCriterion("wgym <>", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymGreaterThan(String value) {
            addCriterion("wgym >", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymGreaterThanOrEqualTo(String value) {
            addCriterion("wgym >=", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymLessThan(String value) {
            addCriterion("wgym <", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymLessThanOrEqualTo(String value) {
            addCriterion("wgym <=", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymLike(String value) {
            addCriterion("wgym like", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymNotLike(String value) {
            addCriterion("wgym not like", value, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymIn(List<String> values) {
            addCriterion("wgym in", values, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymNotIn(List<String> values) {
            addCriterion("wgym not in", values, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymBetween(String value1, String value2) {
            addCriterion("wgym between", value1, value2, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymNotBetween(String value1, String value2) {
            addCriterion("wgym not between", value1, value2, "wgym");
            return (Criteria) this;
        }

        public Criteria andWgymcIsNull() {
            addCriterion("wgymc is null");
            return (Criteria) this;
        }

        public Criteria andWgymcIsNotNull() {
            addCriterion("wgymc is not null");
            return (Criteria) this;
        }

        public Criteria andWgymcEqualTo(String value) {
            addCriterion("wgymc =", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcNotEqualTo(String value) {
            addCriterion("wgymc <>", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcGreaterThan(String value) {
            addCriterion("wgymc >", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcGreaterThanOrEqualTo(String value) {
            addCriterion("wgymc >=", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcLessThan(String value) {
            addCriterion("wgymc <", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcLessThanOrEqualTo(String value) {
            addCriterion("wgymc <=", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcLike(String value) {
            addCriterion("wgymc like", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcNotLike(String value) {
            addCriterion("wgymc not like", value, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcIn(List<String> values) {
            addCriterion("wgymc in", values, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcNotIn(List<String> values) {
            addCriterion("wgymc not in", values, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcBetween(String value1, String value2) {
            addCriterion("wgymc between", value1, value2, "wgymc");
            return (Criteria) this;
        }

        public Criteria andWgymcNotBetween(String value1, String value2) {
            addCriterion("wgymc not between", value1, value2, "wgymc");
            return (Criteria) this;
        }

        public Criteria andYwk1mIsNull() {
            addCriterion("ywk1m is null");
            return (Criteria) this;
        }

        public Criteria andYwk1mIsNotNull() {
            addCriterion("ywk1m is not null");
            return (Criteria) this;
        }

        public Criteria andYwk1mEqualTo(String value) {
            addCriterion("ywk1m =", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mNotEqualTo(String value) {
            addCriterion("ywk1m <>", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mGreaterThan(String value) {
            addCriterion("ywk1m >", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mGreaterThanOrEqualTo(String value) {
            addCriterion("ywk1m >=", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mLessThan(String value) {
            addCriterion("ywk1m <", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mLessThanOrEqualTo(String value) {
            addCriterion("ywk1m <=", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mLike(String value) {
            addCriterion("ywk1m like", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mNotLike(String value) {
            addCriterion("ywk1m not like", value, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mIn(List<String> values) {
            addCriterion("ywk1m in", values, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mNotIn(List<String> values) {
            addCriterion("ywk1m not in", values, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mBetween(String value1, String value2) {
            addCriterion("ywk1m between", value1, value2, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mNotBetween(String value1, String value2) {
            addCriterion("ywk1m not between", value1, value2, "ywk1m");
            return (Criteria) this;
        }

        public Criteria andYwk1mcIsNull() {
            addCriterion("ywk1mc is null");
            return (Criteria) this;
        }

        public Criteria andYwk1mcIsNotNull() {
            addCriterion("ywk1mc is not null");
            return (Criteria) this;
        }

        public Criteria andYwk1mcEqualTo(String value) {
            addCriterion("ywk1mc =", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcNotEqualTo(String value) {
            addCriterion("ywk1mc <>", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcGreaterThan(String value) {
            addCriterion("ywk1mc >", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcGreaterThanOrEqualTo(String value) {
            addCriterion("ywk1mc >=", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcLessThan(String value) {
            addCriterion("ywk1mc <", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcLessThanOrEqualTo(String value) {
            addCriterion("ywk1mc <=", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcLike(String value) {
            addCriterion("ywk1mc like", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcNotLike(String value) {
            addCriterion("ywk1mc not like", value, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcIn(List<String> values) {
            addCriterion("ywk1mc in", values, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcNotIn(List<String> values) {
            addCriterion("ywk1mc not in", values, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcBetween(String value1, String value2) {
            addCriterion("ywk1mc between", value1, value2, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk1mcNotBetween(String value1, String value2) {
            addCriterion("ywk1mc not between", value1, value2, "ywk1mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mIsNull() {
            addCriterion("ywk2m is null");
            return (Criteria) this;
        }

        public Criteria andYwk2mIsNotNull() {
            addCriterion("ywk2m is not null");
            return (Criteria) this;
        }

        public Criteria andYwk2mEqualTo(String value) {
            addCriterion("ywk2m =", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mNotEqualTo(String value) {
            addCriterion("ywk2m <>", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mGreaterThan(String value) {
            addCriterion("ywk2m >", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mGreaterThanOrEqualTo(String value) {
            addCriterion("ywk2m >=", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mLessThan(String value) {
            addCriterion("ywk2m <", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mLessThanOrEqualTo(String value) {
            addCriterion("ywk2m <=", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mLike(String value) {
            addCriterion("ywk2m like", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mNotLike(String value) {
            addCriterion("ywk2m not like", value, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mIn(List<String> values) {
            addCriterion("ywk2m in", values, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mNotIn(List<String> values) {
            addCriterion("ywk2m not in", values, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mBetween(String value1, String value2) {
            addCriterion("ywk2m between", value1, value2, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mNotBetween(String value1, String value2) {
            addCriterion("ywk2m not between", value1, value2, "ywk2m");
            return (Criteria) this;
        }

        public Criteria andYwk2mcIsNull() {
            addCriterion("ywk2mc is null");
            return (Criteria) this;
        }

        public Criteria andYwk2mcIsNotNull() {
            addCriterion("ywk2mc is not null");
            return (Criteria) this;
        }

        public Criteria andYwk2mcEqualTo(String value) {
            addCriterion("ywk2mc =", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcNotEqualTo(String value) {
            addCriterion("ywk2mc <>", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcGreaterThan(String value) {
            addCriterion("ywk2mc >", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcGreaterThanOrEqualTo(String value) {
            addCriterion("ywk2mc >=", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcLessThan(String value) {
            addCriterion("ywk2mc <", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcLessThanOrEqualTo(String value) {
            addCriterion("ywk2mc <=", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcLike(String value) {
            addCriterion("ywk2mc like", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcNotLike(String value) {
            addCriterion("ywk2mc not like", value, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcIn(List<String> values) {
            addCriterion("ywk2mc in", values, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcNotIn(List<String> values) {
            addCriterion("ywk2mc not in", values, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcBetween(String value1, String value2) {
            addCriterion("ywk2mc between", value1, value2, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andYwk2mcNotBetween(String value1, String value2) {
            addCriterion("ywk2mc not between", value1, value2, "ywk2mc");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhIsNull() {
            addCriterion("rwpzsbh is null");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhIsNotNull() {
            addCriterion("rwpzsbh is not null");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhEqualTo(String value) {
            addCriterion("rwpzsbh =", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhNotEqualTo(String value) {
            addCriterion("rwpzsbh <>", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhGreaterThan(String value) {
            addCriterion("rwpzsbh >", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhGreaterThanOrEqualTo(String value) {
            addCriterion("rwpzsbh >=", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhLessThan(String value) {
            addCriterion("rwpzsbh <", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhLessThanOrEqualTo(String value) {
            addCriterion("rwpzsbh <=", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhLike(String value) {
            addCriterion("rwpzsbh like", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhNotLike(String value) {
            addCriterion("rwpzsbh not like", value, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhIn(List<String> values) {
            addCriterion("rwpzsbh in", values, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhNotIn(List<String> values) {
            addCriterion("rwpzsbh not in", values, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhBetween(String value1, String value2) {
            addCriterion("rwpzsbh between", value1, value2, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andRwpzsbhNotBetween(String value1, String value2) {
            addCriterion("rwpzsbh not between", value1, value2, "rwpzsbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhIsNull() {
            addCriterion("tcxyzbh is null");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhIsNotNull() {
            addCriterion("tcxyzbh is not null");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhEqualTo(String value) {
            addCriterion("tcxyzbh =", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhNotEqualTo(String value) {
            addCriterion("tcxyzbh <>", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhGreaterThan(String value) {
            addCriterion("tcxyzbh >", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhGreaterThanOrEqualTo(String value) {
            addCriterion("tcxyzbh >=", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhLessThan(String value) {
            addCriterion("tcxyzbh <", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhLessThanOrEqualTo(String value) {
            addCriterion("tcxyzbh <=", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhLike(String value) {
            addCriterion("tcxyzbh like", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhNotLike(String value) {
            addCriterion("tcxyzbh not like", value, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhIn(List<String> values) {
            addCriterion("tcxyzbh in", values, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhNotIn(List<String> values) {
            addCriterion("tcxyzbh not in", values, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhBetween(String value1, String value2) {
            addCriterion("tcxyzbh between", value1, value2, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andTcxyzbhNotBetween(String value1, String value2) {
            addCriterion("tcxyzbh not between", value1, value2, "tcxyzbh");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyIsNull() {
            addCriterion("rwqrxny is null");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyIsNotNull() {
            addCriterion("rwqrxny is not null");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyEqualTo(String value) {
            addCriterion("rwqrxny =", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyNotEqualTo(String value) {
            addCriterion("rwqrxny <>", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyGreaterThan(String value) {
            addCriterion("rwqrxny >", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyGreaterThanOrEqualTo(String value) {
            addCriterion("rwqrxny >=", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyLessThan(String value) {
            addCriterion("rwqrxny <", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyLessThanOrEqualTo(String value) {
            addCriterion("rwqrxny <=", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyLike(String value) {
            addCriterion("rwqrxny like", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyNotLike(String value) {
            addCriterion("rwqrxny not like", value, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyIn(List<String> values) {
            addCriterion("rwqrxny in", values, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyNotIn(List<String> values) {
            addCriterion("rwqrxny not in", values, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyBetween(String value1, String value2) {
            addCriterion("rwqrxny between", value1, value2, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqrxnyNotBetween(String value1, String value2) {
            addCriterion("rwqrxny not between", value1, value2, "rwqrxny");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmIsNull() {
            addCriterion("rwqgxssm is null");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmIsNotNull() {
            addCriterion("rwqgxssm is not null");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmEqualTo(String value) {
            addCriterion("rwqgxssm =", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmNotEqualTo(String value) {
            addCriterion("rwqgxssm <>", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmGreaterThan(String value) {
            addCriterion("rwqgxssm >", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmGreaterThanOrEqualTo(String value) {
            addCriterion("rwqgxssm >=", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmLessThan(String value) {
            addCriterion("rwqgxssm <", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmLessThanOrEqualTo(String value) {
            addCriterion("rwqgxssm <=", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmLike(String value) {
            addCriterion("rwqgxssm like", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmNotLike(String value) {
            addCriterion("rwqgxssm not like", value, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmIn(List<String> values) {
            addCriterion("rwqgxssm in", values, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmNotIn(List<String> values) {
            addCriterion("rwqgxssm not in", values, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmBetween(String value1, String value2) {
            addCriterion("rwqgxssm between", value1, value2, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxssmNotBetween(String value1, String value2) {
            addCriterion("rwqgxssm not between", value1, value2, "rwqgxssm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmIsNull() {
            addCriterion("rwqgxdm is null");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmIsNotNull() {
            addCriterion("rwqgxdm is not null");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmEqualTo(String value) {
            addCriterion("rwqgxdm =", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmNotEqualTo(String value) {
            addCriterion("rwqgxdm <>", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmGreaterThan(String value) {
            addCriterion("rwqgxdm >", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmGreaterThanOrEqualTo(String value) {
            addCriterion("rwqgxdm >=", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmLessThan(String value) {
            addCriterion("rwqgxdm <", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmLessThanOrEqualTo(String value) {
            addCriterion("rwqgxdm <=", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmLike(String value) {
            addCriterion("rwqgxdm like", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmNotLike(String value) {
            addCriterion("rwqgxdm not like", value, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmIn(List<String> values) {
            addCriterion("rwqgxdm in", values, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmNotIn(List<String> values) {
            addCriterion("rwqgxdm not in", values, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmBetween(String value1, String value2) {
            addCriterion("rwqgxdm between", value1, value2, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxdmNotBetween(String value1, String value2) {
            addCriterion("rwqgxdm not between", value1, value2, "rwqgxdm");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcIsNull() {
            addCriterion("rwqgxmc is null");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcIsNotNull() {
            addCriterion("rwqgxmc is not null");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcEqualTo(String value) {
            addCriterion("rwqgxmc =", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcNotEqualTo(String value) {
            addCriterion("rwqgxmc <>", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcGreaterThan(String value) {
            addCriterion("rwqgxmc >", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcGreaterThanOrEqualTo(String value) {
            addCriterion("rwqgxmc >=", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcLessThan(String value) {
            addCriterion("rwqgxmc <", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcLessThanOrEqualTo(String value) {
            addCriterion("rwqgxmc <=", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcLike(String value) {
            addCriterion("rwqgxmc like", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcNotLike(String value) {
            addCriterion("rwqgxmc not like", value, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcIn(List<String> values) {
            addCriterion("rwqgxmc in", values, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcNotIn(List<String> values) {
            addCriterion("rwqgxmc not in", values, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcBetween(String value1, String value2) {
            addCriterion("rwqgxmc between", value1, value2, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqgxmcNotBetween(String value1, String value2) {
            addCriterion("rwqgxmc not between", value1, value2, "rwqgxmc");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsIsNull() {
            addCriterion("rwqxxxs is null");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsIsNotNull() {
            addCriterion("rwqxxxs is not null");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsEqualTo(String value) {
            addCriterion("rwqxxxs =", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsNotEqualTo(String value) {
            addCriterion("rwqxxxs <>", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsGreaterThan(String value) {
            addCriterion("rwqxxxs >", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsGreaterThanOrEqualTo(String value) {
            addCriterion("rwqxxxs >=", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsLessThan(String value) {
            addCriterion("rwqxxxs <", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsLessThanOrEqualTo(String value) {
            addCriterion("rwqxxxs <=", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsLike(String value) {
            addCriterion("rwqxxxs like", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsNotLike(String value) {
            addCriterion("rwqxxxs not like", value, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsIn(List<String> values) {
            addCriterion("rwqxxxs in", values, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsNotIn(List<String> values) {
            addCriterion("rwqxxxs not in", values, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsBetween(String value1, String value2) {
            addCriterion("rwqxxxs between", value1, value2, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqxxxsNotBetween(String value1, String value2) {
            addCriterion("rwqxxxs not between", value1, value2, "rwqxxxs");
            return (Criteria) this;
        }

        public Criteria andRwqzydmIsNull() {
            addCriterion("rwqzydm is null");
            return (Criteria) this;
        }

        public Criteria andRwqzydmIsNotNull() {
            addCriterion("rwqzydm is not null");
            return (Criteria) this;
        }

        public Criteria andRwqzydmEqualTo(String value) {
            addCriterion("rwqzydm =", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmNotEqualTo(String value) {
            addCriterion("rwqzydm <>", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmGreaterThan(String value) {
            addCriterion("rwqzydm >", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmGreaterThanOrEqualTo(String value) {
            addCriterion("rwqzydm >=", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmLessThan(String value) {
            addCriterion("rwqzydm <", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmLessThanOrEqualTo(String value) {
            addCriterion("rwqzydm <=", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmLike(String value) {
            addCriterion("rwqzydm like", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmNotLike(String value) {
            addCriterion("rwqzydm not like", value, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmIn(List<String> values) {
            addCriterion("rwqzydm in", values, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmNotIn(List<String> values) {
            addCriterion("rwqzydm not in", values, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmBetween(String value1, String value2) {
            addCriterion("rwqzydm between", value1, value2, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzydmNotBetween(String value1, String value2) {
            addCriterion("rwqzydm not between", value1, value2, "rwqzydm");
            return (Criteria) this;
        }

        public Criteria andRwqzymcIsNull() {
            addCriterion("rwqzymc is null");
            return (Criteria) this;
        }

        public Criteria andRwqzymcIsNotNull() {
            addCriterion("rwqzymc is not null");
            return (Criteria) this;
        }

        public Criteria andRwqzymcEqualTo(String value) {
            addCriterion("rwqzymc =", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcNotEqualTo(String value) {
            addCriterion("rwqzymc <>", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcGreaterThan(String value) {
            addCriterion("rwqzymc >", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcGreaterThanOrEqualTo(String value) {
            addCriterion("rwqzymc >=", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcLessThan(String value) {
            addCriterion("rwqzymc <", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcLessThanOrEqualTo(String value) {
            addCriterion("rwqzymc <=", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcLike(String value) {
            addCriterion("rwqzymc like", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcNotLike(String value) {
            addCriterion("rwqzymc not like", value, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcIn(List<String> values) {
            addCriterion("rwqzymc in", values, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcNotIn(List<String> values) {
            addCriterion("rwqzymc not in", values, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcBetween(String value1, String value2) {
            addCriterion("rwqzymc between", value1, value2, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqzymcNotBetween(String value1, String value2) {
            addCriterion("rwqzymc not between", value1, value2, "rwqzymc");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhIsNull() {
            addCriterion("rwqxlzsbh is null");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhIsNotNull() {
            addCriterion("rwqxlzsbh is not null");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhEqualTo(String value) {
            addCriterion("rwqxlzsbh =", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhNotEqualTo(String value) {
            addCriterion("rwqxlzsbh <>", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhGreaterThan(String value) {
            addCriterion("rwqxlzsbh >", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhGreaterThanOrEqualTo(String value) {
            addCriterion("rwqxlzsbh >=", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhLessThan(String value) {
            addCriterion("rwqxlzsbh <", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhLessThanOrEqualTo(String value) {
            addCriterion("rwqxlzsbh <=", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhLike(String value) {
            addCriterion("rwqxlzsbh like", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhNotLike(String value) {
            addCriterion("rwqxlzsbh not like", value, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhIn(List<String> values) {
            addCriterion("rwqxlzsbh in", values, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhNotIn(List<String> values) {
            addCriterion("rwqxlzsbh not in", values, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhBetween(String value1, String value2) {
            addCriterion("rwqxlzsbh between", value1, value2, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwqxlzsbhNotBetween(String value1, String value2) {
            addCriterion("rwqxlzsbh not between", value1, value2, "rwqxlzsbh");
            return (Criteria) this;
        }

        public Criteria andRwnyIsNull() {
            addCriterion("rwny is null");
            return (Criteria) this;
        }

        public Criteria andRwnyIsNotNull() {
            addCriterion("rwny is not null");
            return (Criteria) this;
        }

        public Criteria andRwnyEqualTo(String value) {
            addCriterion("rwny =", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyNotEqualTo(String value) {
            addCriterion("rwny <>", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyGreaterThan(String value) {
            addCriterion("rwny >", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyGreaterThanOrEqualTo(String value) {
            addCriterion("rwny >=", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyLessThan(String value) {
            addCriterion("rwny <", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyLessThanOrEqualTo(String value) {
            addCriterion("rwny <=", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyLike(String value) {
            addCriterion("rwny like", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyNotLike(String value) {
            addCriterion("rwny not like", value, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyIn(List<String> values) {
            addCriterion("rwny in", values, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyNotIn(List<String> values) {
            addCriterion("rwny not in", values, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyBetween(String value1, String value2) {
            addCriterion("rwny between", value1, value2, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwnyNotBetween(String value1, String value2) {
            addCriterion("rwny not between", value1, value2, "rwny");
            return (Criteria) this;
        }

        public Criteria andRwpzdwIsNull() {
            addCriterion("rwpzdw is null");
            return (Criteria) this;
        }

        public Criteria andRwpzdwIsNotNull() {
            addCriterion("rwpzdw is not null");
            return (Criteria) this;
        }

        public Criteria andRwpzdwEqualTo(String value) {
            addCriterion("rwpzdw =", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwNotEqualTo(String value) {
            addCriterion("rwpzdw <>", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwGreaterThan(String value) {
            addCriterion("rwpzdw >", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwGreaterThanOrEqualTo(String value) {
            addCriterion("rwpzdw >=", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwLessThan(String value) {
            addCriterion("rwpzdw <", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwLessThanOrEqualTo(String value) {
            addCriterion("rwpzdw <=", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwLike(String value) {
            addCriterion("rwpzdw like", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwNotLike(String value) {
            addCriterion("rwpzdw not like", value, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwIn(List<String> values) {
            addCriterion("rwpzdw in", values, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwNotIn(List<String> values) {
            addCriterion("rwpzdw not in", values, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwBetween(String value1, String value2) {
            addCriterion("rwpzdw between", value1, value2, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andRwpzdwNotBetween(String value1, String value2) {
            addCriterion("rwpzdw not between", value1, value2, "rwpzdw");
            return (Criteria) this;
        }

        public Criteria andTynyIsNull() {
            addCriterion("tyny is null");
            return (Criteria) this;
        }

        public Criteria andTynyIsNotNull() {
            addCriterion("tyny is not null");
            return (Criteria) this;
        }

        public Criteria andTynyEqualTo(String value) {
            addCriterion("tyny =", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyNotEqualTo(String value) {
            addCriterion("tyny <>", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyGreaterThan(String value) {
            addCriterion("tyny >", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyGreaterThanOrEqualTo(String value) {
            addCriterion("tyny >=", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyLessThan(String value) {
            addCriterion("tyny <", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyLessThanOrEqualTo(String value) {
            addCriterion("tyny <=", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyLike(String value) {
            addCriterion("tyny like", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyNotLike(String value) {
            addCriterion("tyny not like", value, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyIn(List<String> values) {
            addCriterion("tyny in", values, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyNotIn(List<String> values) {
            addCriterion("tyny not in", values, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyBetween(String value1, String value2) {
            addCriterion("tyny between", value1, value2, "tyny");
            return (Criteria) this;
        }

        public Criteria andTynyNotBetween(String value1, String value2) {
            addCriterion("tyny not between", value1, value2, "tyny");
            return (Criteria) this;
        }

        public Criteria andTypzdwIsNull() {
            addCriterion("typzdw is null");
            return (Criteria) this;
        }

        public Criteria andTypzdwIsNotNull() {
            addCriterion("typzdw is not null");
            return (Criteria) this;
        }

        public Criteria andTypzdwEqualTo(String value) {
            addCriterion("typzdw =", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwNotEqualTo(String value) {
            addCriterion("typzdw <>", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwGreaterThan(String value) {
            addCriterion("typzdw >", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwGreaterThanOrEqualTo(String value) {
            addCriterion("typzdw >=", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwLessThan(String value) {
            addCriterion("typzdw <", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwLessThanOrEqualTo(String value) {
            addCriterion("typzdw <=", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwLike(String value) {
            addCriterion("typzdw like", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwNotLike(String value) {
            addCriterion("typzdw not like", value, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwIn(List<String> values) {
            addCriterion("typzdw in", values, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwNotIn(List<String> values) {
            addCriterion("typzdw not in", values, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwBetween(String value1, String value2) {
            addCriterion("typzdw between", value1, value2, "typzdw");
            return (Criteria) this;
        }

        public Criteria andTypzdwNotBetween(String value1, String value2) {
            addCriterion("typzdw not between", value1, value2, "typzdw");
            return (Criteria) this;
        }

        public Criteria andKyIsNull() {
            addCriterion("ky is null");
            return (Criteria) this;
        }

        public Criteria andKyIsNotNull() {
            addCriterion("ky is not null");
            return (Criteria) this;
        }

        public Criteria andKyEqualTo(Double value) {
            addCriterion("ky =", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyNotEqualTo(Double value) {
            addCriterion("ky <>", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyGreaterThan(Double value) {
            addCriterion("ky >", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyGreaterThanOrEqualTo(Double value) {
            addCriterion("ky >=", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyLessThan(Double value) {
            addCriterion("ky <", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyLessThanOrEqualTo(Double value) {
            addCriterion("ky <=", value, "ky");
            return (Criteria) this;
        }

        public Criteria andKyIn(List<Double> values) {
            addCriterion("ky in", values, "ky");
            return (Criteria) this;
        }

        public Criteria andKyNotIn(List<Double> values) {
            addCriterion("ky not in", values, "ky");
            return (Criteria) this;
        }

        public Criteria andKyBetween(Double value1, Double value2) {
            addCriterion("ky between", value1, value2, "ky");
            return (Criteria) this;
        }

        public Criteria andKyNotBetween(Double value1, Double value2) {
            addCriterion("ky not between", value1, value2, "ky");
            return (Criteria) this;
        }

        public Criteria andBsIsNull() {
            addCriterion("bs is null");
            return (Criteria) this;
        }

        public Criteria andBsIsNotNull() {
            addCriterion("bs is not null");
            return (Criteria) this;
        }

        public Criteria andBsEqualTo(Double value) {
            addCriterion("bs =", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotEqualTo(Double value) {
            addCriterion("bs <>", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsGreaterThan(Double value) {
            addCriterion("bs >", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsGreaterThanOrEqualTo(Double value) {
            addCriterion("bs >=", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsLessThan(Double value) {
            addCriterion("bs <", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsLessThanOrEqualTo(Double value) {
            addCriterion("bs <=", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsIn(List<Double> values) {
            addCriterion("bs in", values, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotIn(List<Double> values) {
            addCriterion("bs not in", values, "bs");
            return (Criteria) this;
        }

        public Criteria andBsBetween(Double value1, Double value2) {
            addCriterion("bs between", value1, value2, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotBetween(Double value1, Double value2) {
            addCriterion("bs not between", value1, value2, "bs");
            return (Criteria) this;
        }

        public Criteria andMsIsNull() {
            addCriterion("ms is null");
            return (Criteria) this;
        }

        public Criteria andMsIsNotNull() {
            addCriterion("ms is not null");
            return (Criteria) this;
        }

        public Criteria andMsEqualTo(Double value) {
            addCriterion("ms =", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotEqualTo(Double value) {
            addCriterion("ms <>", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThan(Double value) {
            addCriterion("ms >", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsGreaterThanOrEqualTo(Double value) {
            addCriterion("ms >=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThan(Double value) {
            addCriterion("ms <", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsLessThanOrEqualTo(Double value) {
            addCriterion("ms <=", value, "ms");
            return (Criteria) this;
        }

        public Criteria andMsIn(List<Double> values) {
            addCriterion("ms in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotIn(List<Double> values) {
            addCriterion("ms not in", values, "ms");
            return (Criteria) this;
        }

        public Criteria andMsBetween(Double value1, Double value2) {
            addCriterion("ms between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andMsNotBetween(Double value1, Double value2) {
            addCriterion("ms not between", value1, value2, "ms");
            return (Criteria) this;
        }

        public Criteria andFsIsNull() {
            addCriterion("fs is null");
            return (Criteria) this;
        }

        public Criteria andFsIsNotNull() {
            addCriterion("fs is not null");
            return (Criteria) this;
        }

        public Criteria andFsEqualTo(Double value) {
            addCriterion("fs =", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotEqualTo(Double value) {
            addCriterion("fs <>", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThan(Double value) {
            addCriterion("fs >", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThanOrEqualTo(Double value) {
            addCriterion("fs >=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThan(Double value) {
            addCriterion("fs <", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThanOrEqualTo(Double value) {
            addCriterion("fs <=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsIn(List<Double> values) {
            addCriterion("fs in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotIn(List<Double> values) {
            addCriterion("fs not in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsBetween(Double value1, Double value2) {
            addCriterion("fs between", value1, value2, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotBetween(Double value1, Double value2) {
            addCriterion("fs not between", value1, value2, "fs");
            return (Criteria) this;
        }

        public Criteria andKslxIsNull() {
            addCriterion("kslx is null");
            return (Criteria) this;
        }

        public Criteria andKslxIsNotNull() {
            addCriterion("kslx is not null");
            return (Criteria) this;
        }

        public Criteria andKslxEqualTo(String value) {
            addCriterion("kslx =", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxNotEqualTo(String value) {
            addCriterion("kslx <>", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxGreaterThan(String value) {
            addCriterion("kslx >", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxGreaterThanOrEqualTo(String value) {
            addCriterion("kslx >=", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxLessThan(String value) {
            addCriterion("kslx <", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxLessThanOrEqualTo(String value) {
            addCriterion("kslx <=", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxLike(String value) {
            addCriterion("kslx like", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxNotLike(String value) {
            addCriterion("kslx not like", value, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxIn(List<String> values) {
            addCriterion("kslx in", values, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxNotIn(List<String> values) {
            addCriterion("kslx not in", values, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxBetween(String value1, String value2) {
            addCriterion("kslx between", value1, value2, "kslx");
            return (Criteria) this;
        }

        public Criteria andKslxNotBetween(String value1, String value2) {
            addCriterion("kslx not between", value1, value2, "kslx");
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