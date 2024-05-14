package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教练
     */
    private Integer jiaolianId;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程编号
     */
    private String kechengUuidNumber;


    /**
     * 课程照片
     */
    private String kechengPhoto;


    /**
     * 课程类型
     */
    private Integer kechengTypes;


    /**
     * 课程开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kechengKaishiTime;


    /**
     * 课程结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kechengJieshuTime;


    /**
     * 最大报名人数
     */
    private Integer kechengNumber;


    /**
     * 课程原价
     */
    private Double kechengOldMoney;


    /**
     * 课程现价
     */
    private Double kechengNewMoney;


    /**
     * 课程热度
     */
    private Integer kechengClicknum;


    /**
     * 课程介绍
     */
    private String kechengContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer kechengDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 设置：教练
	 */
    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }


    /**
	 * 设置：课程编号
	 */
    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 获取：课程照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程照片
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：课程开始时间
	 */
    public Date getKechengKaishiTime() {
        return kechengKaishiTime;
    }


    /**
	 * 设置：课程开始时间
	 */
    public void setKechengKaishiTime(Date kechengKaishiTime) {
        this.kechengKaishiTime = kechengKaishiTime;
    }
    /**
	 * 获取：课程结束时间
	 */
    public Date getKechengJieshuTime() {
        return kechengJieshuTime;
    }


    /**
	 * 设置：课程结束时间
	 */
    public void setKechengJieshuTime(Date kechengJieshuTime) {
        this.kechengJieshuTime = kechengJieshuTime;
    }
    /**
	 * 获取：最大报名人数
	 */
    public Integer getKechengNumber() {
        return kechengNumber;
    }


    /**
	 * 设置：最大报名人数
	 */
    public void setKechengNumber(Integer kechengNumber) {
        this.kechengNumber = kechengNumber;
    }
    /**
	 * 获取：课程原价
	 */
    public Double getKechengOldMoney() {
        return kechengOldMoney;
    }


    /**
	 * 设置：课程原价
	 */
    public void setKechengOldMoney(Double kechengOldMoney) {
        this.kechengOldMoney = kechengOldMoney;
    }
    /**
	 * 获取：课程现价
	 */
    public Double getKechengNewMoney() {
        return kechengNewMoney;
    }


    /**
	 * 设置：课程现价
	 */
    public void setKechengNewMoney(Double kechengNewMoney) {
        this.kechengNewMoney = kechengNewMoney;
    }
    /**
	 * 获取：课程热度
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }


    /**
	 * 设置：课程热度
	 */
    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 获取：课程介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程介绍
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
