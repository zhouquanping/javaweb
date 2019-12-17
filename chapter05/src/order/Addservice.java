package order;

import java.sql.SQLException;

import java.util.List;

public class  Addservice {
	private Adddao dao = new Adddao();
	// 添加订单
	public void addOrder(Order p) throws Addexception {
		try {
			dao.addOrder(p);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Addexception("添加订单失败");
		}
	}
	// 查找所有订单信息
	public List<Order> listAll() throws ListProductException {
		try {
			return dao.listAll();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ListProductException("查询订单失败");
		}
	}
	
	// 根据id查找订单
	public Order findProductById(String id) throws FindProductByIdException {
		try {
			return dao.findProductById(id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindProductByIdException("根据ID查找订单失败");
		}
	}
	
	// 多条件查询
	public List<Order> findProductByManyCondition(String id, String name,
			String category, String minprice, String maxprice) {
		List<Order> ps = null;
		try {
			ps = dao.findProductByManyCondition(id, name, category, minprice,
					maxprice);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ps;
	}
	// 修改订单信息
	public void editProduct(Order p) {
		try {
			dao.editProduct(p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//根据id删除订单信息
	public void deleteProduct(String id) {
		try {
			dao.deleteProduct(id);
		} catch (SQLException e) {
			throw new RuntimeException("系统根据id删除订单信息失败！");
		}
	}
}