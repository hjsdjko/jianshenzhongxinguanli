package com.dao;

import com.entity.QicaiWeihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaiWeihuView;

/**
 * 器材维护 Dao 接口
 *
 * @author 
 */
public interface QicaiWeihuDao extends BaseMapper<QicaiWeihuEntity> {

   List<QicaiWeihuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
