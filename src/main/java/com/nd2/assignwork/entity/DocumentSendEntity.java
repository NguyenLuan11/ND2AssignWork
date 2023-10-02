package com.nd2.assignwork.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "Document_Send")
public class DocumentSendEntity {

	@Id
	@Column(name = "Document_Send_ID", columnDefinition = "varchar(20)")
	private String Document_Send_ID;
	
	@Column(name = "Document_Send_Title", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Document_Send_Title;
	
	@Column(name = "Document_Send_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Document_Send_Content;
	
	@Column(name = "Document_Send_Time", columnDefinition = "datetime")
	@CreatedDate
	@NotBlank
	private Date Document_Send_Time;
	
	@Column(name = "Document_Send_Deadline", columnDefinition = "datetime")
	private Date Document_Send_Deadline;
	
	@Column(name = "Document_Send_State", columnDefinition = "int default 0")
	private int Document_Send_State;
	
	// Foreign key Document_Send_UserSend
	@ManyToOne
	@JoinColumn(name = "Document_Send_UserSend")
	@NotBlank
	private UserAccountEntity Document_Send_UserSend;
	
	// Foreign key User_Receive_Document
	@ManyToMany(mappedBy = "DocumentSend")
	private Set<UserAccountEntity> UserAccount = new HashSet<>();
	
	// Foreign key Document_Send_File
	@ManyToMany(mappedBy = "DocumentSendFile")
	private Set<FileEntity> File = new HashSet<>();

	public String getDocument_Send_ID() {
		return Document_Send_ID;
	}

	public void setDocument_Send_ID(String document_Send_ID) {
		Document_Send_ID = document_Send_ID;
	}

	public String getDocument_Send_Title() {
		return Document_Send_Title;
	}

	public void setDocument_Send_Title(String document_Send_Title) {
		Document_Send_Title = document_Send_Title;
	}

	public String getDocument_Send_Content() {
		return Document_Send_Content;
	}

	public void setDocument_Send_Content(String document_Send_Content) {
		Document_Send_Content = document_Send_Content;
	}

	public Date getDocument_Send_Time() {
		return Document_Send_Time;
	}

	public void setDocument_Send_Time(Date document_Send_Time) {
		Document_Send_Time = document_Send_Time;
	}

	public Date getDocument_Send_Deadline() {
		return Document_Send_Deadline;
	}

	public void setDocument_Send_Deadline(Date document_Send_Deadline) {
		Document_Send_Deadline = document_Send_Deadline;
	}

	public int getDocument_Send_State() {
		return Document_Send_State;
	}

	public void setDocument_Send_State(int document_Send_State) {
		Document_Send_State = document_Send_State;
	}

	public UserAccountEntity getDocument_Send_UserSend() {
		return Document_Send_UserSend;
	}

	public void setDocument_Send_UserSend(UserAccountEntity document_Send_UserSend) {
		Document_Send_UserSend = document_Send_UserSend;
	}

	public Set<UserAccountEntity> getUserAccount() {
		return UserAccount;
	}

	public void setUserAccount(Set<UserAccountEntity> userAccount) {
		UserAccount = userAccount;
	}

	public Set<FileEntity> getFile() {
		return File;
	}

	public void setFile(Set<FileEntity> file) {
		File = file;
	}
}
