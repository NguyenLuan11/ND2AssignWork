package com.nd2.assignwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nd2.assignwork.entity.DocumentIncommingEntity;

public interface DocumentIncommingRepository extends JpaRepository<DocumentIncommingEntity, String> {

	
}
