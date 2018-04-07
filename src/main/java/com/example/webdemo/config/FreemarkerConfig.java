package com.example.webdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class FreemarkerConfig {
    @Autowired
    protected freemarker.template.Configuration configuration;
    @Autowired
    protected org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver resolver;
    @Autowired
    protected org.springframework.web.servlet.view.InternalResourceViewResolver springResolver;

    @PostConstruct
    public void setSharedVariable() {
        resolver.setSuffix(".ftl");
        resolver.setCache(false);
        //为模板调用时，调用request对象的变量名</span>
        resolver.setRequestContextAttribute("request");
        resolver.setOrder(0);
        resolver.setExposeRequestAttributes(true);
        resolver.setExposeSessionAttributes(true);
    }
}
