package com.movieBooking.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Movies")
public class MovieDetails {
	@Transient
	public static final String SEQUENCE_NAME = "movie_sequence";

	@Id
	private long id;
	private String movieName;
	private String theaterName;
	private int totalNumberOfTicketsInTheater;
	private int totalNumberOfTicketsBooked;
	private boolean status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public int getTotalNumberOfTicketsInTheater() {
		return totalNumberOfTicketsInTheater;
	}

	public void setTotalNumberOfTicketsInTheater(int totalNumberOfTicketsInTheater) {
		this.totalNumberOfTicketsInTheater = totalNumberOfTicketsInTheater;
	}

	public int getTotalNumberOfTicketsBooked() {
		return totalNumberOfTicketsBooked;
	}

	public void setTotalNumberOfTicketsBooked(int totalNumberOfTicketsBooked) {
		this.totalNumberOfTicketsBooked = totalNumberOfTicketsBooked;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	public MovieDetails(long id, String movieName, String theaterName, int totalNumberOfTicketsInTheater,
			int totalNumberOfTicketsBooked, boolean status) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.totalNumberOfTicketsInTheater = totalNumberOfTicketsInTheater;
		this.totalNumberOfTicketsBooked = totalNumberOfTicketsBooked;
		this.status = status;
	}

	public MovieDetails() {
		super();
	}

	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", movieName=" + movieName + ", theaterName=" + theaterName
				+ ", totalNumberOfTicketsInTheater=" + totalNumberOfTicketsInTheater + ", totalNumberOfTicketsBooked="
				+ totalNumberOfTicketsBooked + ", status=" + status + "]";
	}

}
