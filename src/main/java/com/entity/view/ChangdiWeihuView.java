package com.entity.view;

import com.entity.ChangdiWeihuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 场地维护
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changdi_weihu")
public class ChangdiWeihuView extends ChangdiWeihuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 场地维护类型的值
		*/
		private String changdiWeihuValue;



		//级联表 changdi
			/**
			* 场地名称
			*/
			private String changdiName;
			/**
			* 场地编号
			*/
			private String changdiUuidNumber;
			/**
			* 场地照片
			*/
			private String changdiPhoto;
			/**
			* 场地类型
			*/
			private Integer changdiTypes;
				/**
				* 场地类型的值
				*/
				private String changdiValue;
			/**
			* 场地租赁原价
			*/
			private Double changdiOldMoney;
			/**
			* 场地租赁现价
			*/
			private Double changdiNewMoney;
			/**
			* 场地介绍
			*/
			private String changdiContent;
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
			private Integer changdiDelete;

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

	public ChangdiWeihuView() {

	}

	public ChangdiWeihuView(ChangdiWeihuEntity changdiWeihuEntity) {
		try {
			BeanUtils.copyProperties(this, changdiWeihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 场地维护类型的值
			*/
			public String getChangdiWeihuValue() {
				return changdiWeihuValue;
			}
			/**
			* 设置： 场地维护类型的值
			*/
			public void setChangdiWeihuValue(String changdiWeihuValue) {
				this.changdiWeihuValue = changdiWeihuValue;
			}




				//级联表的get和set changdi

					/**
					* 获取： 场地名称
					*/
					public String getChangdiName() {
						return changdiName;
					}
					/**
					* 设置： 场地名称
					*/
					public void setChangdiName(String changdiName) {
						this.changdiName = changdiName;
					}

					/**
					* 获取： 场地编号
					*/
					public String getChangdiUuidNumber() {
						return changdiUuidNumber;
					}
					/**
					* 设置： 场地编号
					*/
					public void setChangdiUuidNumber(String changdiUuidNumber) {
						this.changdiUuidNumber = changdiUuidNumber;
					}

					/**
					* 获取： 场地照片
					*/
					public String getChangdiPhoto() {
						return changdiPhoto;
					}
					/**
					* 设置： 场地照片
					*/
					public void setChangdiPhoto(String changdiPhoto) {
						this.changdiPhoto = changdiPhoto;
					}

					/**
					* 获取： 场地类型
					*/
					public Integer getChangdiTypes() {
						return changdiTypes;
					}
					/**
					* 设置： 场地类型
					*/
					public void setChangdiTypes(Integer changdiTypes) {
						this.changdiTypes = changdiTypes;
					}


						/**
						* 获取： 场地类型的值
						*/
						public String getChangdiValue() {
							return changdiValue;
						}
						/**
						* 设置： 场地类型的值
						*/
						public void setChangdiValue(String changdiValue) {
							this.changdiValue = changdiValue;
						}

					/**
					* 获取： 场地租赁原价
					*/
					public Double getChangdiOldMoney() {
						return changdiOldMoney;
					}
					/**
					* 设置： 场地租赁原价
					*/
					public void setChangdiOldMoney(Double changdiOldMoney) {
						this.changdiOldMoney = changdiOldMoney;
					}

					/**
					* 获取： 场地租赁现价
					*/
					public Double getChangdiNewMoney() {
						return changdiNewMoney;
					}
					/**
					* 设置： 场地租赁现价
					*/
					public void setChangdiNewMoney(Double changdiNewMoney) {
						this.changdiNewMoney = changdiNewMoney;
					}

					/**
					* 获取： 场地介绍
					*/
					public String getChangdiContent() {
						return changdiContent;
					}
					/**
					* 设置： 场地介绍
					*/
					public void setChangdiContent(String changdiContent) {
						this.changdiContent = changdiContent;
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
					public Integer getChangdiDelete() {
						return changdiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setChangdiDelete(Integer changdiDelete) {
						this.changdiDelete = changdiDelete;
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
