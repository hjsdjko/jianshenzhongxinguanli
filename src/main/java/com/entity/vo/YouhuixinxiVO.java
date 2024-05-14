package com.entity.vo;

import com.entity.YouhuixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 优惠信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("youhuixinxi")
public class YouhuixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 优惠信息详情
     */

    @TableField(value = "youhuixinxi_content")
    private String youhuixinxiContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
