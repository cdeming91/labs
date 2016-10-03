/*
 * Source Material (c) 2016 GCD
 * All rights reserved
 */
package LabA;

/**
 * Responsibility: Hold information about any ONE movie.
 */
public class Movie {
	private Integer id;
	private String title;
	private String category;
	private String description;
	private Integer year;
	private String rating;
	
	public Movie() {
	}

	// Constructor
	public Movie (String t, String c) {
		title = t;
		category = c;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// getter
	public String getTitle() {
		return title;
	}
	
	// getter
	public String getCategory() {
		return category;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	// setter
	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}
	
	

}
