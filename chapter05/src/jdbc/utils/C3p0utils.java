package jdbc.utils;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
public class C3p0utils {
	private static DataSource ds;
	static {
		ds=new ComboPooledDataSource();
	}
	public static DataSource getDataSource() {
		return ds;
	}
}
