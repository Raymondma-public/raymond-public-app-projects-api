package com.ma.raymond.raymondprojects.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date startDate;

	private String description;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project", orphanRemoval = true)
	private List<Image> images;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project", orphanRemoval = true)
	private List<GoogleDoc> googleDocs;
	
	public Project() {
		super();
	}



	public Project(Long id, String name, Date startDate, String description, List<Image> images,
			List<GoogleDoc> googleDocs) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.description = description;
		this.images = images;
		this.googleDocs = googleDocs;
	}



	public String getProjectName() {
		return name;
	}

	public void setProjectName(String projectName) {
		this.name = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<GoogleDoc> getGoogleDocs() {
		return googleDocs;
	}



	public void setGoogleDocs(List<GoogleDoc> googleDocs) {
		this.googleDocs = googleDocs;
	}

	
}
