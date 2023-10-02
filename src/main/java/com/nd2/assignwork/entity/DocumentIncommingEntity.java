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
@Table(name = "Document_Incomming")
public class DocumentIncommingEntity {

	@Id
	@Column(name = "Document_Incomming_ID", columnDefinition = "varchar(20)")
	private String Document_Incomming_ID;
	
	@Column(name = "Document_Incomming_Title", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Document_Incomming_Title;
	
	@Column(name = "Document_Incomming_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Document_Incomming_Content;
	
	@Column(name = "Document_Incomming_Time", columnDefinition = "datetime")
	@CreatedDate
	@NotBlank
	private Date Document_Incomming_Time;
	
	@Column(name = "Document_Incomming_State", columnDefinition = "int default 0")
	private int Document_Incomming_State;
	
	// Foreign key Document_Incomming_UserSend
	@ManyToOne
	@JoinColumn(name = "Document_Incomming_UserSend")
	@NotBlank
	private UserAccountEntity Document_Incomming_UserSend;
	
	// Foreign key Document_Incomming_UserReceive
	@ManyToOne
	@JoinColumn(name = "Document_Incomming_UserReceive")
	@NotBlank
	private UserAccountEntity Document_Incomming_UserReceive;
	
	// Foreign key Document_Incomming_File
	@ManyToMany(mappedBy = "DocumentIncomming")
	private Set<FileEntity> File = new HashSet<>();

	public String getDocument_Incomming_ID() {
		return Document_Incomming_ID;
	}

	public void setDocument_Incomming_ID(String document_Incomming_ID) {
		Document_Incomming_ID = document_Incomming_ID;
	}

	public String getDocument_Incomming_Title() {
		return Document_Incomming_Title;
	}

	public void setDocument_Incomming_Title(String document_Incomming_Title) {
		Document_Incomming_Title = document_Incomming_Title;
	}

	public String getDocument_Incomming_Content() {
		return Document_Incomming_Content;
	}

	public void setDocument_Incomming_Content(String document_Incomming_Content) {
		Document_Incomming_Content = document_Incomming_Content;
	}

	public Date getDocument_Incomming_Time() {
		return Document_Incomming_Time;
	}

	public void setDocument_Incomming_Time(Date document_Incomming_Time) {
		Document_Incomming_Time = document_Incomming_Time;
	}

	public int getDocument_Incomming_State() {
		return Document_Incomming_State;
	}

	public void setDocument_Incomming_State(int document_Incomming_State) {
		Document_Incomming_State = document_Incomming_State;
	}

	public UserAccountEntity getDocument_Incomming_UserSend() {
		return Document_Incomming_UserSend;
	}

	public void setDocument_Incomming_UserSend(UserAccountEntity document_Incomming_UserSend) {
		Document_Incomming_UserSend = document_Incomming_UserSend;
	}

	public UserAccountEntity getDocument_Incomming_UserReceive() {
		return Document_Incomming_UserReceive;
	}

	public void setDocument_Incomming_UserReceive(UserAccountEntity document_Incomming_UserReceive) {
		Document_Incomming_UserReceive = document_Incomming_UserReceive;
	}
}
