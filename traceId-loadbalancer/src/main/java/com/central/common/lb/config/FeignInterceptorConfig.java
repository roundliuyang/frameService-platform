package com.central.common.lb.config;

import cn.hutool.core.util.StrUtil;
import com.central.common.context.TenantContextHolder;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * feign拦截器，只包含基础数据
 */
public class FeignInterceptorConfig {

    /**
     * 使用feign client访问别的微服务时，将上游传过来的client等信息放入header传递给下一个服务
     */
    @Bean
    public RequestInterceptor baseFeignInterceptor() {
        return template -> {
            // 传递client 得到当前线程存储的数据然后进行传递.
            String tenant = TenantContextHolder.getTenant();
            if (StrUtil.isNotEmpty(tenant)) {
                template.header(SecurityConstants.TENANT_HEADER, tenant);
            }
        };
    }
}
