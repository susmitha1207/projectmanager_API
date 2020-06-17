package com.fse.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.pm.dao.ParentTaskDaoImpl;
import com.fse.pm.pojos.ParentTask;

@Service("parentTaskService")
public class ParentTaskServiceImpl implements IParentTaskService {
	
	@Autowired
	ParentTaskDaoImpl parentTaskDao;

	@Override
	public Integer saveOrUpadte(ParentTask parentTask) {
		return parentTaskDao.saveOrUpadte(parentTask);
		}

	@Override
	public ParentTask getParentTask(Integer id) {
		return parentTaskDao.getParentTask(id);
		}

	@Override
	public List<ParentTask> view() {
		return parentTaskDao.view();
		}

	@Override
	public Integer delete(Integer id) {
		return parentTaskDao.delete(id);
		}

}
