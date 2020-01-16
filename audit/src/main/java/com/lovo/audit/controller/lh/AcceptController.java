package com.lovo.audit.controller.lh;
import java.util.List;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.entity.lh.PageEntity;
import com.lovo.audit.entity.lxj.SpecificationEntity;
import com.lovo.audit.service.lh.IMarketingService;
import com.lovo.audit.service.lh.ISpecificationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * 商品促销接收Controller
 */

@RestController
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
    public String findAllMarkMessage(String currPage,String pageSize) throws JsonProcessingException {
        System.out.println(pageSize);
        System.out.println(currPage);
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

    /**
     * 返回总页数
     * @return  总页数
     */
    @RequestMapping(value = "fenYe")
    public int findToTalPage(){
        return marketingService.countAllBy();
    }

}
