package com.fse.pm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fse.pm.pojos.Project;
import com.fse.pm.service.ProjectServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class ProjectController {
	
	@Autowired
	private ProjectServiceImpl projectService;
	
	@PostMapping("/project/saveorupdate")
	public void createOrUpdate(@RequestBody Project project) {
		projectService.saveOrUpadte(project);
	}
	
	@GetMapping("/project/getProject/{id}")
	public Project getProject(@PathVariable String id) {
		return projectService.getProject(Integer.parseInt(id));
		
		
	}
	
	@GetMapping("/project/view")
	public List<Project> getAllProjects(){
		return projectService.view();
		
	}
	
	@DeleteMapping("/project/delete/{id}")
	public Integer deleteProject(@PathVariable String id) {
		return projectService.delete(Integer.parseInt(id));
	}

}
