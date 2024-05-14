package com.entity.vo;

import com.entity.QicaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器材
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qicai")
public class QicaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
