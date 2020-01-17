package com.lovo.audit.faSongController.lh;

import com.lovo.audit.service.lh.IMarketingService;
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

    @RequestMapping("tongGuo/{id}")
    public String shtgMessageById(@PathVariable("id")String id){
        int a = Integer.parseInt(id);
        marketingService.getIdUpStatus(a,2);
        return "0";
    }

    @RequestMapping("noTongGuo")
    public String noMessageById(String id,String neiRon){
        int a = Integer.parseInt(id);
        System.out.println(neiRon);
        marketingService.getIdUpStatus(a,1);
        return "0";
    }
}
