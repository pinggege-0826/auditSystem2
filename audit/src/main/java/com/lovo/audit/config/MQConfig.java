
package com.lovo.audit.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 发送消息队列
 */
@Configuration
public class MQConfig {
    //注入工厂
    @Autowired
    private CachingConnectionFactory connectionFactory;

    //创建交换机
    @Bean
    public DirectExchange createDirectExchange(){
        return  new DirectExchange("lovoSanZu");
    }

    /**
     * 促销审核发送消息队列
     */
    @Bean
    public Queue getSalesPassFromCheckQueue(){
        return  new Queue("getSalesPassFromCheckQueue");
    }

    /**
     * 供应商审核发送消息队列
     */
    @Bean
    public Queue auditResultQueue(){
        return  new Queue("auditResultQueue");
    }

    /**
     * 采购单审核发送消息队列
     */
    @Bean
    public Queue sendPurchaseMessageQueue(){
        return new Queue("sendPurchaseMessageQueue");
    }

    /**
     *绑定采购单审核发送消息队列
     */
    @Bean
    public Binding purchaseDirectExchange(Queue sendPurchaseMessageQueue, DirectExchange createDirectExchange){
        return BindingBuilder.bind(sendPurchaseMessageQueue).to(createDirectExchange).with("sendPurchase");
    }

    /**
     * 绑定促销审核发送消息队列
     */
    @Bean
    public Binding bindingDirectExchange(Queue getSalesPassFromCheckQueue, DirectExchange createDirectExchange){
        return BindingBuilder.bind(getSalesPassFromCheckQueue).to(createDirectExchange).with("shuFu");
    }
    /**
     * 绑定供应商审核发送消息队列
     */
    @Bean
    public Binding auditDirectExchange(Queue auditResultQueue, DirectExchange createDirectExchange){
        return BindingBuilder.bind(auditResultQueue).to(createDirectExchange).with("auditResult");
    }


    /**
     * 返回MQ模板(不用管)
     * @return  模板Template
     */
    @Bean
    public RabbitTemplate createRabbitTemplate(){
       RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
       return rabbitTemplate;
   }



    //websocket 放入到spring容器
    /*@Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }*/
}
