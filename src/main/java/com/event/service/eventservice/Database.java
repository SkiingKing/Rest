package com.event.service.eventservice;


import com.event.service.eventservice.dto.Event;
import com.event.service.eventservice.dto.EventType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Database {

    private final static HashMap<Long, Event> localDatabase = new HashMap<>();

    public static HashMap<Long, Event> getLocalDatabase() {
        localDatabase.put(1L, new Event(1L, "Venom 2", 20, "No speaker", EventType.FIRST, new Date(20, Calendar.APRIL, 21)));
        localDatabase.put(2L, new Event(1L, "Duna", 3, "No speaker", EventType.SECOND, new Date(20, Calendar.MARCH, 21)));
        return localDatabase;
    }
}
