package com.ma.raymond.raymondprojects.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ma.raymond.raymondprojects.models.Project;
import com.ma.raymond.raymondprojects.services.ProjectService;

@RestController(value = "/projects")
public class ProjectsContoller {
	@Autowired
	ProjectService projectService;

	@GetMapping(value = "/{projectId}")
	public Project getProject(@PathVariable(value = "projectId") Optional<String> projectId) {
		String[] projects = new String[] { "a", "b", "c" };
		return new Project("Raymond Project :" + projectId.get(), new Date(),
				"This project display most of the projects I have done", null);
	}

	@GetMapping(value = "/projects")
	public List<Project> getProjects(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize) {
		return projectService.getProjects(page, pageSize);
	}

}
