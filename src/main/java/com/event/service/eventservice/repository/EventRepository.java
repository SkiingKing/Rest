package com.event.service.eventservice.repository;

import com.event.service.eventservice.dto.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends JpaRepository<Event, Long> {


}
