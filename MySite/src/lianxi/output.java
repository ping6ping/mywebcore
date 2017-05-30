package lianxi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class output
 */
@WebServlet("/output")
public class output extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public output() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		ServletOutputStream sos =response.getOutputStream();
		//sos.write("因为我们没有什么不同".getBytes("GB2312"));
		String path = this.getServletContext().getRealPath("\\D:\\363\\apache-tomcat-8.0.43\\wtpwebapps\\MySite\\WEB-INF\\classes\\12.jpg");
	    FileInputStream fis =new FileInputStream("path");
		//PrintWriter pw=response.getWriter();
		int len = 0;
		byte [] m=new byte[1024];
		String filename = path.substring(path.lastIndexOf("\\")+1);
        filename = URLEncoder.encode(filename, "UTF-8");//将不安全的文件名改为UTF-8格式
		
		//告知客户端要下载文件
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		
		while((len=fis.read(m))!=-1)
		{
			sos.write(m,0,len);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
