package com.codewithpranjali.Paying_Guest_Accomdation.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TenantRegisterRequest {
private String fullName;
private String email;
private String password;
private int age;
private String city;
private String preferredLocality;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPreferredLocality() {
	return preferredLocality;
}
public void setPreferredLocality(String preferredLocality) {
	this.preferredLocality = preferredLocality;
}


}
