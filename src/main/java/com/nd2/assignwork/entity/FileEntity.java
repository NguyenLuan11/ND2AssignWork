package com.nd2.assignwork.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "File")
public class FileEntity {

	@Id
	@Column(name = "File_ID", columnDefinition = "varchar(20)")
	private String File_ID;
	
	@Column(name = "File_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String File_Name;
	
	// Foreign key Task_File
	@ManyToMany
	@JoinTable(name = "Task_File",
		joinColumns = @JoinColumn(name = "File_ID"),
		inverseJoinColumns = @JoinColumn(name = "Task_ID"))
	private Set<TaskEntity> Task = new HashSet<>();
	
	// Foreign key Document_Incomming_File
	@ManyToMany
	@JoinTable(name = "Document_Incomming_File",
		joinColumns = @JoinColumn(name = "File_ID"),
		inverseJoinColumns = @JoinColumn(name = "Document_Incomming_ID"))
	private Set<DocumentIncommingEntity> DocumentIncomming = new HashSet<>();
	
	// Foreign key Document_Send_File
	@ManyToMany
	@JoinTable(name = "Document_Send_File",
		joinColumns = @JoinColumn(name = "File_ID"),
		inverseJoinColumns = @JoinColumn(name = "Document_Send_ID"))
	private Set<DocumentSendEntity> DocumentSendFile = new HashSet<>();

	public Set<DocumentSendEntity> getDocumentSendFile() {
		return DocumentSendFile;
	}

	public void setDocumentSendFile(Set<DocumentSendEntity> documentSendFile) {
		DocumentSendFile = documentSendFile;
	}

	public Set<DocumentIncommingEntity> getDocumentIncomming() {
		return DocumentIncomming;
	}

	public void setDocumentIncomming(Set<DocumentIncommingEntity> documentIncomming) {
		DocumentIncomming = documentIncomming;
	}
	
	public Set<TaskEntity> getTask() {
		return Task;
	}

	public void setTask(Set<TaskEntity> task) {
		Task = task;
	}

	public String getFile_ID() {
		return File_ID;
	}

	public void setFile_ID(String file_ID) {
		File_ID = file_ID;
	}

	public String getFile_Name() {
		return File_Name;
	}

	public void setFile_Name(String file_Name) {
		File_Name = file_Name;
	}
}
