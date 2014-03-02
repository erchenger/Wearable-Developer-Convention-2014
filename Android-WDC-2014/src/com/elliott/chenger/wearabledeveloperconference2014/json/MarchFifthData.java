package com.elliott.chenger.wearabledeveloperconference2014.json;

import com.elliott.chenger.wearabledeveloperconference2014.model.Event;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventsByDate;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
import com.google.gson.Gson;

public class MarchFifthData {
	
	public static final String eventBuilder(){
		EventsByDate result = new EventsByDate();
		
		result.date = 1393999200000L;
		
		Event event;
		
		event = new Event();
		event.title = "Morning Coffee";
		event.speaker = "";
		event.startTime = 1394026200000L;
		event.endTime = 1394029800000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Coffee Break";
		event.speaker = "";
		event.startTime = 1394037000000L;
		event.endTime = 1394037900000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Coffee Break";
		event.speaker = "";
		event.startTime = 1394055000000L;
		event.endTime = 1394055900000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Lunch";
		event.speaker = "";
		event.startTime = 1394045100000L;
		event.endTime = 1394047800000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Fireside Chats";
		event.speaker = "Dario Laverde";
		event.startTime = 1394056800000L;
		event.endTime = 1394062200000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Developing for Wearable Devices with Android";
		event.speaker = "Dario Laverde";
		event.startTime = 1394029800000L;
		event.endTime = 1394037000000L;
		event.type = "tutorial";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Filming and Broadcasting with Google Glass";
		event.speaker = "Jeris JC Miller";
		event.startTime = 1394029800000L;
		event.endTime = 1394037000000L;
		event.type = "tutorial";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Headless Android";
		event.speaker = "Ron Munitz";
		event.startTime = 1394029800000L;
		event.endTime = 1394037000000L;
		event.type = "tutorial";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "How to Develop Your Wearable Electronics from Idea to Production";
		event.speaker = "Fabrizio Filippini";
		event.startTime = 1394029800000L;
		event.endTime = 1394037000000L;
		event.type = "tutorial";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Introduction to Wearable Development with Pebble";
		event.speaker = "Thomas Sarlandie";
		event.startTime = 1394037900000L;
		event.endTime = 1394045100000L;
		event.type = "tutorial";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "Prototyping New Wearable Experiences with Soft Electronics and Arduinos";
		event.speaker = "Pearl Chen";
		event.startTime = 1394037900000L;
		event.endTime = 1394045100000L;
		event.type = "tutorial";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Transitioning from Android to Google Glass";
		event.speaker = "Luis de la Rosa";
		event.startTime = 1394037900000L;
		event.endTime = 1394045100000L;
		event.type = "tutorial";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "Building Wearable Technology Applications for Behavior Modification: A Hands-On Tutorial";
		event.speaker = "Ashley Beattie";
		event.startTime = 1394047800000L;
		event.endTime = 1394055000000L;
		event.type = "tutorial";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "Hardware Glassware: Building Bluetooth-Enabled Accessories for Glass";
		event.speaker = "Zack Freedman";
		event.startTime = 1394047800000L;
		event.endTime = 1394055000000L;
		event.type = "tutorial";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "ROM Cooking: A Hands-on, 'Do it at Home' Approach";
		event.speaker = "Ron Munitz";
		event.startTime = 1394047800000L;
		event.endTime = 1394055000000L;
		event.type = "tutorial";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Wearable Hacking with Raspberry Pi, Google Glass, Motors and Camera";
		event.speaker = "Mark Scheel";
		event.startTime = 1394047800000L;
		event.endTime = 1394055000000L;
		event.type = "tutorial";
		event.level = "overview";
		result.events.add(event);
		
		Gson gson = new Gson();
		return gson.toJson(result);
	}

	public static final String timeBuilder(){
		TimesByDate result = new TimesByDate();
		result.date = 1393999200000L;
		
		EventTime time;
		
		time = new EventTime();
		time.startTime = 1394026200000L;
		time.endTime = 1394065800000L;
		result.eventTimes.add(time);

		
		time = new EventTime();
		time.startTime = 1394026200000L;
		time.endTime = 1394029800000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394029800000L;
		time.endTime = 1394037000000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394037000000L;
		time.endTime = 1394037900000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394037900000L;
		time.endTime = 1394045100000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394045100000L;
		time.endTime = 1394047800000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394047800000L;
		time.endTime = 1394055000000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394055000000L;
		time.endTime = 1394055900000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394056800000L;
		time.endTime = 1394062200000L;
		result.eventTimes.add(time);
		
		Gson gson = new Gson();
		return gson.toJson(result);
	}
}
