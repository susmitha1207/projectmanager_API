/**
 * 
 */
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

import com.fse.pm.pojos.Task;
import com.fse.pm.service.TaskServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {
	
	@Autowired
	private TaskServiceImpl taskService;

	@PostMapping("/task/saveorupdate")
	public Integer createOrUpdate(@RequestBody Task task) {
		return taskService.saveOrUpadte(task);
	}
	
	@GetMapping("/task/getTask/{id}")
	public Task getTask(@PathVariable String id) {
		return taskService.getTask(Integer.parseInt(id));
		
		
	}
	
	@GetMapping("/task/getAllTasks")
	public List<Task> getAllTasks(){
		return taskService.view();
		
	}
	
	@DeleteMapping("/task/delete/{id}")
	public Integer deleteTask(@PathVariable String id) {
		return taskService.delete(Integer.parseInt(id));
	}
	
}
