package order;

import java.sql.SQLException;

import java.util.List;

public class  Addservice {
	private Adddao dao = new Adddao();
	// ��Ӷ���
	public void addOrder(Order p) throws Addexception {
		try {
			dao.addOrder(p);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Addexception("��Ӷ���ʧ��");
		}
	}
	// �������ж�����Ϣ
	public List<Order> listAll() throws ListProductException {
		try {
			return dao.listAll();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ListProductException("��ѯ����ʧ��");
		}
	}
	
	// ����id���Ҷ���
	public Order findProductById(String id) throws FindProductByIdException {
		try {
			return dao.findProductById(id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindProductByIdException("����ID���Ҷ���ʧ��");
		}
	}
	
	// ��������ѯ
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
	// �޸Ķ�����Ϣ
	public void editProduct(Order p) {
		try {
			dao.editProduct(p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//����idɾ��������Ϣ
	public void deleteProduct(String id) {
		try {
			dao.deleteProduct(id);
		} catch (SQLException e) {
			throw new RuntimeException("ϵͳ����idɾ��������Ϣʧ�ܣ�");
		}
	}
}