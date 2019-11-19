package com.example.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.moviecatalogservice.model.CatalogItem;
import com.example.moviecatalogservice.model.MovieInfo;
import com.example.moviecatalogservice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatalogItem("PK", userId, 3));
	}

	@GetMapping("/rest/{userId}")
	public List<CatalogItem> getCatalogUsingRestTemplate(@PathVariable("userId") String userId) {
		
		// get all the movies user have watched and rated
		List<Rating> ratings = Arrays.asList(
				new Rating(1, "1"),
				new Rating(2, "2")
				);
		
		// iterate throw the ratings to get the movie info
		return ratings.stream().map(rating -> {
			MovieInfo movie = restTemplate.getForObject("http://localhost:8081/movies/"+ rating.getMovieId(), MovieInfo.class);
			return new CatalogItem(movie.getMovieName(), movie.getId().toString(), rating.getRating());
		}
		).collect(Collectors.toList());
	}

}
