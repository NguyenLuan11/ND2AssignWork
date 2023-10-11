package com.nd2.assignwork.api.output;

import java.util.ArrayList;
import java.util.List;

import com.nd2.assignwork.dto.DocumentIncommingDTO;

public class DocumentIncommingOutput {

	private List<DocumentIncommingDTO> listResult = new ArrayList<>();

	public List<DocumentIncommingDTO> getListResult() {
		return listResult;
	}

	public void setListResult(List<DocumentIncommingDTO> listResult) {
		this.listResult = listResult;
	}
}
