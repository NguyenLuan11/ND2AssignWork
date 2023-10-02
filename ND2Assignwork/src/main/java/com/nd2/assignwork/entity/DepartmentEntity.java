package com.nd2.assignwork.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Department")
public class DepartmentEntity {

	@Id
	@Column(name = "Department_ID", columnDefinition = "varchar(20)")
	private String Department_ID;
	
	@Column(name = "Department_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Department_Name;
	
	// Foreign key Department_Head
	@OneToOne
	@JoinColumn(name = "Department_Head")
	@NotBlank
	private UserAccountEntity Department_Head;
	
	// Foreign key User_Department
	@OneToMany(mappedBy = "User_Department")
	private List<UserAccountEntity> User = new ArrayList<>();

	public String getDepartment_ID() {
		return Department_ID;
	}

	public void setDepartment_ID(String department_ID) {
		Department_ID = department_ID;
	}

	public String getDepartment_Name() {
		return Department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		Department_Name = department_Name;
	}

	public UserAccountEntity getDepartment_Head() {
		return Department_Head;
	}

	public void setDepartment_Head(UserAccountEntity department_Head) {
		Department_Head = department_Head;
	}

	public List<UserAccountEntity> getUser() {
		return User;
	}

	public void setUser(List<UserAccountEntity> user) {
		User = user;
	}
}
