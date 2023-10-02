package com.nd2.assignwork.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "Task")
public class TaskEntity {

	@Id
	@Column(name = "Task_ID", columnDefinition = "varchar(20)")
	private String Task_ID;
	
	@Column(name = "Task_Title", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Task_Title;
	
	@Column(name = "Task_Content", columnDefinition = "nvarchar(255)")
	private String Task_Content;
	
	@Column(name = "Task_DateSend", columnDefinition = "datetime")
	@CreatedDate
	@NotBlank
	private Date Task_DateSend;
	
	@Column(name = "Task_DateEnd", columnDefinition = "datetime")
	private Date Task_DateEnd;
	
	@Column(name = "Task_State", columnDefinition = "int default 0")
	private int Task_State;
	
	// Foreign key Task_Category_Task
	@ManyToOne
	@JoinColumn(name = "Task_Category")
	@NotBlank
	private TaskCategoryEntity Task_Category;
	
	// Foreign key Task_Personal_Send
	@ManyToOne
	@JoinColumn(name = "Task_Personal_Send")
	@NotBlank
	private UserAccountEntity Task_Personal_Send;

	// Foreign key Task_Personal_Receive
	@ManyToOne
	@JoinColumn(name = "Task_Personal_Receive")
	@NotBlank
	private UserAccountEntity Task_Personal_Receive;
	
	// Foreign key Discuss_Task
	@OneToMany(mappedBy = "Discuss_Task")
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

	public String getTask_ID() {
		return Task_ID;
	}

	public void setTask_ID(String task_ID) {
		Task_ID = task_ID;
	}

	public String getTask_Title() {
		return Task_Title;
	}

	public void setTask_Title(String task_Title) {
		Task_Title = task_Title;
	}

	public String getTask_Content() {
		return Task_Content;
	}

	public void setTask_Content(String task_Content) {
		Task_Content = task_Content;
	}

	public Date getTask_DateSend() {
		return Task_DateSend;
	}

	public void setTask_DateSend(Date task_DateSend) {
		Task_DateSend = task_DateSend;
	}

	public Date getTask_DateEnd() {
		return Task_DateEnd;
	}

	public void setTask_DateEnd(Date task_DateEnd) {
		Task_DateEnd = task_DateEnd;
	}

	public int getTask_State() {
		return Task_State;
	}

	public void setTask_State(int task_State) {
		Task_State = task_State;
	}

	public TaskCategoryEntity getTask_Category() {
		return Task_Category;
	}

	public void setTask_Category(TaskCategoryEntity task_Category) {
		Task_Category = task_Category;
	}

	public UserAccountEntity getTask_Personal_Send() {
		return Task_Personal_Send;
	}

	public void setTask_Personal_Send(UserAccountEntity task_Personal_Send) {
		Task_Personal_Send = task_Personal_Send;
	}

	public UserAccountEntity getTask_Personal_Receive() {
		return Task_Personal_Receive;
	}

	public void setTask_Personal_Receive(UserAccountEntity task_Personal_Receive) {
		Task_Personal_Receive = task_Personal_Receive;
	}

	public List<DiscussEntity> getDiscuss() {
		return Discuss;
	}

	public void setDiscuss(List<DiscussEntity> discuss) {
		Discuss = discuss;
	}
}
