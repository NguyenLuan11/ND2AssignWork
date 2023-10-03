package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DepartmentDTO;
import com.nd2.assignwork.entity.DepartmentEntity;

@Component
public class DepartmentConverter {

	// Convert from DTO to Entity
	public DepartmentEntity toEntity(DepartmentDTO dto) {
		DepartmentEntity entity = new DepartmentEntity();
		entity.setDepartment_ID(dto.getDepartment_ID());
		entity.setDepartmentName(dto.getDepartment_Name());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DepartmentDTO toDTO(DepartmentEntity entity) {
		DepartmentDTO dto = new DepartmentDTO();
		dto.setDepartment_ID(entity.getDepartment_ID());
		dto.setDepartment_Name(entity.getDepartmentName());
		if(entity.getDepartment_Head() != null) {
			dto.setDepartment_Head(entity.getDepartment_Head().getUser_FullName());
		}
		return dto;
	}
	
	// Save update Department by convert from DTO to Entity
	public DepartmentEntity toEntity(DepartmentDTO dto, DepartmentEntity entity) {
		entity.setDepartment_ID(dto.getDepartment_ID());
		entity.setDepartmentName(dto.getDepartment_Name());
		return entity;
	}
}
