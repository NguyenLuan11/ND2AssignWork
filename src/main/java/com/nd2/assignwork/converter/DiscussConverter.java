package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DiscussDTO;
import com.nd2.assignwork.entity.DiscussEntity;

@Component
public class DiscussConverter {

	// Convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto) {
		DiscussEntity entity = new DiscussEntity();
		entity.setDiscuss_Time(dto.getDiscuss_Time());
		entity.setDiscuss_Content(dto.getDiscuss_Content());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DiscussDTO toDTO(DiscussEntity entity) {
		DiscussDTO dto = new DiscussDTO();
		dto.setDiscuss_Time(entity.getDiscuss_Time());
		dto.setDiscuss_Content(entity.getDiscuss_Content());
		if(entity.getDiscuss_Task() != null) {
			dto.setDiscuss_Task(entity.getDiscuss_Task().getTask_Title());
		}
		if(entity.getDiscuss_User() != null) {
			dto.setDiscuss_User(entity.getDiscuss_User().getUser_FullName());
		}
		return dto;
	}
	
	// Save update Discuss by convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto, DiscussEntity entity) {
		entity.setDiscuss_Time(dto.getDiscuss_Time());
		entity.setDiscuss_Content(dto.getDiscuss_Content());
		return entity;
	}
}
