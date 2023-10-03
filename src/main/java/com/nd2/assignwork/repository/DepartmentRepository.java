package com.nd2.assignwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nd2.assignwork.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, String> {

	// Find single Department by Department_Name
	DepartmentEntity findOneByDepartment_Name(String Department_Name);
}
