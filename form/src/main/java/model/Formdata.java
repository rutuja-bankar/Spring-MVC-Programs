package model;

public class Formdata {
  String username,password,birthdate,email,gender,courses,hobbies;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getBirthdate() {
	return birthdate;
}

public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getCourses() {
	return courses;
}

public void setCourses(String courses) {
	this.courses = courses;
}

public String getHobbies() {
	return hobbies;
}

public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}

@Override
public String toString() {
	return "Formdata [username=" + username + ", password=" + password + ", birthdate=" + birthdate + ", email=" + email
			+ ", gender=" + gender + ", courses=" + courses + ", hobbies=" + hobbies + "]";
}
 
  
}
