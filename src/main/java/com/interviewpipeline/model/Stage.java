package com.interviewpipeline.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stage {

	@Id 
	int stageId;
	
	Long userId;
	
	String stageName;
	
//	List<Stage> interviewList = new ArrayList<>();
}
