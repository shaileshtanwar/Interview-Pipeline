package com.interviewpipeline.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Stage {

	@Id 
	int stageId;
	
	@ManyToOne
	User user;
	
	String stageName;
	
	@OneToMany
	List<Interview> interviewList = new ArrayList<>();
}
