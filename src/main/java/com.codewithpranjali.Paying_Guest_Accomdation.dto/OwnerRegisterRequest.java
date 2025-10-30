package com.codewithpranjali.Paying_Guest_Accomdation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerRegisterRequest {
private String fullName;
private String email;
private String password;
private int age;
private String contactNumber;
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}


}
