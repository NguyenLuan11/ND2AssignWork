package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DocumentIncommingDTO;
import com.nd2.assignwork.entity.DocumentIncommingEntity;

@Component
public class DocumentIncommingConverter {

	// Convert from DTO to Entity
	public DocumentIncommingEntity toEntity(DocumentIncommingDTO dto) {
		DocumentIncommingEntity entity = new DocumentIncommingEntity();
		entity.setDocumentIncommingID(dto.getDocumentIncommingID());
		entity.setDocumentIncommingTitle(dto.getDocumentIncommingTitle());
		entity.setDocumentIncommingContent(dto.getDocumentIncommingContent());
		entity.setDocumentIncommingTime(dto.getDocumentIncommingTime());
		entity.setDocumentIncommingState(dto.getDocumentIncommingState());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DocumentIncommingDTO toDTO(DocumentIncommingEntity entity) {
		DocumentIncommingDTO dto = new DocumentIncommingDTO();
		dto.setDocumentIncommingID(entity.getDocumentIncommingID());
		dto.setDocumentIncommingTitle(entity.getDocumentIncommingTitle());
		dto.setDocumentIncommingContent(entity.getDocumentIncommingContent());
		dto.setDocumentIncommingTime(entity.getDocumentIncommingTime());
		dto.setDocumentIncommingState(entity.getDocumentIncommingState());
		if(entity.getDocumentIncommingUserSend() != null) {
			dto.setDocumentIncommingUserSend(entity.getDocumentIncommingUserSend().getUserFullName());
		}
		if(entity.getDocumentIncommingUserReceive() != null) {
			dto.setDocumentIncommingUserReceive(entity.getDocumentIncommingUserReceive().getUserFullName());
		}
		return dto;
	}
	
	// Save update DocumentIncomming by convert from DTO to Entity
	public DocumentIncommingEntity toEntity(DocumentIncommingDTO dto, DocumentIncommingEntity entity) {
		entity.setDocumentIncommingID(dto.getDocumentIncommingID());
		entity.setDocumentIncommingTitle(dto.getDocumentIncommingTitle());
		entity.setDocumentIncommingContent(dto.getDocumentIncommingContent());
		entity.setDocumentIncommingTime(dto.getDocumentIncommingTime());
		entity.setDocumentIncommingState(dto.getDocumentIncommingState());
		return entity;
	}
}
