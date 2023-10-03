package com.nd2.assignwork.service.imp;

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

		DiscussEntity oldDiscussEntity = discussRepository.findOne(discussDTO.getDiscuss_Time());
		if(discussDTO.getDiscuss_Time() != null) {
			discussEntity = discussConverter.toEntity(discussDTO, oldDiscussEntity);
		} else {
			discussEntity = discussConverter.toEntity(discussDTO);
		}
		
		TaskEntity taskEntity = taskRepository.findOneByTask_Tile(discussDTO.getDiscuss_Task());
		discussEntity.setDiscuss_Task(taskEntity);
		
		UserAccountEntity userAccountEntity = userAccountRepository.findOneByUser_UserName(discussDTO.getDiscuss_User());
		discussEntity.setDiscuss_User(userAccountEntity);
		
		discussEntity = discussRepository.save(discussEntity);
		return discussConverter.toDTO(discussEntity);
	}

	@Override
	public void delete(Date[] ids) {
		for(Date id: ids) {
			discussRepository.delete(id);
		}
	}

	@Override
	public List<DiscussDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
