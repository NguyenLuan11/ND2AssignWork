package com.nd2.assignwork.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Permission")
public class PermissionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Permission_ID")
	private int Permission_ID;
	
	@Column(name = "Permission_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Permission_Name;
	
	// Foreign key User_Permission
	@ManyToMany(mappedBy = "Permission")
	private Set<UserAccountEntity> User = new HashSet<>();

	public Set<UserAccountEntity> getUser() {
		return User;
	}

	public void setUser(Set<UserAccountEntity> user) {
		User = user;
	}

	public int getPermission_ID() {
		return Permission_ID;
	}

	public void setPermission_ID(int permission_ID) {
		Permission_ID = permission_ID;
	}

	public String getPermission_Name() {
		return Permission_Name;
	}

	public void setPermission_Name(String permission_Name) {
		Permission_Name = permission_Name;
	}
}
