package com.yonyou.demo.mq;

import org.hibernate.annotations.Synchronize;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 14:56
 * @Description:
 */
//@Component
public class BaseReceiver {

    @RabbitListener(queues = "topic.base")
    @RabbitHandler
    public void process(String message ){
        System.out.println("主数据接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");

    }
}
