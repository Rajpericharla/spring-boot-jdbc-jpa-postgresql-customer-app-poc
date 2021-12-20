package com.ethoca.customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SECTOR")
	private String sector;

	@Column(name = "LOC")
	private String location;

	@Override
	public String toString() {
		return id + "," + name + "," + sector + "," + location + "\n";
	}
	
}
