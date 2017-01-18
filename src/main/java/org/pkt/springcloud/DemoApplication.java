package org.pkt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@ComponentScan("org.pkt.springcloud")
@ImportResource(locations = "classpath:spring-config.xml")
@EnableAutoConfiguration
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Bean
	public ServletRegistrationBean registerServlet(){
		FacesServlet facesServlet=new FacesServlet();
		ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(facesServlet,"*.xhtml");
		servletRegistrationBean.setLoadOnStartup(1);
		return servletRegistrationBean;
	}
*/
   /* @Bean
    public ServletListenerRegistrationBean<StartupServletContextListener> jsfConfigureListener() {
        return new ServletListenerRegistrationBean<StartupServletContextListener>(new StartupServletContextListener());
    }*/

	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
		servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
        super.onStartup(servletContext);
	}*/
}
