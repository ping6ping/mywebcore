package lianxi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class xiazai
 */
@WebServlet("/xiazai")
public class xiazai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xiazai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int width = 110;
		int height = 25;
		BufferedImage bi =new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		Graphics ics = bi.getGraphics();
		ics.setColor(Color.BLUE);
		ics.fillRect(1, 1, width-2, height-2);
		ics.setColor(Color.GREEN);
		ics.drawRect(0, 0, width-1, height-1);
		ics.setColor(Color.RED);
		ics.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,15));
		Random ran =new Random();
		for(int i=0,position=5;i<4;i++,position+=30)
		{
			ics.drawString(ran.nextInt(10)+"", position, 20);
		}
		ics.setColor(Color.YELLOW);
		for(int i =0;i<9;i++)
		{ics.drawLine(ran.nextInt(width), ran.nextInt(height), ran.nextInt(width), ran.nextInt(height));}
		ImageIO.write(bi,"jpg",response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
