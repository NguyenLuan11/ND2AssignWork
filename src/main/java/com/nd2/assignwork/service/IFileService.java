package com.nd2.assignwork.service;

import java.util.List;

import com.nd2.assignwork.dto.FileDTO;

public interface IFileService {

	// Save File from DTO
	FileDTO save(FileDTO fileDTO);
	// Delete File
	void delete(String[] ids);
	// Get File no paging
	List<FileDTO> findAll();
}
