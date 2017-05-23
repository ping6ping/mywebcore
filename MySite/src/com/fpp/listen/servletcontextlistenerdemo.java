package com.fpp.listen;

import java.awt.Event;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class servletcontextlistenerdemo
 *
 */
@WebListener
public class servletcontextlistenerdemo implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public servletcontextlistenerdemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("容器销毁"+arg0.getServletContext().getContextPath());
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("容器初始化"+arg0.getServletContext().getContextPath());
    }

	
				
	
	
}
