package com.movieBooking.admin.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movieBooking.admin.model.MovieDetails;

public interface MovieDetailsRepository extends MongoRepository<MovieDetails, Long> {
	public List<MovieDetails> findByMovieName(String movieName);
}
