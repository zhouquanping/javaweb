package order;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
//import com.sun.faces.taglib.jsf_core.MaxMinValidatorTag;
import order.Order;
import jdbc.utils.C3p0utils;

public class Adddao {
	// 添加订单
	public boolean addOrder(Order p) throws SQLException {

		String sql = "insert into orders values(?,?,?,?,?,?,?,?,?,?)";
		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
		int num=runner.update(sql, p.getId(), p.getOrdername(), p.getGongying(),
				p.getGoodsid(), p.getGoodsname(), p.getNumber(), p.getPrice(),p.getMoney(),p.getDate(),
				p.getPaystate());
		if(num>0)
			return true;
		return false;
	}
	// 查找所有订单
	public List<Order> listAll() throws SQLException {
		String sql = "select * from orders";
		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
		return runner.query(sql, new BeanListHandler<Order>(Order.class));
	}
	
	// 根据id查找订单
	public Order findProductById(String id) throws SQLException {
		String sql = "select * from orders where id=?";
		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
		return runner.query(sql, new BeanHandler<Order>(Order.class), id);
	}


	// 多条件查询
	public List<Order> findProductByManyCondition(String id, String goodsname,
			String paystate, String minprice, String maxprice)
			throws SQLException {
		List<Object> list = new ArrayList<Object>();
		String sql = "select * from orders where 1=1 ";

		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());

		if (id != null && id.trim().length() > 0) {
			sql += " and id=?";
			list.add(id);
		}

		if (goodsname != null && goodsname.trim().length() > 0) {
			sql += " and goodsname=?";
			list.add(goodsname);
		}
		if (paystate != null && paystate.trim().length() > 0) {
			sql += " and paystate=?";
			list.add(paystate);
		}
		if (minprice != null && maxprice != null
				&& minprice.trim().length() > 0 && maxprice.trim().length() > 0) {
			sql += " and price between ? and ?";
			list.add(minprice);
			list.add(maxprice);
		}

		Object[] params = list.toArray();

		return runner.query(sql, new BeanListHandler<Order>(Order.class),
				params);
	}
	// 修改订单信息
	public void editProduct(Order p) throws SQLException {
		//1.创建集合并将商品信息添加到集合中
		List<Object> obj = new ArrayList<Object>();
		obj.add(p.getOrdername());
		obj.add(p.getGongying());
		obj.add(p.getGoodsid());
		obj.add(p.getGoodsname());
		obj.add(p.getNumber());
		obj.add(p.getPrice());
		obj.add(p.getMoney());
		obj.add(p.getDate());
		obj.add(p.getPaystate());
		//2.创建sql语句，并拼接sql
		String sql  = "update orders " +
				      "set  ordername=?,gongying=?,goodsid=?,goodsname=?,"
				      + "number=?,price=?,money=?,date=?,paystate=? ";

		sql += " where id=?";
		obj.add(p.getId());		
		System.out.println(sql);		
		System.out.println(obj);
		//3.创建QueryRunner对象
		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
		//4.使用QueryRunner对象的update()方法更新数据
		runner.update(sql, obj.toArray());
	}
	
	//根据id删除订单信息
	public void deleteProduct(String id) throws SQLException {
		String sql = "DELETE FROM orders WHERE id = ?";
		QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
		runner.update(sql, id);
	}
}
