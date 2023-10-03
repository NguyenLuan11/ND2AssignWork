package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DocumentSendDTO;
import com.nd2.assignwork.entity.DocumentSendEntity;

@Component
public class DocumentSendConverter {

	// Convert from DTO to Entity
	public DocumentSendEntity toEntity(DocumentSendDTO dto) {
		DocumentSendEntity entity = new DocumentSendEntity();
		entity.setDocument_Send_ID(dto.getDocument_Send_ID());
		entity.setDocument_Send_Title(dto.getDocument_Send_Title());
		entity.setDocument_Send_Content(dto.getDocument_Send_Content());
		entity.setDocument_Send_Time(dto.getDocument_Send_Time());
		entity.setDocument_Send_Deadline(dto.getDocument_Send_Deadline());
		entity.setDocument_Send_State(dto.getDocument_Send_State());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DocumentSendDTO toDTO(DocumentSendEntity entity) {
		DocumentSendDTO dto = new DocumentSendDTO();
		dto.setDocument_Send_ID(entity.getDocument_Send_ID());
		dto.setDocument_Send_Title(entity.getDocument_Send_Title());
		dto.setDocument_Send_Content(entity.getDocument_Send_Content());
		dto.setDocument_Send_Time(entity.getDocument_Send_Time());
		dto.setDocument_Send_Deadline(entity.getDocument_Send_Deadline());
		dto.setDocument_Send_State(entity.getDocument_Send_State());
		if(entity.getDocument_Send_UserSend() != null) {
			dto.setDocument_Send_UserSend(entity.getDocument_Send_UserSend().getUser_FullName());
		}
		return dto;
	}
	
	// Save update DocumentSend by convert from DTO to Entity
	public DocumentSendEntity toEntity(DocumentSendDTO dto, DocumentSendEntity entity) {
		entity.setDocument_Send_ID(dto.getDocument_Send_ID());
		entity.setDocument_Send_Title(dto.getDocument_Send_Title());
		entity.setDocument_Send_Content(dto.getDocument_Send_Content());
		entity.setDocument_Send_Time(dto.getDocument_Send_Time());
		entity.setDocument_Send_Deadline(dto.getDocument_Send_Deadline());
		entity.setDocument_Send_State(dto.getDocument_Send_State());
		return entity;
	}
}
