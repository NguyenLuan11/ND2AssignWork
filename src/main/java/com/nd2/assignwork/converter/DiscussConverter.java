package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DiscussDTO;
import com.nd2.assignwork.entity.DiscussEntity;

@Component
public class DiscussConverter {

	// Convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto) {
		DiscussEntity entity = new DiscussEntity();
		entity.setDiscussTime(dto.getDiscuss_Time());
		entity.setDiscuss_Content(dto.getDiscuss_Content());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DiscussDTO toDTO(DiscussEntity entity) {
		DiscussDTO dto = new DiscussDTO();
		dto.setDiscuss_Time(entity.getDiscussTime());
		dto.setDiscuss_Content(entity.getDiscuss_Content());
		if(entity.getDiscussTask() != null) {
			dto.setDiscuss_Task(entity.getDiscussTask().getTaskTitle());
		}
		if(entity.getDiscussUser() != null) {
			dto.setDiscuss_User(entity.getDiscussUser().getUser_FullName());
		}
		return dto;
	}
	
	// Save update Discuss by convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto, DiscussEntity entity) {
		entity.setDiscussTime(dto.getDiscuss_Time());
		entity.setDiscuss_Content(dto.getDiscuss_Content());
		return entity;
	}
}
