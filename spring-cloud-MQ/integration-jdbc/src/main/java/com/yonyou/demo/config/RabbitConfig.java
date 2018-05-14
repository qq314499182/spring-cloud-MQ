package com.yonyou.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 09:06
 * @Description:
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}
