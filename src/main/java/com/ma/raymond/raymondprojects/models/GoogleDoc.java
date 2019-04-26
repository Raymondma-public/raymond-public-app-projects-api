package com.ma.raymond.raymondprojects.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "google_doc")
public class GoogleDoc {
	@Id
	@GeneratedValue
	private Long id;
	private String content;
	@ManyToOne(fetch = FetchType.LAZY)
	private Project project;
	
	
	public GoogleDoc() {
		super();
	}


	public GoogleDoc(Long id, String content, Project project) {
		super();
		this.id = id;
		this.content = content;
		this.project = project;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
	
}
