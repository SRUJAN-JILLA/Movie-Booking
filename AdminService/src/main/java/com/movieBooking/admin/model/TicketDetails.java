package com.movieBooking.admin.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tickets")
public class TicketDetails {
	@Transient
	public static final String SEQUENCE_NAME = "ticket_sequence";

	@Id
	private long id;
	private long movieId;
	private long userId;
	private int numberOfTicketsBookedByUser;
	private List<Integer> seatNumbers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getNumberOfTicketsBookedByUser() {
		return numberOfTicketsBookedByUser;
	}

	public void setNumberOfTicketsBookedByUser(int numberOfTicketsBookedByUser) {
		this.numberOfTicketsBookedByUser = numberOfTicketsBookedByUser;
	}

	public List<Integer> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(List<Integer> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	public TicketDetails(long id, long movieId, long userId, int numberOfTicketsBookedByUser,
			List<Integer> seatNumbers) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.userId = userId;
		this.numberOfTicketsBookedByUser = numberOfTicketsBookedByUser;
		this.seatNumbers = seatNumbers;
	}

	public TicketDetails() {
		super();
	}

	@Override
	public String toString() {
		return "TicketDetails [id=" + id + ", movieId=" + movieId + ", userId=" + userId
				+ ", numberOfTicketsBookedByUser=" + numberOfTicketsBookedByUser + ", seatNumbers=" + seatNumbers + "]";
	}

}
