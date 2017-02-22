package org.pkt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("org.pkt.springcloud")
@ImportResource(locations = "classpath:spring-config.xml")
@EnableAutoConfiguration

public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	/*@Override
    protected SpringApplicationBuilder configure
			(SpringApplicationBuilder application) {
		return application.sources(
				new Class[] { DemoApplication.class, WebXmlConfiguration.class});
	}*/
}
