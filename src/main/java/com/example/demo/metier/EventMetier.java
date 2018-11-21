package com.example.demo.metier;

import java.util.List;


import com.example.demo.entities.Event;

public interface EventMetier {
	public Event saveEvent(Event E);
	public List<Event> listEvent();
}
