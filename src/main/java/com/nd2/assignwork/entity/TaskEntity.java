package com.nd2.assignwork.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Task")
public class TaskEntity {

	@Id
	@Column(name = "Task_ID", columnDefinition = "varchar(20)")
	private String taskID;
	
	@Column(name = "Task_Title", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String taskTitle;
	
	@Column(name = "Task_Content", columnDefinition = "nvarchar(255)")
	private String taskContent;
	
	@Column(name = "Task_DateSend", columnDefinition = "datetime")
	@CreationTimestamp
	private Date taskDateSend;
	
	@Column(name = "Task_DateEnd", columnDefinition = "datetime")
	private Date taskDateEnd;
	
	@Column(name = "Task_State", columnDefinition = "int default 0")
	private int taskState;
	
	// Foreign key Task_Category_Task
	@ManyToOne
	@JoinColumn(name = "Task_Category")
	@NotNull
	private TaskCategoryEntity taskCategory;
	
	// Foreign key Task_Personal_Send
	@ManyToOne
	@JoinColumn(name = "Task_Personal_Send")
	@NotNull
	private UserAccountEntity taskPersonalSend;

	// Foreign key Task_Personal_Receive
	@ManyToOne
	@JoinColumn(name = "Task_Personal_Receive")
	@NotNull
	private UserAccountEntity taskPersonalReceive;
	
	// Foreign key Discuss_Task
	@OneToMany(mappedBy = "discussTask")
	private List<DiscussEntity> Discuss = new ArrayList<>();
	
	// Foreign key Task_File
	@ManyToMany(mappedBy = "Task")
	private Set<FileEntity> File = new HashSet<>();
	
	public Set<FileEntity> getFile() {
		return File;
	}

	public void setFile(Set<FileEntity> file) {
		File = file;
	}
	
	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	
	public List<DiscussEntity> getDiscuss() {
		return Discuss;
	}

	public void setDiscuss(List<DiscussEntity> discuss) {
		Discuss = discuss;
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public String getTaskContent() {
		return taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	public Date getTaskDateSend() {
		return taskDateSend;
	}

	public void setTaskDateSend(Date taskDateSend) {
		this.taskDateSend = taskDateSend;
	}

	public Date getTaskDateEnd() {
		return taskDateEnd;
	}

	public void setTaskDateEnd(Date taskDateEnd) {
		this.taskDateEnd = taskDateEnd;
	}

	public int getTaskState() {
		return taskState;
	}

	public void setTaskState(int taskState) {
		this.taskState = taskState;
	}

	public TaskCategoryEntity getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(TaskCategoryEntity taskCategory) {
		this.taskCategory = taskCategory;
	}

	public UserAccountEntity getTaskPersonalSend() {
		return taskPersonalSend;
	}

	public void setTaskPersonalSend(UserAccountEntity taskPersonalSend) {
		this.taskPersonalSend = taskPersonalSend;
	}

	public UserAccountEntity getTaskPersonalReceive() {
		return taskPersonalReceive;
	}

	public void setTaskPersonalReceive(UserAccountEntity taskPersonalReceive) {
		this.taskPersonalReceive = taskPersonalReceive;
	}
}
