package org.pkt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("org.pkt.springcloud")
@ImportResource(locations = "classpath:spring-config.xml")
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate createLoadBalancedRestTemplate() {
        return   new RestTemplate();
    }

}
