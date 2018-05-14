package com.yonyou.demo.service;

import com.yonyou.demo.mq.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/9 15:45
 * @Description:
 */
@Component
public class JdbcMessageHandler {

    @Autowired
    private HelloSender sender;

    @ServiceActivator
    public void handleJdbcMessage(List<Map<String,Object>> message) {
        sender.send(message);
    }
}
