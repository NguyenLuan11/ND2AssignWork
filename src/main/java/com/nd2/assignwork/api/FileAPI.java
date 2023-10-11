package com.nd2.assignwork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nd2.assignwork.api.output.FileOutput;
import com.nd2.assignwork.dto.FileDTO;
import com.nd2.assignwork.service.imp.FileService;

@CrossOrigin
@RestController
public class FileAPI {

	@Autowired
	private FileService fileService;
	
	@GetMapping(value = "/api/file")
	public FileOutput showFile() {
		FileOutput result = new FileOutput();
		result.setListResult(fileService.findAll());
		return result;
	}
	
	@PostMapping(value = "/api/file")
	public FileDTO createFile(@RequestBody FileDTO model) {
		return fileService.save(model);
	}
	
	@PutMapping(value = "/api/file/{fileId}")
	public FileDTO updateFile(@RequestBody FileDTO model, @PathVariable("fileId") String fileId) {
		model.setFileID(fileId);
		return fileService.save(model);
	}
	
	@DeleteMapping(value = "/api/file")
	public void deleteFile(@RequestBody String[] fileIds) {
		fileService.delete(fileIds);
	}
}
