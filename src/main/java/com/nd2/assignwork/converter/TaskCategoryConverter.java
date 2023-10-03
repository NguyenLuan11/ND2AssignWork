package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.TaskCategoryDTO;
import com.nd2.assignwork.entity.TaskCategoryEntity;

@Component
public class TaskCategoryConverter {

	// Convert from DTO to Entity
	public TaskCategoryEntity toEntity(TaskCategoryDTO dto) {
		TaskCategoryEntity entity = new TaskCategoryEntity();
		entity.setCategory_Name(dto.getCategory_Name());
		return entity;
	}
	
	// Convert from Entity to DTO
	public TaskCategoryDTO toDTO(TaskCategoryEntity entity) {
		TaskCategoryDTO dto = new TaskCategoryDTO();
		if(entity.getTask_Category_ID() != null) {
			dto.setTask_Category_ID(entity.getTask_Category_ID());
		}
		dto.setCategory_Name(entity.getCategory_Name());
		return dto;
	}
	
	// Save update TaskCategory by convert from DTO to Entity
	public TaskCategoryEntity toEntity(TaskCategoryDTO dto, TaskCategoryEntity entity) {
		entity.setCategory_Name(dto.getCategory_Name());
		return entity;
	}
}
