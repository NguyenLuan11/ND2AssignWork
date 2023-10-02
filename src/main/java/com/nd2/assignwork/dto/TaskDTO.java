package com.nd2.assignwork.dto;

import java.util.Date;

public class TaskDTO {
	
	private String Task_ID;
	
	private String Task_Title;
	
	private String Task_Content;
	
	private int Task_Category;
	
	private Date Task_DateSend;
	
	private Date Task_DateEnd;
	
	private String Task_Personal_Send;
	
	private String Task_Personal_Receive;
	
	private int Task_State;

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

	public int getTask_Category() {
		return Task_Category;
	}

	public void setTask_Category(int task_Category) {
		Task_Category = task_Category;
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

	public String getTask_Personal_Send() {
		return Task_Personal_Send;
	}

	public void setTask_Personal_Send(String task_Personal_Send) {
		Task_Personal_Send = task_Personal_Send;
	}

	public String getTask_Personal_Receive() {
		return Task_Personal_Receive;
	}

	public void setTask_Personal_Receive(String task_Personal_Receive) {
		Task_Personal_Receive = task_Personal_Receive;
	}

	public int getTask_State() {
		return Task_State;
	}

	public void setTask_State(int task_State) {
		Task_State = task_State;
	}
	
	
}
