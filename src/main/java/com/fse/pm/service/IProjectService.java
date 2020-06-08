package com.fse.pm.service;

import java.util.List;

import com.fse.pm.pojos.Project;

public interface IProjectService {

	public Integer saveOrUpadte(Project project);
	public Project getProject(Integer id);
	public List<Project> view();
	public Integer delete(Integer id);
}
