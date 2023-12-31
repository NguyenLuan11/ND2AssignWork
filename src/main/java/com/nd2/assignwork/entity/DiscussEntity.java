package com.nd2.assignwork.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Discuss")
@IdClass(DiscussID.class)
public class DiscussEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Foreign key Discuss_Task
	@Id
	@ManyToOne
	@JoinColumns(
			@JoinColumn(name = "Discuss_Task", referencedColumnName = "Task_ID"))
	@NotNull
	private TaskEntity discussTask;

	// Foreign key Discuss_User
	@Id
	@ManyToOne
	@JoinColumns(
			@JoinColumn(name = "Discuss_User", referencedColumnName = "User_ID"))
	@NotNull
	private UserAccountEntity discussUser;

	@Id
	@Column(name = "Discuss_Time", columnDefinition = "datetime")
	private Date discussTime;
	
	@Column(name = "Discuss_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String discussContent;

	public TaskEntity getDiscussTask() {
		return discussTask;
	}

	public void setDiscussTask(TaskEntity discussTask) {
		this.discussTask = discussTask;
	}

	public UserAccountEntity getDiscussUser() {
		return discussUser;
	}

	public void setDiscussUser(UserAccountEntity discussUser) {
		this.discussUser = discussUser;
	}

	public Date getDiscussTime() {
		return discussTime;
	}

	public void setDiscussTime(Date discussTime) {
		this.discussTime = discussTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDiscussContent() {
		return discussContent;
	}

	public void setDiscussContent(String discussContent) {
		this.discussContent = discussContent;
	}
}
