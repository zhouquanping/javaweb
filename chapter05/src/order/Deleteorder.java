package order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deleteorder
 */
public class Deleteorder extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取请求参数，产品id
		String id = request.getParameter("id");
		Addservice service = new Addservice();
		// 调用service完成删除订单操作
		service.deleteProduct(id);
		response.sendRedirect("list.jsp");
		return;
	}
}