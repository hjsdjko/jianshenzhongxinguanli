package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程预约
 *
 * @author 
 * @email
 */
@TableName("kecheng_order")
public class KechengOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengOrderEntity() {

	}

	public KechengOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 预约流水号
     */
    @TableField(value = "kecheng_order_uuid_number")

    private String kechengOrderUuidNumber;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 会员
     */
    @TableField(value = "huiyuan_id")

    private Integer huiyuanId;


    /**
     * 实付金额
     */
    @TableField(value = "kecheng_order_true_price")

    private Double kechengOrderTruePrice;


    /**
     * 课程预约状态
     */
    @TableField(value = "kecheng_order_types")

    private Integer kechengOrderTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：预约流水号
	 */
    public String getKechengOrderUuidNumber() {
        return kechengOrderUuidNumber;
    }
    /**
	 * 获取：预约流水号
	 */

    public void setKechengOrderUuidNumber(String kechengOrderUuidNumber) {
        this.kechengOrderUuidNumber = kechengOrderUuidNumber;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }
    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：会员
	 */
    public Integer getHuiyuanId() {
        return huiyuanId;
    }
    /**
	 * 获取：会员
	 */

    public void setHuiyuanId(Integer huiyuanId) {
        this.huiyuanId = huiyuanId;
    }
    /**
	 * 设置：实付金额
	 */
    public Double getKechengOrderTruePrice() {
        return kechengOrderTruePrice;
    }
    /**
	 * 获取：实付金额
	 */

    public void setKechengOrderTruePrice(Double kechengOrderTruePrice) {
        this.kechengOrderTruePrice = kechengOrderTruePrice;
    }
    /**
	 * 设置：课程预约状态
	 */
    public Integer getKechengOrderTypes() {
        return kechengOrderTypes;
    }
    /**
	 * 获取：课程预约状态
	 */

    public void setKechengOrderTypes(Integer kechengOrderTypes) {
        this.kechengOrderTypes = kechengOrderTypes;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：预约时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "KechengOrder{" +
            "id=" + id +
            ", kechengOrderUuidNumber=" + kechengOrderUuidNumber +
            ", kechengId=" + kechengId +
            ", huiyuanId=" + huiyuanId +
            ", kechengOrderTruePrice=" + kechengOrderTruePrice +
            ", kechengOrderTypes=" + kechengOrderTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
