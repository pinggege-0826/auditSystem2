package com.lovo.audit.send.lh;


import com.lovo.audit.get.GetMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class SendDirectQueueControoler {

     //注入MQ模板
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    GetMessage getMessage;

    @RequestMapping("gotoMessagePage")
    public ModelAndView gotoUserPage(){
        ModelAndView mv=new ModelAndView("message");

        return mv;
    }
    @RequestMapping("gotoMessagePage2")
    public ModelAndView gotoUserPage2(){
        ModelAndView mv=new ModelAndView("show");

        return mv;
    }

    @RequestMapping("getUserName")
    public  String getUserName() throws InterruptedException {
        //获得队列的数据
        String str=getMessage.queue.take();
        System.out.println(str);
        return str;
    }
    @RequestMapping("topic")
    public  String topic(){
        rabbitTemplate.convertAndSend("myfanoutExchange","","mytopic");
        return "ok";
    }
}
