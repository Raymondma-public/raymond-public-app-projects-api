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

	public Project() {
		super();
	}

	public Project(String projectName, Date startDate, String description, List<Image> images) {
		super();
		this.name = projectName;
		this.startDate = startDate;
		this.description = description;
		this.images = images;
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

}
