package com.entity.view;

import com.entity.KechengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_collection")
public class KechengCollectionView extends KechengCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String kechengCollectionValue;



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

		//级联表 kecheng
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
				* 课程类型的值
				*/
				private String kechengValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer kechengDelete;

	public KechengCollectionView() {

	}

	public KechengCollectionView(KechengCollectionEntity kechengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kechengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getKechengCollectionValue() {
				return kechengCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setKechengCollectionValue(String kechengCollectionValue) {
				this.kechengCollectionValue = kechengCollectionValue;
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





				//级联表的get和set kecheng


					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程编号
					*/
					public String getKechengUuidNumber() {
						return kechengUuidNumber;
					}
					/**
					* 设置： 课程编号
					*/
					public void setKechengUuidNumber(String kechengUuidNumber) {
						this.kechengUuidNumber = kechengUuidNumber;
					}

					/**
					* 获取： 课程照片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程照片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
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
					* 获取： 课程开始时间
					*/
					public Date getKechengKaishiTime() {
						return kechengKaishiTime;
					}
					/**
					* 设置： 课程开始时间
					*/
					public void setKechengKaishiTime(Date kechengKaishiTime) {
						this.kechengKaishiTime = kechengKaishiTime;
					}

					/**
					* 获取： 课程结束时间
					*/
					public Date getKechengJieshuTime() {
						return kechengJieshuTime;
					}
					/**
					* 设置： 课程结束时间
					*/
					public void setKechengJieshuTime(Date kechengJieshuTime) {
						this.kechengJieshuTime = kechengJieshuTime;
					}

					/**
					* 获取： 最大报名人数
					*/
					public Integer getKechengNumber() {
						return kechengNumber;
					}
					/**
					* 设置： 最大报名人数
					*/
					public void setKechengNumber(Integer kechengNumber) {
						this.kechengNumber = kechengNumber;
					}

					/**
					* 获取： 课程原价
					*/
					public Double getKechengOldMoney() {
						return kechengOldMoney;
					}
					/**
					* 设置： 课程原价
					*/
					public void setKechengOldMoney(Double kechengOldMoney) {
						this.kechengOldMoney = kechengOldMoney;
					}

					/**
					* 获取： 课程现价
					*/
					public Double getKechengNewMoney() {
						return kechengNewMoney;
					}
					/**
					* 设置： 课程现价
					*/
					public void setKechengNewMoney(Double kechengNewMoney) {
						this.kechengNewMoney = kechengNewMoney;
					}

					/**
					* 获取： 课程热度
					*/
					public Integer getKechengClicknum() {
						return kechengClicknum;
					}
					/**
					* 设置： 课程热度
					*/
					public void setKechengClicknum(Integer kechengClicknum) {
						this.kechengClicknum = kechengClicknum;
					}

					/**
					* 获取： 课程介绍
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程介绍
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
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
					public Integer getKechengDelete() {
						return kechengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKechengDelete(Integer kechengDelete) {
						this.kechengDelete = kechengDelete;
					}































}
