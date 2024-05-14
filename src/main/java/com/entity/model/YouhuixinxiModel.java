package com.entity.model;

import com.entity.YouhuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 优惠信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YouhuixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 优惠信息名称
     */
    private String youhuixinxiName;


    /**
     * 优惠信息图片
     */
    private String youhuixinxiPhoto;


    /**
     * 优惠信息类型
     */
    private Integer youhuixinxiTypes;


    /**
     * 优惠信息发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 优惠信息详情
     */
    private String youhuixinxiContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：优惠信息名称
	 */
    public String getYouhuixinxiName() {
        return youhuixinxiName;
    }


    /**
	 * 设置：优惠信息名称
	 */
    public void setYouhuixinxiName(String youhuixinxiName) {
        this.youhuixinxiName = youhuixinxiName;
    }
    /**
	 * 获取：优惠信息图片
	 */
    public String getYouhuixinxiPhoto() {
        return youhuixinxiPhoto;
    }


    /**
	 * 设置：优惠信息图片
	 */
    public void setYouhuixinxiPhoto(String youhuixinxiPhoto) {
        this.youhuixinxiPhoto = youhuixinxiPhoto;
    }
    /**
	 * 获取：优惠信息类型
	 */
    public Integer getYouhuixinxiTypes() {
        return youhuixinxiTypes;
    }


    /**
	 * 设置：优惠信息类型
	 */
    public void setYouhuixinxiTypes(Integer youhuixinxiTypes) {
        this.youhuixinxiTypes = youhuixinxiTypes;
    }
    /**
	 * 获取：优惠信息发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：优惠信息发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：优惠信息详情
	 */
    public String getYouhuixinxiContent() {
        return youhuixinxiContent;
    }


    /**
	 * 设置：优惠信息详情
	 */
    public void setYouhuixinxiContent(String youhuixinxiContent) {
        this.youhuixinxiContent = youhuixinxiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
