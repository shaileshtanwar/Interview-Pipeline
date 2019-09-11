package com.interviewpipeline.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Interview {
	@Id
	int interviewId;

	@ManyToOne
	Stage stage;

	String interviewName;
}
