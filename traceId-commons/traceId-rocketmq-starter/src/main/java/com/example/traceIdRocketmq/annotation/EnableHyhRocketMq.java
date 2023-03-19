package com.example.traceIdRocketmq.annotation;


import com.example.traceIdRocketmq.config.RocketMqAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启RocketMq注解
 *
 * @author :fy
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({RocketMqAutoConfiguration.class})     // todo  怎样实现自动配置的?
public @interface EnableHyhRocketMq {
}
