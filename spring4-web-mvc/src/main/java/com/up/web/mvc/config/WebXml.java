package com.up.web.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 *
 * servelt 3.0版本以后，没有xml了，  使用spring来驱动的话，容器启动后会调用这个onstartUp方法
 * @author xu.qiang
 * @date 20/2/8
 */
public class WebXml implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        //启动spring的IOC
        AnnotationConfigWebApplicationContext ctx= new AnnotationConfigWebApplicationContext();
        ctx.register(WebMvcConfig.class);
        ctx.setServletContext(servletContext);

        //向web容器注册 servlet
        ServletRegistration.Dynamic dispathServelt = servletContext.addServlet("dispathServelt", new DispatcherServlet(ctx));
        dispathServelt.setLoadOnStartup(1);
        dispathServelt.addMapping("/");
    }
}
