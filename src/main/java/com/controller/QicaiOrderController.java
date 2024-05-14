
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
 * 器材租赁
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/qicaiOrder")
public class QicaiOrderController {
    private static final Logger logger = LoggerFactory.getLogger(QicaiOrderController.class);

    @Autowired
    private QicaiOrderService qicaiOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private HuiyuanService huiyuanService;
    @Autowired
    private QicaiService qicaiService;



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
        PageUtils page = qicaiOrderService.queryPage(params);

        //字典表数据转换
        List<QicaiOrderView> list =(List<QicaiOrderView>)page.getList();
        for(QicaiOrderView c:list){
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
        QicaiOrderEntity qicaiOrder = qicaiOrderService.selectById(id);
        if(qicaiOrder !=null){
            //entity转view
            QicaiOrderView view = new QicaiOrderView();
            BeanUtils.copyProperties( qicaiOrder , view );//把实体数据重构到view中

                //级联表
                HuiyuanEntity huiyuan = huiyuanService.selectById(qicaiOrder.getHuiyuanId());
                if(huiyuan != null){
                    BeanUtils.copyProperties( huiyuan , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setHuiyuanId(huiyuan.getId());
                }
                //级联表
                QicaiEntity qicai = qicaiService.selectById(qicaiOrder.getQicaiId());
                if(qicai != null){
                    BeanUtils.copyProperties( qicai , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setQicaiId(qicai.getId());
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
    public R save(@RequestBody QicaiOrderEntity qicaiOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,qicaiOrder:{}",this.getClass().getName(),qicaiOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("会员".equals(role))
            qicaiOrder.setHuiyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        qicaiOrder.setInsertTime(new Date());
        qicaiOrder.setCreateTime(new Date());
        qicaiOrderService.insert(qicaiOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QicaiOrderEntity qicaiOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,qicaiOrder:{}",this.getClass().getName(),qicaiOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("会员".equals(role))
//            qicaiOrder.setHuiyuanId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<QicaiOrderEntity> queryWrapper = new EntityWrapper<QicaiOrderEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QicaiOrderEntity qicaiOrderEntity = qicaiOrderService.selectOne(queryWrapper);
        if(qicaiOrderEntity==null){
            qicaiOrderService.updateById(qicaiOrder);//根据id更新
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
        qicaiOrderService.deleteBatchIds(Arrays.asList(ids));
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
            List<QicaiOrderEntity> qicaiOrderList = new ArrayList<>();//上传的东西
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
                            QicaiOrderEntity qicaiOrderEntity = new QicaiOrderEntity();
//                            qicaiOrderEntity.setQicaiOrderUuidNumber(data.get(0));                    //租赁流水号 要改的
//                            qicaiOrderEntity.setQicaiId(Integer.valueOf(data.get(0)));   //器材 要改的
//                            qicaiOrderEntity.setHuiyuanId(Integer.valueOf(data.get(0)));   //会员 要改的
//                            qicaiOrderEntity.setInsertTime(date);//时间
//                            qicaiOrderEntity.setGuihuanTime(sdf.parse(data.get(0)));          //归还时间 要改的
//                            qicaiOrderEntity.setQicaiZulinTian(Integer.valueOf(data.get(0)));   //租赁天数 要改的
//                            qicaiOrderEntity.setQicaiOrderTruePrice(data.get(0));                    //实付金额 要改的
//                            qicaiOrderEntity.setQicaiOrderTypes(Integer.valueOf(data.get(0)));   //器材租赁状态 要改的
//                            qicaiOrderEntity.setCreateTime(date);//时间
                            qicaiOrderList.add(qicaiOrderEntity);


                            //把要查询是否重复的字段放入map中
                                //租赁流水号
                                if(seachFields.containsKey("qicaiOrderUuidNumber")){
                                    List<String> qicaiOrderUuidNumber = seachFields.get("qicaiOrderUuidNumber");
                                    qicaiOrderUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> qicaiOrderUuidNumber = new ArrayList<>();
                                    qicaiOrderUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("qicaiOrderUuidNumber",qicaiOrderUuidNumber);
                                }
                        }

                        //查询是否重复
                         //租赁流水号
                        List<QicaiOrderEntity> qicaiOrderEntities_qicaiOrderUuidNumber = qicaiOrderService.selectList(new EntityWrapper<QicaiOrderEntity>().in("qicai_order_uuid_number", seachFields.get("qicaiOrderUuidNumber")));
                        if(qicaiOrderEntities_qicaiOrderUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QicaiOrderEntity s:qicaiOrderEntities_qicaiOrderUuidNumber){
                                repeatFields.add(s.getQicaiOrderUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [租赁流水号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        qicaiOrderService.insertBatch(qicaiOrderList);
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
        PageUtils page = qicaiOrderService.queryPage(params);

        //字典表数据转换
        List<QicaiOrderView> list =(List<QicaiOrderView>)page.getList();
        for(QicaiOrderView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QicaiOrderEntity qicaiOrder = qicaiOrderService.selectById(id);
            if(qicaiOrder !=null){


                //entity转view
                QicaiOrderView view = new QicaiOrderView();
                BeanUtils.copyProperties( qicaiOrder , view );//把实体数据重构到view中

                //级联表
                    HuiyuanEntity huiyuan = huiyuanService.selectById(qicaiOrder.getHuiyuanId());
                if(huiyuan != null){
                    BeanUtils.copyProperties( huiyuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setHuiyuanId(huiyuan.getId());
                }
                //级联表
                    QicaiEntity qicai = qicaiService.selectById(qicaiOrder.getQicaiId());
                if(qicai != null){
                    BeanUtils.copyProperties( qicai , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setQicaiId(qicai.getId());
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
    public R add(@RequestBody QicaiOrderEntity qicaiOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,qicaiOrder:{}",this.getClass().getName(),qicaiOrder.toString());
            QicaiEntity qicaiEntity = qicaiService.selectById(qicaiOrder.getQicaiId());
        qicaiOrder.setInsertTime(new Date());
        qicaiOrder.setCreateTime(new Date());

            if(qicaiEntity == null){
                return R.error(511,"查不到该器材");
            }
            // Double qicaiNewMoney = qicaiEntity.getQicaiNewMoney();

            if(false){
            }
            else if((qicaiEntity.getQicaiKucunNumber() -1)<0){
                return R.error(511,"购买数量不能大于库存数量");
            }
            else if(qicaiEntity.getQicaiNewMoney() == null){
                return R.error(511,"器材价格不能为空");
            }


        Long l =   qicaiOrder.getGuihuanTime().getTime()-qicaiOrder.getInsertTime().getTime();
        if(l.intValue()==0){
            qicaiOrder.setQicaiZulinTian(1);
        }else{
            Long l1 = l / (24 * 60 * 60 * 1000);
            qicaiOrder.setQicaiZulinTian(l1.intValue()+1);
        }


        //计算所获得积分
            Double buyJifen =0.0;
            Integer userId = (Integer) request.getSession().getAttribute("userId");
            HuiyuanEntity huiyuanEntity = huiyuanService.selectById(userId);
            if(huiyuanEntity == null)
                return R.error(511,"用户不能为空");
            if(huiyuanEntity.getNewMoney() == null)
                return R.error(511,"用户金额不能为空");
            double balance = huiyuanEntity.getNewMoney() - qicaiEntity.getQicaiNewMoney()*1*qicaiOrder.getQicaiZulinTian();//余额
            if(balance<0)
                return R.error(511,"余额不够支付");
            qicaiOrder.setQicaiOrderTypes(1); //设置订单状态为已支付
            qicaiOrder.setQicaiOrderTruePrice(qicaiEntity.getQicaiNewMoney()*qicaiOrder.getQicaiZulinTian()); //设置实付价格
            qicaiOrder.setHuiyuanId(userId); //设置订单支付人id
            qicaiOrder.setQicaiOrderUuidNumber(String.valueOf(new Date().getTime()));
                qicaiEntity.setQicaiKucunNumber( qicaiEntity.getQicaiKucunNumber() -1);
                qicaiService.updateById(qicaiEntity);
                qicaiOrderService.insert(qicaiOrder);//新增订单
            huiyuanEntity.setNewMoney(balance);//设置金额
            huiyuanService.updateById(huiyuanEntity);
            return R.ok();
    }

    /**
    * 退款
    */
    @RequestMapping("/refund")
    public R refund(Integer id, HttpServletRequest request){
        logger.debug("refund方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        String role = String.valueOf(request.getSession().getAttribute("role"));

            QicaiOrderEntity qicaiOrder = qicaiOrderService.selectById(id);
            Integer qicaiId = qicaiOrder.getQicaiId();
            if(qicaiId == null)
                return R.error(511,"查不到该器材");
            QicaiEntity qicaiEntity = qicaiService.selectById(qicaiId);
            if(qicaiEntity == null)
                return R.error(511,"查不到该器材");
            Double qicaiNewMoney = qicaiEntity.getQicaiNewMoney();
            if(qicaiNewMoney == null)
                return R.error(511,"器材价格不能为空");

            Integer userId = (Integer) request.getSession().getAttribute("userId");
            HuiyuanEntity huiyuanEntity = huiyuanService.selectById(userId);
            if(huiyuanEntity == null)
                return R.error(511,"用户不能为空");
            if(huiyuanEntity.getNewMoney() == null)
                return R.error(511,"用户金额不能为空");

            Double zhekou = 1.0;


            //判断是什么支付方式 1代表余额 2代表积分
                //计算金额
                Double money = qicaiEntity.getQicaiNewMoney() * 1*qicaiOrder.getQicaiZulinTian()  * zhekou;
                //计算所获得积分
                Double buyJifen = 0.0;
                huiyuanEntity.setNewMoney(huiyuanEntity.getNewMoney() + money); //设置金额



            qicaiEntity.setQicaiKucunNumber(qicaiEntity.getQicaiKucunNumber() + 1);



            qicaiOrder.setQicaiOrderTypes(2);//设置订单状态为退款
            qicaiOrderService.updateById(qicaiOrder);//根据id更新
            huiyuanService.updateById(huiyuanEntity);//更新用户信息
            qicaiService.updateById(qicaiEntity);//更新订单中器材的信息
            return R.ok();
    }


    /**
     * 完成
     */
    @RequestMapping("/deliver")
    public R deliver(Integer id ){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        QicaiOrderEntity  qicaiOrderEntity = new  QicaiOrderEntity();;
        qicaiOrderEntity.setId(id);
        qicaiOrderEntity.setQicaiOrderTypes(3);
        boolean b =  qicaiOrderService.updateById( qicaiOrderEntity);
        if(!b){
            return R.error("完成出错");
        }
        return R.ok();
    }














    /**
     * 归还
     */
    @RequestMapping("/receiving")
    public R receiving(Integer id){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        QicaiOrderEntity  qicaiOrderEntity = new  QicaiOrderEntity();
        qicaiOrderEntity.setId(id);
        qicaiOrderEntity.setQicaiOrderTypes(4);
        boolean b =  qicaiOrderService.updateById( qicaiOrderEntity);

        QicaiOrderEntity qicaiOrderEntity1 = qicaiOrderService.selectById(qicaiOrderEntity.getId());


        QicaiEntity qicaiEntity = qicaiService.selectById(qicaiOrderEntity1.getQicaiId());
        if(qicaiEntity != null){
            qicaiEntity.setQicaiKucunNumber(qicaiEntity.getQicaiKucunNumber()+1);
            qicaiService.updateById(qicaiEntity);
        }
        if(!b){
            return R.error("归还出错");
        }
        return R.ok();
    }










}
