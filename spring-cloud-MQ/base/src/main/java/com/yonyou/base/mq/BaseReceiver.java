package com.yonyou.base.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class BaseReceiver {

    @RabbitListener(queues = "topic.base")
    @RabbitHandler
    public void process(String message ){
        System.out.println("主数据接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");

    }

    @RabbitListener(queues = "fanout.base")
    @RabbitHandler
    public void execute(String message ){
        System.out.println("主数据接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");

    }
}
