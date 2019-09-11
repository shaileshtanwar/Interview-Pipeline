package com.interviewpipeline.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id 
	int userId;
	
	String UserName;
	
	@OneToMany
	List<Stage> stageList = new ArrayList<>();
}
