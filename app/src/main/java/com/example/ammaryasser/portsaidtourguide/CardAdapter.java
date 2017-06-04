package com.example.ammaryasser.portsaidtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(@NonNull Context context, @NonNull List<Card> cards) {
        super(context, 0, cards);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View cardView = convertView;

        if (convertView == null) {
            cardView = LayoutInflater.from(getContext()).inflate(R.layout.card_view, parent, false);
        }

        Card card = getItem(position);
        ImageView image = (ImageView) cardView.findViewById(R.id.image);
        TextView title = (TextView) cardView.findViewById(R.id.title);
        TextView description = (TextView) cardView.findViewById(R.id.description);
        TextView openHours = (TextView) cardView.findViewById(R.id.openHours);

        image.setImageResource(card.getPlaceImageRId());
        title.setText(card.getPlaceName());
        description.setText(card.getPlaceDescription());
        openHours.setText("Open from" + card.getPlaceOpenTime() + "to" + card.getClass());

        return cardView;
    }
}
