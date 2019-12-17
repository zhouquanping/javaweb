package user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import order.Addexception;


/**
 * Servlet implementation class Adduser
 */
public class Adduser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String login_password=request.getParameter("login_password");
		String confirm_password=request.getParameter("confirm_password");
		User user=new User();
		if(id.length()==0) {
			response.getWriter().write("请输入相关信息");
			response.sendRedirect("/chapter05/zhuce.jsp");
			return;
		}
		if(!login_password.equals(confirm_password)) {
			response.getWriter().write("两次密码不同！");
			response.sendRedirect("/chapter05/zhuce.jsp");
			return;
		}
		user.setID(id);
		user.setUsername(name);
		user.setPassword(login_password);
		user.setEmail(email);
		PrintWriter pw=response.getWriter();
		Userdao service=new Userdao();
		try {
			service.addOrder(user);
			response.sendRedirect("/chapter05/login.jsp");
			return;
			
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().write("注册失败");
			return;
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
