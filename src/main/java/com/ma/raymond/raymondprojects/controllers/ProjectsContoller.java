package com.ma.raymond.raymondprojects.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ma.raymond.raymondprojects.models.Project;

@RestController(value="/projects")
public class ProjectsContoller {
	@GetMapping(value = "/{projectId}")
	public Project getProject(@PathVariable(value="projectId")Optional<String> projectId) {
		String[] projects = new String[] { "a", "b", "c" };
		return new Project("Raymond Project :"+projectId.get(),new Date(),null, "This project display most of the projects I have done", "https://www.coderanch.com/mooseImages/betaview/moosefly.gif");
	}
	@GetMapping(value = "/projects")
	public Map<String, String> getProjects() {
		 HashMap<String, String> map = new HashMap<>();
		    map.put("key", "value");
		    map.put("foo", "bar");
		    map.put("aa", "bb");
		    return map;
	}

}
