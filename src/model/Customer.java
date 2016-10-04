package model;

public class Customer {
	private String id;
	private String name;
	private String email;
	private String gender;
	private String password;
	
	
	public Customer(String id, String password, String gender, String name, String email) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
