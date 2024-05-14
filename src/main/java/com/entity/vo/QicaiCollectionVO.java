package com.entity.vo;

import com.entity.QicaiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器材收藏
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qicai_collection")
public class QicaiCollectionVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
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
	 * 设置：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
