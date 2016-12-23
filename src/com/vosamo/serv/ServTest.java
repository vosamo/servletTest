package com.vosamo.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServTest
 */
public class ServTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServTest() {
        super();
        // TODO Auto-generated constructor stub
    }
	/* (non-Javadoc)
     * @see javax.servlet.GenericServlet#init()
     */
    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        message = "Hello World! Hello Inspur!";
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
	    response.setContentType("text/html");

	      // 实际的逻辑是在这里
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
