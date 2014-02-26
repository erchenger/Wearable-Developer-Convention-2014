package com.elliott.chenger.wearabledeveloperconference2014;

import java.util.List;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollView;
import com.google.gson.Gson;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author elliott chenger
 *
 */
public class EventActivity extends Activity{
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private ImpCardScrollAdapter mCardScrollAdapter;
	private Gson mGson;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mGson = new Gson();
		getIntent().getExtras().getLong(TimeActivity.START_TIME);
		loadJson();
		createCardsBasedOnTime();
		
		mCardScrollView = new CardScrollView(this);
		mCardScrollAdapter = new ImpCardScrollAdapter(mCards);
		mCardScrollView.setAdapter(mCardScrollAdapter);
		mCardScrollView.activate();
		setContentView(mCardScrollView);
	}

	private void createCardsBasedOnTime() {
		// TODO Auto-generated method stub
		
	}

	private void loadJson() {
		// TODO Auto-generated method stub
		
	}
}
