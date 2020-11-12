package com.cos.springjsp;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

	@GetMapping("/events")
	public String getEvents(Model model) {
		Event event1 = new Event();
		event1.setName("스프링 웹 MVC 스터디1");
		event1.setStarts(LocalDateTime.of(2019, 1, 15, 10, 0));
		
		Event event2 = new Event();
		event1.setName("스프링 웹 MVC 스터디2");
		event1.setStarts(LocalDateTime.of(2019, 1, 22, 10, 0));
		
		//List<Event> events = List.of(event1, event2);
		List<Event> events = new ArrayList<>();
		System.out.println("events add 전" + events);
		events.add(event1);
		events.add(event2);
		System.out.println("events add 후" + events);
		
		model.addAttribute("events", events);
		model.addAttribute("message", "Happy New Year!");
		
		
		return "events/list";
	}
	
	
}
