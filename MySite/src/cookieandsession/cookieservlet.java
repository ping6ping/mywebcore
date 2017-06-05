package cookieandsession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.sun.xml.internal.ws.handler.HandlerProcessor.RequestOrResponse;

/**
 * Servlet implementation class cookieservlet
 */
@WebServlet("/cookieservlet")
public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookieservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		PrintWriter out =response.getWriter();
		Cookie [] cookies=request.getCookies();
		for(int i=0;cookies!=null&&i<cookies.length;i++)
		{
			if("lastAccessTime".equals(cookies[i].getName()))
			{
				long time =Long.parseLong(cookies[i].getValue());
				out.write("您上次登录的时间为"+new Date(time).toLocaleString());
			}
		}
	}
	  Cookie cookie = new Cookie("lastAccessTime",""+System.currentTimeMillis());
     
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
