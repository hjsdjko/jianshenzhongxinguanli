package com.entity.vo;

import com.entity.ChangdiWeihuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 场地维护
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("changdi_weihu")
public class ChangdiWeihuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 场地
     */

    @TableField(value = "changdi_id")
    private Integer changdiId;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 维护编号
     */

    @TableField(value = "changdi_weihu_uuid_number")
    private String changdiWeihuUuidNumber;


    /**
     * 场地维护类型
     */

    @TableField(value = "changdi_weihu_types")
    private Integer changdiWeihuTypes;


    /**
     * 场地维护详情
     */

    @TableField(value = "changdi_weihu_content")
    private String changdiWeihuContent;


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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：场地
	 */
    public Integer getChangdiId() {
        return changdiId;
    }


    /**
	 * 获取：场地
	 */

    public void setChangdiId(Integer changdiId) {
        this.changdiId = changdiId;
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
    public String getChangdiWeihuUuidNumber() {
        return changdiWeihuUuidNumber;
    }


    /**
	 * 获取：维护编号
	 */

    public void setChangdiWeihuUuidNumber(String changdiWeihuUuidNumber) {
        this.changdiWeihuUuidNumber = changdiWeihuUuidNumber;
    }
    /**
	 * 设置：场地维护类型
	 */
    public Integer getChangdiWeihuTypes() {
        return changdiWeihuTypes;
    }


    /**
	 * 获取：场地维护类型
	 */

    public void setChangdiWeihuTypes(Integer changdiWeihuTypes) {
        this.changdiWeihuTypes = changdiWeihuTypes;
    }
    /**
	 * 设置：场地维护详情
	 */
    public String getChangdiWeihuContent() {
        return changdiWeihuContent;
    }


    /**
	 * 获取：场地维护详情
	 */

    public void setChangdiWeihuContent(String changdiWeihuContent) {
        this.changdiWeihuContent = changdiWeihuContent;
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

}
