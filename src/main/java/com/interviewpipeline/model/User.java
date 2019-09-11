package com.interviewpipeline.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id 
	int userId;
	
	String UserName;
	
//	List<Stage> stageList = new ArrayList<>();
}
