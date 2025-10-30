package com.codewithpranjali.Paying_Guest_Accomdation.entites;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tenants")
public class Tenant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int age;
private String city;
private String preferredLocality;
@OneToOne
@JoinColumn(name = "user_id")
private User user;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


}
