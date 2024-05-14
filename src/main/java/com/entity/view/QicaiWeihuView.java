package com.entity.view;

import com.entity.QicaiWeihuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 器材维护
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qicai_weihu")
public class QicaiWeihuView extends QicaiWeihuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 器材维护类型的值
		*/
		private String qicaiWeihuValue;



		//级联表 qicai
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
				* 器材类型的值
				*/
				private String qicaiValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer qicaiDelete;

		//级联表 yuangong
			/**
			* 员工编号
			*/
			private String yuangongUuidNumber;
			/**
			* 员工姓名
			*/
			private String yuangongName;
			/**
			* 员工手机号
			*/
			private String yuangongPhone;
			/**
			* 员工身份证号
			*/
			private String yuangongIdNumber;
			/**
			* 员工头像
			*/
			private String yuangongPhoto;

	public QicaiWeihuView() {

	}

	public QicaiWeihuView(QicaiWeihuEntity qicaiWeihuEntity) {
		try {
			BeanUtils.copyProperties(this, qicaiWeihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 器材维护类型的值
			*/
			public String getQicaiWeihuValue() {
				return qicaiWeihuValue;
			}
			/**
			* 设置： 器材维护类型的值
			*/
			public void setQicaiWeihuValue(String qicaiWeihuValue) {
				this.qicaiWeihuValue = qicaiWeihuValue;
			}


































				//级联表的get和set qicai

					/**
					* 获取： 器材名称
					*/
					public String getQicaiName() {
						return qicaiName;
					}
					/**
					* 设置： 器材名称
					*/
					public void setQicaiName(String qicaiName) {
						this.qicaiName = qicaiName;
					}

					/**
					* 获取： 器材编号
					*/
					public String getQicaiUuidNumber() {
						return qicaiUuidNumber;
					}
					/**
					* 设置： 器材编号
					*/
					public void setQicaiUuidNumber(String qicaiUuidNumber) {
						this.qicaiUuidNumber = qicaiUuidNumber;
					}

					/**
					* 获取： 器材照片
					*/
					public String getQicaiPhoto() {
						return qicaiPhoto;
					}
					/**
					* 设置： 器材照片
					*/
					public void setQicaiPhoto(String qicaiPhoto) {
						this.qicaiPhoto = qicaiPhoto;
					}

					/**
					* 获取： 器材类型
					*/
					public Integer getQicaiTypes() {
						return qicaiTypes;
					}
					/**
					* 设置： 器材类型
					*/
					public void setQicaiTypes(Integer qicaiTypes) {
						this.qicaiTypes = qicaiTypes;
					}


						/**
						* 获取： 器材类型的值
						*/
						public String getQicaiValue() {
							return qicaiValue;
						}
						/**
						* 设置： 器材类型的值
						*/
						public void setQicaiValue(String qicaiValue) {
							this.qicaiValue = qicaiValue;
						}

					/**
					* 获取： 器材数量
					*/
					public Integer getQicaiKucunNumber() {
						return qicaiKucunNumber;
					}
					/**
					* 设置： 器材数量
					*/
					public void setQicaiKucunNumber(Integer qicaiKucunNumber) {
						this.qicaiKucunNumber = qicaiKucunNumber;
					}

					/**
					* 获取： 器材租赁原价/天
					*/
					public Double getQicaiOldMoney() {
						return qicaiOldMoney;
					}
					/**
					* 设置： 器材租赁原价/天
					*/
					public void setQicaiOldMoney(Double qicaiOldMoney) {
						this.qicaiOldMoney = qicaiOldMoney;
					}

					/**
					* 获取： 器材租赁现价/天
					*/
					public Double getQicaiNewMoney() {
						return qicaiNewMoney;
					}
					/**
					* 设置： 器材租赁现价/天
					*/
					public void setQicaiNewMoney(Double qicaiNewMoney) {
						this.qicaiNewMoney = qicaiNewMoney;
					}

					/**
					* 获取： 器材热度
					*/
					public Integer getQicaiClicknum() {
						return qicaiClicknum;
					}
					/**
					* 设置： 器材热度
					*/
					public void setQicaiClicknum(Integer qicaiClicknum) {
						this.qicaiClicknum = qicaiClicknum;
					}

					/**
					* 获取： 器材介绍
					*/
					public String getQicaiContent() {
						return qicaiContent;
					}
					/**
					* 设置： 器材介绍
					*/
					public void setQicaiContent(String qicaiContent) {
						this.qicaiContent = qicaiContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getQicaiDelete() {
						return qicaiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setQicaiDelete(Integer qicaiDelete) {
						this.qicaiDelete = qicaiDelete;
					}
















				//级联表的get和set yuangong

					/**
					* 获取： 员工编号
					*/
					public String getYuangongUuidNumber() {
						return yuangongUuidNumber;
					}
					/**
					* 设置： 员工编号
					*/
					public void setYuangongUuidNumber(String yuangongUuidNumber) {
						this.yuangongUuidNumber = yuangongUuidNumber;
					}

					/**
					* 获取： 员工姓名
					*/
					public String getYuangongName() {
						return yuangongName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYuangongName(String yuangongName) {
						this.yuangongName = yuangongName;
					}

					/**
					* 获取： 员工手机号
					*/
					public String getYuangongPhone() {
						return yuangongPhone;
					}
					/**
					* 设置： 员工手机号
					*/
					public void setYuangongPhone(String yuangongPhone) {
						this.yuangongPhone = yuangongPhone;
					}

					/**
					* 获取： 员工身份证号
					*/
					public String getYuangongIdNumber() {
						return yuangongIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYuangongIdNumber(String yuangongIdNumber) {
						this.yuangongIdNumber = yuangongIdNumber;
					}

					/**
					* 获取： 员工头像
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 员工头像
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}






}
