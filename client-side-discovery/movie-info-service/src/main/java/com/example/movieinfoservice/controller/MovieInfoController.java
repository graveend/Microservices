package com.example.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieinfoservice.model.MovieInfo;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@GetMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId) {
		return new MovieInfo( Integer.valueOf(movieId), "Test Movie");
	}

}
