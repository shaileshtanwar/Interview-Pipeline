package com.interviewpipeline.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Interview {
	@Id
	int interviewId;

	Long stageId;

	String interviewName;
}
