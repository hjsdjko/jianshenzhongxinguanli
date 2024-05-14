package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.ChangdiCollectionDao;
import com.entity.ChangdiCollectionEntity;
import com.service.ChangdiCollectionService;
import com.entity.view.ChangdiCollectionView;

/**
 * 场地收藏 服务实现类
 */
@Service("changdiCollectionService")
@Transactional
public class ChangdiCollectionServiceImpl extends ServiceImpl<ChangdiCollectionDao, ChangdiCollectionEntity> implements ChangdiCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ChangdiCollectionView> page =new Query<ChangdiCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
