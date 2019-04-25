package com.ma.raymond.raymondprojects.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ma.raymond.raymondprojects.models.Project;
import com.ma.raymond.raymondprojects.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public List<Project> getProjects(int page, int pageSize){
		Sort sort = new Sort(Sort.Direction.DESC,"name");
        Pageable pageable = PageRequest.of(page, pageSize);
		return projectRepository.findAllProjects(pageable);
        
	}
}
