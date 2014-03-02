package com.elliott.chenger.wearabledeveloperconference2014.json;

import com.elliott.chenger.wearabledeveloperconference2014.model.Event;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventsByDate;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
import com.google.gson.Gson;

public class MarchSixthData {
	public static final String eventBuilder(){
		EventsByDate result = new EventsByDate();
		
		result.date = 1394085600000L;
		
		Event event;
		
		event = new Event();
		event.title = "Morning Coffee";
		event.speaker = "";
		event.startTime = 1394112600000L;
		event.endTime = 1394116200000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Coffee Break";
		event.speaker = "";
		event.startTime = 1394119800000L;
		event.endTime = 1394120700000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "The Glass Platform: How We Got Here";
		event.speaker = "Jenny Murphy";
		event.startTime = 1394120700000L;
		event.endTime = 1394124300000L;
		event.type = "keynote";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Exhibit Hall Open";
		event.speaker = "";
		event.startTime = 1394128800000L;
		event.endTime = 1394156700000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Lunch";
		event.speaker = "";
		event.startTime = 1394131500000L;
		event.endTime = 1394135100000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Ice Cream Social";
		event.speaker = "";
		event.startTime = 1394138700000L;
		event.endTime = 1394140500000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Vision: Wear them, Forget them. What that means for the Underlying Breakthrough Technology";
		event.speaker = "Philippe Kahn";
		event.startTime = 1394145000000L;
		event.endTime = 1394148600000L;
		event.type = "keynote";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Lightning Talks";
		event.speaker = "";
		event.startTime = 1394148600000L;
		event.endTime = 1394151300000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "Networking Reception";
		event.speaker = "";
		event.startTime = 1394151300000L;
		event.endTime = 1394156700000L;
		event.type = "";
		event.level = "";
		result.events.add(event);

		event = new Event();
		event.title = "An Overview of Computer Vision and how it can Enable Perceptive Wearables";
		event.speaker = "Goksel Dedeoglu";
		event.startTime = 1394116200000L;
		event.endTime = 1394119800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "API and GDK Design for Google Glass";
		event.speaker = "Cecilia Abadie";
		event.startTime = 1394116200000L;
		event.endTime = 1394119800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Creating Products for Google Glass at the Highest Level";
		event.speaker = "Mike DiGiovanni";
		event.startTime = 1394116200000L;
		event.endTime = 1394119800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "NDK Primer";
		event.speaker = "Ron Munitz";
		event.startTime = 1394116200000L;
		event.endTime = 1394119800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Developers in the Doctor’s Office: How Wearables are Changing the way we give and Receive Care";
		event.speaker = "Andrei Pop";
		event.startTime = 1394125200000L;
		event.endTime = 1394128800000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);

		event = new Event();
		event.title = "Glassware UI Design";
		event.speaker = "Matt Abdou";
		event.startTime = 1394125200000L;
		event.endTime = 1394128800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Security Challenges in Wearables";
		event.speaker = "Ray Potter";
		event.startTime = 1394125200000L;
		event.endTime = 1394128800000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Using WearScript for Powerful Rapid Prototyping on Google Glass";
		event.speaker = "Brandyn White";
		event.startTime = 1394125200000L;
		event.endTime = 1394128800000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);

		event = new Event();
		event.title = "Ensuring Your Wearable Apps Delight Users and Beat the Competition";
		event.speaker = "John Montgomery";
		event.startTime = 1394129700000L;
		event.endTime = 1394131500000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Sony SmartWatch 2: Get a Headstart on Wearable Apps Development";
		event.speaker = "Anupam Nath";
		event.startTime = 1394129700000L;
		event.endTime = 1394131500000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "APIs and Hardware: The Current Tradeoff";
		event.speaker = "Fabrizio Filippini";
		event.startTime = 1394135100000L;
		event.endTime = 1394138700000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);

		event = new Event();
		event.title = "Hybrid Glassware";
		event.speaker = "Jenny Murphy";
		event.startTime = 1394135100000L;
		event.endTime = 1394138700000L;
		event.type = "class";
		event.level = "advanced";
		result.events.add(event);

		event = new Event();
		event.title = "Publishing Your Google Glass App";
		event.speaker = "Matt Abdou";
		event.startTime = 1394135100000L;
		event.endTime = 1394138700000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Wearable Springboard: High Performance, Low Power Motion Technology";
		event.speaker = "David B. Karlin";
		event.startTime = 1394135100000L;
		event.endTime = 1394138700000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);

		event = new Event();
		event.title = "Beyond Activity Trackers: Sport Wearables Design";
		event.speaker = "Jen Costillo";
		event.startTime = 1394140500000L;
		event.endTime = 1394144100000L;
		event.type = "class";
		event.level = "advanced";
		result.events.add(event);

		event = new Event();
		event.title = "Deep Dive into Google Glass Live Cards";
		event.speaker = "Luis de la Rosa";
		event.startTime = 1394140500000L;
		event.endTime = 1394144100000L;
		event.type = "class";
		event.level = "advanced";
		result.events.add(event);

		event = new Event();
		event.title = "Social Smarts for Small Screens";
		event.speaker = "Sonia Koesterer";
		event.startTime = 1394140500000L;
		event.endTime = 1394144100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "When Microwatts Are Precious: Battery Tips for Wearable Apps";
		event.speaker = "Mark Murphy";
		event.startTime = 1394140500000L;
		event.endTime = 1394144100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		Gson gson = new Gson();
		return gson.toJson(result);
	}

	public static final String timeBuilder(){
		TimesByDate result = new TimesByDate();
		result.date = 1394085600000L;
		
		EventTime time;
		
		time = new EventTime();
		time.startTime = 1394112600000L;
		time.endTime = 1394116200000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394116200000L;
		time.endTime = 1394119800000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394119800000L;
		time.endTime = 1394120700000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394120700000L;
		time.endTime = 1394124300000L;
		result.eventTimes.add(time);

		time = new EventTime();
		time.startTime = 1394125200000L;
		time.endTime = 1394128800000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394128800000L;
		time.endTime = 1394156700000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394129700000L;
		time.endTime = 1394131500000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394131500000L;
		time.endTime = 1394135100000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394135100000L;
		time.endTime = 1394138700000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394138700000L;
		time.endTime = 1394140500000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394140500000L;
		time.endTime = 1394144100000L;
		result.eventTimes.add(time);
		
		
		
		time = new EventTime();
		time.startTime = 1394145000000L;
		time.endTime = 1394148600000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394148600000L;
		time.endTime = 1394151300000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394151300000L;
		time.endTime = 1394156700000L;
		result.eventTimes.add(time);
		
		
		Gson gson = new Gson();
		return gson.toJson(result);
	}
}
