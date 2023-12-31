package com.nd2.assignwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nd2.assignwork.entity.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, String> {

	// Find single UserAccount by User_UserName
	UserAccountEntity findOneByUserUserName(String userUserName);
}
