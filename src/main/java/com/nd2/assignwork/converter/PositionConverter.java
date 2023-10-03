package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.PositionDTO;
import com.nd2.assignwork.entity.PositionEntity;

@Component
public class PositionConverter {

	// Convert from DTO to Entity
	public PositionEntity toEntity(PositionDTO dto) {
		PositionEntity entity = new PositionEntity();
		entity.setPosition_Name(dto.getPosition_Name());
		return entity;
	}
	
	// Convert from Entity to DTO
	public PositionDTO toDTO(PositionEntity entity) {
		PositionDTO dto = new PositionDTO();
		if(entity.getPosition_ID() != null) {
			dto.setPosition_ID(entity.getPosition_ID());
		}
		dto.setPosition_Name(entity.getPosition_Name());
		return dto;
	}
	
	// Save update Position by convert from DTO to Entity
	public PositionEntity toEntity(PositionDTO dto, PositionEntity entity) {
		entity.setPosition_Name(dto.getPosition_Name());
		return entity;
	}
}
