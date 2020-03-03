/*
 * Copyright 2020 HPB Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpb.bc.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public CoinConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coin_config
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coin_config
     *
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNull() {
            addCriterion("coin_symbol is null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNotNull() {
            addCriterion("coin_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolEqualTo(String value) {
            addCriterion("coin_symbol =", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotEqualTo(String value) {
            addCriterion("coin_symbol <>", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThan(String value) {
            addCriterion("coin_symbol >", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("coin_symbol >=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThan(String value) {
            addCriterion("coin_symbol <", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThanOrEqualTo(String value) {
            addCriterion("coin_symbol <=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLike(String value) {
            addCriterion("coin_symbol like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotLike(String value) {
            addCriterion("coin_symbol not like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIn(List<String> values) {
            addCriterion("coin_symbol in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotIn(List<String> values) {
            addCriterion("coin_symbol not in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolBetween(String value1, String value2) {
            addCriterion("coin_symbol between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotBetween(String value1, String value2) {
            addCriterion("coin_symbol not between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameIsNull() {
            addCriterion("coin_full_name is null");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameIsNotNull() {
            addCriterion("coin_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameEqualTo(String value) {
            addCriterion("coin_full_name =", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameNotEqualTo(String value) {
            addCriterion("coin_full_name <>", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameGreaterThan(String value) {
            addCriterion("coin_full_name >", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("coin_full_name >=", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameLessThan(String value) {
            addCriterion("coin_full_name <", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameLessThanOrEqualTo(String value) {
            addCriterion("coin_full_name <=", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameLike(String value) {
            addCriterion("coin_full_name like", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameNotLike(String value) {
            addCriterion("coin_full_name not like", value, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameIn(List<String> values) {
            addCriterion("coin_full_name in", values, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameNotIn(List<String> values) {
            addCriterion("coin_full_name not in", values, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameBetween(String value1, String value2) {
            addCriterion("coin_full_name between", value1, value2, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andCoinFullNameNotBetween(String value1, String value2) {
            addCriterion("coin_full_name not between", value1, value2, "coinFullName");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionIsNull() {
            addCriterion("coin_precision is null");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionIsNotNull() {
            addCriterion("coin_precision is not null");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionEqualTo(String value) {
            addCriterion("coin_precision =", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionNotEqualTo(String value) {
            addCriterion("coin_precision <>", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionGreaterThan(String value) {
            addCriterion("coin_precision >", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionGreaterThanOrEqualTo(String value) {
            addCriterion("coin_precision >=", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionLessThan(String value) {
            addCriterion("coin_precision <", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionLessThanOrEqualTo(String value) {
            addCriterion("coin_precision <=", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionLike(String value) {
            addCriterion("coin_precision like", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionNotLike(String value) {
            addCriterion("coin_precision not like", value, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionIn(List<String> values) {
            addCriterion("coin_precision in", values, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionNotIn(List<String> values) {
            addCriterion("coin_precision not in", values, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionBetween(String value1, String value2) {
            addCriterion("coin_precision between", value1, value2, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andCoinPrecisionNotBetween(String value1, String value2) {
            addCriterion("coin_precision not between", value1, value2, "coinPrecision");
            return (Criteria) this;
        }

        public Criteria andContractAddrIsNull() {
            addCriterion("contract_addr is null");
            return (Criteria) this;
        }

        public Criteria andContractAddrIsNotNull() {
            addCriterion("contract_addr is not null");
            return (Criteria) this;
        }

        public Criteria andContractAddrEqualTo(String value) {
            addCriterion("contract_addr =", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrNotEqualTo(String value) {
            addCriterion("contract_addr <>", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrGreaterThan(String value) {
            addCriterion("contract_addr >", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrGreaterThanOrEqualTo(String value) {
            addCriterion("contract_addr >=", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrLessThan(String value) {
            addCriterion("contract_addr <", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrLessThanOrEqualTo(String value) {
            addCriterion("contract_addr <=", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrLike(String value) {
            addCriterion("contract_addr like", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrNotLike(String value) {
            addCriterion("contract_addr not like", value, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrIn(List<String> values) {
            addCriterion("contract_addr in", values, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrNotIn(List<String> values) {
            addCriterion("contract_addr not in", values, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrBetween(String value1, String value2) {
            addCriterion("contract_addr between", value1, value2, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andContractAddrNotBetween(String value1, String value2) {
            addCriterion("contract_addr not between", value1, value2, "contractAddr");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNull() {
            addCriterion("coin_type is null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIsNotNull() {
            addCriterion("coin_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTypeEqualTo(String value) {
            addCriterion("coin_type =", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotEqualTo(String value) {
            addCriterion("coin_type <>", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThan(String value) {
            addCriterion("coin_type >", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("coin_type >=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThan(String value) {
            addCriterion("coin_type <", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLessThanOrEqualTo(String value) {
            addCriterion("coin_type <=", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeLike(String value) {
            addCriterion("coin_type like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotLike(String value) {
            addCriterion("coin_type not like", value, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeIn(List<String> values) {
            addCriterion("coin_type in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotIn(List<String> values) {
            addCriterion("coin_type not in", values, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeBetween(String value1, String value2) {
            addCriterion("coin_type between", value1, value2, "coinType");
            return (Criteria) this;
        }

        public Criteria andCoinTypeNotBetween(String value1, String value2) {
            addCriterion("coin_type not between", value1, value2, "coinType");
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

        public Criteria andPriceFromIsNull() {
            addCriterion("price_from is null");
            return (Criteria) this;
        }

        public Criteria andPriceFromIsNotNull() {
            addCriterion("price_from is not null");
            return (Criteria) this;
        }

        public Criteria andPriceFromEqualTo(String value) {
            addCriterion("price_from =", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromNotEqualTo(String value) {
            addCriterion("price_from <>", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromGreaterThan(String value) {
            addCriterion("price_from >", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromGreaterThanOrEqualTo(String value) {
            addCriterion("price_from >=", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromLessThan(String value) {
            addCriterion("price_from <", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromLessThanOrEqualTo(String value) {
            addCriterion("price_from <=", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromLike(String value) {
            addCriterion("price_from like", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromNotLike(String value) {
            addCriterion("price_from not like", value, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromIn(List<String> values) {
            addCriterion("price_from in", values, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromNotIn(List<String> values) {
            addCriterion("price_from not in", values, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromBetween(String value1, String value2) {
            addCriterion("price_from between", value1, value2, "priceFrom");
            return (Criteria) this;
        }

        public Criteria andPriceFromNotBetween(String value1, String value2) {
            addCriterion("price_from not between", value1, value2, "priceFrom");
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

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("is_show like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("is_show not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coin_config
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coin_config
     *
     * @mbg.generated
     */
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