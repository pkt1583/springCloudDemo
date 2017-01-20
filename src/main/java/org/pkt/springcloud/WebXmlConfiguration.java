package org.pkt.springcloud;

import org.apache.myfaces.webapp.StartupServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class WebXmlConfiguration extends SpringBootServletInitializer {
    @Bean
    public ServletRegistrationBean registerServlet(){
        FacesServlet facesServlet=new FacesServlet();
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(facesServlet,"*.xhtml");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean jsfConfigureListener() {
        return new ServletListenerRegistrationBean(new StartupServletContextListener());
    }


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
		servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
		servletContext.addListener(new StartupServletContextListener());
        super.onStartup(servletContext);
	}
}
