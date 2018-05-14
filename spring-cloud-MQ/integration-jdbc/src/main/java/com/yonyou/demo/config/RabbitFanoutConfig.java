package com.yonyou.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 14:35
 * @Description:
 */

@Configuration
public class RabbitFanoutConfig {

    private final static String msgBase = "fanout.base";
    private final static String msgOrder = "fanout.order";
    private final static String msgStock = "fanout.stock";

    /**
     * 基础数据队列
     * @return Queue
     */
    @Bean
    public Queue queueBase() {
        return new Queue(RabbitFanoutConfig.msgBase);
    }

    /**
     * 订单队列
     * @return Queue
     */
    @Bean
    public Queue queueOrder() {
        return new Queue(RabbitFanoutConfig.msgOrder);
    }

    /**
     * 库存队列
     * @return Queue
     */
    @Bean
    public Queue queueStock() {
        return new Queue(RabbitFanoutConfig.msgStock);
    }

    /**
     * 创建路由
     * @return TopicExchange
     */
    @Bean
    FanoutExchange exchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingMsgBase() {
        return BindingBuilder.bind(queueBase()).to(exchange());
    }

    @Bean
    Binding bindingMsgOrder() {
        return BindingBuilder.bind(queueOrder()).to(exchange());
    }

    @Bean
    Binding bindingMsgStock() {
        return BindingBuilder.bind(queueStock()).to(exchange());
    }
}
