package com.hpb.bc.entity;

import java.util.Date;

public class RedPacketDetail extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.red_packet_no
     *
     * @mbg.generated
     */
    private String redPacketNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.trade_time
     *
     * @mbg.generated
     */
    private Date tradeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.token_id
     *
     * @mbg.generated
     */
    private Long tokenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.from_addr
     *
     * @mbg.generated
     */
    private String fromAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.to_addr
     *
     * @mbg.generated
     */
    private String toAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.packet_key
     *
     * @mbg.generated
     */
    private String packetKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.coin_value
     *
     * @mbg.generated
     */
    private String coinValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.tx_hash
     *
     * @mbg.generated
     */
    private String txHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.max_flag
     *
     * @mbg.generated
     */
    private String maxFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.red_packet_type
     *
     * @mbg.generated
     */
    private String redPacketType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.title_en
     *
     * @mbg.generated
     */
    private String titleEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column red_packet_detail.gmt_modify
     *
     * @mbg.generated
     */
    private Date gmtModify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.id
     *
     * @return the value of red_packet_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.id
     *
     * @param id the value for red_packet_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.red_packet_no
     *
     * @return the value of red_packet_detail.red_packet_no
     *
     * @mbg.generated
     */
    public String getRedPacketNo() {
        return redPacketNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.red_packet_no
     *
     * @param redPacketNo the value for red_packet_detail.red_packet_no
     *
     * @mbg.generated
     */
    public void setRedPacketNo(String redPacketNo) {
        this.redPacketNo = redPacketNo == null ? null : redPacketNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.status
     *
     * @return the value of red_packet_detail.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.status
     *
     * @param status the value for red_packet_detail.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.trade_time
     *
     * @return the value of red_packet_detail.trade_time
     *
     * @mbg.generated
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.trade_time
     *
     * @param tradeTime the value for red_packet_detail.trade_time
     *
     * @mbg.generated
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.token_id
     *
     * @return the value of red_packet_detail.token_id
     *
     * @mbg.generated
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.token_id
     *
     * @param tokenId the value for red_packet_detail.token_id
     *
     * @mbg.generated
     */
    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.from_addr
     *
     * @return the value of red_packet_detail.from_addr
     *
     * @mbg.generated
     */
    public String getFromAddr() {
        return fromAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.from_addr
     *
     * @param fromAddr the value for red_packet_detail.from_addr
     *
     * @mbg.generated
     */
    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr == null ? null : fromAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.to_addr
     *
     * @return the value of red_packet_detail.to_addr
     *
     * @mbg.generated
     */
    public String getToAddr() {
        return toAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.to_addr
     *
     * @param toAddr the value for red_packet_detail.to_addr
     *
     * @mbg.generated
     */
    public void setToAddr(String toAddr) {
        this.toAddr = toAddr == null ? null : toAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.packet_key
     *
     * @return the value of red_packet_detail.packet_key
     *
     * @mbg.generated
     */
    public String getPacketKey() {
        return packetKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.packet_key
     *
     * @param packetKey the value for red_packet_detail.packet_key
     *
     * @mbg.generated
     */
    public void setPacketKey(String packetKey) {
        this.packetKey = packetKey == null ? null : packetKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.coin_value
     *
     * @return the value of red_packet_detail.coin_value
     *
     * @mbg.generated
     */
    public String getCoinValue() {
        return coinValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.coin_value
     *
     * @param coinValue the value for red_packet_detail.coin_value
     *
     * @mbg.generated
     */
    public void setCoinValue(String coinValue) {
        this.coinValue = coinValue == null ? null : coinValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.tx_hash
     *
     * @return the value of red_packet_detail.tx_hash
     *
     * @mbg.generated
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.tx_hash
     *
     * @param txHash the value for red_packet_detail.tx_hash
     *
     * @mbg.generated
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash == null ? null : txHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.max_flag
     *
     * @return the value of red_packet_detail.max_flag
     *
     * @mbg.generated
     */
    public String getMaxFlag() {
        return maxFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.max_flag
     *
     * @param maxFlag the value for red_packet_detail.max_flag
     *
     * @mbg.generated
     */
    public void setMaxFlag(String maxFlag) {
        this.maxFlag = maxFlag == null ? null : maxFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.red_packet_type
     *
     * @return the value of red_packet_detail.red_packet_type
     *
     * @mbg.generated
     */
    public String getRedPacketType() {
        return redPacketType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.red_packet_type
     *
     * @param redPacketType the value for red_packet_detail.red_packet_type
     *
     * @mbg.generated
     */
    public void setRedPacketType(String redPacketType) {
        this.redPacketType = redPacketType == null ? null : redPacketType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.title
     *
     * @return the value of red_packet_detail.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.title
     *
     * @param title the value for red_packet_detail.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.title_en
     *
     * @return the value of red_packet_detail.title_en
     *
     * @mbg.generated
     */
    public String getTitleEn() {
        return titleEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.title_en
     *
     * @param titleEn the value for red_packet_detail.title_en
     *
     * @mbg.generated
     */
    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.gmt_create
     *
     * @return the value of red_packet_detail.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.gmt_create
     *
     * @param gmtCreate the value for red_packet_detail.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column red_packet_detail.gmt_modify
     *
     * @return the value of red_packet_detail.gmt_modify
     *
     * @mbg.generated
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column red_packet_detail.gmt_modify
     *
     * @param gmtModify the value for red_packet_detail.gmt_modify
     *
     * @mbg.generated
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_detail
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RedPacketDetail other = (RedPacketDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRedPacketNo() == null ? other.getRedPacketNo() == null : this.getRedPacketNo().equals(other.getRedPacketNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
            && (this.getFromAddr() == null ? other.getFromAddr() == null : this.getFromAddr().equals(other.getFromAddr()))
            && (this.getToAddr() == null ? other.getToAddr() == null : this.getToAddr().equals(other.getToAddr()))
            && (this.getPacketKey() == null ? other.getPacketKey() == null : this.getPacketKey().equals(other.getPacketKey()))
            && (this.getCoinValue() == null ? other.getCoinValue() == null : this.getCoinValue().equals(other.getCoinValue()))
            && (this.getTxHash() == null ? other.getTxHash() == null : this.getTxHash().equals(other.getTxHash()))
            && (this.getMaxFlag() == null ? other.getMaxFlag() == null : this.getMaxFlag().equals(other.getMaxFlag()))
            && (this.getRedPacketType() == null ? other.getRedPacketType() == null : this.getRedPacketType().equals(other.getRedPacketType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getTitleEn() == null ? other.getTitleEn() == null : this.getTitleEn().equals(other.getTitleEn()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModify() == null ? other.getGmtModify() == null : this.getGmtModify().equals(other.getGmtModify()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table red_packet_detail
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRedPacketNo() == null) ? 0 : getRedPacketNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        result = prime * result + ((getFromAddr() == null) ? 0 : getFromAddr().hashCode());
        result = prime * result + ((getToAddr() == null) ? 0 : getToAddr().hashCode());
        result = prime * result + ((getPacketKey() == null) ? 0 : getPacketKey().hashCode());
        result = prime * result + ((getCoinValue() == null) ? 0 : getCoinValue().hashCode());
        result = prime * result + ((getTxHash() == null) ? 0 : getTxHash().hashCode());
        result = prime * result + ((getMaxFlag() == null) ? 0 : getMaxFlag().hashCode());
        result = prime * result + ((getRedPacketType() == null) ? 0 : getRedPacketType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getTitleEn() == null) ? 0 : getTitleEn().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModify() == null) ? 0 : getGmtModify().hashCode());
        return result;
    }
}