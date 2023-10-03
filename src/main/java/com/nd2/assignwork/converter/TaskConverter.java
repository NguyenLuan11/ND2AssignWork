package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.TaskDTO;
import com.nd2.assignwork.entity.TaskEntity;

@Component
public class TaskConverter {

	// Convert from DTO to Entity
	public TaskEntity toEntity(TaskDTO dto) {
		TaskEntity entity = new TaskEntity();
		entity.setTask_ID(dto.getTask_ID());
		entity.setTask_Title(dto.getTask_Title());
		entity.setTask_Content(dto.getTask_Content());
		entity.setTask_DateSend(dto.getTask_DateEnd());
		entity.setTask_DateEnd(dto.getTask_DateEnd());
		entity.setTask_State(dto.getTask_State());
		return entity;
	}
	
	// Convert from Entity to DTO
	public TaskDTO toDTO(TaskEntity entity) {
		TaskDTO dto = new TaskDTO();
		dto.setTask_ID(entity.getTask_ID());
		dto.setTask_Title(entity.getTask_Title());
		dto.setTask_Content(entity.getTask_Content());
		dto.setTask_DateSend(entity.getTask_DateEnd());
		dto.setTask_DateEnd(entity.getTask_DateEnd());
		dto.setTask_State(entity.getTask_State());
		if(entity.getTask_Category() != null) {
			dto.setTask_Category(entity.getTask_Category().getCategory_Name());
		}
		if(entity.getTask_Personal_Send() != null) {
			dto.setTask_Personal_Send(entity.getTask_Personal_Send().getUser_FullName());
		}
		if(entity.getTask_Personal_Receive() != null) {
			dto.setTask_Personal_Receive(entity.getTask_Personal_Receive().getUser_FullName());
		}
		return dto;
	}
	
	// Save update Task by convert from DTO to Entity
	public TaskEntity toEntity(TaskDTO dto, TaskEntity entity) {
		entity.setTask_ID(dto.getTask_ID());
		entity.setTask_Title(dto.getTask_Title());
		entity.setTask_Content(dto.getTask_Content());
		entity.setTask_DateSend(dto.getTask_DateEnd());
		entity.setTask_DateEnd(dto.getTask_DateEnd());
		return entity;
	}
}
