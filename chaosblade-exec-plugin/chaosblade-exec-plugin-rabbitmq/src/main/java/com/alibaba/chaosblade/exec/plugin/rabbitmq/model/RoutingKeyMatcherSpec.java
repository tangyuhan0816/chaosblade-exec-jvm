package com.alibaba.chaosblade.exec.plugin.rabbitmq.model;

import com.alibaba.chaosblade.exec.common.model.matcher.BasePredicateMatcherSpec;
import com.alibaba.chaosblade.exec.plugin.rabbitmq.RabbitMqConstant;

/**
 * @author raygenyang@163.com
 */
public class RoutingKeyMatcherSpec extends BasePredicateMatcherSpec implements RabbitMqConstant {
    @Override
    public String getName() {
        return ROUTING_KEY;
    }

    @Override
    public String getDesc() {
        return "";
    }

    @Override
    public boolean noArgs() {
        return false;
    }

    @Override
    public boolean required() {
        return false;
    }
}
