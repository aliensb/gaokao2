package ku6.tv.gaokao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XuexiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XuexiaoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaIsNull() {
            addCriterion("zhaoshengdaima is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaIsNotNull() {
            addCriterion("zhaoshengdaima is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaEqualTo(String value) {
            addCriterion("zhaoshengdaima =", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaNotEqualTo(String value) {
            addCriterion("zhaoshengdaima <>", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaGreaterThan(String value) {
            addCriterion("zhaoshengdaima >", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaGreaterThanOrEqualTo(String value) {
            addCriterion("zhaoshengdaima >=", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaLessThan(String value) {
            addCriterion("zhaoshengdaima <", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaLessThanOrEqualTo(String value) {
            addCriterion("zhaoshengdaima <=", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaLike(String value) {
            addCriterion("zhaoshengdaima like", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaNotLike(String value) {
            addCriterion("zhaoshengdaima not like", value, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaIn(List<String> values) {
            addCriterion("zhaoshengdaima in", values, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaNotIn(List<String> values) {
            addCriterion("zhaoshengdaima not in", values, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaBetween(String value1, String value2) {
            addCriterion("zhaoshengdaima between", value1, value2, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andZhaoshengdaimaNotBetween(String value1, String value2) {
            addCriterion("zhaoshengdaima not between", value1, value2, "zhaoshengdaima");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengIsNull() {
            addCriterion("xuexiaomingcheng is null");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengIsNotNull() {
            addCriterion("xuexiaomingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengEqualTo(String value) {
            addCriterion("xuexiaomingcheng =", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengNotEqualTo(String value) {
            addCriterion("xuexiaomingcheng <>", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengGreaterThan(String value) {
            addCriterion("xuexiaomingcheng >", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengGreaterThanOrEqualTo(String value) {
            addCriterion("xuexiaomingcheng >=", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengLessThan(String value) {
            addCriterion("xuexiaomingcheng <", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengLessThanOrEqualTo(String value) {
            addCriterion("xuexiaomingcheng <=", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengLike(String value) {
            addCriterion("xuexiaomingcheng like", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengNotLike(String value) {
            addCriterion("xuexiaomingcheng not like", value, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengIn(List<String> values) {
            addCriterion("xuexiaomingcheng in", values, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengNotIn(List<String> values) {
            addCriterion("xuexiaomingcheng not in", values, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengBetween(String value1, String value2) {
            addCriterion("xuexiaomingcheng between", value1, value2, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andXuexiaomingchengNotBetween(String value1, String value2) {
            addCriterion("xuexiaomingcheng not between", value1, value2, "xuexiaomingcheng");
            return (Criteria) this;
        }

        public Criteria andDiquIsNull() {
            addCriterion("diqu is null");
            return (Criteria) this;
        }

        public Criteria andDiquIsNotNull() {
            addCriterion("diqu is not null");
            return (Criteria) this;
        }

        public Criteria andDiquEqualTo(String value) {
            addCriterion("diqu =", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotEqualTo(String value) {
            addCriterion("diqu <>", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquGreaterThan(String value) {
            addCriterion("diqu >", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquGreaterThanOrEqualTo(String value) {
            addCriterion("diqu >=", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLessThan(String value) {
            addCriterion("diqu <", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLessThanOrEqualTo(String value) {
            addCriterion("diqu <=", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquLike(String value) {
            addCriterion("diqu like", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotLike(String value) {
            addCriterion("diqu not like", value, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquIn(List<String> values) {
            addCriterion("diqu in", values, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotIn(List<String> values) {
            addCriterion("diqu not in", values, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquBetween(String value1, String value2) {
            addCriterion("diqu between", value1, value2, "diqu");
            return (Criteria) this;
        }

        public Criteria andDiquNotBetween(String value1, String value2) {
            addCriterion("diqu not between", value1, value2, "diqu");
            return (Criteria) this;
        }

        public Criteria andChengshiIsNull() {
            addCriterion("chengshi is null");
            return (Criteria) this;
        }

        public Criteria andChengshiIsNotNull() {
            addCriterion("chengshi is not null");
            return (Criteria) this;
        }

        public Criteria andChengshiEqualTo(String value) {
            addCriterion("chengshi =", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotEqualTo(String value) {
            addCriterion("chengshi <>", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiGreaterThan(String value) {
            addCriterion("chengshi >", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiGreaterThanOrEqualTo(String value) {
            addCriterion("chengshi >=", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLessThan(String value) {
            addCriterion("chengshi <", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLessThanOrEqualTo(String value) {
            addCriterion("chengshi <=", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLike(String value) {
            addCriterion("chengshi like", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotLike(String value) {
            addCriterion("chengshi not like", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiIn(List<String> values) {
            addCriterion("chengshi in", values, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotIn(List<String> values) {
            addCriterion("chengshi not in", values, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiBetween(String value1, String value2) {
            addCriterion("chengshi between", value1, value2, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotBetween(String value1, String value2) {
            addCriterion("chengshi not between", value1, value2, "chengshi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiIsNull() {
            addCriterion("banxuexingzhi is null");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiIsNotNull() {
            addCriterion("banxuexingzhi is not null");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiEqualTo(String value) {
            addCriterion("banxuexingzhi =", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiNotEqualTo(String value) {
            addCriterion("banxuexingzhi <>", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiGreaterThan(String value) {
            addCriterion("banxuexingzhi >", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("banxuexingzhi >=", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiLessThan(String value) {
            addCriterion("banxuexingzhi <", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiLessThanOrEqualTo(String value) {
            addCriterion("banxuexingzhi <=", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiLike(String value) {
            addCriterion("banxuexingzhi like", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiNotLike(String value) {
            addCriterion("banxuexingzhi not like", value, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiIn(List<String> values) {
            addCriterion("banxuexingzhi in", values, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiNotIn(List<String> values) {
            addCriterion("banxuexingzhi not in", values, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiBetween(String value1, String value2) {
            addCriterion("banxuexingzhi between", value1, value2, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andBanxuexingzhiNotBetween(String value1, String value2) {
            addCriterion("banxuexingzhi not between", value1, value2, "banxuexingzhi");
            return (Criteria) this;
        }

        public Criteria andLisuIsNull() {
            addCriterion("lisu is null");
            return (Criteria) this;
        }

        public Criteria andLisuIsNotNull() {
            addCriterion("lisu is not null");
            return (Criteria) this;
        }

        public Criteria andLisuEqualTo(String value) {
            addCriterion("lisu =", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuNotEqualTo(String value) {
            addCriterion("lisu <>", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuGreaterThan(String value) {
            addCriterion("lisu >", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuGreaterThanOrEqualTo(String value) {
            addCriterion("lisu >=", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuLessThan(String value) {
            addCriterion("lisu <", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuLessThanOrEqualTo(String value) {
            addCriterion("lisu <=", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuLike(String value) {
            addCriterion("lisu like", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuNotLike(String value) {
            addCriterion("lisu not like", value, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuIn(List<String> values) {
            addCriterion("lisu in", values, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuNotIn(List<String> values) {
            addCriterion("lisu not in", values, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuBetween(String value1, String value2) {
            addCriterion("lisu between", value1, value2, "lisu");
            return (Criteria) this;
        }

        public Criteria andLisuNotBetween(String value1, String value2) {
            addCriterion("lisu not between", value1, value2, "lisu");
            return (Criteria) this;
        }

        public Criteria andJibieIsNull() {
            addCriterion("jibie is null");
            return (Criteria) this;
        }

        public Criteria andJibieIsNotNull() {
            addCriterion("jibie is not null");
            return (Criteria) this;
        }

        public Criteria andJibieEqualTo(String value) {
            addCriterion("jibie =", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotEqualTo(String value) {
            addCriterion("jibie <>", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieGreaterThan(String value) {
            addCriterion("jibie >", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieGreaterThanOrEqualTo(String value) {
            addCriterion("jibie >=", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieLessThan(String value) {
            addCriterion("jibie <", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieLessThanOrEqualTo(String value) {
            addCriterion("jibie <=", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieLike(String value) {
            addCriterion("jibie like", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotLike(String value) {
            addCriterion("jibie not like", value, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieIn(List<String> values) {
            addCriterion("jibie in", values, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotIn(List<String> values) {
            addCriterion("jibie not in", values, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieBetween(String value1, String value2) {
            addCriterion("jibie between", value1, value2, "jibie");
            return (Criteria) this;
        }

        public Criteria andJibieNotBetween(String value1, String value2) {
            addCriterion("jibie not between", value1, value2, "jibie");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("leixing like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("leixing not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andPaimingIsNull() {
            addCriterion("paiming is null");
            return (Criteria) this;
        }

        public Criteria andPaimingIsNotNull() {
            addCriterion("paiming is not null");
            return (Criteria) this;
        }

        public Criteria andPaimingEqualTo(String value) {
            addCriterion("paiming =", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingNotEqualTo(String value) {
            addCriterion("paiming <>", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingGreaterThan(String value) {
            addCriterion("paiming >", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingGreaterThanOrEqualTo(String value) {
            addCriterion("paiming >=", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingLessThan(String value) {
            addCriterion("paiming <", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingLessThanOrEqualTo(String value) {
            addCriterion("paiming <=", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingLike(String value) {
            addCriterion("paiming like", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingNotLike(String value) {
            addCriterion("paiming not like", value, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingIn(List<String> values) {
            addCriterion("paiming in", values, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingNotIn(List<String> values) {
            addCriterion("paiming not in", values, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingBetween(String value1, String value2) {
            addCriterion("paiming between", value1, value2, "paiming");
            return (Criteria) this;
        }

        public Criteria andPaimingNotBetween(String value1, String value2) {
            addCriterion("paiming not between", value1, value2, "paiming");
            return (Criteria) this;
        }

        public Criteria andWenliIsNull() {
            addCriterion("wenli is null");
            return (Criteria) this;
        }

        public Criteria andWenliIsNotNull() {
            addCriterion("wenli is not null");
            return (Criteria) this;
        }

        public Criteria andWenliEqualTo(String value) {
            addCriterion("wenli =", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliNotEqualTo(String value) {
            addCriterion("wenli <>", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliGreaterThan(String value) {
            addCriterion("wenli >", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliGreaterThanOrEqualTo(String value) {
            addCriterion("wenli >=", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliLessThan(String value) {
            addCriterion("wenli <", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliLessThanOrEqualTo(String value) {
            addCriterion("wenli <=", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliLike(String value) {
            addCriterion("wenli like", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliNotLike(String value) {
            addCriterion("wenli not like", value, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliIn(List<String> values) {
            addCriterion("wenli in", values, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliNotIn(List<String> values) {
            addCriterion("wenli not in", values, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliBetween(String value1, String value2) {
            addCriterion("wenli between", value1, value2, "wenli");
            return (Criteria) this;
        }

        public Criteria andWenliNotBetween(String value1, String value2) {
            addCriterion("wenli not between", value1, value2, "wenli");
            return (Criteria) this;
        }

        public Criteria andPiciIsNull() {
            addCriterion("pici is null");
            return (Criteria) this;
        }

        public Criteria andPiciIsNotNull() {
            addCriterion("pici is not null");
            return (Criteria) this;
        }

        public Criteria andPiciEqualTo(String value) {
            addCriterion("pici =", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciNotEqualTo(String value) {
            addCriterion("pici <>", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciGreaterThan(String value) {
            addCriterion("pici >", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciGreaterThanOrEqualTo(String value) {
            addCriterion("pici >=", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciLessThan(String value) {
            addCriterion("pici <", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciLessThanOrEqualTo(String value) {
            addCriterion("pici <=", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciLike(String value) {
            addCriterion("pici like", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciNotLike(String value) {
            addCriterion("pici not like", value, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciIn(List<String> values) {
            addCriterion("pici in", values, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciNotIn(List<String> values) {
            addCriterion("pici not in", values, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciBetween(String value1, String value2) {
            addCriterion("pici between", value1, value2, "pici");
            return (Criteria) this;
        }

        public Criteria andPiciNotBetween(String value1, String value2) {
            addCriterion("pici not between", value1, value2, "pici");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016IsNull() {
            addCriterion("zhaoshenrenshu2016 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016IsNotNull() {
            addCriterion("zhaoshenrenshu2016 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2016 =", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2016 <>", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2016 >", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2016 >=", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2016 <", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2016 <=", value, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2016 in", values, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2016 not in", values, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2016 between", value1, value2, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2016NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2016 not between", value1, value2, "zhaoshenrenshu2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015IsNull() {
            addCriterion("zhaoshenrenshu2015 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015IsNotNull() {
            addCriterion("zhaoshenrenshu2015 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2015 =", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2015 <>", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2015 >", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2015 >=", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2015 <", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2015 <=", value, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2015 in", values, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2015 not in", values, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2015 between", value1, value2, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2015NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2015 not between", value1, value2, "zhaoshenrenshu2015");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014IsNull() {
            addCriterion("zhaoshenrenshu2014 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014IsNotNull() {
            addCriterion("zhaoshenrenshu2014 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2014 =", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2014 <>", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2014 >", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2014 >=", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2014 <", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2014 <=", value, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2014 in", values, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2014 not in", values, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2014 between", value1, value2, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2014NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2014 not between", value1, value2, "zhaoshenrenshu2014");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013IsNull() {
            addCriterion("zhaoshenrenshu2013 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013IsNotNull() {
            addCriterion("zhaoshenrenshu2013 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2013 =", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2013 <>", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2013 >", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2013 >=", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2013 <", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2013 <=", value, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2013 in", values, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2013 not in", values, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2013 between", value1, value2, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2013NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2013 not between", value1, value2, "zhaoshenrenshu2013");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012IsNull() {
            addCriterion("zhaoshenrenshu2012 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012IsNotNull() {
            addCriterion("zhaoshenrenshu2012 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2012 =", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2012 <>", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2012 >", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2012 >=", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2012 <", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2012 <=", value, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2012 in", values, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2012 not in", values, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2012 between", value1, value2, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2012NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2012 not between", value1, value2, "zhaoshenrenshu2012");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011IsNull() {
            addCriterion("zhaoshenrenshu2011 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011IsNotNull() {
            addCriterion("zhaoshenrenshu2011 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011EqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2011 =", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011NotEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2011 <>", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011GreaterThan(Integer value) {
            addCriterion("zhaoshenrenshu2011 >", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2011 >=", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011LessThan(Integer value) {
            addCriterion("zhaoshenrenshu2011 <", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshenrenshu2011 <=", value, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011In(List<Integer> values) {
            addCriterion("zhaoshenrenshu2011 in", values, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011NotIn(List<Integer> values) {
            addCriterion("zhaoshenrenshu2011 not in", values, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011Between(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2011 between", value1, value2, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andZhaoshenrenshu2011NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshenrenshu2011 not between", value1, value2, "zhaoshenrenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2010IsNull() {
            addCriterion("fenshu2010 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2010IsNotNull() {
            addCriterion("fenshu2010 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2010EqualTo(BigDecimal value) {
            addCriterion("fenshu2010 =", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2010 <>", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010GreaterThan(BigDecimal value) {
            addCriterion("fenshu2010 >", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2010 >=", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010LessThan(BigDecimal value) {
            addCriterion("fenshu2010 <", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2010 <=", value, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010In(List<BigDecimal> values) {
            addCriterion("fenshu2010 in", values, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2010 not in", values, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2010 between", value1, value2, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2010NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2010 not between", value1, value2, "fenshu2010");
            return (Criteria) this;
        }

        public Criteria andFenshu2011IsNull() {
            addCriterion("fenshu2011 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2011IsNotNull() {
            addCriterion("fenshu2011 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2011EqualTo(BigDecimal value) {
            addCriterion("fenshu2011 =", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2011 <>", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011GreaterThan(BigDecimal value) {
            addCriterion("fenshu2011 >", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2011 >=", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011LessThan(BigDecimal value) {
            addCriterion("fenshu2011 <", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2011 <=", value, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011In(List<BigDecimal> values) {
            addCriterion("fenshu2011 in", values, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2011 not in", values, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2011 between", value1, value2, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2011NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2011 not between", value1, value2, "fenshu2011");
            return (Criteria) this;
        }

        public Criteria andFenshu2012IsNull() {
            addCriterion("fenshu2012 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2012IsNotNull() {
            addCriterion("fenshu2012 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2012EqualTo(BigDecimal value) {
            addCriterion("fenshu2012 =", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2012 <>", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012GreaterThan(BigDecimal value) {
            addCriterion("fenshu2012 >", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2012 >=", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012LessThan(BigDecimal value) {
            addCriterion("fenshu2012 <", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2012 <=", value, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012In(List<BigDecimal> values) {
            addCriterion("fenshu2012 in", values, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2012 not in", values, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2012 between", value1, value2, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2012NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2012 not between", value1, value2, "fenshu2012");
            return (Criteria) this;
        }

        public Criteria andFenshu2013IsNull() {
            addCriterion("fenshu2013 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2013IsNotNull() {
            addCriterion("fenshu2013 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2013EqualTo(BigDecimal value) {
            addCriterion("fenshu2013 =", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2013 <>", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013GreaterThan(BigDecimal value) {
            addCriterion("fenshu2013 >", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2013 >=", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013LessThan(BigDecimal value) {
            addCriterion("fenshu2013 <", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2013 <=", value, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013In(List<BigDecimal> values) {
            addCriterion("fenshu2013 in", values, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2013 not in", values, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2013 between", value1, value2, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2013NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2013 not between", value1, value2, "fenshu2013");
            return (Criteria) this;
        }

        public Criteria andFenshu2014IsNull() {
            addCriterion("fenshu2014 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2014IsNotNull() {
            addCriterion("fenshu2014 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2014EqualTo(BigDecimal value) {
            addCriterion("fenshu2014 =", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2014 <>", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014GreaterThan(BigDecimal value) {
            addCriterion("fenshu2014 >", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2014 >=", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014LessThan(BigDecimal value) {
            addCriterion("fenshu2014 <", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2014 <=", value, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014In(List<BigDecimal> values) {
            addCriterion("fenshu2014 in", values, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2014 not in", values, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2014 between", value1, value2, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2014NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2014 not between", value1, value2, "fenshu2014");
            return (Criteria) this;
        }

        public Criteria andFenshu2015IsNull() {
            addCriterion("fenshu2015 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2015IsNotNull() {
            addCriterion("fenshu2015 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2015EqualTo(BigDecimal value) {
            addCriterion("fenshu2015 =", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2015 <>", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015GreaterThan(BigDecimal value) {
            addCriterion("fenshu2015 >", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2015 >=", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015LessThan(BigDecimal value) {
            addCriterion("fenshu2015 <", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2015 <=", value, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015In(List<BigDecimal> values) {
            addCriterion("fenshu2015 in", values, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2015 not in", values, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2015 between", value1, value2, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2015NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2015 not between", value1, value2, "fenshu2015");
            return (Criteria) this;
        }

        public Criteria andFenshu2016IsNull() {
            addCriterion("fenshu2016 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2016IsNotNull() {
            addCriterion("fenshu2016 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2016EqualTo(BigDecimal value) {
            addCriterion("fenshu2016 =", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2016 <>", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016GreaterThan(BigDecimal value) {
            addCriterion("fenshu2016 >", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2016 >=", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016LessThan(BigDecimal value) {
            addCriterion("fenshu2016 <", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2016 <=", value, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016In(List<BigDecimal> values) {
            addCriterion("fenshu2016 in", values, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2016 not in", values, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2016 between", value1, value2, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andFenshu2016NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2016 not between", value1, value2, "fenshu2016");
            return (Criteria) this;
        }

        public Criteria andWeici2011IsNull() {
            addCriterion("weici2011 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2011IsNotNull() {
            addCriterion("weici2011 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2011EqualTo(Integer value) {
            addCriterion("weici2011 =", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011NotEqualTo(Integer value) {
            addCriterion("weici2011 <>", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011GreaterThan(Integer value) {
            addCriterion("weici2011 >", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2011 >=", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011LessThan(Integer value) {
            addCriterion("weici2011 <", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011LessThanOrEqualTo(Integer value) {
            addCriterion("weici2011 <=", value, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011In(List<Integer> values) {
            addCriterion("weici2011 in", values, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011NotIn(List<Integer> values) {
            addCriterion("weici2011 not in", values, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011Between(Integer value1, Integer value2) {
            addCriterion("weici2011 between", value1, value2, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2011NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2011 not between", value1, value2, "weici2011");
            return (Criteria) this;
        }

        public Criteria andWeici2012IsNull() {
            addCriterion("weici2012 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2012IsNotNull() {
            addCriterion("weici2012 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2012EqualTo(Integer value) {
            addCriterion("weici2012 =", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012NotEqualTo(Integer value) {
            addCriterion("weici2012 <>", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012GreaterThan(Integer value) {
            addCriterion("weici2012 >", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2012 >=", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012LessThan(Integer value) {
            addCriterion("weici2012 <", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012LessThanOrEqualTo(Integer value) {
            addCriterion("weici2012 <=", value, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012In(List<Integer> values) {
            addCriterion("weici2012 in", values, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012NotIn(List<Integer> values) {
            addCriterion("weici2012 not in", values, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012Between(Integer value1, Integer value2) {
            addCriterion("weici2012 between", value1, value2, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2012NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2012 not between", value1, value2, "weici2012");
            return (Criteria) this;
        }

        public Criteria andWeici2013IsNull() {
            addCriterion("weici2013 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2013IsNotNull() {
            addCriterion("weici2013 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2013EqualTo(Integer value) {
            addCriterion("weici2013 =", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013NotEqualTo(Integer value) {
            addCriterion("weici2013 <>", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013GreaterThan(Integer value) {
            addCriterion("weici2013 >", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2013 >=", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013LessThan(Integer value) {
            addCriterion("weici2013 <", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013LessThanOrEqualTo(Integer value) {
            addCriterion("weici2013 <=", value, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013In(List<Integer> values) {
            addCriterion("weici2013 in", values, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013NotIn(List<Integer> values) {
            addCriterion("weici2013 not in", values, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013Between(Integer value1, Integer value2) {
            addCriterion("weici2013 between", value1, value2, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2013NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2013 not between", value1, value2, "weici2013");
            return (Criteria) this;
        }

        public Criteria andWeici2014IsNull() {
            addCriterion("weici2014 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2014IsNotNull() {
            addCriterion("weici2014 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2014EqualTo(Integer value) {
            addCriterion("weici2014 =", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014NotEqualTo(Integer value) {
            addCriterion("weici2014 <>", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014GreaterThan(Integer value) {
            addCriterion("weici2014 >", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2014 >=", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014LessThan(Integer value) {
            addCriterion("weici2014 <", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014LessThanOrEqualTo(Integer value) {
            addCriterion("weici2014 <=", value, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014In(List<Integer> values) {
            addCriterion("weici2014 in", values, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014NotIn(List<Integer> values) {
            addCriterion("weici2014 not in", values, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014Between(Integer value1, Integer value2) {
            addCriterion("weici2014 between", value1, value2, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2014NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2014 not between", value1, value2, "weici2014");
            return (Criteria) this;
        }

        public Criteria andWeici2015IsNull() {
            addCriterion("weici2015 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2015IsNotNull() {
            addCriterion("weici2015 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2015EqualTo(Integer value) {
            addCriterion("weici2015 =", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015NotEqualTo(Integer value) {
            addCriterion("weici2015 <>", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015GreaterThan(Integer value) {
            addCriterion("weici2015 >", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2015 >=", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015LessThan(Integer value) {
            addCriterion("weici2015 <", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015LessThanOrEqualTo(Integer value) {
            addCriterion("weici2015 <=", value, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015In(List<Integer> values) {
            addCriterion("weici2015 in", values, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015NotIn(List<Integer> values) {
            addCriterion("weici2015 not in", values, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015Between(Integer value1, Integer value2) {
            addCriterion("weici2015 between", value1, value2, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2015NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2015 not between", value1, value2, "weici2015");
            return (Criteria) this;
        }

        public Criteria andWeici2016IsNull() {
            addCriterion("weici2016 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2016IsNotNull() {
            addCriterion("weici2016 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2016EqualTo(Integer value) {
            addCriterion("weici2016 =", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016NotEqualTo(Integer value) {
            addCriterion("weici2016 <>", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016GreaterThan(Integer value) {
            addCriterion("weici2016 >", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2016 >=", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016LessThan(Integer value) {
            addCriterion("weici2016 <", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016LessThanOrEqualTo(Integer value) {
            addCriterion("weici2016 <=", value, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016In(List<Integer> values) {
            addCriterion("weici2016 in", values, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016NotIn(List<Integer> values) {
            addCriterion("weici2016 not in", values, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016Between(Integer value1, Integer value2) {
            addCriterion("weici2016 between", value1, value2, "weici2016");
            return (Criteria) this;
        }

        public Criteria andWeici2016NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2016 not between", value1, value2, "weici2016");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017IsNull() {
            addCriterion("zhaoshengrenshu2017 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017IsNotNull() {
            addCriterion("zhaoshengrenshu2017 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017EqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2017 =", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017NotEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2017 <>", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017GreaterThan(Integer value) {
            addCriterion("zhaoshengrenshu2017 >", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2017 >=", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017LessThan(Integer value) {
            addCriterion("zhaoshengrenshu2017 <", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2017 <=", value, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017In(List<Integer> values) {
            addCriterion("zhaoshengrenshu2017 in", values, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017NotIn(List<Integer> values) {
            addCriterion("zhaoshengrenshu2017 not in", values, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017Between(Integer value1, Integer value2) {
            addCriterion("zhaoshengrenshu2017 between", value1, value2, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2017NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshengrenshu2017 not between", value1, value2, "zhaoshengrenshu2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017IsNull() {
            addCriterion("weici2017 is null");
            return (Criteria) this;
        }

        public Criteria andWeici2017IsNotNull() {
            addCriterion("weici2017 is not null");
            return (Criteria) this;
        }

        public Criteria andWeici2017EqualTo(Integer value) {
            addCriterion("weici2017 =", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017NotEqualTo(Integer value) {
            addCriterion("weici2017 <>", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017GreaterThan(Integer value) {
            addCriterion("weici2017 >", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017GreaterThanOrEqualTo(Integer value) {
            addCriterion("weici2017 >=", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017LessThan(Integer value) {
            addCriterion("weici2017 <", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017LessThanOrEqualTo(Integer value) {
            addCriterion("weici2017 <=", value, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017In(List<Integer> values) {
            addCriterion("weici2017 in", values, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017NotIn(List<Integer> values) {
            addCriterion("weici2017 not in", values, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017Between(Integer value1, Integer value2) {
            addCriterion("weici2017 between", value1, value2, "weici2017");
            return (Criteria) this;
        }

        public Criteria andWeici2017NotBetween(Integer value1, Integer value2) {
            addCriterion("weici2017 not between", value1, value2, "weici2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017IsNull() {
            addCriterion("fenshu2017 is null");
            return (Criteria) this;
        }

        public Criteria andFenshu2017IsNotNull() {
            addCriterion("fenshu2017 is not null");
            return (Criteria) this;
        }

        public Criteria andFenshu2017EqualTo(BigDecimal value) {
            addCriterion("fenshu2017 =", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017NotEqualTo(BigDecimal value) {
            addCriterion("fenshu2017 <>", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017GreaterThan(BigDecimal value) {
            addCriterion("fenshu2017 >", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2017 >=", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017LessThan(BigDecimal value) {
            addCriterion("fenshu2017 <", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fenshu2017 <=", value, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017In(List<BigDecimal> values) {
            addCriterion("fenshu2017 in", values, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017NotIn(List<BigDecimal> values) {
            addCriterion("fenshu2017 not in", values, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2017 between", value1, value2, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andFenshu2017NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fenshu2017 not between", value1, value2, "fenshu2017");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeIsNull() {
            addCriterion("zhaoshenguize is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeIsNotNull() {
            addCriterion("zhaoshenguize is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeEqualTo(String value) {
            addCriterion("zhaoshenguize =", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeNotEqualTo(String value) {
            addCriterion("zhaoshenguize <>", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeGreaterThan(String value) {
            addCriterion("zhaoshenguize >", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeGreaterThanOrEqualTo(String value) {
            addCriterion("zhaoshenguize >=", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeLessThan(String value) {
            addCriterion("zhaoshenguize <", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeLessThanOrEqualTo(String value) {
            addCriterion("zhaoshenguize <=", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeLike(String value) {
            addCriterion("zhaoshenguize like", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeNotLike(String value) {
            addCriterion("zhaoshenguize not like", value, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeIn(List<String> values) {
            addCriterion("zhaoshenguize in", values, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeNotIn(List<String> values) {
            addCriterion("zhaoshenguize not in", values, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeBetween(String value1, String value2) {
            addCriterion("zhaoshenguize between", value1, value2, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andZhaoshenguizeNotBetween(String value1, String value2) {
            addCriterion("zhaoshenguize not between", value1, value2, "zhaoshenguize");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018IsNull() {
            addCriterion("yucefenshu2018 is null");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018IsNotNull() {
            addCriterion("yucefenshu2018 is not null");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018EqualTo(BigDecimal value) {
            addCriterion("yucefenshu2018 =", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018NotEqualTo(BigDecimal value) {
            addCriterion("yucefenshu2018 <>", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018GreaterThan(BigDecimal value) {
            addCriterion("yucefenshu2018 >", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yucefenshu2018 >=", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018LessThan(BigDecimal value) {
            addCriterion("yucefenshu2018 <", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018LessThanOrEqualTo(BigDecimal value) {
            addCriterion("yucefenshu2018 <=", value, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018In(List<BigDecimal> values) {
            addCriterion("yucefenshu2018 in", values, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018NotIn(List<BigDecimal> values) {
            addCriterion("yucefenshu2018 not in", values, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("yucefenshu2018 between", value1, value2, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYucefenshu2018NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yucefenshu2018 not between", value1, value2, "yucefenshu2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018IsNull() {
            addCriterion("yuceweici2018 is null");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018IsNotNull() {
            addCriterion("yuceweici2018 is not null");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018EqualTo(Integer value) {
            addCriterion("yuceweici2018 =", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018NotEqualTo(Integer value) {
            addCriterion("yuceweici2018 <>", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018GreaterThan(Integer value) {
            addCriterion("yuceweici2018 >", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018GreaterThanOrEqualTo(Integer value) {
            addCriterion("yuceweici2018 >=", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018LessThan(Integer value) {
            addCriterion("yuceweici2018 <", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018LessThanOrEqualTo(Integer value) {
            addCriterion("yuceweici2018 <=", value, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018In(List<Integer> values) {
            addCriterion("yuceweici2018 in", values, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018NotIn(List<Integer> values) {
            addCriterion("yuceweici2018 not in", values, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018Between(Integer value1, Integer value2) {
            addCriterion("yuceweici2018 between", value1, value2, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andYuceweici2018NotBetween(Integer value1, Integer value2) {
            addCriterion("yuceweici2018 not between", value1, value2, "yuceweici2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018IsNull() {
            addCriterion("zhaoshengrenshu2018 is null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018IsNotNull() {
            addCriterion("zhaoshengrenshu2018 is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018EqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2018 =", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018NotEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2018 <>", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018GreaterThan(Integer value) {
            addCriterion("zhaoshengrenshu2018 >", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018GreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2018 >=", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018LessThan(Integer value) {
            addCriterion("zhaoshengrenshu2018 <", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018LessThanOrEqualTo(Integer value) {
            addCriterion("zhaoshengrenshu2018 <=", value, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018In(List<Integer> values) {
            addCriterion("zhaoshengrenshu2018 in", values, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018NotIn(List<Integer> values) {
            addCriterion("zhaoshengrenshu2018 not in", values, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018Between(Integer value1, Integer value2) {
            addCriterion("zhaoshengrenshu2018 between", value1, value2, "zhaoshengrenshu2018");
            return (Criteria) this;
        }

        public Criteria andZhaoshengrenshu2018NotBetween(Integer value1, Integer value2) {
            addCriterion("zhaoshengrenshu2018 not between", value1, value2, "zhaoshengrenshu2018");
            return (Criteria) this;
        }
    }

    /**
     */
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