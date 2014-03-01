package com.elliott.chenger.wearabledeveloperconference2014.utils;

import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
import com.google.gson.Gson;

public class PreloadedJson {

	public static final String FIFTH_EVENTS = "{\"date\":\"1393999200000\",\"events\": [{\"title\" : \"Morning Coffee\",\"speaker\" : \"\",\"startTime\" : 1394026200000,\"endTime\" : 1394029800000, \"type\" : \"\",\"level\" : \"\"},{\"title\" : \"Coffee Break\",\"speaker\" : \"\",\"startTime\" : 1394037000000,\"endTime\" : 1394037900000, \"type\" : \"\",\"level\" : \"\"},{\"title\" : \"Coffee Break\",\"speaker\" : \"\",\"startTime\" : 1394055000000,\"endTime\" : 1394055900000, \"type\" : \"\",\"level\" : \"\"},{\"title\" : \"Lunch\",\"speaker\" : \"\",\"startTime\" : 1394045100000,\"endTime\" : 1394047800000, \"type\" : \"\",\"level\" : \"\"},{\"title\" : \"Fireside Chats\",\"speaker\" : \"Dario Laverde\",\"startTime\" : 1394056800000,\"endTime\" : 1394062200000, \"type\" : \"\",\"level\" : \"\"},{\"title\" : \"Developing for Wearable Devices with Android\",\"speaker\" : \"Dario Laverde\",\"startTime\" : 1394029800000,\"endTime\" : 1394037000000, \"type\" : \"tutorial\",\"level\" : \"intermediate\"},{\"title\" : \"Filming and Broadcasting with Google Glass\",\"speaker\" : \"Jeris JC Miller\",\"startTime\" : 1394029800000, \"endTime\" : 1394037000000, \"type\" : \"tutorial\",\"level\" : \"overview\" },{\"title\" : \"Headless Android\",\"speaker\" : \"Ron Munitz\",\"startTime\" : 1394029800000,\"endTime\" : 1394037000000,\"type\" : \"tutorial\",\"level\" : \"intermediate\"},{\"title\" : \"How to Develop Your Wearable Electronics from Idea to Production\",\"speaker\" : \"Fabrizio Filippini\",\"startTime\" : 1394029800000,\"endTime\" : 1394037000000,\"type\" : \"tutorial\",\"level\" : \"intermediate\"},{\"title\" : \"Introduction to Wearable Development with Pebble\",\"speaker\" : \"Thomas Sarlandie\",\"startTime\" : 1394037900000,\"endTime\" : 1394045100000,\"type\" : \"tutorial\",\"level\" : \"advanced\"},{\"title\" : \"Prototyping New Wearable Experiences with Soft Electronics and Arduinos\",\"speaker\" : \"Pearl Chen\",\"startTime\" : 1394037900000, \"endTime\" : 1394045100000,\"type\" : \"tutorial\", \"level\" : \"intermediate\"},{\"title\" : \"Transitioning from Android to Google Glass\",\"speaker\" : \"Luis de la Rosa\",\"startTime\" : 1394037900000,\"endTime\" : 1394045100000, \"type\" : \"tutorial\",\"level\" : \"advanced\"},{\"title\" : \"Building Wearable Technology Applications for Behavior Modification: A Hands-On Tutorial\",\"speaker\" : \"Ashley Beattie\",\"startTime\" : 1394047800000,\"endTime\" : 1394055000000,\"type\" : \"tutorial\",\"level\" : \"advanced\"},{\"title\" : \"Hardware Glassware: Building Bluetooth-Enabled Accessories for Glass\", \"speaker\" : \"Zack Freedman\",\"startTime\" : 1394047800000,\"endTime\" : 1394055000000,\"type\" : \"tutorial\",\"level\" : \"advanced\"},{\"title\" : \"ROM Cooking: A Hands-on, \'Do it at Home\' Approach\",\"speaker\" : \"Ron Munitz\",\"startTime\" : 1394047800000,\"endTime\" : 1394055000000,\"type\" : \"tutorial\",\"level\" : \"intermediate\"},{\"title\" : \"Wearable Hacking with Raspberry Pi, Google Glass, Motors and Camera\",\"speaker\" : \"Mark Scheel\",\"startTime\" : 1394047800000,\"endTime\" : 1394055000000,\"type\" : \"tutorial\",\"level\" : \"overview\"}]}";
	public static final String SIXTH_EVENTS = "{\"date\":\"1394085600000\",\"events\": [{\"title\" : \"An Overview of Computer Vision and how it can Enable Perceptive Wearables\",\"speaker\" : \"Goksel Dedeoglu\",\"startTime\" : 1394116200000,\"endTime\" : 1394119800000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"API and GDK Design for Google Glass\",\"speaker\" : \"Cecilia Abadie\",\"startTime\" : 1394116200000,\"endTime\" : 1394119800000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Creating Products for Google Glass at the Highest Level\",\"speaker\" : \"Mike DiGiovanni\",\"startTime\" : 1394116200000,\"endTime\" : 1394119800000, \"type\" : \"class\",\"level\" : \"overview\"} ,{\"title\" : \"NDK Primer\",\"speaker\" : \"Ron Munitz\",\"startTime\" : 1394116200000,\"endTime\" : 1394119800000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Developers in the Doctor’s Office: How Wearables are Changing the way we give and Receive Care\",\"speaker\" : \"Andrei Pop\",\"startTime\" : 1394125200000,\"endTime\" : 1394128800000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Glassware UI Design\",\"speaker\" : \"Matt Abdou\",\"startTime\" : 1394125200000,\"endTime\" : 1394128800000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Security Challenges in Wearables\",\"speaker\" : \"Ray Potter\",\"startTime\" : 1394125200000,\"endTime\" : 1394128800000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Using WearScript for Powerful Rapid Prototyping on Google Glass\",\"speaker\" : \"Brandyn White\",\"startTime\" : 1394125200000,\"endTime\" : 1394128800000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Ensuring Your Wearable Apps Delight Users and Beat the Competition\",\"speaker\" : \"John Montgomery\",\"startTime\" : 1394129700000,\"endTime\" : 1394131500000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Sony SmartWatch 2: Get a Headstart on Wearable Apps Development\",\"speaker\" : \"Anupam Nath\",\"startTime\" : 1394129700000,\"endTime\" : 1394131500000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"APIs and Hardware: The Current Tradeoff\",\"speaker\" : \"Fabrizio Filippini\",\"startTime\" : 1394135100000,\"endTime\" : 1394138700000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Hybrid Glassware\",\"speaker\" : \"Jenny Murphy\",\"startTime\" : 1394135100000,\"endTime\" : 1394138700000, \"type\" : \"class\",\"level\" : \"advanced\"},{\"title\" : \"Publishing Your Google Glass App\",\"speaker\" : \"Matt Abdou\",\"startTime\" : 1394135100000,\"endTime\" : 1394138700000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Wearable Springboard: High Performance, Low Power Motion Technology\",\"speaker\" : \"David B. Karlin\",\"startTime\" : 1394135100000,\"endTime\" : 1394138700000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Beyond Activity Trackers: Sport Wearables Design\",\"speaker\" : \"Jen Costillo\",\"startTime\" : 1394140500000,\"endTime\" : 1394144100000, \"type\" : \"class\",\"level\" : \"advanced\"},{\"title\" : \"Deep Dive into Google Glass Live Cards \",\"speaker\" : \"Luis de la Rosa\",\"startTime\" : 1394140500000,\"endTime\" : 1394144100000, \"type\" : \"class\",\"level\" : \"advanced\"},{\"title\" : \"Social Smarts for Small Screens \",\"speaker\" : \"Sonia Koesterer\",\"startTime\" : 1394140500000,\"endTime\" : 1394144100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"When Microwatts Are Precious: Battery Tips for Wearable Apps\",\"speaker\" : \"Mark Murphy\",\"startTime\" : 1394140500000,\"endTime\" : 1394144100000, \"type\" : \"class\",\"level\" : \"overview\"}    ]}";
	public static final String SEVENTH_EVENTS = "{\"date\":\"1394172000000\",\"events\": [{\"title\" : \"Analyze Communications and Security from Wearables\",\"speaker\" : \"Wilson Mar\",\"startTime\" : 1394203500000,\"endTime\" : 1394207100000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Building Wearable Technology Applications for Behavior Modification: A Conceptual Overview\",\"speaker\" : \"Ashley Beattie\",\"startTime\" : 1394203500000,\"endTime\" : 1394207100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Harnessing the Power of the Other Sensors in Google Glass: There's more than just the Camera\",\"speaker\" : \"Victor Kaiser-Pendergrast and Jake Steinerman\",\"startTime\" : 1394203500000,\"endTime\" : 1394207100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Leveraging Open-Source Hardware and Software for Perceptive Wearables\",\"speaker\" : \"Goksel Dedeoglu\",\"startTime\" : 1394203500000,\"endTime\" : 1394207100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Beyond Glass: Connecting the GDK with App Engine Web Services\",\"speaker\" : \"Victor Kaiser-Pendergrast and Jake Steinerman\",\"startTime\" : 1394208000000,\"endTime\" : 1394211600000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Design and Engineering Principles for Wearables 2.0\",\"speaker\" : \"Rachel Kalmar\",\"startTime\" : 1394208000000,\"endTime\" : 1394211600000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Native App Development on Google Glass\",\"speaker\" : \"Jim McKeeth\",\"startTime\" : 1394208000000,\"endTime\" : 1394211600000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Wireless Connectivity and Wearables: The What, How and Why\",\"speaker\" : \"Cary Bran\",\"startTime\" : 1394208000000,\"endTime\" : 1394211600000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Developing and Designing Finance Glassware\",\"speaker\" : \"Lawrence Wong\",\"startTime\" : 1394213400000,\"endTime\" : 1394217000000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Gradle and Your Android Wearable Projects\",\"speaker\" : \"Mark Murphy\",\"startTime\" : 1394213400000,\"endTime\" : 1394217000000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Made in China: How to Build Hardware with Less Than $10k\",\"speaker\" : \"Jason Gui\",\"startTime\" : 1394213400000,\"endTime\" : 1394217000000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Wearable and Bluetooth – Exploring the Details of Wireless Communications\",\"speaker\" : \"Vincent Gao\",\"startTime\" : 1394213400000,\"endTime\" : 1394217000000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"An Emotional Approach to the Design of Wearable Medical Devices\",\"speaker\" : \"Shaun Rahimi\",\"startTime\" : 1394221500000,\"endTime\" : 1394225100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"Glass Development: Common use cases, Lessons Learned and Gotchas!\",\"speaker\" : \"Tejas Lagvankar\",\"startTime\" : 1394221500000,\"endTime\" : 1394225100000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Is Thought the Future of Wearable Input?\",\"speaker\" : \"Jim McKeeth\",\"startTime\" : 1394221500000,\"endTime\" : 1394225100000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Lean Hardware: Positioning, Financing and Retail\",\"speaker\" : \"Benjamin Joffe\",\"startTime\" : 1394221500000,\"endTime\" : 1394225100000, \"type\" : \"class\",\"level\" : \"overview\"},{\"title\" : \"APIs: The Secret to Making Wearables Relevant\",\"speaker\" : \"Hussain Chinoy and Ashish Vaid\",\"startTime\" : 1394227800000,\"endTime\" : 1394231400000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Building Wearable Devices Through Rapid Prototyping\",\"speaker\" : \"Moe Tanabian\",\"startTime\" : 1394227800000,\"endTime\" : 1394231400000, \"type\" : \"class\",\"level\" : \"advanced\"},{\"title\" : \"Elegance, a Design Philosophy\",\"speaker\" : \"Mladen Barbaric\",\"startTime\" : 1394227800000,\"endTime\" : 1394231400000, \"type\" : \"class\",\"level\" : \"intermediate\"},{\"title\" : \"Making Android Bluetooth 4.0 Work\",\"speaker\" : \"Chris Herbert\",\"startTime\" : 1394227800000,\"endTime\" : 1394231400000, \"type\" : \"class\",\"level\" : \"advanced\"}]}";
	

	public static final String seventhTimeBuilders(){
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
	
	public static final String fifthTimeBuilder(){
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
	public static final String sixthTimeBuilder(){
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
	