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
 * 器材租赁
 *
 * @author 
 * @email
 */
@TableName("qicai_order")
public class QicaiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QicaiOrderEntity() {

	}

	public QicaiOrderEntity(T t) {
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
     * 租赁流水号
     */
    @TableField(value = "qicai_order_uuid_number")

    private String qicaiOrderUuidNumber;


    /**
     * 器材
     */
    @TableField(value = "qicai_id")

    private Integer qicaiId;


    /**
     * 会员
     */
    @TableField(value = "huiyuan_id")

    private Integer huiyuanId;


    /**
     * 租赁时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "guihuan_time")

    private Date guihuanTime;


    /**
     * 租赁天数
     */
    @TableField(value = "qicai_zulin_tian")

    private Integer qicaiZulinTian;


    /**
     * 实付金额
     */
    @TableField(value = "qicai_order_true_price")

    private Double qicaiOrderTruePrice;


    /**
     * 器材租赁状态
     */
    @TableField(value = "qicai_order_types")

    private Integer qicaiOrderTypes;


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
	 * 设置：租赁流水号
	 */
    public String getQicaiOrderUuidNumber() {
        return qicaiOrderUuidNumber;
    }
    /**
	 * 获取：租赁流水号
	 */

    public void setQicaiOrderUuidNumber(String qicaiOrderUuidNumber) {
        this.qicaiOrderUuidNumber = qicaiOrderUuidNumber;
    }
    /**
	 * 设置：器材
	 */
    public Integer getQicaiId() {
        return qicaiId;
    }
    /**
	 * 获取：器材
	 */

    public void setQicaiId(Integer qicaiId) {
        this.qicaiId = qicaiId;
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
	 * 设置：租赁时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：租赁时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：归还时间
	 */
    public Date getGuihuanTime() {
        return guihuanTime;
    }
    /**
	 * 获取：归还时间
	 */

    public void setGuihuanTime(Date guihuanTime) {
        this.guihuanTime = guihuanTime;
    }
    /**
	 * 设置：租赁天数
	 */
    public Integer getQicaiZulinTian() {
        return qicaiZulinTian;
    }
    /**
	 * 获取：租赁天数
	 */

    public void setQicaiZulinTian(Integer qicaiZulinTian) {
        this.qicaiZulinTian = qicaiZulinTian;
    }
    /**
	 * 设置：实付金额
	 */
    public Double getQicaiOrderTruePrice() {
        return qicaiOrderTruePrice;
    }
    /**
	 * 获取：实付金额
	 */

    public void setQicaiOrderTruePrice(Double qicaiOrderTruePrice) {
        this.qicaiOrderTruePrice = qicaiOrderTruePrice;
    }
    /**
	 * 设置：器材租赁状态
	 */
    public Integer getQicaiOrderTypes() {
        return qicaiOrderTypes;
    }
    /**
	 * 获取：器材租赁状态
	 */

    public void setQicaiOrderTypes(Integer qicaiOrderTypes) {
        this.qicaiOrderTypes = qicaiOrderTypes;
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
        return "QicaiOrder{" +
            "id=" + id +
            ", qicaiOrderUuidNumber=" + qicaiOrderUuidNumber +
            ", qicaiId=" + qicaiId +
            ", huiyuanId=" + huiyuanId +
            ", insertTime=" + insertTime +
            ", guihuanTime=" + guihuanTime +
            ", qicaiZulinTian=" + qicaiZulinTian +
            ", qicaiOrderTruePrice=" + qicaiOrderTruePrice +
            ", qicaiOrderTypes=" + qicaiOrderTypes +
            ", createTime=" + createTime +
        "}";
    }
}
