package com.ma.raymond.raymondprojects.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ma.raymond.raymondprojects.models.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {
	
	@Query("SELECT p FROM Project p ORDER BY p.name")
	List<Project> findAllProjects(Pageable pagable);
	
}
