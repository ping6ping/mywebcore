package yonghu;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class sevletlistener
 *
 */
@WebListener
public class sevletlistener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
	private ServletContext app = null;
    public sevletlistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	Set all =(Set)app.getAttribute("user");
    	if(all.size()>0)
    	{all.remove(arg0.getSession().getAttribute("user"));}
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	Set all =(Set)app.getAttribute("user");
    	String param =(String)arg0.getName();
    	if(param.equals("user"))
    	{
    		String name =(String)arg0.getValue();
    		try {
				name =new String(name.getBytes("iso-8859-1"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		all.add(name);
    		app.setAttribute("user", all);
    	}
    	else
    	{
    		System.out.println("属性不是user");
    	}
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	Set all =(Set)app.getAttribute("user");
    	all.remove(arg0.getValue());
    	app.setAttribute("user", all);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	app = arg0.getServletContext();
    	app.setAttribute("user", new TreeSet());
    }
	
}
