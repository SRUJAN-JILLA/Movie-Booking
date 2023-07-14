package com.movieBooking.admin.controller;

import org.springframework.http.MediaType;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.movieBooking.admin.model.MovieDetails;
import com.movieBooking.admin.model.TicketDetails;
import com.movieBooking.admin.service.MovieBookingService;

@CrossOrigin(origins = "*")
@RestController
public class MovieBookingController {
	@Autowired
	private MovieBookingService movieBookingService;
	
	@RequestMapping(value = "/api/v1/moviebooking/subscribe",  consumes = MediaType.ALL_VALUE)
	public SseEmitter subscribe() {
		return this.movieBookingService.subscribe();
	}
	
	@GetMapping("/api/v1/sendemiiter")
	public String sendEmitter() {
		this.movieBookingService.sendMessage();
		return "sent";
	}
	
	/* Should return all movie details with given movieNames */
	@GetMapping("/api/v1/moviebooking/movies/search/{moviename}")
	public List<MovieDetails> getAllMovieDetailsWithMovieName(@PathVariable("moviename") String moviename) {
		return this.movieBookingService.getAllMovieDetailsWithMovieName(moviename);
	}
	
	/* Should update ticket status based on id */
	@GetMapping("/api/v1/moviebooking/update/status/{movieId}/{ticketStatus}")
	public String setTicketStatus(@PathVariable("movieId") long movieId,
			@PathVariable("ticketStatus") boolean ticketStatus) {
		return this.movieBookingService.setTicketStatus(movieId, ticketStatus);
	}

	/* Should delete movie based on id */
	@DeleteMapping("/api/v1/moviebooking/delete/movie/{id}")
	public boolean deleteEmployee(@PathVariable("id") long id) {
		return this.movieBookingService.deleteMovie(id);
	}

	/* Should return all ticket details */
	@GetMapping("/api/v1/ticketdetails/all")
	public List<TicketDetails> getAllTicketDetails() {
		return this.movieBookingService.getAllTicketDetails();
	}

	/* Should add movie details */
	@PostMapping("/api/v1/moviebooking/movie/add")
	public String addMovie(@RequestBody MovieDetails movieDetails) throws ParseException {
		return movieBookingService.addMovieDetails(movieDetails);
	}
}
