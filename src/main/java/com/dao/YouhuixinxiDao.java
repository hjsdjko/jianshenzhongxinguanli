package com.dao;

import com.entity.YouhuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouhuixinxiView;

/**
 * 优惠信息 Dao 接口
 *
 * @author 
 */
public interface YouhuixinxiDao extends BaseMapper<YouhuixinxiEntity> {

   List<YouhuixinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
