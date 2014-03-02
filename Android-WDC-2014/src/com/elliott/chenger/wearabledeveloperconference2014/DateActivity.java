package com.elliott.chenger.wearabledeveloperconference2014;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.elliott.chenger.wearabledeveloperconference2014.adapter.ImpCardScrollAdapter;
import com.elliott.chenger.wearabledeveloperconference2014.utils.CardUtils;
import com.elliott.chenger.wearabledeveloperconference2014.utils.DateConstants;
import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollView;

/**
 * @author elliott chenger
 *
 */
public class DateActivity extends Activity {
	public static final String DATE = "date";
	private List<Card> mCards;
	private CardScrollView mCardScrollView;
	private ImpCardScrollAdapter mCardScrollAdapter;
	private Date mCurrentDate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		createCards();

		mCardScrollView = new CardScrollView(this);
		mCardScrollAdapter = new ImpCardScrollAdapter(mCards);
		mCardScrollView.setAdapter(mCardScrollAdapter);
		mCardScrollView.activate();
		mCardScrollView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position,
					long arg3) {
				if(position<3){
					Intent intent = new Intent(DateActivity.this, TimeActivity.class);
					Long selectedDate = 0L;
					switch(position){
					case 0:
						selectedDate= DateConstants.MAR_FIFTH;
						break;
					case 1:
						selectedDate= DateConstants.MAR_SIXTH;
						break;
					case 2:
						selectedDate= DateConstants.MAR_SEVENTH; 			
						break;
					default:
						break;
					}
					intent.putExtra(DATE, selectedDate);
					startActivity(intent);
				}
			}
		});
		setContentView(mCardScrollView);
	}

	private void createCards(){
		mCurrentDate = new Date(System.currentTimeMillis());
		mCards = new ArrayList<Card>();
		if(mCurrentDate.before(new Date(DateConstants.MAR_FIFTH)))
			mCards.add(CardUtils.createCard(this,"Wednesday, March 5th"));
		if(mCurrentDate.before(new Date(DateConstants.MAR_SIXTH)))
			mCards.add(CardUtils.createCard(this,"Thursday, March 6th"));
		if(mCurrentDate.before(new Date(DateConstants.MAR_SEVENTH)))
			mCards.add(CardUtils.createCard(this,"Friday, March 7th"));
		
		mCards.add(CardUtils.createCard(this,"The WDC Schedule Glassware was expertly crafted by Elliott Chenger from Mutual Mobile", "Twitter: @echenger", R.drawable.elliott_chenger));
	}

}
