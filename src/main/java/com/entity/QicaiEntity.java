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
 * 器材
 *
 * @author 
 * @email
 */
@TableName("qicai")
public class QicaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QicaiEntity() {

	}

	public QicaiEntity(T t) {
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
     * 器材名称
     */
    @TableField(value = "qicai_name")

    private String qicaiName;


    /**
     * 器材编号
     */
    @TableField(value = "qicai_uuid_number")

    private String qicaiUuidNumber;


    /**
     * 器材照片
     */
    @TableField(value = "qicai_photo")

    private String qicaiPhoto;


    /**
     * 器材类型
     */
    @TableField(value = "qicai_types")

    private Integer qicaiTypes;


    /**
     * 器材数量
     */
    @TableField(value = "qicai_kucun_number")

    private Integer qicaiKucunNumber;


    /**
     * 器材租赁原价/天
     */
    @TableField(value = "qicai_old_money")

    private Double qicaiOldMoney;


    /**
     * 器材租赁现价/天
     */
    @TableField(value = "qicai_new_money")

    private Double qicaiNewMoney;


    /**
     * 器材热度
     */
    @TableField(value = "qicai_clicknum")

    private Integer qicaiClicknum;


    /**
     * 器材介绍
     */
    @TableField(value = "qicai_content")

    private String qicaiContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "qicai_delete")

    private Integer qicaiDelete;


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
	 * 设置：器材名称
	 */
    public String getQicaiName() {
        return qicaiName;
    }
    /**
	 * 获取：器材名称
	 */

    public void setQicaiName(String qicaiName) {
        this.qicaiName = qicaiName;
    }
    /**
	 * 设置：器材编号
	 */
    public String getQicaiUuidNumber() {
        return qicaiUuidNumber;
    }
    /**
	 * 获取：器材编号
	 */

    public void setQicaiUuidNumber(String qicaiUuidNumber) {
        this.qicaiUuidNumber = qicaiUuidNumber;
    }
    /**
	 * 设置：器材照片
	 */
    public String getQicaiPhoto() {
        return qicaiPhoto;
    }
    /**
	 * 获取：器材照片
	 */

    public void setQicaiPhoto(String qicaiPhoto) {
        this.qicaiPhoto = qicaiPhoto;
    }
    /**
	 * 设置：器材类型
	 */
    public Integer getQicaiTypes() {
        return qicaiTypes;
    }
    /**
	 * 获取：器材类型
	 */

    public void setQicaiTypes(Integer qicaiTypes) {
        this.qicaiTypes = qicaiTypes;
    }
    /**
	 * 设置：器材数量
	 */
    public Integer getQicaiKucunNumber() {
        return qicaiKucunNumber;
    }
    /**
	 * 获取：器材数量
	 */

    public void setQicaiKucunNumber(Integer qicaiKucunNumber) {
        this.qicaiKucunNumber = qicaiKucunNumber;
    }
    /**
	 * 设置：器材租赁原价/天
	 */
    public Double getQicaiOldMoney() {
        return qicaiOldMoney;
    }
    /**
	 * 获取：器材租赁原价/天
	 */

    public void setQicaiOldMoney(Double qicaiOldMoney) {
        this.qicaiOldMoney = qicaiOldMoney;
    }
    /**
	 * 设置：器材租赁现价/天
	 */
    public Double getQicaiNewMoney() {
        return qicaiNewMoney;
    }
    /**
	 * 获取：器材租赁现价/天
	 */

    public void setQicaiNewMoney(Double qicaiNewMoney) {
        this.qicaiNewMoney = qicaiNewMoney;
    }
    /**
	 * 设置：器材热度
	 */
    public Integer getQicaiClicknum() {
        return qicaiClicknum;
    }
    /**
	 * 获取：器材热度
	 */

    public void setQicaiClicknum(Integer qicaiClicknum) {
        this.qicaiClicknum = qicaiClicknum;
    }
    /**
	 * 设置：器材介绍
	 */
    public String getQicaiContent() {
        return qicaiContent;
    }
    /**
	 * 获取：器材介绍
	 */

    public void setQicaiContent(String qicaiContent) {
        this.qicaiContent = qicaiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getQicaiDelete() {
        return qicaiDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setQicaiDelete(Integer qicaiDelete) {
        this.qicaiDelete = qicaiDelete;
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
        return "Qicai{" +
            "id=" + id +
            ", qicaiName=" + qicaiName +
            ", qicaiUuidNumber=" + qicaiUuidNumber +
            ", qicaiPhoto=" + qicaiPhoto +
            ", qicaiTypes=" + qicaiTypes +
            ", qicaiKucunNumber=" + qicaiKucunNumber +
            ", qicaiOldMoney=" + qicaiOldMoney +
            ", qicaiNewMoney=" + qicaiNewMoney +
            ", qicaiClicknum=" + qicaiClicknum +
            ", qicaiContent=" + qicaiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", qicaiDelete=" + qicaiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
