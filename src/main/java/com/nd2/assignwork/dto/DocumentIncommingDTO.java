package com.nd2.assignwork.dto;

import java.util.Date;

public class DocumentIncommingDTO {

	private String documentIncommingID;
	private String documentIncommingTitle;
	private String documentIncommingContent;
	private Date documentIncommingTime;
	private int documentIncommingState;
	private String documentIncommingUserSend;
	private String documentIncommingUserReceive;

	public String getDocumentIncommingID() {
		return documentIncommingID;
	}

	public void setDocumentIncommingID(String documentIncommingID) {
		this.documentIncommingID = documentIncommingID;
	}

	public String getDocumentIncommingTitle() {
		return documentIncommingTitle;
	}

	public void setDocumentIncommingTitle(String documentIncommingTitle) {
		this.documentIncommingTitle = documentIncommingTitle;
	}

	public String getDocumentIncommingContent() {
		return documentIncommingContent;
	}

	public void setDocumentIncommingContent(String documentIncommingContent) {
		this.documentIncommingContent = documentIncommingContent;
	}

	public Date getDocumentIncommingTime() {
		return documentIncommingTime;
	}

	public void setDocumentIncommingTime(Date documentIncommingTime) {
		this.documentIncommingTime = documentIncommingTime;
	}

	public int getDocumentIncommingState() {
		return documentIncommingState;
	}

	public void setDocumentIncommingState(int documentIncommingState) {
		this.documentIncommingState = documentIncommingState;
	}

	public String getDocumentIncommingUserSend() {
		return documentIncommingUserSend;
	}

	public void setDocumentIncommingUserSend(String documentIncommingUserSend) {
		this.documentIncommingUserSend = documentIncommingUserSend;
	}

	public String getDocumentIncommingUserReceive() {
		return documentIncommingUserReceive;
	}

	public void setDocumentIncommingUserReceive(String documentIncommingUserReceive) {
		this.documentIncommingUserReceive = documentIncommingUserReceive;
	}
}
