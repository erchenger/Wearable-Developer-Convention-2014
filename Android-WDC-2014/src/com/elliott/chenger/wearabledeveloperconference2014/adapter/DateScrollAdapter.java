package com.elliott.chenger.wearabledeveloperconference2014.adapter;

import java.util.List;

import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollAdapter;

public class DateScrollAdapter extends CardScrollAdapter{
	private List<Card> mCards;
	
	public DateScrollAdapter(List<Card> cards){
		mCards = cards;
	}
	
	@Override
	public int findIdPosition(Object id) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int findItemPosition(Object item) {
		return mCards.indexOf(item);
	}

	@Override
	public int getCount() {
		return mCards.size();
	}

	@Override
	public Object getItem(int location) {
		return mCards.get(location);
	}

	@Override
	public View getView(int location, View convertView, ViewGroup parent) {
		return mCards.get(location).toView();
	}

}
