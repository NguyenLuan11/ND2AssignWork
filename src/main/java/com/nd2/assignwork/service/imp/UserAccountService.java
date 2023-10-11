package com.nd2.assignwork.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd2.assignwork.converter.UserAccountConverter;
import com.nd2.assignwork.dto.UserAccountDTO;
import com.nd2.assignwork.entity.DepartmentEntity;
import com.nd2.assignwork.entity.PositionEntity;
import com.nd2.assignwork.entity.UserAccountEntity;
import com.nd2.assignwork.repository.DepartmentRepository;
import com.nd2.assignwork.repository.PositionRepository;
import com.nd2.assignwork.repository.UserAccountRepository;
import com.nd2.assignwork.service.IUserAccountService;

@Service
public class UserAccountService implements IUserAccountService {
	
	@Autowired
	private UserAccountConverter userAccountConverter;
	
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Autowired
	private PositionRepository positionRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public UserAccountDTO save(UserAccountDTO userAccountDTO) {
		UserAccountEntity userAccountEntity = new UserAccountEntity();
		
		UserAccountEntity oldUserAccountEntity = userAccountRepository.findOne(userAccountDTO.getUserID());
		if(oldUserAccountEntity != null) {
			userAccountEntity = userAccountConverter.toEntity(userAccountDTO, oldUserAccountEntity);
		} else {
			userAccountEntity = userAccountConverter.toEntity(userAccountDTO);
		}
		
		PositionEntity positionEntity = positionRepository.findOneByPositionName(userAccountDTO.getUserPosition());
		userAccountEntity.setUserPosition(positionEntity);
		
		DepartmentEntity departmentEntity = departmentRepository.findOneByDepartmentName(userAccountDTO.getUserDepartment());
		userAccountEntity.setUserDepartment(departmentEntity);
		
		userAccountEntity = userAccountRepository.save(userAccountEntity);
		return userAccountConverter.toDTO(userAccountEntity);
	}

	@Override
	public void delete(String[] ids) {
		for(String id: ids) {
			userAccountRepository.delete(id);
		}
	}

	@Override
	public List<UserAccountDTO> findAll() {
		List<UserAccountDTO> result = new ArrayList<>();
		List<UserAccountEntity> entities = userAccountRepository.findAll();
		
		for(UserAccountEntity entity: entities) {
			UserAccountDTO dto = userAccountConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}
}
