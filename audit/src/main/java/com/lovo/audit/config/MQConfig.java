/*
package com.lovo.audit.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
public class MQConfig {
    //注入工厂
    @Autowired
    private CachingConnectionFactory connectionFactory;
  //创建交换机
    @Bean
    public DirectExchange createDirectExchange(){
        return  new DirectExchange("myFirstDirect");
    }

    //创建队列
    @Bean
    public Queue createQueue(){
        return  new Queue("myqueue");
    }
    //创建电影院1接收队列
    @Bean
    public Queue createQueueOne(){
        return  new Queue("queueOne");
    }
    //创建电影院2接收队列
    @Bean
    public Queue createQueueTwo(){
        return  new Queue("queueTwo");
    }

    //订阅发布交换机
    @Bean
    public FanoutExchange createFanoutExchange(){
        return  new FanoutExchange("myfanoutExchange");
    }

    //绑定队列
    @Bean
    public Binding bindingDirectExchange(Queue createQueue, DirectExchange createDirectExchange){
        return BindingBuilder.bind(createQueue).to(createDirectExchange).with("j173");
    }

   @Bean
    public RabbitTemplate createRabbitTemplate(){

       RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);

       return rabbitTemplate;

   }
    @Bean
    public Binding bindingFanOutExchangeOne(Queue createQueueOne, FanoutExchange createFanoutExchange){
        return BindingBuilder.bind(createQueueOne).to(createFanoutExchange);
    }
    @Bean
    public Binding bindingFanOutExchangeTwo(Queue createQueueTwo, FanoutExchange createFanoutExchange){
        return BindingBuilder.bind(createQueueTwo).to(createFanoutExchange);
    }

    //websocket 放入到spring容器
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
*/
