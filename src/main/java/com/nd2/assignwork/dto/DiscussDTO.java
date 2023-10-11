package com.nd2.assignwork.dto;

import java.util.Date;

public class DiscussDTO {

	private String discussTask;
	private String discussUser;
	private Date discussTime;
	private String discussContent;
	
	public String getDiscussTask() {
		return discussTask;
	}

	public void setDiscussTask(String discussTask) {
		this.discussTask = discussTask;
	}

	public String getDiscussUser() {
		return discussUser;
	}

	public void setDiscussUser(String discussUser) {
		this.discussUser = discussUser;
	}

	public Date getDiscussTime() {
		return discussTime;
	}

	public void setDiscussTime(Date discussTime) {
		this.discussTime = discussTime;
	}

	public String getDiscussContent() {
		return discussContent;
	}

	public void setDiscussContent(String discussContent) {
		this.discussContent = discussContent;
	}
}
