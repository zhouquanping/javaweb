package order;
import java.io.IOException;
import java.sql.SQLException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.utils.C3p0utils;
import java.util.List; 
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 * 
 * 用于添加订单的servlet
 */
public class Add extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
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
		if(id==null) {
			response.getWriter().write("请输入订单信息");
			response.sendRedirect("/chapter05/add.jsp");
			return;
		}
		order.setId(id);
		order.setOrdername(ordername);
		order.setGongying(gongying);
		order.setGoodsid(goodsid);
		order.setGoodsname(goodsname);
		System.out.println(goodsname);
		System.out.println("number");
		System.out.println(number);
		int p=Integer.parseInt(number);
		order.setNumber(p);
		order.setPrice(Double.parseDouble(price));
		order.setMoney(Double.parseDouble(money));
		order.setPaystate(Integer.parseInt(paystate));
		order. setDate(date);
		PrintWriter pw=response.getWriter();
		Addservice service=new Addservice();
		try {
			service.addOrder(order);
			response.sendRedirect("/chapter05/list.jsp");
			return;
			
		}catch(Addexception e) {
			e.printStackTrace();
			response.getWriter().write("添加订单失败");
			return;
		}
		//response.sendRedirect("/chapter05/list.jsp");*/
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
}
