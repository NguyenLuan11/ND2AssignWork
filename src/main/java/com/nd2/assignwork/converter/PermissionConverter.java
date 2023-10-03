package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.PermissionDTO;
import com.nd2.assignwork.entity.PermissionEntity;

@Component
public class PermissionConverter {

	// Convert from DTO to Entity
	public PermissionEntity toEntity(PermissionDTO dto) {
		PermissionEntity entity = new PermissionEntity();
		entity.setPermission_Name(dto.getPermission_Name());
		return entity;
	}
	
	// Convert from Entity to DTO
	public PermissionDTO toDTO(PermissionEntity entity) {
		PermissionDTO dto = new PermissionDTO();
		if(entity.getPermission_ID() != null) {
			dto.setPermission_ID(entity.getPermission_ID());
		}
		dto.setPermission_Name(entity.getPermission_Name());
		return dto;
	}
	
	// Save update Permission by convert from DTO to Entity
	public PermissionEntity toEntity(PermissionDTO dto, PermissionEntity entity) {
		entity.setPermission_Name(dto.getPermission_Name());
		return entity;
	}
}
