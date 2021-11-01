package com.event.service.eventservice.controller;


import com.event.service.eventservice.dto.Event;
import com.event.service.eventservice.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EventServiceController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping( value = "/create/{id}", method = RequestMethod.PUT)
    public void createEvent(@RequestBody Event event, @PathVariable Long id){
        eventRepository.save(event);
    }

    @RequestMapping( value = "/update/{id}", method = RequestMethod.PUT)
    public void updateEvent(@RequestBody Event event, @PathVariable Long id){
        eventRepository.save(event);
    }

    @RequestMapping( value = "/getEventById/{id}", method = RequestMethod.GET)
    public Event getEventById(@PathVariable Long id){
        return eventRepository.findById(id).orElse(null);
    }

    @RequestMapping( value = "/deleteEventById/{id}", method = RequestMethod.DELETE)
    public void deleteEventById(@PathVariable Long id){
         eventRepository.deleteById(id);
    }

    @RequestMapping( value = "/deleteEventById", method = RequestMethod.GET)
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    @RequestMapping( value = "/getAllEventsByTitle/{title}", method = RequestMethod.GET)
    public List<Event> getAllEventsByTitle(@PathVariable String title){
        return eventRepository.findAll().stream()
                .filter(i -> i.getTitle().equals(title))
                .collect(Collectors.toList());
    }
}
