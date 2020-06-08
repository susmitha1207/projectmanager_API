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
import com.fse.pm.pojos.User;
import com.fse.pm.service.ProjectServiceImpl;
import com.fse.pm.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/user/saveorupdate")
	public Integer createOrUpdate(@RequestBody User user) {
		return userService.saveOrUpadte(user);
	}
	
	@GetMapping("/user/getUser/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(Integer.parseInt(id));
		
		
	}
	
	@GetMapping("/user/getAllUsers")
	public List<User> getAllUsers(){
		return userService.view();
		
	}
	
	@DeleteMapping("/user/delete/{id}")
	public Integer deleteUser(@PathVariable String id) {
		return userService.delete(Integer.parseInt(id));
	}
	

}
