package com.nd2.assignwork.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nd2.assignwork.converter.TaskConverter;
import com.nd2.assignwork.dto.TaskDTO;
import com.nd2.assignwork.entity.TaskCategoryEntity;
import com.nd2.assignwork.entity.TaskEntity;
import com.nd2.assignwork.entity.UserAccountEntity;
import com.nd2.assignwork.repository.TaskCategoryRepository;
import com.nd2.assignwork.repository.TaskRepository;
import com.nd2.assignwork.repository.UserAccountRepository;
import com.nd2.assignwork.service.ITaskService;

@Service
public class TaskService implements ITaskService {
	
	@Autowired
	private TaskConverter taskConverter;

	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private TaskCategoryRepository taskCategoryRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Override
	public TaskDTO save(TaskDTO taskDTO) {
		TaskEntity taskEntity = new TaskEntity();
		
		TaskEntity oldTaskEntity = taskRepository.findOne(taskDTO.getTask_ID());
		if(oldTaskEntity != null) {
			taskEntity = taskConverter.toEntity(taskDTO, oldTaskEntity);
		} else {
			taskEntity = taskConverter.toEntity(taskDTO);
		}
		
		TaskCategoryEntity taskCategoryEntity = taskCategoryRepository.findOneByCategory_Name(taskDTO.getTask_Category());
		taskEntity.setTask_Category(taskCategoryEntity);
		
		UserAccountEntity userAccountSend = userAccountRepository.findOneByUser_UserName(taskDTO.getTask_Personal_Send());
		taskEntity.setTask_Personal_Send(userAccountSend);
		
		UserAccountEntity userAccountReceive = userAccountRepository.findOneByUser_UserName(taskDTO.getTask_Personal_Receive());
		taskEntity.setTask_Personal_Receive(userAccountReceive);
		
		taskEntity = taskRepository.save(taskEntity);
		return taskConverter.toDTO(taskEntity);
	}

	@Override
	public void delete(String[] ids) {
		for(String id: ids) {
			taskRepository.delete(id);
		}
	}

	@Override
	public List<TaskDTO> findAll() {
		List<TaskDTO> result = new ArrayList<>();
		List<TaskEntity> entities = taskRepository.findAll();
		
		for(TaskEntity entity: entities) {
			TaskDTO dto = taskConverter.toDTO(entity);
			result.add(dto);
		}
		return result;
	}

}
