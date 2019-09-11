package com.interviewpipeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewpipeline.model.User;
import com.interviewpipeline.service.PipelineService;

@RestController
public class PipelineController {
	
	@Autowired
	PipelineService pipelineService;
	
	@RequestMapping("/welcome")
	public String firstPage() {
		return "welcome to interview pipeline";
	}
	
	@RequestMapping("/getuser")
	public User getUser() {
		return this.pipelineService.getUser();
	}
}
