package org.pkt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("org.pkt.springcloud")
@ImportResource(locations = "classpath:spring-config.xml")
@EnableEurekaClient
@EnableCircuitBreaker
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CourseStudentRegistrationService extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CourseStudentRegistrationService.class, args);
    }

	/*@Override
    protected SpringApplicationBuilder configure
			(SpringApplicationBuilder application) {
		return application.sources(
				new Class[] { DemoApplication.class, WebXmlConfiguration.class});
	}*/
}
