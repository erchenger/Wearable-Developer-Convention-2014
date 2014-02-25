package com.elliott.chenger.wearabledeveloperconference2014;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.DateScrollAdapter;
import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollView;

public class DateActivity extends Activity {
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private DateScrollAdapter mCardScrollAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		createCards();
		
		mCardScrollView = new CardScrollView(this);
		mCardScrollAdapter = new DateScrollAdapter(mCards);
		mCardScrollView.setAdapter(mCardScrollAdapter);
		mCardScrollView.activate();
		mCardScrollView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent = new Intent(DateActivity.this, TimeActivity.class);
				startActivity(intent);
			}
		});
		setContentView(mCardScrollView);
	}

	private void createCards(){
		mCards = new ArrayList<Card>();
		mCards.add(createCard("Swipe to a date or just say it!"));
		mCards.add(createCard("March 5th"));
		mCards.add(createCard("March 6th"));
		mCards.add(createCard("March 7th"));
	}

	private Card createCard(String text) {
		Card card;
		card = new Card(this);
		card.setText(text);
		return card;
	}
	
}
