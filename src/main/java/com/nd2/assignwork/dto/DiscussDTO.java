package com.nd2.assignwork.dto;

import java.util.Date;

public class DiscussDTO {
	
	private String Discuss_Task;
	
	private String Discuss_User;
	
	private Date Discuss_Time;
	
	private String Discuss_Content;

	public String getDiscuss_Task() {
		return Discuss_Task;
	}

	public void setDiscuss_Task(String discuss_Task) {
		Discuss_Task = discuss_Task;
	}

	public String getDiscuss_User() {
		return Discuss_User;
	}

	public void setDiscuss_User(String discuss_User) {
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
