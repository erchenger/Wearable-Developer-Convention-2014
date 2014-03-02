package com.elliott.chenger.wearabledeveloperconference2014.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class EventsByDate {

	@SerializedName("date")
	public Long date;
	
	@SerializedName("events")
	public List<Event> events;
	
	public EventsByDate(){
		
		events = new ArrayList<Event>();
	}
}
