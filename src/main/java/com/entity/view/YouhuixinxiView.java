package com.entity.view;

import com.entity.YouhuixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 优惠信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("youhuixinxi")
public class YouhuixinxiView extends YouhuixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 优惠信息类型的值
		*/
		private String youhuixinxiValue;



	public YouhuixinxiView() {

	}

	public YouhuixinxiView(YouhuixinxiEntity youhuixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, youhuixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 优惠信息类型的值
			*/
			public String getYouhuixinxiValue() {
				return youhuixinxiValue;
			}
			/**
			* 设置： 优惠信息类型的值
			*/
			public void setYouhuixinxiValue(String youhuixinxiValue) {
				this.youhuixinxiValue = youhuixinxiValue;
			}




















}
