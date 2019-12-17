package jdbc.utils;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.SQLException;

import java.util.List;

import jdbc.utils.Dbutilsdao;

import user.Userss;

public class Test {
	private static Dbutilsdao dao=new Dbutilsdao();
	public static void testfind()throws SQLException{
		List<Userss> user =dao.find(3);
		System.out.println(user.get(0).getId()+","+user.get(0).getUsername()+","+user.get(0).getPassword()+user.get(0).getEmail());
	}
	public static void delete()throws SQLException{
		boolean b=dao.delete(2);
		System.out.println(b);
	}
	/*public static void testfind()throws SQLException{
		List<Userss> user =dao.findAll();
		for(int i=0;i<user.size();i++)
		System.out.println(user.get(i).getId()+","+user.get(i).getUsername()+","+user.get(i).getPassword());
	}*/
	/*public static void testinsert()throws SQLException{
		Userss user=new Userss();
		user.setUsername("zhaoliu");
		user.setPassword("123");
		user.setEmail("zhaoliu@qq.com");
		SimpleDateFormat simp02=new SimpleDateFormat("yyyy-MM-dd");
		Date date=simp02;
		user.setBirthday(date);
		boolean b=dao.insert(user);
		System.out.println(b);
	}*/
	public static void main(String[] args)throws SQLException{
		testfind();
	}

}
