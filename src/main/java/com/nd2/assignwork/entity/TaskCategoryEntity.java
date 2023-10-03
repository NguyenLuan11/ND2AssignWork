package com.nd2.assignwork.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Task_Category")
public class TaskCategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Task_Category_ID")
	private Integer Task_Category_ID;
	
	@Column(name = "Category_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String categoryName;
	
	// Foreign key Task_Category_Task
	@OneToMany(mappedBy = "Task_Category")
	private List<TaskEntity> Task = new ArrayList<>();

	public List<TaskEntity> getTask() {
		return Task;
	}

	public void setTask(List<TaskEntity> task) {
		Task = task;
	}

	public Integer getTask_Category_ID() {
		return Task_Category_ID;
	}

	public void setTask_Category_ID(Integer task_Category_ID) {
		Task_Category_ID = task_Category_ID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
