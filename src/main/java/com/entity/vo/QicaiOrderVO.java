package com.entity.vo;

import com.entity.QicaiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器材租赁
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qicai_order")
public class QicaiOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 归还时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
