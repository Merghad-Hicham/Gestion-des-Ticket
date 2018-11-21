package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EventRepository;
import com.example.demo.entities.Event;
@Service
public class EventMetierImpl implements EventMetier {
	@Autowired
	private EventRepository eventRepositoy;
	
	@Override
	public Event saveEvent(Event E) {
		
		return eventRepositoy.save(E);
	}

	@Override
	public List<Event> listEvent() {
		
		return eventRepositoy.findAll();
	}

}
