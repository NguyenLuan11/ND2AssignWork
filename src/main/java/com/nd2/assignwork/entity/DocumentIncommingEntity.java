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
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "Document_Incomming")
public class DocumentIncommingEntity {

	@Id
	@Column(name = "Document_Incomming_ID", columnDefinition = "varchar(20)")
	private String documentIncommingID;
	
	@Column(name = "Document_Incomming_Title", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String documentIncommingTitle;
	
	@Column(name = "Document_Incomming_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String documentIncommingContent;
	
	@Column(name = "Document_Incomming_Time", columnDefinition = "datetime")
	@CreatedDate
	@NotNull
	private Date documentIncommingTime;
	
	@Column(name = "Document_Incomming_State", columnDefinition = "int default 0")
	private int documentIncommingState;
	
	// Foreign key Document_Incomming_UserSend
	@ManyToOne
	@JoinColumn(name = "Document_Incomming_UserSend")
	@NotNull
	private UserAccountEntity documentIncommingUserSend;
	
	// Foreign key Document_Incomming_UserReceive
	@ManyToOne
	@JoinColumn(name = "Document_Incomming_UserReceive")
	@NotNull
	private UserAccountEntity documentIncommingUserReceive;
	
	// Foreign key Document_Incomming_File
	@ManyToMany(mappedBy = "documentIncomming")
	private Set<FileEntity> File = new HashSet<>();

	public String getDocumentIncommingID() {
		return documentIncommingID;
	}

	public void setDocumentIncommingID(String documentIncommingID) {
		this.documentIncommingID = documentIncommingID;
	}

	public String getDocumentIncommingTitle() {
		return documentIncommingTitle;
	}

	public void setDocumentIncommingTitle(String documentIncommingTitle) {
		this.documentIncommingTitle = documentIncommingTitle;
	}

	public String getDocumentIncommingContent() {
		return documentIncommingContent;
	}

	public void setDocumentIncommingContent(String documentIncommingContent) {
		this.documentIncommingContent = documentIncommingContent;
	}

	public Date getDocumentIncommingTime() {
		return documentIncommingTime;
	}

	public void setDocumentIncommingTime(Date documentIncommingTime) {
		this.documentIncommingTime = documentIncommingTime;
	}

	public int getDocumentIncommingState() {
		return documentIncommingState;
	}

	public void setDocumentIncommingState(int documentIncommingState) {
		this.documentIncommingState = documentIncommingState;
	}

	public UserAccountEntity getDocumentIncommingUserSend() {
		return documentIncommingUserSend;
	}

	public void setDocumentIncommingUserSend(UserAccountEntity documentIncommingUserSend) {
		this.documentIncommingUserSend = documentIncommingUserSend;
	}

	public UserAccountEntity getDocumentIncommingUserReceive() {
		return documentIncommingUserReceive;
	}

	public void setDocumentIncommingUserReceive(UserAccountEntity documentIncommingUserReceive) {
		this.documentIncommingUserReceive = documentIncommingUserReceive;
	}

	public Set<FileEntity> getFile() {
		return File;
	}

	public void setFile(Set<FileEntity> file) {
		File = file;
	}
}
