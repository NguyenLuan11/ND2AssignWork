package com.nd2.assignwork.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd2.assignwork.converter.DocumentIncommingConverter;
import com.nd2.assignwork.dto.DocumentIncommingDTO;
import com.nd2.assignwork.entity.DocumentIncommingEntity;
import com.nd2.assignwork.entity.UserAccountEntity;
import com.nd2.assignwork.repository.DocumentIncommingRepository;
import com.nd2.assignwork.repository.UserAccountRepository;
import com.nd2.assignwork.service.IDocumentIncommingService;

@Service
public class DocumentIncommingService implements IDocumentIncommingService {
	
	@Autowired
	private DocumentIncommingConverter documentIncommingConverter;
	
	@Autowired
	private DocumentIncommingRepository documentIncommingRepository;

	@Autowired
	private UserAccountRepository userAccountRepository;

	@Override
	public DocumentIncommingDTO save(DocumentIncommingDTO documentIncommingDTO) {
		DocumentIncommingEntity documentIncommingEntity = new DocumentIncommingEntity();
		
		DocumentIncommingEntity oldDocumentIncommingEntity = documentIncommingRepository.findOne(documentIncommingDTO.getDocumentIncommingID());
		if(oldDocumentIncommingEntity != null) {
			documentIncommingEntity = documentIncommingConverter.toEntity(documentIncommingDTO, oldDocumentIncommingEntity);
		} else {
			documentIncommingEntity = documentIncommingConverter.toEntity(documentIncommingDTO);
		}
		
		UserAccountEntity userSend = userAccountRepository.findOneByUserUserName(documentIncommingDTO.getDocumentIncommingUserSend());
		documentIncommingEntity.setDocumentIncommingUserSend(userSend);
		
		UserAccountEntity userReceive = userAccountRepository.findOneByUserUserName(documentIncommingDTO.getDocumentIncommingUserReceive());
		documentIncommingEntity.setDocumentIncommingUserReceive(userReceive);
		
		documentIncommingEntity = documentIncommingRepository.save(documentIncommingEntity);
		return documentIncommingConverter.toDTO(documentIncommingEntity);
	}

	@Override
	public void delete(String[] ids) {
		for(String id: ids) {
			documentIncommingRepository.delete(id);
		}
	}

	@Override
	public List<DocumentIncommingDTO> findAll() {
		List<DocumentIncommingDTO> result = new ArrayList<>();
		List<DocumentIncommingEntity> entities = documentIncommingRepository.findAll();
		
		for(DocumentIncommingEntity entity: entities) {
			DocumentIncommingDTO dto = documentIncommingConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}

}
