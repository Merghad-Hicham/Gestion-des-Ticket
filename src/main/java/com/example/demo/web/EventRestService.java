package com.example.demo.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Event;
import com.example.demo.metier.EventMetier;
@RestController
@CrossOrigin("*")
public class EventRestService {
	@Autowired
	 private EventMetier eventMetier;
	@RequestMapping(value="/event",method=RequestMethod.POST)
	public Event saveEvent(@RequestBody Event E) {
		return eventMetier.saveEvent(E);
	}
	@RequestMapping(value="/event",method=RequestMethod.GET)
	public List<Event> listEvent() {
		return eventMetier.listEvent();
	}

}
