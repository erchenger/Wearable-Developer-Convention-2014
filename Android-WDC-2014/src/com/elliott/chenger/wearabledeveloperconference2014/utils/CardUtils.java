package com.elliott.chenger.wearabledeveloperconference2014.utils;

import android.content.Context;

import com.google.android.glass.app.Card;

public class CardUtils {

	public static Card createCard(Context context, String text) {
		Card card;
		card = new Card(context);
		card.setText(text);
		return card;
	}
	public static Card createCard(Context context,String text, String footerText){
		Card card;
		card = new Card(context);
		card.setText(text);
		card.setFootnote(footerText);
		return card;
	}
	public static Card createCard(Context context,String text, String footerText,int imageId){
		Card card;
		card = new Card(context);
		card.setText(text);
		card.setFootnote(footerText);
		card.addImage(imageId);
		return card;
	}
}
