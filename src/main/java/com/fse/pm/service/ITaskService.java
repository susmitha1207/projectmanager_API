package com.fse.pm.service;

import java.util.List;

import com.fse.pm.pojos.Task;

public interface ITaskService {

	public Integer saveOrUpadte(Task task);
	public Task getTask(Integer id);
	public List<Task> view();
	public Integer delete(Integer id);
}
