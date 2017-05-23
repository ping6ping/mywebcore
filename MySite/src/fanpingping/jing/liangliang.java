package fanpingping.jing;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class liangliang
 */
@WebServlet("/zhang/liangliang")
public class liangliang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public liangliang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H2>which get your body from</H2>");
		out.println("<H3>用户输入信息如下：</H3>");
		String username= request.getParameter("userName");
		if (username==null||username=="") username="未输入";
		String userpwd =request.getParameter("password");
		if(userpwd==null||userpwd=="") userpwd="未输入";
		out.println("<H2>用户名:"+username+"</H2>");
		out.println("<H2>密    码:"+userpwd+"</H2>");	
		File file = new File("D:\\1.txt");
		FileWriter filewriter =new FileWriter(file,true);
		filewriter.write("用户名"+username+" "+"密码"+userpwd);
		filewriter.close();
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
