package com.fse.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.pm.dao.TaskDaoImpl;
import com.fse.pm.pojos.Task;

@Service("taskService")
public class TaskServiceImpl implements ITaskService {

	@Autowired
	TaskDaoImpl taskDao;
	
	@Override
	public Integer saveOrUpadte(Task task) {
		return taskDao.saveOrUpadte(task);
	}

	@Override
	public Task getTask(Integer id) {
		return taskDao.getTask(id);
		}

	@Override
	public List<Task> view() {
		return taskDao.view();
		}

	@Override
	public Integer delete(Integer id) {
		return taskDao.delete(id);
		}

}
