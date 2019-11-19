package com.example.ratingsdataservice.model;

public class Rating {

	private Integer rating;
	private String movieId;

	public Rating(Integer rating, String movieId) {
		super();
		this.rating = rating;
		this.movieId = movieId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

}
