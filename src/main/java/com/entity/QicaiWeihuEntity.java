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
 * 器材维护
 *
 * @author 
 * @email
 */
@TableName("qicai_weihu")
public class QicaiWeihuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QicaiWeihuEntity() {

	}

	public QicaiWeihuEntity(T t) {
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
     * 器材
     */
    @TableField(value = "qicai_id")

    private Integer qicaiId;


    /**
     * 员工
     */
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 维护编号
     */
    @TableField(value = "qicai_weihu_uuid_number")

    private String qicaiWeihuUuidNumber;


    /**
     * 器材维护类型
     */
    @TableField(value = "qicai_weihu_types")

    private Integer qicaiWeihuTypes;


    /**
     * 器材维护详情
     */
    @TableField(value = "qicai_weihu_content")

    private String qicaiWeihuContent;


    /**
     * 维护时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "weihu_time")

    private Date weihuTime;


    /**
     * 录入时间
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
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }
    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：维护编号
	 */
    public String getQicaiWeihuUuidNumber() {
        return qicaiWeihuUuidNumber;
    }
    /**
	 * 获取：维护编号
	 */

    public void setQicaiWeihuUuidNumber(String qicaiWeihuUuidNumber) {
        this.qicaiWeihuUuidNumber = qicaiWeihuUuidNumber;
    }
    /**
	 * 设置：器材维护类型
	 */
    public Integer getQicaiWeihuTypes() {
        return qicaiWeihuTypes;
    }
    /**
	 * 获取：器材维护类型
	 */

    public void setQicaiWeihuTypes(Integer qicaiWeihuTypes) {
        this.qicaiWeihuTypes = qicaiWeihuTypes;
    }
    /**
	 * 设置：器材维护详情
	 */
    public String getQicaiWeihuContent() {
        return qicaiWeihuContent;
    }
    /**
	 * 获取：器材维护详情
	 */

    public void setQicaiWeihuContent(String qicaiWeihuContent) {
        this.qicaiWeihuContent = qicaiWeihuContent;
    }
    /**
	 * 设置：维护时间
	 */
    public Date getWeihuTime() {
        return weihuTime;
    }
    /**
	 * 获取：维护时间
	 */

    public void setWeihuTime(Date weihuTime) {
        this.weihuTime = weihuTime;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
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
        return "QicaiWeihu{" +
            "id=" + id +
            ", qicaiId=" + qicaiId +
            ", yuangongId=" + yuangongId +
            ", qicaiWeihuUuidNumber=" + qicaiWeihuUuidNumber +
            ", qicaiWeihuTypes=" + qicaiWeihuTypes +
            ", qicaiWeihuContent=" + qicaiWeihuContent +
            ", weihuTime=" + weihuTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
