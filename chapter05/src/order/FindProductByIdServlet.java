package order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindProductByIdServlet
 */
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �õ�������id
		String id = request.getParameter("id");
		
		String type = request.getParameter("type");		
		Addservice service = new Addservice();		
		try {
			// ����service�㷽����ͨ��id���Ҷ���
			Order p = service.findProductById(id);
			request.setAttribute("p", p);
							
			request.getRequestDispatcher("edit.jsp").forward(request, response);
			return;
		} catch (FindProductByIdException e) {
			e.printStackTrace();
		}
	}
}
