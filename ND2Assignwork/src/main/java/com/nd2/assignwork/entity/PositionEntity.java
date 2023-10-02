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
@Table(name = "Position")
public class PositionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Position_ID")
	private int Position_ID;
	
	@Column(name = "Position_Name", columnDefinition = "nvarchar(255)")
	@NotBlank
	private String Position_Name;
	
	// Foreign key User_Position
	@OneToMany(mappedBy = "User_Position")
	private List<UserAccountEntity> User = new ArrayList<>();

	public int getPosition_ID() {
		return Position_ID;
	}

	public void setPosition_ID(int position_ID) {
		Position_ID = position_ID;
	}

	public String getPosition_Name() {
		return Position_Name;
	}

	public void setPosition_Name(String position_Name) {
		Position_Name = position_Name;
	}
}
