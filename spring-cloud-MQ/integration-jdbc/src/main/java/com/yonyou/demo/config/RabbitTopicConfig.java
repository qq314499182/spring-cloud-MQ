package com.yonyou.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/10 14:35
 * @Description:
 */

@Configuration
public class RabbitTopicConfig {

    private final static String msgBase = "topic.base";
    private final static String msgOrder = "topic.order";
    private final static String msgStock = "topic.stock";

    /**
     * 基础数据队列
     * @return Queue
     */
    @Bean
    public Queue queueBase() {
        return new Queue(RabbitTopicConfig.msgBase);
    }

    /**
     * 订单队列
     * @return Queue
     */
    @Bean
    public Queue queueOrder() {
        return new Queue(RabbitTopicConfig.msgOrder);
    }

    /**
     * 库存队列
     * @return Queue
     */
    @Bean
    public Queue queueStock() {
        return new Queue(RabbitTopicConfig.msgStock);
    }

    /**
     * 创建路由
     * @return TopicExchange
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    Binding bindingMsgBase() {
        return BindingBuilder.bind(queueBase()).to(exchange()).with("topic.base");
    }

    @Bean
    Binding bindingMsgOrder() {
        return BindingBuilder.bind(queueOrder()).to(exchange()).with("topic.order");
    }

    @Bean
    Binding bindingMsgStock() {
        return BindingBuilder.bind(queueStock()).to(exchange()).with("topic.stock");
    }
}
