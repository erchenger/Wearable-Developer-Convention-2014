package com.elliott.chenger.wearabledeveloperconference2014;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.elliott.chenger.wearabledeveloperconference2014.model.EventTime;
import com.elliott.chenger.wearabledeveloperconference2014.model.TimesByDate;
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
public class TimeActivity extends Activity{
	public static final String START_TIME = "starttime";
	public static final String END_TIME = "endtime";
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private ImpCardScrollAdapter mCardScrollAdapter;
	private Long mSelectedDate, mSelectedStartTime, mSelectedEndTime;
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
		mCardScrollView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long arg3) {
				if(position>0){
					Intent intent = new Intent(TimeActivity.this, EventActivity.class);
					mSelectedStartTime = mEventTimes.eventTimes.get(position-1).startTime;
					mSelectedEndTime = mEventTimes.eventTimes.get(position-1).endTime;
					intent.putExtra(START_TIME, mSelectedStartTime);
					intent.putExtra(END_TIME, mSelectedEndTime);
					intent.putExtra(DateActivity.DATE, mSelectedDate);
					startActivity(intent);
				}
			}
		});
		setContentView(mCardScrollView);
	}

	private void loadJson() {
		if(mSelectedDate.equals(DateConstants.MAR_FIFTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.fifthTimeBuilder(), TimesByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SIXTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.sixthTimeBuilder(), TimesByDate.class);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SEVENTH)){
			mEventTimes = mGson.fromJson(PreloadedJson.seventhTimeBuilders(), TimesByDate.class);
		}
	}

	private void createCardsBasedOnDate() {
		mCards = new ArrayList<Card>();
		mCards.add(CardUtils.createCard(this,getResources().getString(R.string.select_a_time)+getSelectedDay(), getResources().getString(R.string.swipe_message)));
		for(EventTime times:mEventTimes.eventTimes){
			mCards.add(CardUtils.createCard(this,formatTimeToString(times.startTime,times.endTime)));
		}
	}


	private String getSelectedDay() {
		if(mSelectedDate.equals(DateConstants.MAR_FIFTH)){
			return getResources().getString(R.string.wednesday);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SIXTH)){
			return getResources().getString(R.string.thursday);
		}
		else if(mSelectedDate.equals(DateConstants.MAR_SEVENTH)){
			return getResources().getString(R.string.friday);
		}
		else{
			return null;

		}
	}

	private String formatTimeToString(Long startTime, Long endTime) {
		String result = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("h:mma", Locale.US);
		result = dateFormat.format(new Date(startTime))+" to "+dateFormat.format(new Date(endTime));
		return result;
	}


}
