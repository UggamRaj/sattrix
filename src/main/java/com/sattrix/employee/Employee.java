package com.sattrix.employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private String name;
	 private Character gender;
	 private Long contact;
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "addressid")
	 private Address address;
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "departentid")
	 private Department departent;
}
