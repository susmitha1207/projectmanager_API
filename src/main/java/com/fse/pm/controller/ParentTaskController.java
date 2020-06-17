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

import com.fse.pm.pojos.ParentTask;
import com.fse.pm.service.ParentTaskServiceImpl;
import com.fse.pm.service.TaskServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class ParentTaskController {
	
	@Autowired
	private  ParentTaskServiceImpl parentTaskService;

	@PostMapping("/parentTask/saveorupdate")
	public Integer createOrUpdate(@RequestBody ParentTask parentTask) {
		return parentTaskService.saveOrUpadte(parentTask);
	}
	
	@GetMapping("/parentTask/getParentTask/{id}")
	public ParentTask getTask(@PathVariable String id) {
		return parentTaskService.getParentTask(Integer.parseInt(id));
		
		
	}
	
	@GetMapping("/parentTask/getAllParentTask")
	public List<ParentTask> getAllParentTask(){
		return parentTaskService.view();
		
	}
	
	@DeleteMapping("/parentTask/delete/{id}")
	public Integer deleteTask(@PathVariable String id) {
		return parentTaskService.delete(Integer.parseInt(id));
	}
	
}
