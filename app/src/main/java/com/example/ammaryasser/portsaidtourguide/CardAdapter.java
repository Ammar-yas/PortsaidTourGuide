package com.example.ammaryasser.portsaidtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(@NonNull Context context, @NonNull List<Card> cards) {
        super(context, 0, cards);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View cardView = convertView;

        if ( convertView == null ){
            cardView = LayoutInflater.from(getContext()).inflate(R.layout.card_view, parent, false);
        }

        Card card = getItem(position);

        //TODO: link the card View with the card class then then return the cardView variable

        return super.getView(position, convertView, parent);
    }
}
