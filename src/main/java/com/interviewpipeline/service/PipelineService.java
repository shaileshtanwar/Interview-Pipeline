package com.interviewpipeline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewpipeline.model.User;
import com.interviewpipeline.repository.PipelineRepository;

@Service
public class PipelineService implements PipelinServiceInterface{
	@Autowired
	PipelineRepository pipelineRepository;
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return this.pipelineRepository.findById(new Integer(1)).get();
//		return new User();
	}

	@Override
	public User setUser() {
		// TODO Auto-generated method stub
		return new User();
	}
	
}
