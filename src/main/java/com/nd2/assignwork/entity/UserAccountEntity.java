package com.nd2.assignwork.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "UserAccount")
public class UserAccountEntity {

	@Id
	@Column(name = "User_ID", columnDefinition = "varchar(20)")
	private String userID;

	@Column(name = "User_UserName", columnDefinition = "varchar(30)")
	@NotBlank
	private String userUserName;

	@Column(name = "User_FullName", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String userFullName;

	@Column(name = "User_Password", columnDefinition = "varchar(255)")
	@NotBlank
	private String userPassword;

	@Column(name = "User_Phone", columnDefinition = "varchar(12)")
	@NotBlank
	private String userPhone;

	@Column(name = "User_Email", columnDefinition = "varchar(255)")
	@NotBlank
	private String userEmail;

	@Column(name = "User_Image", columnDefinition = "varbinary(60000)")
	private byte[] userImage;

	@Column(name = "User_isActive", columnDefinition = "bit default 1")
	private Boolean userIsActive;

	// Foreign key User_Position
	@ManyToOne
	@JoinColumn(name = "User_Position")
	@NotNull
	private PositionEntity userPosition;

	// Foreign key User_Department
	@ManyToOne
	@JoinColumn(name = "User_Department")
	@NotNull
	private DepartmentEntity userDepartment;

	// Foreign key Task_Personal_Send
	@OneToMany(mappedBy = "taskPersonalSend")
	private List<TaskEntity> taskPersonalSend = new ArrayList<>();

	// Foreign key Task_Personal_Receive
	@OneToMany(mappedBy = "taskPersonalReceive")
	private List<TaskEntity> taskPersonalReceive = new ArrayList<>();

	// Foreign key Department_Head
	@OneToOne(mappedBy = "departmentHead")
	private DepartmentEntity Department;

	// Foreign key Discuss_User
	@OneToMany(mappedBy = "discussUser")
	private List<DiscussEntity> Discuss = new ArrayList<>();

	// Foreign key User_Permission
	@ManyToMany
	@JoinTable(name = "User_Permission", joinColumns = @JoinColumn(name = "User_ID"), inverseJoinColumns = @JoinColumn(name = "Permission_ID"))
	private Set<PermissionEntity> Permission = new HashSet<>();

	// Foreign key Document_Incomming_UserSend
	@OneToMany(mappedBy = "documentIncommingUserSend")
	private List<DocumentIncommingEntity> documentIncommingUserSend = new ArrayList<>();

	// Foreign key Document_Incomming_UserReceive
	@OneToMany(mappedBy = "documentIncommingUserReceive")
	private List<DocumentIncommingEntity> documentIncommingUserReceive = new ArrayList<>();

	// Foreign key Document_Send_UserSend
	@OneToMany(mappedBy = "documentSendUserSend")
	private List<DocumentSendEntity> documentSendUserSend = new ArrayList<>();

	// Foreign key User_Receive_Document
	@ManyToMany
	@JoinTable(name = "User_Receive_Document", joinColumns = @JoinColumn(name = "User_ID"), inverseJoinColumns = @JoinColumn(name = "Document_Send_ID"))
	private Set<DocumentSendEntity> documentSend = new HashSet<>();

	public Set<PermissionEntity> getPermission() {
		return Permission;
	}

	public void setPermission(Set<PermissionEntity> permission) {
		Permission = permission;
	}

	public List<DiscussEntity> getDiscuss() {
		return Discuss;
	}

	public void setDiscuss(List<DiscussEntity> discuss) {
		Discuss = discuss;
	}

	public String getUserUserName() {
		return userUserName;
	}

	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}

	public DepartmentEntity getDepartment() {
		return Department;
	}

	public void setDepartment(DepartmentEntity department) {
		Department = department;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public byte[] getUserImage() {
		return userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

	public Boolean getUserIsActive() {
		return userIsActive;
	}

	public void setUserIsActive(Boolean userIsActive) {
		this.userIsActive = userIsActive;
	}

	public PositionEntity getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(PositionEntity userPosition) {
		this.userPosition = userPosition;
	}

	public DepartmentEntity getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(DepartmentEntity userDepartment) {
		this.userDepartment = userDepartment;
	}

	public List<TaskEntity> getTaskPersonalSend() {
		return taskPersonalSend;
	}

	public void setTaskPersonalSend(List<TaskEntity> taskPersonalSend) {
		this.taskPersonalSend = taskPersonalSend;
	}

	public List<TaskEntity> getTaskPersonalReceive() {
		return taskPersonalReceive;
	}

	public void setTaskPersonalReceive(List<TaskEntity> taskPersonalReceive) {
		this.taskPersonalReceive = taskPersonalReceive;
	}

	public List<DocumentIncommingEntity> getDocumentIncommingUserSend() {
		return documentIncommingUserSend;
	}

	public void setDocumentIncommingUserSend(List<DocumentIncommingEntity> documentIncommingUserSend) {
		this.documentIncommingUserSend = documentIncommingUserSend;
	}

	public List<DocumentIncommingEntity> getDocumentIncommingUserReceive() {
		return documentIncommingUserReceive;
	}

	public void setDocumentIncommingUserReceive(List<DocumentIncommingEntity> documentIncommingUserReceive) {
		this.documentIncommingUserReceive = documentIncommingUserReceive;
	}

	public List<DocumentSendEntity> getDocumentSendUserSend() {
		return documentSendUserSend;
	}

	public void setDocumentSendUserSend(List<DocumentSendEntity> documentSendUserSend) {
		this.documentSendUserSend = documentSendUserSend;
	}

	public Set<DocumentSendEntity> getDocumentSend() {
		return documentSend;
	}

	public void setDocumentSend(Set<DocumentSendEntity> documentSend) {
		this.documentSend = documentSend;
	}
}
