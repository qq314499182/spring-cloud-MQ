package com.yonyou.order.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 16:15
 * @Description:
 */
@Component
public class OrderReceiver {

    @RabbitHandler
    @RabbitListener(queues = "topic.order")
    public void process(String message ){
        System.out.println("订单中心接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");
    }

    @RabbitHandler
    @RabbitListener(queues = "fanout.order")
    public void execute(String message ){
        System.out.println("订单中心接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");
    }
}
