package com.nd2.assignwork.service.imp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd2.assignwork.converter.DiscussConverter;
import com.nd2.assignwork.dto.DiscussDTO;
import com.nd2.assignwork.entity.DiscussEntity;
import com.nd2.assignwork.entity.TaskEntity;
import com.nd2.assignwork.entity.UserAccountEntity;
import com.nd2.assignwork.repository.DiscussRepository;
import com.nd2.assignwork.repository.TaskRepository;
import com.nd2.assignwork.repository.UserAccountRepository;
import com.nd2.assignwork.service.IDiscussService;

@Service
public class DiscussService implements IDiscussService {
	
	@Autowired
	private DiscussConverter discussConverter;
	
	@Autowired
	private DiscussRepository discussRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;

	@Override
	public DiscussDTO save(DiscussDTO discussDTO) {
		DiscussEntity discussEntity = new DiscussEntity();

		DiscussEntity oldDiscussEntity = discussRepository.findOneByDiscussTime(discussDTO.getDiscuss_Time());
		if(discussDTO.getDiscuss_Time() != null) {
			discussEntity = discussConverter.toEntity(discussDTO, oldDiscussEntity);
		} else {
			discussEntity = discussConverter.toEntity(discussDTO);
		}
		
		TaskEntity taskEntity = taskRepository.findOneByTaskTitle(discussDTO.getDiscuss_Task());
		discussEntity.setDiscussTask(taskEntity);
		
		UserAccountEntity userAccountEntity = userAccountRepository.findOneByUserUserName(discussDTO.getDiscuss_User());
		discussEntity.setDiscussUser(userAccountEntity);
		
		discussEntity = discussRepository.save(discussEntity);
		return discussConverter.toDTO(discussEntity);
	}

	@Override
	public void delete(Date[] ids) {
		for(Date id: ids) {
			discussRepository.deleteByDiscussTime(id);
		}
	}

	@Override
	public List<DiscussDTO> findAll() {
		List<DiscussDTO> result = new ArrayList<>();
		List<DiscussEntity> entities = discussRepository.findAll();
		
		for(DiscussEntity entity: entities) {
			DiscussDTO dto = discussConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}

}
