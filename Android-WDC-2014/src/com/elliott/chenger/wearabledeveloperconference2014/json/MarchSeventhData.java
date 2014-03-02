package com.elliott.chenger.wearabledeveloperconference2014.json;

import com.elliott.chenger.wearabledeveloperconference2014.model.Event;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventsByDate;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
import com.google.gson.Gson;

public class MarchSeventhData {
	public static final String eventBuilder(){
		EventsByDate result = new EventsByDate();
		
		result.date = 1394172000000L;
		
		Event event;
		
		event = new Event();
		event.title = "Analyze Communications and Security from Wearables";
		event.speaker = "Wilson Ma";
		event.startTime = 1394203500000L;
		event.endTime = 1394207100000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Building Wearable Technology Applications for Behavior Modification: A Conceptual Overview";
		event.speaker = "Ashley Beattie";
		event.startTime = 1394203500000L;
		event.endTime = 1394207100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);

		event = new Event();
		event.title = "Harnessing the Power of the Other Sensors in Google Glass: There's more than just the Camera";
		event.speaker = "Victor Kaiser-Pendergrast and Jake Steinerman";
		event.startTime = 1394203500000L;
		event.endTime = 1394207100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Leveraging Open-Source Hardware and Software for Perceptive Wearables";
		event.speaker = "Goksel Dedeoglu";
		event.startTime = 1394203500000L;
		event.endTime = 1394207100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Beyond Glass: Connecting the GDK with App Engine Web Services";
		event.speaker = "Victor Kaiser-Pendergrast and Jake Steinerman";
		event.startTime = 1394208000000L;
		event.endTime = 1394211600000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Design and Engineering Principles for Wearables 2.0";
		event.speaker = "Rachel Kalmar";
		event.startTime = 1394208000000L;
		event.endTime = 1394211600000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Native App Development on Google Glass";
		event.speaker = "Jim McKeeth";
		event.startTime = 1394208000000L;
		event.endTime = 1394211600000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Wireless Connectivity and Wearables: The What, How and Why";
		event.speaker = "Cary Bran";
		event.startTime = 1394208000000L;
		event.endTime = 1394211600000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Developing and Designing Finance Glassware";
		event.speaker = "Lawrence Wong";
		event.startTime = 1394213400000L;
		event.endTime = 1394217000000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Gradle and Your Android Wearable Projects";
		event.speaker = "Mark Murphy";
		event.startTime = 1394213400000L;
		event.endTime = 1394217000000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Made in China: How to Build Hardware with Less Than $10k";
		event.speaker = "Jason Gui";
		event.startTime = 1394213400000L;
		event.endTime = 1394217000000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Wearable and Bluetooth Ð Exploring the Details of Wireless Communications";
		event.speaker = "Vincent Gao";
		event.startTime = 1394213400000L;
		event.endTime = 1394217000000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "An Emotional Approach to the Design of Wearable Medical Devices";
		event.speaker = "Shaun Rahimi";
		event.startTime = 1394221500000L;
		event.endTime = 1394225100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "Glass Development: Common use cases, Lessons Learned and Gotchas!";
		event.speaker = "Tejas Lagvankar";
		event.startTime = 1394221500000L;
		event.endTime = 1394225100000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Is Thought the Future of Wearable Input?";
		event.speaker = "Jim McKeeth";
		event.startTime = 1394221500000L;
		event.endTime = 1394225100000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Lean Hardware: Positioning, Financing and Retail";
		event.speaker = "Benjamin Joffe";
		event.startTime = 1394221500000L;
		event.endTime = 1394225100000L;
		event.type = "class";
		event.level = "overview";
		result.events.add(event);
		
		event = new Event();
		event.title = "APIs: The Secret to Making Wearables Relevant";
		event.speaker = "Hussain Chinoy and Ashish Vaid";
		event.startTime = 1394227800000L;
		event.endTime = 1394231400000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Building Wearable Devices Through Rapid Prototyping";
		event.speaker = "Moe Tanabian";
		event.startTime = 1394227800000L;
		event.endTime = 1394231400000L;
		event.type = "class";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "Elegance, a Design Philosophy";
		event.speaker = "Mladen Barbaric";
		event.startTime = 1394227800000L;
		event.endTime = 1394231400000L;
		event.type = "class";
		event.level = "intermediate";
		result.events.add(event);
		
		event = new Event();
		event.title = "Making Android Bluetooth 4.0 Work";
		event.speaker = "Chris Herbert";
		event.startTime = 1394227800000L;
		event.endTime = 1394231400000L;
		event.type = "class";
		event.level = "advanced";
		result.events.add(event);
		
		event = new Event();
		event.title = "Registration Open";
		event.speaker = "";
		event.startTime = 1394199000000L;
		event.endTime = 1394229600000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Morning Coffee";
		event.speaker = "";
		event.startTime = 1394199000000L;
		event.endTime = 1394203500000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Exhibit Hall Open";
		event.speaker = "";
		event.startTime = 1394211600000L;
		event.endTime = 1394227800000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Coffee Break";
		event.speaker = "";
		event.startTime = 1394211600000L;
		event.endTime = 1394213400000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Lunch";
		event.speaker = "";
		event.startTime = 1394217900000L;
		event.endTime = 1394221500000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		event = new Event();
		event.title = "Coffee Break & Winner's Circle";
		event.speaker = "";
		event.startTime = 1394225100000L;
		event.endTime = 1394226900000L;
		event.type = "";
		event.level = "";
		result.events.add(event);
		
		
		Gson gson = new Gson();
		return gson.toJson(result);
	}
	public static final String TimeBuilder(){
		TimesByDate result = new TimesByDate();
		result.date = 1394172000000L;
		
		EventTime time;
		
		time = new EventTime();
		time.startTime = 1394199000000L;
		time.endTime = 1394229600000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394199000000L;
		time.endTime = 1394203500000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394203500000L;
		time.endTime = 1394207100000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394208000000L;
		time.endTime = 1394211600000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394211600000L;
		time.endTime = 1394227800000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394211600000L;
		time.endTime = 1394213400000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394213400000L;
		time.endTime = 1394217000000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394217900000L;
		time.endTime = 1394221500000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394221500000L;
		time.endTime = 1394225100000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394225100000L;
		time.endTime = 1394226900000L;
		result.eventTimes.add(time);
		
		time = new EventTime();
		time.startTime = 1394227800000L;
		time.endTime = 1394231400000L;
		result.eventTimes.add(time);
		
		Gson gson = new Gson();
		return gson.toJson(result);
	}
}
