package com.sanqing.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanqing.bean.Criticism;
import com.sanqing.bean.Employee;
import com.sanqing.dao.CriticismDAO;
import com.sanqing.factory.CriticismDAOFactory;

public class CommitCriticism extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String criticismContent = request.getParameter("criticismContent");//����û�����Ļظ�����
		int messageID = Integer.parseInt(request.getParameter("messageID"));
		ServletContext servletContext = getServletContext();
		RequestDispatcher dispatcher = null;
		//���ĸ��쵼����������
		Employee employee = (Employee) request.getSession().getAttribute("employee");
		if(employee == null) {
			request.setAttribute("error", "Ҫ���������������Ƚ������ʶ��");
		}else {
			if(criticismContent == null || "".equals(criticismContent)) { //����û�û���������
				request.setAttribute("error", "����������������");
			}else {
				Criticism criticism = new Criticism();
				criticism.setCriticismContent(criticismContent);
				criticism.setEmployeeID(employee.getEmployeeID());
				criticism.setCriticismTime(new Date());
				criticism.setMessageID(messageID);
				CriticismDAO criticismDAO = CriticismDAOFactory.getCriticismDAOInstance();
				criticismDAO.addCriticism(criticism);
			}
		}
		dispatcher = servletContext.
				getRequestDispatcher("/GetMessage?messageID=" + messageID);//��ת����Ϣ�鿴ҳ
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
