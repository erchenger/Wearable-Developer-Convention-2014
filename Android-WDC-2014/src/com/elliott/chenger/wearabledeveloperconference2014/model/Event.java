package com.elliott.chenger.wearabledeveloperconference2014.model;

import com.google.gson.annotations.SerializedName;


public class Event {
	
	@SerializedName("startTime")
	public Long startTime;
	
	@SerializedName("endTime")
	public Long endTime;
	
	@SerializedName("title")
	public String title;
	
	@SerializedName("speaker")
	public String speaker;
	
	@SerializedName("type")
	public String type;
	
	@SerializedName("level")
	public String level;
}
