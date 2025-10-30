package com.codewithpranjali.Paying_Guest_Accomdation.entites;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "owners")
public class Owner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private int age;
private String contactNumber;
@OneToOne
@JoinColumn(name = "user_id")
private User user;
@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
private List<PGPlace> pgPlaces;

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
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public List<PGPlace> getPgPlaces() {
	return pgPlaces;
}
public void setPgPlaces(List<PGPlace> pgPlaces) {
	this.pgPlaces = pgPlaces;
}
}
