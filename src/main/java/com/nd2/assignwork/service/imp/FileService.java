package com.nd2.assignwork.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd2.assignwork.converter.FileConverter;
import com.nd2.assignwork.dto.FileDTO;
import com.nd2.assignwork.entity.FileEntity;
import com.nd2.assignwork.repository.FileRepository;
import com.nd2.assignwork.service.IFileService;

@Service
public class FileService implements IFileService {
	
	@Autowired
	private FileConverter fileConverter;
	
	@Autowired
	private FileRepository fileRepository;

	@Override
	public FileDTO save(FileDTO fileDTO) {
		FileEntity fileEntity = new FileEntity();

		FileEntity oldFileEntity = fileRepository.findOne(fileDTO.getFile_ID());
		if(oldFileEntity != null) {
			fileEntity = fileConverter.toEntity(fileDTO, oldFileEntity);
		} else {
			fileEntity = fileConverter.toEntity(fileDTO);
		}
		
		fileEntity = fileRepository.save(fileEntity);
		return fileConverter.toDTO(fileEntity);
	}

	@Override
	public void delete(String[] ids) {
		for(String id: ids) {
			fileRepository.delete(id);
		}
	}

	@Override
	public List<FileDTO> findAll() {
		List<FileDTO> result = new ArrayList<>();
		List<FileEntity> entities = fileRepository.findAll();
		
		for(FileEntity entity: entities) {
			FileDTO dto = fileConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}

}
