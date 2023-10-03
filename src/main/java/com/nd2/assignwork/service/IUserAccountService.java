package com.nd2.assignwork.service;

import java.util.List;

import com.nd2.assignwork.dto.UserAccountDTO;

public interface IUserAccountService {

	// Save UserAccount from DTO
	UserAccountDTO save(UserAccountDTO userAccountDTO);
	// Delete UserAccount
	void delete(String[] ids);
	// Get UserAccount no paging
	List<UserAccountDTO> findAll();
}
