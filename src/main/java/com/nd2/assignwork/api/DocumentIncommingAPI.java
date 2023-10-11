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

import com.nd2.assignwork.api.output.DocumentIncommingOutput;
import com.nd2.assignwork.dto.DocumentIncommingDTO;
import com.nd2.assignwork.service.imp.DocumentIncommingService;

@CrossOrigin
@RestController
public class DocumentIncommingAPI {

	@Autowired
	private DocumentIncommingService documentIncommingService;
	
	@GetMapping(value = "/api/documentincomming")
	public DocumentIncommingOutput showDocumentIncomming() {
		DocumentIncommingOutput result = new DocumentIncommingOutput();
		result.setListResult(documentIncommingService.findAll());
		return result;
	}
	
	@PostMapping(value = "/api/documentincomming")
	public DocumentIncommingDTO saveDocumentIncomming(@RequestBody DocumentIncommingDTO model) {
		return documentIncommingService.save(model);
	}
	
	@PutMapping(value = "/api/documentincomming/{documentIncommingId}")
	public DocumentIncommingDTO updateDocumentIncomming(@RequestBody DocumentIncommingDTO model, 
			@PathVariable("documentIncommingId") String documentIncommingId) {
		model.setDocumentIncommingID(documentIncommingId);
		return documentIncommingService.save(model);
	}
	
	@DeleteMapping(value = "/api/documentincomming")
	public void deleteDocumentIncomming(@RequestBody String[] documentIncommingIds) {
		documentIncommingService.delete(documentIncommingIds);
	}
}
