package com.fse.pm.dao;

import java.util.List;

import com.fse.pm.pojos.ParentTask;


public interface IParentTaskDao {
	public Integer saveOrUpadte(ParentTask parentTask);
	public ParentTask getParentTask(Integer id);
	public List<ParentTask> view();
	public Integer delete(Integer id);
}
