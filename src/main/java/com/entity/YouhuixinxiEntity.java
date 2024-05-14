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
 * 优惠信息
 *
 * @author 
 * @email
 */
@TableName("youhuixinxi")
public class YouhuixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouhuixinxiEntity() {

	}

	public YouhuixinxiEntity(T t) {
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
     * 优惠信息名称
     */
    @TableField(value = "youhuixinxi_name")

    private String youhuixinxiName;


    /**
     * 优惠信息图片
     */
    @TableField(value = "youhuixinxi_photo")

    private String youhuixinxiPhoto;


    /**
     * 优惠信息类型
     */
    @TableField(value = "youhuixinxi_types")

    private Integer youhuixinxiTypes;


    /**
     * 优惠信息发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 优惠信息详情
     */
    @TableField(value = "youhuixinxi_content")

    private String youhuixinxiContent;


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
	 * 设置：优惠信息名称
	 */
    public String getYouhuixinxiName() {
        return youhuixinxiName;
    }
    /**
	 * 获取：优惠信息名称
	 */

    public void setYouhuixinxiName(String youhuixinxiName) {
        this.youhuixinxiName = youhuixinxiName;
    }
    /**
	 * 设置：优惠信息图片
	 */
    public String getYouhuixinxiPhoto() {
        return youhuixinxiPhoto;
    }
    /**
	 * 获取：优惠信息图片
	 */

    public void setYouhuixinxiPhoto(String youhuixinxiPhoto) {
        this.youhuixinxiPhoto = youhuixinxiPhoto;
    }
    /**
	 * 设置：优惠信息类型
	 */
    public Integer getYouhuixinxiTypes() {
        return youhuixinxiTypes;
    }
    /**
	 * 获取：优惠信息类型
	 */

    public void setYouhuixinxiTypes(Integer youhuixinxiTypes) {
        this.youhuixinxiTypes = youhuixinxiTypes;
    }
    /**
	 * 设置：优惠信息发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：优惠信息发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：优惠信息详情
	 */
    public String getYouhuixinxiContent() {
        return youhuixinxiContent;
    }
    /**
	 * 获取：优惠信息详情
	 */

    public void setYouhuixinxiContent(String youhuixinxiContent) {
        this.youhuixinxiContent = youhuixinxiContent;
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
        return "Youhuixinxi{" +
            "id=" + id +
            ", youhuixinxiName=" + youhuixinxiName +
            ", youhuixinxiPhoto=" + youhuixinxiPhoto +
            ", youhuixinxiTypes=" + youhuixinxiTypes +
            ", insertTime=" + insertTime +
            ", youhuixinxiContent=" + youhuixinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
