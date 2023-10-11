package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DiscussDTO;
import com.nd2.assignwork.entity.DiscussEntity;

@Component
public class DiscussConverter {

	// Convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto) {
		DiscussEntity entity = new DiscussEntity();
		entity.setDiscussTime(dto.getDiscussTime());
		entity.setDiscussContent(dto.getDiscussContent());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DiscussDTO toDTO(DiscussEntity entity) {
		DiscussDTO dto = new DiscussDTO();
		dto.setDiscussTime(entity.getDiscussTime());
		dto.setDiscussContent(entity.getDiscussContent());
		if(entity.getDiscussTask() != null) {
			dto.setDiscussTask(entity.getDiscussTask().getTaskTitle());
		}
		if(entity.getDiscussUser() != null) {
			dto.setDiscussUser(entity.getDiscussUser().getUserFullName());
		}
		return dto;
	}
	
	// Save update Discuss by convert from DTO to Entity
	public DiscussEntity toEntity(DiscussDTO dto, DiscussEntity entity) {
		if(dto.getDiscussTime() != null) {
			entity.setDiscussTime(dto.getDiscussTime());
		}
		if(dto.getDiscussContent() != null) {
			entity.setDiscussContent(dto.getDiscussContent());
		}
		return entity;
	}
}
