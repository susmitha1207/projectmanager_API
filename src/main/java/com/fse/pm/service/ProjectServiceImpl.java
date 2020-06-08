package com.fse.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.pm.dao.ProjectDaoImpl;
import com.fse.pm.pojos.Project;

@Service("projectService")
public class ProjectServiceImpl implements IProjectService {
	
	@Autowired
	private ProjectDaoImpl projectDao;

	@Override
	public Integer saveOrUpadte(Project project) {
		Integer saveOrUpadte = projectDao.saveOrUpadte(project);
		return saveOrUpadte;
	}
	
	@Override
	public Project getProject(Integer id) {
		return projectDao.getProject(id);
	}

	@Override
	public List<Project> view() {
		return projectDao.view();
	}

	@Override
	public Integer delete(Integer id) {
		return projectDao.delete(id);
	}
	
}
