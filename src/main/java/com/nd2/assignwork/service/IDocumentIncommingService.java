package com.nd2.assignwork.service;

import java.util.List;

import com.nd2.assignwork.dto.DocumentIncommingDTO;

public interface IDocumentIncommingService {

	// Save DocumentIncomming from DTO
	DocumentIncommingDTO save(DocumentIncommingDTO documentIncommingDTO);
	// Delete DocumentIncomming
	void delete(String[] ids);
	// Get DocumentIncomming no paging
	List<DocumentIncommingDTO> findAll();
}
