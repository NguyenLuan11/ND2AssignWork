package com.nd2.assignwork.dto;

import java.util.Date;

public class DocumentSendDTO {
	private String Document_Send_ID;
	
	private String Document_Send_Title;
	
	private String Document_Send_Content;
	
	private Date Document_Send_Time;
	
	private Date Document_Send_Deadline ;
	
	private String Document_Send_UserSend;

	private int Document_Send_State;

	public String getDocument_Send_ID() {
		return Document_Send_ID;
	}

	public void setDocument_Send_ID(String document_Send_ID) {
		Document_Send_ID = document_Send_ID;
	}

	public String getDocument_Send_Title() {
		return Document_Send_Title;
	}

	public void setDocument_Send_Title(String document_Send_Title) {
		Document_Send_Title = document_Send_Title;
	}

	public String getDocument_Send_Content() {
		return Document_Send_Content;
	}

	public void setDocument_Send_Content(String document_Send_Content) {
		Document_Send_Content = document_Send_Content;
	}

	public Date getDocument_Send_Time() {
		return Document_Send_Time;
	}

	public void setDocument_Send_Time(Date document_Send_Time) {
		Document_Send_Time = document_Send_Time;
	}

	public Date getDocument_Send_Deadline() {
		return Document_Send_Deadline;
	}

	public void setDocument_Send_Deadline(Date document_Send_Deadline) {
		Document_Send_Deadline = document_Send_Deadline;
	}

	public String getDocument_Send_UserSend() {
		return Document_Send_UserSend;
	}

	public void setDocument_Send_UserSend(String document_Send_UserSend) {
		Document_Send_UserSend = document_Send_UserSend;
	}

	public int getDocument_Send_State() {
		return Document_Send_State;
	}

	public void setDocument_Send_State(int document_Send_State) {
		Document_Send_State = document_Send_State;
	}
	
	
}
