package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教练
     */

    @TableField(value = "jiaolian_id")
    private Integer jiaolianId;


    /**
     * 课程名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 课程编号
     */

    @TableField(value = "kecheng_uuid_number")
    private String kechengUuidNumber;


    /**
     * 课程照片
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 课程类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 课程开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kecheng_kaishi_time")
    private Date kechengKaishiTime;


    /**
     * 课程结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kecheng_jieshu_time")
    private Date kechengJieshuTime;


    /**
     * 最大报名人数
     */

    @TableField(value = "kecheng_number")
    private Integer kechengNumber;


    /**
     * 课程原价
     */

    @TableField(value = "kecheng_old_money")
    private Double kechengOldMoney;


    /**
     * 课程现价
     */

    @TableField(value = "kecheng_new_money")
    private Double kechengNewMoney;


    /**
     * 课程热度
     */

    @TableField(value = "kecheng_clicknum")
    private Integer kechengClicknum;


    /**
     * 课程介绍
     */

    @TableField(value = "kecheng_content")
    private String kechengContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "kecheng_delete")
    private Integer kechengDelete;


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
	 * 设置：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 获取：教练
	 */

    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程编号
	 */
    public String getKechengUuidNumber() {
        return kechengUuidNumber;
    }


    /**
	 * 获取：课程编号
	 */

    public void setKechengUuidNumber(String kechengUuidNumber) {
        this.kechengUuidNumber = kechengUuidNumber;
    }
    /**
	 * 设置：课程照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：课程照片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：课程开始时间
	 */
    public Date getKechengKaishiTime() {
        return kechengKaishiTime;
    }


    /**
	 * 获取：课程开始时间
	 */

    public void setKechengKaishiTime(Date kechengKaishiTime) {
        this.kechengKaishiTime = kechengKaishiTime;
    }
    /**
	 * 设置：课程结束时间
	 */
    public Date getKechengJieshuTime() {
        return kechengJieshuTime;
    }


    /**
	 * 获取：课程结束时间
	 */

    public void setKechengJieshuTime(Date kechengJieshuTime) {
        this.kechengJieshuTime = kechengJieshuTime;
    }
    /**
	 * 设置：最大报名人数
	 */
    public Integer getKechengNumber() {
        return kechengNumber;
    }


    /**
	 * 获取：最大报名人数
	 */

    public void setKechengNumber(Integer kechengNumber) {
        this.kechengNumber = kechengNumber;
    }
    /**
	 * 设置：课程原价
	 */
    public Double getKechengOldMoney() {
        return kechengOldMoney;
    }


    /**
	 * 获取：课程原价
	 */

    public void setKechengOldMoney(Double kechengOldMoney) {
        this.kechengOldMoney = kechengOldMoney;
    }
    /**
	 * 设置：课程现价
	 */
    public Double getKechengNewMoney() {
        return kechengNewMoney;
    }


    /**
	 * 获取：课程现价
	 */

    public void setKechengNewMoney(Double kechengNewMoney) {
        this.kechengNewMoney = kechengNewMoney;
    }
    /**
	 * 设置：课程热度
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }


    /**
	 * 获取：课程热度
	 */

    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 设置：课程介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：课程介绍
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
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
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
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
