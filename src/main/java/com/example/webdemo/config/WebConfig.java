package com.example.webdemo.config;

import com.example.webdemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created info
 * User: lijie
 * Date: 2018/4/6
 * Time: 23:16
 * Description:
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new MyInterceptor());
        interceptorRegistration.excludePathPatterns("/static").excludePathPatterns("/login**");
        interceptorRegistration.addPathPatterns("/**");
    }

}
