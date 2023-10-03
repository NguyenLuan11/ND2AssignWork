package com.nd2.assignwork.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	@JoinColumn(name = "Discuss_Task")
	private TaskEntity discussTask;

	// Foreign key Discuss_User
	@Id
	@ManyToOne
	@JoinColumn(name = "Discuss_User")
	private UserAccountEntity discussUser;

	@Id
	@Column(name = "Discuss_Time", columnDefinition = "datetime")
	private Date discussTime;
	
	@Column(name = "Discuss_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Discuss_Content;

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
	
	public String getDiscuss_Content() {
		return Discuss_Content;
	}

	public void setDiscuss_Content(String discuss_Content) {
		Discuss_Content = discuss_Content;
	}
}
