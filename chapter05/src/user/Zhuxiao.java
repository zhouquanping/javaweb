package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import order.Addservice;

/**
 * Servlet implementation class Zhuxiao
 */
public class Zhuxiao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取请求参数，用户id
		String id =request.getParameter("uid");
		//String id =${id};
		Userdao service = new Userdao();
		// 调用service完成删除用户操作
		try {
		service.deleteUser(id);
		System.out.println(id+"成功");
		System.out.println("成功");
		response.sendRedirect("login.jsp");
		return;
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().write("注销失败");
			return;
		}
	}

}
