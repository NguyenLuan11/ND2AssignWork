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

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "UserAccount")
public class UserAccountEntity {

	@Id
	@Column(name = "User_ID", columnDefinition = "varchar(20)")
	private String User_ID;
	
	@Column(name = "User_UserName", columnDefinition = "varchar(30)")
	@NotBlank
	private String User_UserName;
	
	@Column(name = "User_FullName", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String User_FullName;
	
	@Column(name = "User_Password", columnDefinition = "varchar(255)")
	@NotBlank
	private String User_Password;
	
	@Column(name = "User_Phone", columnDefinition = "varchar(12)")
	@NotBlank
	private String User_Phone;
	
	@Column(name = "User_Email", columnDefinition = "varchar(255)")
	@NotBlank
	private String User_Email;
	
	@Column(name = "User_Image", columnDefinition = "varbinary(60000)")
	private byte[] User_Image;
	
	@Column(name = "User_isActive", columnDefinition = "bit default 1")
	private Boolean User_isActive;
	
	// Foreign key User_Position
	@ManyToOne
	@JoinColumn(name = "User_Position")
	@NotBlank
	private PositionEntity User_Position;
	
	// Foreign key User_Department
	@ManyToOne
	@JoinColumn(name = "User_Department")
	@NotBlank
	private DepartmentEntity User_Department;
	
	// Foreign key Task_Personal_Send
	@OneToMany(mappedBy = "Task_Personal_Send")
	private List<TaskEntity> TaskPersonalSend = new ArrayList<>();
	
	// Foreign key Task_Personal_Receive
	@OneToMany(mappedBy = "Task_Personal_Receive")
	private List<TaskEntity> TaskPersonalReceive = new ArrayList<>();
	
	// Foreign key Department_Head
	@OneToOne(mappedBy = "Department_Head")
	private DepartmentEntity Department;
	
	// Foreign key Discuss_User
	@OneToMany(mappedBy = "Discuss_User")
	private List<DiscussEntity> Discuss = new ArrayList<>();
	
	// Foreign key User_Permission
	@ManyToMany
	@JoinTable(name = "User_Permission",
			joinColumns = @JoinColumn(name = "User_ID"),
			inverseJoinColumns = @JoinColumn(name = "Permission_ID"))
	private Set<PermissionEntity> Permission = new HashSet<>();
	
	// Foreign key Document_Incomming_UserSend
	@OneToMany(mappedBy = "Document_Incomming_UserSend")
	private List<DocumentIncommingEntity> DocumentIncommingUserSend = new ArrayList<>();
	
	// Foreign key Document_Incomming_UserReceive
	@OneToMany(mappedBy = "Document_Incomming_UserReceive")
	private List<DocumentIncommingEntity> DocumentIncommingUserReceive = new ArrayList<>();
	
	// Foreign key Document_Send_UserSend
	@OneToMany(mappedBy = "Document_Send_UserSend")
	private List<DocumentSendEntity> DocumentSendUserSend = new ArrayList<>();
	
	// Foreign key User_Receive_Document
	@ManyToMany
	@JoinTable(name = "User_Receive_Document",
			joinColumns = @JoinColumn(name = "User_ID"),
			inverseJoinColumns = @JoinColumn(name = "Document_Send_ID"))
	private Set<DocumentSendEntity> DocumentSend = new HashSet<>();
	
	public Set<DocumentSendEntity> getDocumentSend() {
		return DocumentSend;
	}

	public void setDocumentSend(Set<DocumentSendEntity> documentSend) {
		DocumentSend = documentSend;
	}

	public List<DocumentSendEntity> getDocumentSendUserSend() {
		return DocumentSendUserSend;
	}

	public void setDocumentSendUserSend(List<DocumentSendEntity> documentSendUserSend) {
		DocumentSendUserSend = documentSendUserSend;
	}

	public List<DocumentIncommingEntity> getDocumentIncommingUserSend() {
		return DocumentIncommingUserSend;
	}

	public void setDocumentIncommingUserSend(List<DocumentIncommingEntity> documentIncommingUserSend) {
		DocumentIncommingUserSend = documentIncommingUserSend;
	}

	public List<DocumentIncommingEntity> getDocumentIncommingUserReceive() {
		return DocumentIncommingUserReceive;
	}

	public void setDocumentIncommingUserReceive(List<DocumentIncommingEntity> documentIncommingUserReceive) {
		DocumentIncommingUserReceive = documentIncommingUserReceive;
	}

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

	public String getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}

	public String getUser_UserName() {
		return User_UserName;
	}

	public void setUser_UserName(String user_UserName) {
		User_UserName = user_UserName;
	}

	public String getUser_FullName() {
		return User_FullName;
	}

	public void setUser_FullName(String user_FullName) {
		User_FullName = user_FullName;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public String getUser_Phone() {
		return User_Phone;
	}

	public void setUser_Phone(String user_Phone) {
		User_Phone = user_Phone;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public byte[] getUser_Image() {
		return User_Image;
	}

	public void setUser_Image(byte[] user_Image) {
		User_Image = user_Image;
	}

	public Boolean getUser_isActive() {
		return User_isActive;
	}

	public void setUser_isActive(Boolean user_isActive) {
		User_isActive = user_isActive;
	}

	public PositionEntity getUser_Position() {
		return User_Position;
	}

	public void setUser_Position(PositionEntity user_Position) {
		User_Position = user_Position;
	}

	public DepartmentEntity getUser_Department() {
		return User_Department;
	}

	public void setUser_Department(DepartmentEntity user_Department) {
		User_Department = user_Department;
	}

	public List<TaskEntity> getTaskPersonalSend() {
		return TaskPersonalSend;
	}

	public void setTaskPersonalSend(List<TaskEntity> taskPersonalSend) {
		TaskPersonalSend = taskPersonalSend;
	}

	public List<TaskEntity> getTaskPersonalReceive() {
		return TaskPersonalReceive;
	}

	public void setTaskPersonalReceive(List<TaskEntity> taskPersonalReceive) {
		TaskPersonalReceive = taskPersonalReceive;
	}

	public DepartmentEntity getDepartment() {
		return Department;
	}

	public void setDepartment(DepartmentEntity department) {
		Department = department;
	}
}
