package com.lovo.audit.get.wl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;

@Component
public class GetMessage {

    public ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(10);

    @RabbitListener(queues = "myqueue")
    public void getMessage(String str) throws Exception{
        queue.put(str);
        System.out.println(str);
    }
    @RabbitListener(queues = "queueOne")
    public void getQueueOne(String str){
        System.out.println("我是第一个队列"+str);
    }
    @RabbitListener(queues = "queueTwo")
    public void getQueueTwo(String str){
        System.out.println("我是第二个队列"+str);
    }
}
