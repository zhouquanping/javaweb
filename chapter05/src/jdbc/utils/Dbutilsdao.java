package jdbc.utils;
import java.util.List; 
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import jdbc.utils.C3p0utils;
import user.Userss;
public class Dbutilsdao {
	public List<Userss> findAll() throws SQLException{
		QueryRunner runner=new QueryRunner(C3p0utils.getDataSource());
		String sql="select * from users";
		List<Userss> list=(List<Userss>)runner.query(sql, new BeanListHandler(Userss.class));
		return list;
	}
	public List<Userss> find(int id)throws SQLException{
		QueryRunner runner=new QueryRunner(C3p0utils.getDataSource());
		String sql="select * from users where id=?";
		List<Userss> user=(List<Userss>)runner.query(sql,new BeanListHandler(Userss.class), new Object[] {id});
		return user;
	}
	public Boolean delete(int id) throws SQLException{
		QueryRunner runner=new QueryRunner(C3p0utils.getDataSource());
		String sql="delete from users where id=?";
		int num=runner.update(sql,id);
		if(num>0)
			return true;
		return false;
	}
	public Boolean insert(Userss user) throws SQLException{
		QueryRunner runner=new QueryRunner(C3p0utils.getDataSource());
		String sql="insert into users(name,password,email,birthday)values(?,?,?,?)";
		int num=runner.update(sql,new Object[] {user.getUsername(),user.getPassword(),user.getEmail(),user.getBirthday()});
		if(num>0)
			return true;
		return false;
	}

}
