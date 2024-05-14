
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
 * 场地维护
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/changdiWeihu")
public class ChangdiWeihuController {
    private static final Logger logger = LoggerFactory.getLogger(ChangdiWeihuController.class);

    @Autowired
    private ChangdiWeihuService changdiWeihuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ChangdiService changdiService;
    @Autowired
    private YuangongService yuangongService;

    @Autowired
    private HuiyuanService huiyuanService;


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
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = changdiWeihuService.queryPage(params);

        //字典表数据转换
        List<ChangdiWeihuView> list =(List<ChangdiWeihuView>)page.getList();
        for(ChangdiWeihuView c:list){
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
        ChangdiWeihuEntity changdiWeihu = changdiWeihuService.selectById(id);
        if(changdiWeihu !=null){
            //entity转view
            ChangdiWeihuView view = new ChangdiWeihuView();
            BeanUtils.copyProperties( changdiWeihu , view );//把实体数据重构到view中

                //级联表
                ChangdiEntity changdi = changdiService.selectById(changdiWeihu.getChangdiId());
                if(changdi != null){
                    BeanUtils.copyProperties( changdi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChangdiId(changdi.getId());
                }
                //级联表
                YuangongEntity yuangong = yuangongService.selectById(changdiWeihu.getYuangongId());
                if(yuangong != null){
                    BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYuangongId(yuangong.getId());
                }
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
    public R save(@RequestBody ChangdiWeihuEntity changdiWeihu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,changdiWeihu:{}",this.getClass().getName(),changdiWeihu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("员工".equals(role))
            changdiWeihu.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChangdiWeihuEntity> queryWrapper = new EntityWrapper<ChangdiWeihuEntity>()
            .eq("changdi_id", changdiWeihu.getChangdiId())
            .eq("yuangong_id", changdiWeihu.getYuangongId())
            .eq("changdi_weihu_uuid_number", changdiWeihu.getChangdiWeihuUuidNumber())
            .eq("changdi_weihu_types", changdiWeihu.getChangdiWeihuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangdiWeihuEntity changdiWeihuEntity = changdiWeihuService.selectOne(queryWrapper);
        if(changdiWeihuEntity==null){
            changdiWeihu.setInsertTime(new Date());
            changdiWeihu.setCreateTime(new Date());
            changdiWeihuService.insert(changdiWeihu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChangdiWeihuEntity changdiWeihu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,changdiWeihu:{}",this.getClass().getName(),changdiWeihu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("员工".equals(role))
//            changdiWeihu.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ChangdiWeihuEntity> queryWrapper = new EntityWrapper<ChangdiWeihuEntity>()
            .notIn("id",changdiWeihu.getId())
            .andNew()
            .eq("changdi_id", changdiWeihu.getChangdiId())
            .eq("yuangong_id", changdiWeihu.getYuangongId())
            .eq("changdi_weihu_uuid_number", changdiWeihu.getChangdiWeihuUuidNumber())
            .eq("changdi_weihu_types", changdiWeihu.getChangdiWeihuTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangdiWeihuEntity changdiWeihuEntity = changdiWeihuService.selectOne(queryWrapper);
        if(changdiWeihuEntity==null){
            changdiWeihuService.updateById(changdiWeihu);//根据id更新
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
        changdiWeihuService.deleteBatchIds(Arrays.asList(ids));
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
            List<ChangdiWeihuEntity> changdiWeihuList = new ArrayList<>();//上传的东西
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
                            ChangdiWeihuEntity changdiWeihuEntity = new ChangdiWeihuEntity();
//                            changdiWeihuEntity.setChangdiId(Integer.valueOf(data.get(0)));   //场地 要改的
//                            changdiWeihuEntity.setYuangongId(Integer.valueOf(data.get(0)));   //员工 要改的
//                            changdiWeihuEntity.setChangdiWeihuUuidNumber(data.get(0));                    //维护编号 要改的
//                            changdiWeihuEntity.setChangdiWeihuTypes(Integer.valueOf(data.get(0)));   //场地维护类型 要改的
//                            changdiWeihuEntity.setChangdiWeihuContent("");//详情和图片
//                            changdiWeihuEntity.setWeihuTime(sdf.parse(data.get(0)));          //维护时间 要改的
//                            changdiWeihuEntity.setInsertTime(date);//时间
//                            changdiWeihuEntity.setCreateTime(date);//时间
                            changdiWeihuList.add(changdiWeihuEntity);


                            //把要查询是否重复的字段放入map中
                                //维护编号
                                if(seachFields.containsKey("changdiWeihuUuidNumber")){
                                    List<String> changdiWeihuUuidNumber = seachFields.get("changdiWeihuUuidNumber");
                                    changdiWeihuUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> changdiWeihuUuidNumber = new ArrayList<>();
                                    changdiWeihuUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("changdiWeihuUuidNumber",changdiWeihuUuidNumber);
                                }
                        }

                        //查询是否重复
                         //维护编号
                        List<ChangdiWeihuEntity> changdiWeihuEntities_changdiWeihuUuidNumber = changdiWeihuService.selectList(new EntityWrapper<ChangdiWeihuEntity>().in("changdi_weihu_uuid_number", seachFields.get("changdiWeihuUuidNumber")));
                        if(changdiWeihuEntities_changdiWeihuUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChangdiWeihuEntity s:changdiWeihuEntities_changdiWeihuUuidNumber){
                                repeatFields.add(s.getChangdiWeihuUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [维护编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        changdiWeihuService.insertBatch(changdiWeihuList);
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
        PageUtils page = changdiWeihuService.queryPage(params);

        //字典表数据转换
        List<ChangdiWeihuView> list =(List<ChangdiWeihuView>)page.getList();
        for(ChangdiWeihuView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChangdiWeihuEntity changdiWeihu = changdiWeihuService.selectById(id);
            if(changdiWeihu !=null){


                //entity转view
                ChangdiWeihuView view = new ChangdiWeihuView();
                BeanUtils.copyProperties( changdiWeihu , view );//把实体数据重构到view中

                //级联表
                    ChangdiEntity changdi = changdiService.selectById(changdiWeihu.getChangdiId());
                if(changdi != null){
                    BeanUtils.copyProperties( changdi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChangdiId(changdi.getId());
                }
                //级联表
                    YuangongEntity yuangong = yuangongService.selectById(changdiWeihu.getYuangongId());
                if(yuangong != null){
                    BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYuangongId(yuangong.getId());
                }
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
    public R add(@RequestBody ChangdiWeihuEntity changdiWeihu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,changdiWeihu:{}",this.getClass().getName(),changdiWeihu.toString());
        Wrapper<ChangdiWeihuEntity> queryWrapper = new EntityWrapper<ChangdiWeihuEntity>()
            .eq("changdi_id", changdiWeihu.getChangdiId())
            .eq("yuangong_id", changdiWeihu.getYuangongId())
            .eq("changdi_weihu_uuid_number", changdiWeihu.getChangdiWeihuUuidNumber())
            .eq("changdi_weihu_types", changdiWeihu.getChangdiWeihuTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChangdiWeihuEntity changdiWeihuEntity = changdiWeihuService.selectOne(queryWrapper);
        if(changdiWeihuEntity==null){
            changdiWeihu.setInsertTime(new Date());
            changdiWeihu.setCreateTime(new Date());
        changdiWeihuService.insert(changdiWeihu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
