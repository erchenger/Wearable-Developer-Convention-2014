package com.elliott.chenger.wearabledeveloperconference2014;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.elliott.chenger.wearabledeveloperconference2014.model.Event;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventsByDate;
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
		mCards.add(createCard("Select an Event", "Swipe left or right"));
		for(Event event:mEvents.events){
			if(event.startTime.equals(mSelectedStartTime) && event.endTime.equals(mSelectedEndTime)){
				mCards.add(createCard(event.title+" ("+event.level+")","Speaker: "+event.speaker+"  Type: "+event.type));
			}
		}		
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

	private Card createCard(String text) {
		Card card;
		card = new Card(this);
		card.setText(text);
		return card;
	}
	private Card createCard(String text, String footerText){
		Card card;
		card = new Card(this);
		card.setText(text);
		card.setFootnote(footerText);
		return card;
	}
	private Card createCard(String text, String footerText,int imageId){
		Card card;
		card = new Card(this);
		card.setText(text);
		card.setFootnote(footerText);
		card.addImage(imageId);
		return card;
	}
}
