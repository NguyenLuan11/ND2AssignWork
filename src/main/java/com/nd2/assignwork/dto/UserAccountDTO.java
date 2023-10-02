package com.nd2.assignwork.dto;


public class UserAccountDTO {
	private String User_ID;

	private String User_UserName;
	
	private String User_FullName;
	
	private String User_Password;

	private String User_Phone;
	
	private String User_Email;
	
	private int User_Position;
	
	private String User_Department;
	
	private byte[] User_Image;

	private Boolean User_isActive;

	public String getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}

	public String getUser_UserName() {
		return User_UserName;
	}

	public void setUser_UserName(String user_UserName) {
		User_UserName = user_UserName;
	}

	public String getUser_FullName() {
		return User_FullName;
	}

	public void setUser_FullName(String user_FullName) {
		User_FullName = user_FullName;
	}

	public String getUser_Password() {
		return User_Password;
	}

	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}

	public String getUser_Phone() {
		return User_Phone;
	}

	public void setUser_Phone(String user_Phone) {
		User_Phone = user_Phone;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public int getUser_Position() {
		return User_Position;
	}

	public void setUser_Position(int user_Position) {
		User_Position = user_Position;
	}

	public String getUser_Department() {
		return User_Department;
	}

	public void setUser_Department(String user_Department) {
		User_Department = user_Department;
	}

	public byte[] getUser_Image() {
		return User_Image;
	}

	public void setUser_Image(byte[] user_Image) {
		User_Image = user_Image;
	}

	public Boolean getUser_isActive() {
		return User_isActive;
	}

	public void setUser_isActive(Boolean user_isActive) {
		User_isActive = user_isActive;
	}
	
}
