package com.elliott.chenger.wearabledeveloperconference2014;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
import com.elliott.chenger.wearabledeveloperconference2014.utils.DateConstants;
import com.elliott.chenger.wearabledeveloperconference2014.utils.PreloadedJson;
import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollView;
import com.google.gson.Gson;

/**
 * @author elliott chenger
 *
 */
public class TimeActivity extends Activity{
	public static final String START_TIME = "starttime";
	public static final String END_TIME = "endtime";
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private ImpCardScrollAdapter mCardScrollAdapter;
	private Long mSelectedDate;
	private Gson mGson;
	private TimesByDate mEventTimes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGson = new Gson();
		mSelectedDate = getIntent().getExtras().getLong(DateActivity.DATE);
		loadJson();
		createCardsBasedOnDate();
		
		mCardScrollView = new CardScrollView(this);
		mCardScrollAdapter = new ImpCardScrollAdapter(mCards);
		mCardScrollView.setAdapter(mCardScrollAdapter);
		mCardScrollView.activate();
		setContentView(mCardScrollView);
	}

	private void loadJson() {
		if(mSelectedDate.equals(DateConstants.MAR_FIFTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.FIFTH_TIMES, TimesByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SIXTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.SIXTH_TIMES, TimesByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SEVENTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.SEVENTH_TIMES, TimesByDate.class);
		}
	}

	private void createCardsBasedOnDate() {
		mCards = new ArrayList<Card>();
		mCards.add(createCard("Select a time", "Speak your time or swipe"));
		for(EventTime times:mEventTimes.eventTimes){
			mCards.add(createCard(formatTimeToString(times.startTime,times.endTime)));
		}
	}


	private String formatTimeToString(Long startTime, Long endTime) {
		String result = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mma");
		result = dateFormat.format(new Date(startTime))+" to "+dateFormat.format(new Date(endTime));
		return result;
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
}
