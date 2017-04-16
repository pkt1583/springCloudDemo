package com.pkt.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ZuulRoutesConfigurer {
    @Autowired
    protected ZuulProperties zuulProperties;

    @PostConstruct
    public void setMoreRoutes(){
        System.out.println(zuulProperties.getHost());
    }
}
