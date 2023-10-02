package com.nd2.assignwork.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Discuss")
public class DiscussEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Foreign key Discuss_Task
	@Id
	@ManyToOne
	@JoinColumn(name = "Discuss_Task")
	private TaskEntity Discuss_Task;

	// Foreign key Discuss_User
	@Id
	@ManyToOne
	@JoinColumn(name = "Discuss_User")
	private UserAccountEntity Discuss_User;

	@Id
	@Column(name = "Discuss_Time", columnDefinition = "datetime")
	private Date Discuss_Time;
	
	@Column(name = "Discuss_Content", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Discuss_Content;

	public TaskEntity getDiscuss_Task() {
		return Discuss_Task;
	}

	public void setDiscuss_Task(TaskEntity discuss_Task) {
		Discuss_Task = discuss_Task;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserAccountEntity getDiscuss_User() {
		return Discuss_User;
	}

	public void setDiscuss_User(UserAccountEntity discuss_User) {
		Discuss_User = discuss_User;
	}

	public Date getDiscuss_Time() {
		return Discuss_Time;
	}

	public void setDiscuss_Time(Date discuss_Time) {
		Discuss_Time = discuss_Time;
	}

	public String getDiscuss_Content() {
		return Discuss_Content;
	}

	public void setDiscuss_Content(String discuss_Content) {
		Discuss_Content = discuss_Content;
	}
}
