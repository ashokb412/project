///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.apps.appsmanager.config;
//
///**
// *
// * @author Tapreward
// */
////import org.apache.log4j.Logger;
//import com.apps.appsmanager.config.AppConfig;
//import javax.servlet.FilterRegistration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class AppInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext container) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(AppConfig.class);
//        
//        ctx.setServletContext(container);
//        ServletRegistration.Dynamic servlet = container.addServlet(
//                "dispatcher", new DispatcherServlet(ctx));
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//        FilterRegistration.Dynamic filter  = container.addFilter("SpringOpenEntityManagerInViewFilter", 
//                "org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter");
//    }
//}
