package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.FileDTO;
import com.nd2.assignwork.entity.FileEntity;

@Component
public class FileConverter {

	// Convert from DTO to Entity
	public FileEntity toEntity(FileDTO dto) {
		FileEntity entity = new FileEntity();
		entity.setFile_ID(dto.getFile_ID());
		entity.setFile_Name(dto.getFile_Name());
		return entity;
	}
	
	// Convert from Entity to DTO
	public FileDTO toDTO(FileEntity entity) {
		FileDTO dto = new FileDTO();
		dto.setFile_ID(entity.getFile_ID());
		dto.setFile_Name(entity.getFile_Name());
		return dto;
	}
	
	// Save update File by convert from DTO to Entity
	public FileEntity toEntity(FileDTO dto, FileEntity entity) {
		entity.setFile_ID(dto.getFile_ID());
		entity.setFile_Name(dto.getFile_Name());
		return entity;
	}
}
