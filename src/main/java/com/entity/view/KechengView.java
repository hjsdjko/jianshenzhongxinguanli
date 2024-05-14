package com.entity.view;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String kechengValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



		//级联表 jiaolian
			/**
			* 教练编号
			*/
			private String jiaolianUuidNumber;
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 教练手机号
			*/
			private String jiaolianPhone;
			/**
			* 教练身份证号
			*/
			private String jiaolianIdNumber;
			/**
			* 教练头像
			*/
			private String jiaolianPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 教练擅长
			*/
			private String jiaolianShanchang;
			/**
			* 任职时长
			*/
			private String jiaolianShichang;
			/**
			* 教练介绍
			*/
			private String jiaolianContent;

	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课程类型的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 课程类型的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
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
















				//级联表的get和set jiaolian

					/**
					* 获取： 教练编号
					*/
					public String getJiaolianUuidNumber() {
						return jiaolianUuidNumber;
					}
					/**
					* 设置： 教练编号
					*/
					public void setJiaolianUuidNumber(String jiaolianUuidNumber) {
						this.jiaolianUuidNumber = jiaolianUuidNumber;
					}

					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}

					/**
					* 获取： 教练手机号
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 教练手机号
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}

					/**
					* 获取： 教练身份证号
					*/
					public String getJiaolianIdNumber() {
						return jiaolianIdNumber;
					}
					/**
					* 设置： 教练身份证号
					*/
					public void setJiaolianIdNumber(String jiaolianIdNumber) {
						this.jiaolianIdNumber = jiaolianIdNumber;
					}

					/**
					* 获取： 教练头像
					*/
					public String getJiaolianPhoto() {
						return jiaolianPhoto;
					}
					/**
					* 设置： 教练头像
					*/
					public void setJiaolianPhoto(String jiaolianPhoto) {
						this.jiaolianPhoto = jiaolianPhoto;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 教练擅长
					*/
					public String getJiaolianShanchang() {
						return jiaolianShanchang;
					}
					/**
					* 设置： 教练擅长
					*/
					public void setJiaolianShanchang(String jiaolianShanchang) {
						this.jiaolianShanchang = jiaolianShanchang;
					}

					/**
					* 获取： 任职时长
					*/
					public String getJiaolianShichang() {
						return jiaolianShichang;
					}
					/**
					* 设置： 任职时长
					*/
					public void setJiaolianShichang(String jiaolianShichang) {
						this.jiaolianShichang = jiaolianShichang;
					}

					/**
					* 获取： 教练介绍
					*/
					public String getJiaolianContent() {
						return jiaolianContent;
					}
					/**
					* 设置： 教练介绍
					*/
					public void setJiaolianContent(String jiaolianContent) {
						this.jiaolianContent = jiaolianContent;
					}






















}
