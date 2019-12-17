package user;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import jdbc.utils.C3p0utils;
import user.User;

public class Userdao {
		// ע���û�
		public boolean addOrder(User p) throws SQLException {

			String sql = "insert into users values(?,?,?,?)";
			QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
			int num=runner.update(sql, p.getId(), p.getUsername(), p.getPassword(),
					p.getEmail());
			if(num>0)
				return true;
			return false;
		}
		
		//�����û�������������û�
		public User findUserByUsernameAndPassword(String username, String password) throws SQLException {
			String sql="select * from users where name=? and password=?";
			QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
			return runner.query(sql, new BeanHandler<User>(User.class),username,password);
		}
		//����idɾ���û�
		public void deleteUser(String id) throws SQLException {
			String sql = "DELETE FROM users WHERE id = ?";
			QueryRunner runner = new QueryRunner(C3p0utils.getDataSource());
			runner.update(sql, id);
		}

}
