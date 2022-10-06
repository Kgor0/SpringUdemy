package com.appdeveloperblog.app.ws.ui.model.resquest;

public class UserDetailsRequestModel {
	
public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotNull(   message="First Name caanot be null")
private String firstName;
	@NotNull(message="Last Name caanot be null")
private String lastName;
	@NotNull(message="Email Name caanot be null")
	@Email
private String email;
@NotNull(message="Pasword Name caanot be null")
	@Size(min=8, max=16, message="Password must be equal or greater than 8 characters and less than 6 characters")
private String password;
 {
	// TODO Auto-generated method stub
	
}


}
