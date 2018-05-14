package com.yonyou.demo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 09:53
 * @Description:
 */
@Component
public class HelloReceiver {

    @RabbitHandler
    @RabbitListener(queues = "hello")
    public void process(List<Map<String,Object>> message ){
        System.out.println("接收消息 :");
        for(Map<String,Object> resultMap:message){
            System.out.println("组 :");
            for(String column:resultMap.keySet()){
                System.out.println("字段:"+column+" 值:"+resultMap.get(column));
            }
        }
    }
}
