package com.example.moviecatalogservice.model;

public class MovieInfo {

	private Integer id;
	private String movieName;
	
	public MovieInfo() {
		
	}

	public MovieInfo(Integer id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
