package com.event.service.eventservice.dto;

import java.util.Date;

public class Event {

    private long id;
    private String title;
    private int place;
    private String speaker;
    private EventType eventType;
    private Date dateTime;

    public Event(long id, String title, int place, String speaker, EventType eventType, Date dateTime) {
        this.id = id;
        this.title = title;
        this.place = place;
        this.speaker = speaker;
        this.eventType = eventType;
        this.dateTime = dateTime;
    }
    public Event(){

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPlace() {
        return place;
    }

    public String getSpeaker() {
        return speaker;
    }

    public EventType getEventType() {
        return eventType;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
