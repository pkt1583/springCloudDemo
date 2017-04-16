package com.pkt.springcloud;

import com.pkt.springcloud.filter.MyTestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ZuulProxyServer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyServer.class, args);
    }




    @Bean
    public MyTestFilter createFilter() {
        return new MyTestFilter();
    }
}
