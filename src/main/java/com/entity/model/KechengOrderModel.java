package com.entity.model;

import com.entity.KechengOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约流水号
     */
    private String kechengOrderUuidNumber;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 会员
     */
    private Integer huiyuanId;


    /**
     * 实付金额
     */
    private Double kechengOrderTruePrice;


    /**
     * 课程预约状态
     */
    private Integer kechengOrderTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：预约流水号
	 */
    public String getKechengOrderUuidNumber() {
        return kechengOrderUuidNumber;
    }


    /**
	 * 设置：预约流水号
	 */
    public void setKechengOrderUuidNumber(String kechengOrderUuidNumber) {
        this.kechengOrderUuidNumber = kechengOrderUuidNumber;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
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
	 * 获取：实付金额
	 */
    public Double getKechengOrderTruePrice() {
        return kechengOrderTruePrice;
    }


    /**
	 * 设置：实付金额
	 */
    public void setKechengOrderTruePrice(Double kechengOrderTruePrice) {
        this.kechengOrderTruePrice = kechengOrderTruePrice;
    }
    /**
	 * 获取：课程预约状态
	 */
    public Integer getKechengOrderTypes() {
        return kechengOrderTypes;
    }


    /**
	 * 设置：课程预约状态
	 */
    public void setKechengOrderTypes(Integer kechengOrderTypes) {
        this.kechengOrderTypes = kechengOrderTypes;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
