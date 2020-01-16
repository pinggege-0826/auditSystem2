package com.lovo.audit.controller.lh;
import java.util.List;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.entity.lh.PageEntity;
import com.lovo.audit.entity.lxj.SpecificationEntity;
import com.lovo.audit.service.lh.IMarketingService;
import com.lovo.audit.service.lh.ISpecificationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 商品促销接收Controller
 */

@Controller
public class AcceptController {
    @Autowired
    private IMarketingService marketingService;
    @Autowired
    private ISpecificationService specificationService;

    /**
     * 保存队列中传过来的促销方案对象JSON
     * @param promotionPlan  JSON促销方案
     */
    @RequestMapping(value = "saveMarketing")
    public void saveMarketing(String promotionPlan){
        MarketingEntity mark = new MarketingEntity();
        SpecificationEntity spe = new SpecificationEntity();
        //保存促销商品
        marketingService.saveMarket(mark);
        //保存促销商品的规格集合对象
        specificationService.saveSpecification(spe);
    }
    /**
     * 展示所有保存了的促销方案信息
     * @return  方案集合
     */
    @RequestMapping(value = "findAllMessage")
    @ResponseBody
    public String findAllMarkMessage(String currPage,String pageSize) throws JsonProcessingException {
        int a = Integer.parseInt(currPage);
        int b = Integer.parseInt(pageSize);
        List<MarketingEntity> list = marketingService.findAllBy(a, b);
        //得到总条数,是总跳数,不是总页数
        int totalPage = marketingService.countAllBy();
        //分页实体bean泛型，底下要用改为自己的
        PageEntity<MarketingEntity> page = new PageEntity<MarketingEntity>();
        page.setList(list);
        page.setTotalPage(totalPage);
        ObjectMapper om = new ObjectMapper();
        return om.writeValueAsString(page);
    }

    @RequestMapping(value = "findById")
    @ResponseBody
    public ModelAndView findById(String id,String value){
        int id2=Integer.parseInt(id);
        ModelAndView modelAndView = new ModelAndView("");
        MarketingEntity mark = marketingService.findById(id2);
        if(value.equals("未通过")){

        }else if(value.equals("已通过")){

        }else if(value.equals("已审核")){

        }
        return modelAndView;
    }

    @RequestMapping(value = "delById/{id}")
    @ResponseBody
    public String delById(@PathVariable("id")String id){
        int a = Integer.parseInt(id);
        marketingService.getIdUpStatus(a,3);
        return "0";
    }
}
