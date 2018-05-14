package com.yonyou.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 09:13
 * @Description:
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(List<Map<String,Object>> message){
        System.out.println("商品模块发送数据" );
        rabbitTemplate.convertAndSend("hello",message);
    }
}
