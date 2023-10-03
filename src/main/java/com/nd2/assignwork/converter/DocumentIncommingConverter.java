package com.nd2.assignwork.converter;

import org.springframework.stereotype.Component;

import com.nd2.assignwork.dto.DocumentIncommingDTO;
import com.nd2.assignwork.entity.DocumentIncommingEntity;

@Component
public class DocumentIncommingConverter {

	// Convert from DTO to Entity
	public DocumentIncommingEntity toEntity(DocumentIncommingDTO dto) {
		DocumentIncommingEntity entity = new DocumentIncommingEntity();
		entity.setDocument_Incomming_ID(dto.getDocument_Incomming_ID());
		entity.setDocument_Incomming_Title(dto.getDocument_Incomming_Title());
		entity.setDocument_Incomming_Content(dto.getDocument_Incomming_Content());
		entity.setDocument_Incomming_Time(dto.getDocument_Incomming_Time());
		entity.setDocument_Incomming_State(dto.getDocument_Incomming_State());
		return entity;
	}
	
	// Convert from Entity to DTO
	public DocumentIncommingDTO toDTO(DocumentIncommingEntity entity) {
		DocumentIncommingDTO dto = new DocumentIncommingDTO();
		dto.setDocument_Incomming_ID(entity.getDocument_Incomming_ID());
		dto.setDocument_Incomming_Title(entity.getDocument_Incomming_Title());
		dto.setDocument_Incomming_Content(entity.getDocument_Incomming_Content());
		dto.setDocument_Incomming_Time(entity.getDocument_Incomming_Time());
		dto.setDocument_Incomming_State(entity.getDocument_Incomming_State());
		if(entity.getDocument_Incomming_UserSend() != null) {
			dto.setDocument_Incomming_UserSend(entity.getDocument_Incomming_UserSend().getUser_FullName());
		}
		if(entity.getDocument_Incomming_UserReceive() != null) {
			dto.setDocument_Incomming_UserReceive(entity.getDocument_Incomming_UserReceive().getUser_FullName());
		}
		return dto;
	}
	
	// Save update DocumentIncomming by convert from DTO to Entity
	public DocumentIncommingEntity toEntity(DocumentIncommingDTO dto, DocumentIncommingEntity entity) {
		entity.setDocument_Incomming_ID(dto.getDocument_Incomming_ID());
		entity.setDocument_Incomming_Title(dto.getDocument_Incomming_Title());
		entity.setDocument_Incomming_Content(dto.getDocument_Incomming_Content());
		entity.setDocument_Incomming_State(dto.getDocument_Incomming_State());
		return entity;
	}
}
