package com.event.service.eventservice.impl;

import com.event.service.eventservice.Database;
import com.event.service.eventservice.api.EventService;
import com.event.service.eventservice.dto.Event;
import com.event.service.eventservice.dto.EventType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class EventServiceImpl implements EventService {


    @Override
    public Event createEvent(long id, String title, int place, String speaker, EventType eventType, Date dateTime) {
        return null;
    }

    @Override
    public Event updateEvent(Event event) {
        return null;
    }

    @Override
    public Event getEvent(long id) {
        return null;
    }

    @Override
    public boolean deleteEvent(long id) {
        return false;
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public List<Event> getAllEventsByTitle(String string) {
        return null;
    }
}
