package com.nd2.assignwork.entity;

import java.io.Serializable;
import java.util.Date;

public class DiscussID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TaskEntity discussTask;
	private UserAccountEntity discussUser;
	private Date discussTime;

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
}
