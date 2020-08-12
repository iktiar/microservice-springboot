package iktiar.com.movieinfoservice.resource;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iktiar.com.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	
	//getMovie info by movie ID
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test movie");
	}
	
}
