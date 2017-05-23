package canshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class liangliang
 */
@WebServlet(name = "liangliangyese", urlPatterns = { "/liangliangyese" })
public class liangliang extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String myInstitute =null;
    private String myMajor=null;
    private int count = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public liangliang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		myInstitute =config.getInitParameter("Institute");
		if(myInstitute==null)
			myInstitute="";
		myMajor=config.getInitParameter("major");
		if(myMajor==null)
			myMajor="";
		String strCount =config.getInitParameter("count");
		try{
			count=Integer.parseInt(strCount);
		}
		catch(Exception e)
		{e.printStackTrace();
		}
		}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获取初始化参数</TITLE></HEAD>");
		count++;
		out.println("<H3>此Servle的访问次数:"+count+"<H3>");
		out.println("</BODY>");
		out.print("</HTML>");
		out.close();
	}

}
