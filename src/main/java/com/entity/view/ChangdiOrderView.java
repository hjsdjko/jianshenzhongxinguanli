package com.entity.view;

import com.entity.ChangdiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 场地预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changdi_order")
public class ChangdiOrderView extends ChangdiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 场地预约状态的值
		*/
		private String changdiOrderValue;



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

		//级联表 huiyuan
			/**
			* 会员编号
			*/
			private String huiyuanUuidNumber;
			/**
			* 会员姓名
			*/
			private String huiyuanName;
			/**
			* 会员手机号
			*/
			private String huiyuanPhone;
			/**
			* 会员身份证号
			*/
			private String huiyuanIdNumber;
			/**
			* 会员头像
			*/
			private String huiyuanPhoto;
			/**
			* 电子邮箱
			*/
			private String huiyuanEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public ChangdiOrderView() {

	}

	public ChangdiOrderView(ChangdiOrderEntity changdiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, changdiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 场地预约状态的值
			*/
			public String getChangdiOrderValue() {
				return changdiOrderValue;
			}
			/**
			* 设置： 场地预约状态的值
			*/
			public void setChangdiOrderValue(String changdiOrderValue) {
				this.changdiOrderValue = changdiOrderValue;
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
















				//级联表的get和set huiyuan

					/**
					* 获取： 会员编号
					*/
					public String getHuiyuanUuidNumber() {
						return huiyuanUuidNumber;
					}
					/**
					* 设置： 会员编号
					*/
					public void setHuiyuanUuidNumber(String huiyuanUuidNumber) {
						this.huiyuanUuidNumber = huiyuanUuidNumber;
					}

					/**
					* 获取： 会员姓名
					*/
					public String getHuiyuanName() {
						return huiyuanName;
					}
					/**
					* 设置： 会员姓名
					*/
					public void setHuiyuanName(String huiyuanName) {
						this.huiyuanName = huiyuanName;
					}

					/**
					* 获取： 会员手机号
					*/
					public String getHuiyuanPhone() {
						return huiyuanPhone;
					}
					/**
					* 设置： 会员手机号
					*/
					public void setHuiyuanPhone(String huiyuanPhone) {
						this.huiyuanPhone = huiyuanPhone;
					}

					/**
					* 获取： 会员身份证号
					*/
					public String getHuiyuanIdNumber() {
						return huiyuanIdNumber;
					}
					/**
					* 设置： 会员身份证号
					*/
					public void setHuiyuanIdNumber(String huiyuanIdNumber) {
						this.huiyuanIdNumber = huiyuanIdNumber;
					}

					/**
					* 获取： 会员头像
					*/
					public String getHuiyuanPhoto() {
						return huiyuanPhoto;
					}
					/**
					* 设置： 会员头像
					*/
					public void setHuiyuanPhoto(String huiyuanPhoto) {
						this.huiyuanPhoto = huiyuanPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getHuiyuanEmail() {
						return huiyuanEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setHuiyuanEmail(String huiyuanEmail) {
						this.huiyuanEmail = huiyuanEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




































}
