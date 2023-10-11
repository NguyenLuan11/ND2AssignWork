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
	private String departmentID;
	
	@Column(name = "Department_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String departmentName;
	
	// Foreign key Department_Head
	@OneToOne
	@JoinColumn(name = "Department_Head")
	private UserAccountEntity departmentHead;
	
	// Foreign key User_Department
	@OneToMany(mappedBy = "userDepartment")
	private List<UserAccountEntity> User = new ArrayList<>();

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<UserAccountEntity> getUser() {
		return User;
	}

	public void setUser(List<UserAccountEntity> user) {
		User = user;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public UserAccountEntity getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(UserAccountEntity departmentHead) {
		this.departmentHead = departmentHead;
	}
}
