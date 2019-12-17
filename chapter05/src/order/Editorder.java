package order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Editorder
 */
public class Editorder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String ordername=request.getParameter("ordername");
		String gongying=request.getParameter("gongying");
		String goodsid=request.getParameter("goodsid");
		String goodsname=request.getParameter("goodsname");
		String number=request.getParameter("number");
		String price=request.getParameter("price");
		String money=request.getParameter("money");
		String date=request.getParameter("date");
		String paystate="0";
		Adddao dao=new Adddao();
		Order order=new Order();
		order.setId(id);
		order.setOrdername(ordername);
		order.setGongying(gongying);
		order.setGoodsid(goodsid);
		order.setGoodsname(goodsname);
		
		int p=Integer.parseInt(number);
		order.setNumber(p);
		order.setPrice(Double.parseDouble(price));
		order.setMoney(Double.parseDouble(money));
		order.setPaystate(Integer.parseInt(paystate));
		order. setDate(date);
		PrintWriter pw=response.getWriter();
		Addservice service=new Addservice();
			service.editProduct(order);
			response.sendRedirect("/chapter05/list.jsp");
			return;
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
