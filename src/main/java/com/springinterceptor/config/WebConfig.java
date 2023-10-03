package com.springinterceptor.config;

import com.springinterceptor.interceptor.CheckHttpRequestFilter;
import com.springinterceptor.interceptor.TestHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CheckHttpRequestFilter()).order(1);
        registry.addInterceptor(new TestHandlerInterceptor()).order(0);
    }
}
