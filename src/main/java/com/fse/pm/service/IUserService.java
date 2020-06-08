package com.fse.pm.service;

import java.util.List;

import com.fse.pm.pojos.User;

public interface IUserService {
	
	public Integer saveOrUpadte(User user);
	public User getUser(Integer id);
	public List<User> view();
	public Integer delete(Integer id);
}
