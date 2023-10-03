package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.UserAccountDTO;
import com.nd2.assignwork.entity.UserAccountEntity;

@Component
public class UserAccountConverter {

	// Convert from DTO to Entity
	public UserAccountEntity toEntity(UserAccountDTO dto) {
		UserAccountEntity entity = new UserAccountEntity();
		entity.setUser_ID(dto.getUser_ID());
		entity.setUser_UserName(dto.getUser_UserName());
		entity.setUser_FullName(dto.getUser_FullName());
		entity.setUser_Email(dto.getUser_Email());
		entity.setUser_Password(dto.getUser_Password());
		entity.setUser_Phone(dto.getUser_Phone());
		entity.setUser_Image(dto.getUser_Image());
		entity.setUser_isActive(dto.getUser_isActive());
		return entity;
	}
	
	// Convert from Entity to DTO
	public UserAccountDTO toDTO(UserAccountEntity entity) {
		UserAccountDTO dto = new UserAccountDTO();
		dto.setUser_ID(entity.getUser_ID());
		dto.setUser_UserName(entity.getUser_UserName());
		dto.setUser_FullName(entity.getUser_FullName());
		dto.setUser_Email(entity.getUser_Email());
		dto.setUser_Password(entity.getUser_Password());
		dto.setUser_Phone(entity.getUser_Phone());
		dto.setUser_Image(entity.getUser_Image());
		dto.setUser_isActive(entity.getUser_isActive());
		if(entity.getUser_Position() != null) {
			dto.setUser_Position(entity.getUser_Position().getPosition_Name());
		}
		if(entity.getDepartment() != null) {
			dto.setUser_Department(entity.getDepartment().getDepartment_Name());
		}
		return dto;
	}
	
	// Save update UserAccount by convert from DTO to Entity
	public UserAccountEntity toEntity(UserAccountDTO dto, UserAccountEntity entity) {
		entity.setUser_ID(dto.getUser_ID());
		entity.setUser_UserName(dto.getUser_UserName());
		entity.setUser_FullName(dto.getUser_FullName());
		entity.setUser_Email(dto.getUser_Email());
		entity.setUser_Password(dto.getUser_Password());
		entity.setUser_Phone(dto.getUser_Phone());
		entity.setUser_Image(dto.getUser_Image());
		entity.setUser_isActive(dto.getUser_isActive());
		return entity;
	}
}
