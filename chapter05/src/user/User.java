package user;


public class User {
	private String id;
	private String name;
	private String password;
	private String email;
	public String getId()
	{
		return id;
	}
	public void setID(String id)
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
	

}