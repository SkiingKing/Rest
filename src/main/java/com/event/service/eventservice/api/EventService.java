package com.event.service.eventservice.api;

import com.event.service.eventservice.dto.Event;
import com.event.service.eventservice.dto.EventType;

import java.util.Date;
import java.util.List;

public interface EventService {

    Event createEvent(long id, String title, int place, String speaker, EventType eventType, Date dateTime);

    Event updateEvent(Event event);

    Event getEvent(long id);

    boolean deleteEvent(long id);

    List<Event> getAllEvents();

    List<Event> getAllEventsByTitle(String string);

}
