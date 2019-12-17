package order;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Findorder
 */
public class Findorder extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.��ȡ������
		String id = request.getParameter("id"); // ����id
		String name = request.getParameter("goodsname"); // ��������
		String category = request.getParameter("paystate"); // ����״̬
		String minprice = request.getParameter("minprice"); // ��С�۸�
		String maxprice = request.getParameter("maxprice"); // ���۸�
		// 2.����ProductService����
		Addservice service = new Addservice();
		// 3.����service������������ѯ�ķ���
		List<Order> ps = service.findProductByManyCondition(id, name,
				category, minprice, maxprice);
		// 4.��������ѯ�Ľ���Ž�request����
		request.setAttribute("ps", ps);
		// 5.�����ض��򵽶���������ҳlist.jspҳ��
		request.getRequestDispatcher("list.jsp").forward(
				request, response);
	}
}
