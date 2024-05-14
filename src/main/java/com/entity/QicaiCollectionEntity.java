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
 * 器材收藏
 *
 * @author 
 * @email
 */
@TableName("qicai_collection")
public class QicaiCollectionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QicaiCollectionEntity() {

	}

	public QicaiCollectionEntity(T t) {
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
     * 会员
     */
    @TableField(value = "huiyuan_id")

    private Integer huiyuanId;


    /**
     * 类型
     */
    @TableField(value = "qicai_collection_types")

    private Integer qicaiCollectionTypes;


    /**
     * 收藏时间
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
	 * 设置：类型
	 */
    public Integer getQicaiCollectionTypes() {
        return qicaiCollectionTypes;
    }
    /**
	 * 获取：类型
	 */

    public void setQicaiCollectionTypes(Integer qicaiCollectionTypes) {
        this.qicaiCollectionTypes = qicaiCollectionTypes;
    }
    /**
	 * 设置：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：收藏时间
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
        return "QicaiCollection{" +
            "id=" + id +
            ", qicaiId=" + qicaiId +
            ", huiyuanId=" + huiyuanId +
            ", qicaiCollectionTypes=" + qicaiCollectionTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
