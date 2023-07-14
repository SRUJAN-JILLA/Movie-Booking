package com.movieBooking.admin.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movieBooking.admin.model.TicketDetails;

public interface TicketDetailsRepository extends MongoRepository<TicketDetails, Long> {

}
