package user;
//User POJO class


public class User {

	private String userName;
	private String password;
	private String name;
	
	//Constructor, sets the variables
	public User(String [] values) {	//wherever it's used, split the array
		
		this.userName = values[0];
		this.password = values[1];
		this.name = values[3];
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
