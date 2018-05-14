package com.yonyou.stock.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 16:18
 * @Description:
 */
@Component
public class StockReceiver {

    @RabbitHandler
    @RabbitListener(queues = "topic.stock")
    public void process(String message ){
        System.out.println("库存中心接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");
    }

    @RabbitHandler
    @RabbitListener(queues = "fanout.stock")
    public void execute(String message ){
        System.out.println("库存中心接收数据 :");
        System.out.println(message);
        System.out.println("*********************************");
    }
}
