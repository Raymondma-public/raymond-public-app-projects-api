package com.ma.raymond.raymondprojects.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Image") 
public class Image {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String url;
	private String description;
	
	 @ManyToOne(fetch=FetchType.LAZY)
	private Project project;
	
	 
	 
	public Image() {
		super();
	}
	public Image(Long id, String name, String url, String description) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
