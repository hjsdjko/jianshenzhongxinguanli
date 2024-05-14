package com.entity.model;

import com.entity.QicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 器材
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QicaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 器材名称
     */
    private String qicaiName;


    /**
     * 器材编号
     */
    private String qicaiUuidNumber;


    /**
     * 器材照片
     */
    private String qicaiPhoto;


    /**
     * 器材类型
     */
    private Integer qicaiTypes;


    /**
     * 器材数量
     */
    private Integer qicaiKucunNumber;


    /**
     * 器材租赁原价/天
     */
    private Double qicaiOldMoney;


    /**
     * 器材租赁现价/天
     */
    private Double qicaiNewMoney;


    /**
     * 器材热度
     */
    private Integer qicaiClicknum;


    /**
     * 器材介绍
     */
    private String qicaiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer qicaiDelete;


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
	 * 获取：器材名称
	 */
    public String getQicaiName() {
        return qicaiName;
    }


    /**
	 * 设置：器材名称
	 */
    public void setQicaiName(String qicaiName) {
        this.qicaiName = qicaiName;
    }
    /**
	 * 获取：器材编号
	 */
    public String getQicaiUuidNumber() {
        return qicaiUuidNumber;
    }


    /**
	 * 设置：器材编号
	 */
    public void setQicaiUuidNumber(String qicaiUuidNumber) {
        this.qicaiUuidNumber = qicaiUuidNumber;
    }
    /**
	 * 获取：器材照片
	 */
    public String getQicaiPhoto() {
        return qicaiPhoto;
    }


    /**
	 * 设置：器材照片
	 */
    public void setQicaiPhoto(String qicaiPhoto) {
        this.qicaiPhoto = qicaiPhoto;
    }
    /**
	 * 获取：器材类型
	 */
    public Integer getQicaiTypes() {
        return qicaiTypes;
    }


    /**
	 * 设置：器材类型
	 */
    public void setQicaiTypes(Integer qicaiTypes) {
        this.qicaiTypes = qicaiTypes;
    }
    /**
	 * 获取：器材数量
	 */
    public Integer getQicaiKucunNumber() {
        return qicaiKucunNumber;
    }


    /**
	 * 设置：器材数量
	 */
    public void setQicaiKucunNumber(Integer qicaiKucunNumber) {
        this.qicaiKucunNumber = qicaiKucunNumber;
    }
    /**
	 * 获取：器材租赁原价/天
	 */
    public Double getQicaiOldMoney() {
        return qicaiOldMoney;
    }


    /**
	 * 设置：器材租赁原价/天
	 */
    public void setQicaiOldMoney(Double qicaiOldMoney) {
        this.qicaiOldMoney = qicaiOldMoney;
    }
    /**
	 * 获取：器材租赁现价/天
	 */
    public Double getQicaiNewMoney() {
        return qicaiNewMoney;
    }


    /**
	 * 设置：器材租赁现价/天
	 */
    public void setQicaiNewMoney(Double qicaiNewMoney) {
        this.qicaiNewMoney = qicaiNewMoney;
    }
    /**
	 * 获取：器材热度
	 */
    public Integer getQicaiClicknum() {
        return qicaiClicknum;
    }


    /**
	 * 设置：器材热度
	 */
    public void setQicaiClicknum(Integer qicaiClicknum) {
        this.qicaiClicknum = qicaiClicknum;
    }
    /**
	 * 获取：器材介绍
	 */
    public String getQicaiContent() {
        return qicaiContent;
    }


    /**
	 * 设置：器材介绍
	 */
    public void setQicaiContent(String qicaiContent) {
        this.qicaiContent = qicaiContent;
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
    public Integer getQicaiDelete() {
        return qicaiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setQicaiDelete(Integer qicaiDelete) {
        this.qicaiDelete = qicaiDelete;
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
