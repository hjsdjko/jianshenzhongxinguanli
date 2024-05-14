
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 器材
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/qicai")
public class QicaiController {
    private static final Logger logger = LoggerFactory.getLogger(QicaiController.class);

    @Autowired
    private QicaiService qicaiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private HuiyuanService huiyuanService;
    @Autowired
    private YuangongService yuangongService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("会员".equals(role))
            params.put("huiyuanId",request.getSession().getAttribute("userId"));
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        params.put("qicaiDeleteStart",1);params.put("qicaiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = qicaiService.queryPage(params);

        //字典表数据转换
        List<QicaiView> list =(List<QicaiView>)page.getList();
        for(QicaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QicaiEntity qicai = qicaiService.selectById(id);
        if(qicai !=null){
            //entity转view
            QicaiView view = new QicaiView();
            BeanUtils.copyProperties( qicai , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QicaiEntity qicai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,qicai:{}",this.getClass().getName(),qicai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<QicaiEntity> queryWrapper = new EntityWrapper<QicaiEntity>()
            .eq("qicai_name", qicai.getQicaiName())
            .eq("qicai_uuid_number", qicai.getQicaiUuidNumber())
            .eq("qicai_types", qicai.getQicaiTypes())
            .eq("qicai_kucun_number", qicai.getQicaiKucunNumber())
            .eq("qicai_clicknum", qicai.getQicaiClicknum())
            .eq("shangxia_types", qicai.getShangxiaTypes())
            .eq("qicai_delete", qicai.getQicaiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QicaiEntity qicaiEntity = qicaiService.selectOne(queryWrapper);
        if(qicaiEntity==null){
            qicai.setQicaiClicknum(1);
            qicai.setShangxiaTypes(1);
            qicai.setQicaiDelete(1);
            qicai.setCreateTime(new Date());
            qicaiService.insert(qicai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QicaiEntity qicai, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,qicai:{}",this.getClass().getName(),qicai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<QicaiEntity> queryWrapper = new EntityWrapper<QicaiEntity>()
            .notIn("id",qicai.getId())
            .andNew()
            .eq("qicai_name", qicai.getQicaiName())
            .eq("qicai_uuid_number", qicai.getQicaiUuidNumber())
            .eq("qicai_types", qicai.getQicaiTypes())
            .eq("qicai_kucun_number", qicai.getQicaiKucunNumber())
            .eq("qicai_clicknum", qicai.getQicaiClicknum())
            .eq("shangxia_types", qicai.getShangxiaTypes())
            .eq("qicai_delete", qicai.getQicaiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QicaiEntity qicaiEntity = qicaiService.selectOne(queryWrapper);
        if("".equals(qicai.getQicaiPhoto()) || "null".equals(qicai.getQicaiPhoto())){
                qicai.setQicaiPhoto(null);
        }
        if(qicaiEntity==null){
            qicaiService.updateById(qicai);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<QicaiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            QicaiEntity qicaiEntity = new QicaiEntity();
            qicaiEntity.setId(id);
            qicaiEntity.setQicaiDelete(2);
            list.add(qicaiEntity);
        }
        if(list != null && list.size() >0){
            qicaiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<QicaiEntity> qicaiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            QicaiEntity qicaiEntity = new QicaiEntity();
//                            qicaiEntity.setQicaiName(data.get(0));                    //器材名称 要改的
//                            qicaiEntity.setQicaiUuidNumber(data.get(0));                    //器材编号 要改的
//                            qicaiEntity.setQicaiPhoto("");//详情和图片
//                            qicaiEntity.setQicaiTypes(Integer.valueOf(data.get(0)));   //器材类型 要改的
//                            qicaiEntity.setQicaiKucunNumber(Integer.valueOf(data.get(0)));   //器材数量 要改的
//                            qicaiEntity.setQicaiOldMoney(data.get(0));                    //器材租赁原价/天 要改的
//                            qicaiEntity.setQicaiNewMoney(data.get(0));                    //器材租赁现价/天 要改的
//                            qicaiEntity.setQicaiClicknum(Integer.valueOf(data.get(0)));   //器材热度 要改的
//                            qicaiEntity.setQicaiContent("");//详情和图片
//                            qicaiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            qicaiEntity.setQicaiDelete(1);//逻辑删除字段
//                            qicaiEntity.setCreateTime(date);//时间
                            qicaiList.add(qicaiEntity);


                            //把要查询是否重复的字段放入map中
                                //器材编号
                                if(seachFields.containsKey("qicaiUuidNumber")){
                                    List<String> qicaiUuidNumber = seachFields.get("qicaiUuidNumber");
                                    qicaiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> qicaiUuidNumber = new ArrayList<>();
                                    qicaiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("qicaiUuidNumber",qicaiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //器材编号
                        List<QicaiEntity> qicaiEntities_qicaiUuidNumber = qicaiService.selectList(new EntityWrapper<QicaiEntity>().in("qicai_uuid_number", seachFields.get("qicaiUuidNumber")).eq("qicai_delete", 1));
                        if(qicaiEntities_qicaiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QicaiEntity s:qicaiEntities_qicaiUuidNumber){
                                repeatFields.add(s.getQicaiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [器材编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        qicaiService.insertBatch(qicaiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = qicaiService.queryPage(params);

        //字典表数据转换
        List<QicaiView> list =(List<QicaiView>)page.getList();
        for(QicaiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QicaiEntity qicai = qicaiService.selectById(id);
            if(qicai !=null){

                //点击数量加1
                qicai.setQicaiClicknum(qicai.getQicaiClicknum()+1);
                qicaiService.updateById(qicai);

                //entity转view
                QicaiView view = new QicaiView();
                BeanUtils.copyProperties( qicai , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody QicaiEntity qicai, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,qicai:{}",this.getClass().getName(),qicai.toString());
        Wrapper<QicaiEntity> queryWrapper = new EntityWrapper<QicaiEntity>()
            .eq("qicai_name", qicai.getQicaiName())
            .eq("qicai_uuid_number", qicai.getQicaiUuidNumber())
            .eq("qicai_types", qicai.getQicaiTypes())
            .eq("qicai_kucun_number", qicai.getQicaiKucunNumber())
            .eq("qicai_clicknum", qicai.getQicaiClicknum())
            .eq("shangxia_types", qicai.getShangxiaTypes())
            .eq("qicai_delete", qicai.getQicaiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QicaiEntity qicaiEntity = qicaiService.selectOne(queryWrapper);
        if(qicaiEntity==null){
            qicai.setQicaiDelete(1);
            qicai.setCreateTime(new Date());
        qicaiService.insert(qicai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
