package org.pkt.springcloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Configuration
@ServletComponentScan
@EnableAutoConfiguration
public class WebXmlConfiguration extends SpringBootServletInitializer implements ServletContextAware {
    private ServletContext servletContext;

    /*@Bean
    public ServletRegistrationBean registerServlet() {
        FacesServlet facesServlet = new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(facesServlet, "*.xhtml");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

   *//* @Bean
    public StartupServletContextListener registerStartUpServletContextListener() {
        return new StartupServletContextListener();
    }*//*

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
    }

    @Bean
    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
        return new ServletListenerRegistrationBean<ConfigureListener>(new ConfigureListener());
    }*/

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
       // servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
    }

}
