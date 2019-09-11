package com.interviewpipeline.repository;

import org.springframework.data.repository.CrudRepository;

import com.interviewpipeline.model.User;

public interface PipelineRepository extends CrudRepository<User, Integer>{

}
