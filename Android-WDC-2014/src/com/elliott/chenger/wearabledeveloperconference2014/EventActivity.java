package com.elliott.chenger.wearabledeveloperconference2014;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.elliott.chenger.wearabledeveloperconference2014.model.Event;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventsByDate;
import com.elliott.chenger.wearabledeveloperconference2014.utils.CardUtils;
import com.elliott.chenger.wearabledeveloperconference2014.utils.DateConstants;
import com.elliott.chenger.wearabledeveloperconference2014.utils.PreloadedJson;
import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollView;
import com.google.gson.Gson;

/**
 * @author elliott chenger
 *
 */
public class EventActivity extends Activity{
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private ImpCardScrollAdapter mCardScrollAdapter;
	private Gson mGson;
	private EventsByDate mEvents;
	private Long mSelectedDate, mSelectedStartTime, mSelectedEndTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGson = new Gson();

		getIntent().getExtras().getLong(TimeActivity.START_TIME);
		mSelectedDate = getIntent().getExtras().getLong(DateActivity.DATE);
		mSelectedStartTime = getIntent().getExtras().getLong(TimeActivity.START_TIME);
		mSelectedEndTime = getIntent().getExtras().getLong(TimeActivity.END_TIME);

		loadJson();
		createCardsBasedOnEvents();

		mCardScrollView = new CardScrollView(this);
		mCardScrollAdapter = new ImpCardScrollAdapter(mCards);
		mCardScrollView.setAdapter(mCardScrollAdapter);
		mCardScrollView.activate();
		setContentView(mCardScrollView);
	}

	private void createCardsBasedOnEvents() {
		mCards = new ArrayList<Card>();
		mCards.add(CardUtils.createCard(this,getResources().getString(R.string.select_an_event), getResources().getString(R.string.swipe_message)));
		for(Event event:mEvents.events){
			if(event.startTime.equals(mSelectedStartTime) && event.endTime.equals(mSelectedEndTime)){
				if(event.level.isEmpty()&&event.speaker.isEmpty()&&event.type.isEmpty())
					mCards.add(CardUtils.createCard(this,event.title));
				else
					mCards.add(CardUtils.createCard(this,titleBuilder(event),footerBuilder(event)));
			}
		}		
	}

	private String titleBuilder(Event event){
		String result = "";
		result += event.title;
		if(!event.level.isEmpty()){
			result += " ("+event.level+")";
		}
		return result;
	}
	
	private String footerBuilder(Event event){
		String result = "Speaker: ";
		result += event.speaker;
		if(!event.type.isEmpty()){
			result += " Type: "+event.type;
		}
		return result;
	}
	
	private void loadJson() {
		if(mSelectedDate.equals(DateConstants.MAR_FIFTH)){
			Log.v("JSON",PreloadedJson.FIFTH_EVENTS);
			mEvents = mGson.fromJson(PreloadedJson.FIFTH_EVENTS, EventsByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SIXTH)){
			mEvents = mGson.fromJson(PreloadedJson.SIXTH_EVENTS, EventsByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SEVENTH)){
			mEvents = mGson.fromJson(PreloadedJson.SEVENTH_EVENTS, EventsByDate.class);
		}		
	}


}
