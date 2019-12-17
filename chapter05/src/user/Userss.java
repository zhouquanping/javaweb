package user;
import java.util.Date;
public class Userss {
	private int id;
	private String name;
	private String password;
	private String email;
	private Date birthday;
	public int getId()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public String getUsername()
	{
		return name;
	}
	public void setUsername(String username)
	{
		this.name=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday=birthday;
	}

}
