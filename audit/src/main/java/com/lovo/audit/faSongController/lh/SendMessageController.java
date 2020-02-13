package com.lovo.audit.faSongController.lh;

import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.service.lh.IMarketingService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发送消息控制层
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMarketingService marketingService;

    //注入MQ模板
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("tongGuo/{id}")
    public String shtgMessageById(@PathVariable("id")String id){
        int a = Integer.parseInt(id);
        MarketingEntity byId = marketingService.findById(a);
        String productCode = byId.getProductCode();
        //商品编号+通过放入到队列中
        rabbitTemplate.convertAndSend("lovoSanZu","shuFu"
        ,productCode+"通过");
        marketingService.getIdUpStatus(a,2);
        return "0";
}

    @RequestMapping("noTongGuo")
    public String noMessageById(String id,String neiRon){
        int a = Integer.parseInt(id);
        rabbitTemplate.convertAndSend("lovoSanZu","shuFu",neiRon);
        marketingService.getIdUpStatus(a,1);
        return "0";
    }

    @RequestMapping("fasong")
    public void test(String ab){

        rabbitTemplate.convertAndSend("lovoSanZu","shuFu",ab);
    }

}
