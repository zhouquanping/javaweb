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

		// ��ȡ�����������Ʒid
		String id = request.getParameter("id");
		Addservice service = new Addservice();
		// ����service���ɾ����������
		service.deleteProduct(id);
		response.sendRedirect("list.jsp");
		return;
	}
}