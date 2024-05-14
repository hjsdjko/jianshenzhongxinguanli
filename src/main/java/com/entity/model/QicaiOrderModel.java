package com.entity.model;

import com.entity.QicaiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 器材租赁
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QicaiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 租赁流水号
     */
    private String qicaiOrderUuidNumber;


    /**
     * 器材
     */
    private Integer qicaiId;


    /**
     * 会员
     */
    private Integer huiyuanId;


    /**
     * 租赁时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date guihuanTime;


    /**
     * 租赁天数
     */
    private Integer qicaiZulinTian;


    /**
     * 实付金额
     */
    private Double qicaiOrderTruePrice;


    /**
     * 器材租赁状态
     */
    private Integer qicaiOrderTypes;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：租赁流水号
	 */
    public String getQicaiOrderUuidNumber() {
        return qicaiOrderUuidNumber;
    }


    /**
	 * 设置：租赁流水号
	 */
    public void setQicaiOrderUuidNumber(String qicaiOrderUuidNumber) {
        this.qicaiOrderUuidNumber = qicaiOrderUuidNumber;
    }
    /**
	 * 获取：器材
	 */
    public Integer getQicaiId() {
        return qicaiId;
    }


    /**
	 * 设置：器材
	 */
    public void setQicaiId(Integer qicaiId) {
        this.qicaiId = qicaiId;
    }
    /**
	 * 获取：会员
	 */
    public Integer getHuiyuanId() {
        return huiyuanId;
    }


    /**
	 * 设置：会员
	 */
    public void setHuiyuanId(Integer huiyuanId) {
        this.huiyuanId = huiyuanId;
    }
    /**
	 * 获取：租赁时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：租赁时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：归还时间
	 */
    public Date getGuihuanTime() {
        return guihuanTime;
    }


    /**
	 * 设置：归还时间
	 */
    public void setGuihuanTime(Date guihuanTime) {
        this.guihuanTime = guihuanTime;
    }
    /**
	 * 获取：租赁天数
	 */
    public Integer getQicaiZulinTian() {
        return qicaiZulinTian;
    }


    /**
	 * 设置：租赁天数
	 */
    public void setQicaiZulinTian(Integer qicaiZulinTian) {
        this.qicaiZulinTian = qicaiZulinTian;
    }
    /**
	 * 获取：实付金额
	 */
    public Double getQicaiOrderTruePrice() {
        return qicaiOrderTruePrice;
    }


    /**
	 * 设置：实付金额
	 */
    public void setQicaiOrderTruePrice(Double qicaiOrderTruePrice) {
        this.qicaiOrderTruePrice = qicaiOrderTruePrice;
    }
    /**
	 * 获取：器材租赁状态
	 */
    public Integer getQicaiOrderTypes() {
        return qicaiOrderTypes;
    }


    /**
	 * 设置：器材租赁状态
	 */
    public void setQicaiOrderTypes(Integer qicaiOrderTypes) {
        this.qicaiOrderTypes = qicaiOrderTypes;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
