package user;
//User POJO class


public class User {

	private String userName;
	private String password;
	private String name;
	
	//Constructor, sets the variables
	public User(String userName, String password, String name) {
		
		this.userName = userName;
		this.password = password;
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
}
