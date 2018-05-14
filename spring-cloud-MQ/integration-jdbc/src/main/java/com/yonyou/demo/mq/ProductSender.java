package com.yonyou.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 14:51
 * @Description:
 */
@Component
public class ProductSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendToOrder(){
        String product = "一个大冰箱";
        System.out.println("商品模块发送数据 :"+product );
        rabbitTemplate.convertAndSend("exchange","topic.order",product);
    }

    public void sendToStcok(){
        String product = "一个大冰箱";
        System.out.println("商品模块发送数据 :"+product );
        rabbitTemplate.convertAndSend("exchange","topic.stock",product);
    }

    public void sendToBase(){
        String product = "一个大冰箱";
        System.out.println("商品模块发送数据 :"+product );
        rabbitTemplate.convertAndSend("exchange","topic.base",product);
    }

    public void sendFanout(){
        String product = "一个大冰箱";
        System.out.println("商品模块发送数据 :"+product );
        rabbitTemplate.convertAndSend("fanoutExchange","",product);
    }
}
