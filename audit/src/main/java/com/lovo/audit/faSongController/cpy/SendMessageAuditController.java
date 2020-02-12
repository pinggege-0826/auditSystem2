package com.lovo.audit.faSongController.cpy;

import com.lovo.audit.entity.cpy.CompanyEntity;
import com.lovo.audit.entity.lh.MarketingEntity;
import com.lovo.audit.service.cpy.ICompanyService;
import com.lovo.audit.service.lh.IMarketingService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发送消息控制层
 */
@Controller
public class SendMessageAuditController {
    @Autowired
    private ICompanyService companyService;

    //注入MQ模板
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("updateCompany")
    @ResponseBody
    @Transactional
    public String updateCompany(CompanyEntity company){
        String level = company.getCompanyLevel();
        Integer id = company.getId();
        CompanyEntity byId = companyService.findCompanyById(id);
        String companyName = byId.getCompanyName();
        //商品编号+通过放入到队列中
        rabbitTemplate.convertAndSend("lovoSanZu","auditResult"
                ,companyName+"通过");
        companyService.updateStatusById(level,id);
        return "修改成功";
    }

//    @RequestMapping("noQuestion/{id}")
//    public String backMessageById(@PathVariable("id")String id){
//        int companyId = Integer.parseInt(id);
//        CompanyEntity byId = companyService.findCompanyById(companyId);
//        String companyName = byId.getCompanyName();
//        //商品编号+通过放入到队列中
//        rabbitTemplate.convertAndSend("lovoSanZu","auditResult"
//                ,companyName+"通过");
//        companyService.updateStatus(companyId);
//        return "0";
//    }

    @RequestMapping("questionFeedBack")
    @ResponseBody
    public String noMessageById(String id,String question){
        int a = Integer.parseInt(id);
        rabbitTemplate.convertAndSend("lovoSanZu","auditResult",question);
        companyService.updateStatus(a);
        return "0";
    }
}
