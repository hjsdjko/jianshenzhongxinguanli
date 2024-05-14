package com.entity.model;

import com.entity.ChangdiWeihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 场地维护
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChangdiWeihuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 场地
     */
    private Integer changdiId;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 维护编号
     */
    private String changdiWeihuUuidNumber;


    /**
     * 场地维护类型
     */
    private Integer changdiWeihuTypes;


    /**
     * 场地维护详情
     */
    private String changdiWeihuContent;


    /**
     * 维护时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date weihuTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：场地
	 */
    public Integer getChangdiId() {
        return changdiId;
    }


    /**
	 * 设置：场地
	 */
    public void setChangdiId(Integer changdiId) {
        this.changdiId = changdiId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：维护编号
	 */
    public String getChangdiWeihuUuidNumber() {
        return changdiWeihuUuidNumber;
    }


    /**
	 * 设置：维护编号
	 */
    public void setChangdiWeihuUuidNumber(String changdiWeihuUuidNumber) {
        this.changdiWeihuUuidNumber = changdiWeihuUuidNumber;
    }
    /**
	 * 获取：场地维护类型
	 */
    public Integer getChangdiWeihuTypes() {
        return changdiWeihuTypes;
    }


    /**
	 * 设置：场地维护类型
	 */
    public void setChangdiWeihuTypes(Integer changdiWeihuTypes) {
        this.changdiWeihuTypes = changdiWeihuTypes;
    }
    /**
	 * 获取：场地维护详情
	 */
    public String getChangdiWeihuContent() {
        return changdiWeihuContent;
    }


    /**
	 * 设置：场地维护详情
	 */
    public void setChangdiWeihuContent(String changdiWeihuContent) {
        this.changdiWeihuContent = changdiWeihuContent;
    }
    /**
	 * 获取：维护时间
	 */
    public Date getWeihuTime() {
        return weihuTime;
    }


    /**
	 * 设置：维护时间
	 */
    public void setWeihuTime(Date weihuTime) {
        this.weihuTime = weihuTime;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
