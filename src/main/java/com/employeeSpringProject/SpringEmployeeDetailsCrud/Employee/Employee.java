package com.employeeSpringProject.SpringEmployeeDetailsCrud.Employee;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="complain")
	private String Complain;
	
	
	@Column(name="gender")
	private String gender;

	@Column(name="email")
	private String email;
	
	@Column(name="description")
	private String description;
	
	@Column(name="complainid")
	private String complainId;
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComplain() {
		return Complain;
	}

	public void setComplain(String complain) {
		this.Complain = complain;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComplainId() {
		return complainId;
	}

	public void setComplainId(String complainId) {
		this.complainId = complainId;
	}

	public Employee(String name, String phone, String complain, String gender, String email, String description,
			String complainId) {
		//super();
		this.name = name;
		this.phone = phone;
		this.Complain = complain;
		this.gender = gender;
		this.email = email;
		this.description = description;
		this.complainId = complainId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", complain=" + Complain + ", gender="
				+ gender + ", email=" + email + ", description=" + description + ", complainId=" + complainId + "]";
	}
	
	
	
}
