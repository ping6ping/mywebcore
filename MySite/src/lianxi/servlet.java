package lianxi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet/ss")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		//response.setHeader("content-type", "text/html;charset=UTF-8");
		/*response.setContentType("text/html; charset=UTF-8");*/
		//PrintWriter out =response.getWriter();
		//out.write("你好");
        /*response.setContentType("text/html; charset=UTF-8");	
		PrintWriter out = response.getWriter();//得到一个字符输出流
		out.write("你好！");//向客户端响应文本内容		
*/  
		ServletContext app =this.getServletContext().getAttribute(arg0);
		app.setAttribute("name", "胡晓东");
		System.out.println(app.getClass().getName());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
