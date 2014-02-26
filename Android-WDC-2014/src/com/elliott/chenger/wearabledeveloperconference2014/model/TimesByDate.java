package com.elliott.chenger.wearabledeveloperconference2014.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TimesByDate {
	
	@SerializedName("date")
	public Long date;
	
	@SerializedName("times")
	public List<EventTime> eventTimes;
}
