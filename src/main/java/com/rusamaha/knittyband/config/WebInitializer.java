package com.rusamaha.knittyband.config;

import com.rusamaha.knittyband.config.application.WebConfig;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by rusamaha on 4/6/17.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
//    @Override
//    protected void registerContextLoaderListener(ServletContext servletContext) {
//        super.registerContextLoaderListener(servletContext);
//        servletContext.addFilter("ovf", OpenEntityManagerInViewFilter.class)
//                .addMappingForUrlPatterns(null, false, "/*");
//    }
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//
//    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//        registerOpenEntityManagerInViewFilter(servletContext);
//        super.onStartup(servletContext);
//
//    }
//
//    private void registerOpenEntityManagerInViewFilter(ServletContext servletContext) {
//        OpenEntityManagerInViewFilter viewFilter = new OpenEntityManagerInViewFilter();
//        viewFilter.setEntityManagerFactoryBeanName("entityManagerFactory");
//        FilterRegistration.Dynamic registration = servletContext.addFilter("openEntityManagerInView",
//                new OpenEntityManagerInViewFilter());
//        registration.addMappingForUrlPatterns(null, false, "/*");
//
//    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;//new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
