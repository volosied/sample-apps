package myapp;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;
import javax.servlet.jsp.JspApplicationContext;
import javax.servlet.jsp.JspFactory;
import javax.servlet.annotation.WebListener;

@WebListener
public class ConfigListener implements ServletContextListener { 

    @Override 
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext(); 
        JspApplicationContext jspContext = JspFactory.getDefaultFactory().getJspApplicationContext(servletContext); 
        jspContext.addELResolver(new CustomELResolver()); 
    } 


}