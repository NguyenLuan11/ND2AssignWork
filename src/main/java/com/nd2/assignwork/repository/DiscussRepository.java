package com.nd2.assignwork.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nd2.assignwork.entity.DiscussEntity;

public interface DiscussRepository extends JpaRepository<DiscussEntity, Date> {

	
}
