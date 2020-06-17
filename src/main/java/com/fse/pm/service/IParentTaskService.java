package com.fse.pm.service;

import java.util.List;

import com.fse.pm.pojos.ParentTask;

public interface IParentTaskService {

	public Integer saveOrUpadte(ParentTask parentTask);
	public ParentTask getParentTask(Integer id);
	public List<ParentTask> view();
	public Integer delete(Integer id);
}
