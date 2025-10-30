package com.codewithpranjali.Paying_Guest_Accomdation.entites;
import com.codewithpranjali.Paying_Guest_Accomdation.enums.UserRole;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String fullName;
@Column(unique = true, nullable = false)
private String email;
@Column(nullable = false)
private String password;
@Enumerated(EnumType.STRING)
private UserRole role;
@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
private Tenant tenant;
@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)

private Owner owner;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public UserRole getRole() {
	return role;
}
public void setRole(UserRole role) {
	this.role = role;
}
public Tenant getTenant() {
	return tenant;
}
public void setTenant(Tenant tenant) {
	this.tenant = tenant;
}
public Owner getOwner() {
	return owner;
}
public void setOwner(Owner owner) {
	this.owner = owner;
}
}
