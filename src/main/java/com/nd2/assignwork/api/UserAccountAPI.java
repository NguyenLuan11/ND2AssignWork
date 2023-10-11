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

import com.nd2.assignwork.api.output.UserAccountOutput;
import com.nd2.assignwork.dto.UserAccountDTO;
import com.nd2.assignwork.service.imp.UserAccountService;

@CrossOrigin
@RestController
public class UserAccountAPI {

	@Autowired
	private UserAccountService userAccountService;
	
	@GetMapping(value = "/api/useraccount")
	public UserAccountOutput showUserAccount() {
		UserAccountOutput result = new UserAccountOutput();
		result.setListResult(userAccountService.findAll());
		return result;
	}
	
	@PostMapping(value = "/api/useraccount")
	public UserAccountDTO createUserAccount(@RequestBody UserAccountDTO model) {
		return userAccountService.save(model);
	}
	
	@PutMapping(value = "/api/useraccount/{userId}")
	public UserAccountDTO updateUserAccount(@RequestBody UserAccountDTO model, @PathVariable("userId") String userId) {
		model.setUserID(userId);
		return userAccountService.save(model);
	}
	
	@DeleteMapping(value = "/api/useraccount")
	public void deleteUserAccount(@RequestBody String[] userIds) {
		userAccountService.delete(userIds);
	}
}
