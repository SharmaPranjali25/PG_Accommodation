package com.codewithpranjali.Paying_Guest_Accomdation.entites;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pg_places")
public class PGPlace {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String pgName;
private String city;
private String locality;
private double rentAmount;
private boolean available;
@ManyToOne
@JoinColumn(name = "owner_id")
private Owner owner;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPgName() {
	return pgName;
}
public void setPgName(String pgName) {
	this.pgName = pgName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public double getRentAmount() {
	return rentAmount;
}
public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}
public Owner getOwner() {
	return owner;
}
public void setOwner(Owner owner) {
	this.owner = owner;
}


}
