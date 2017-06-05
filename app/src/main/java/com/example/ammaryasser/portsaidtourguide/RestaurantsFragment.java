package com.example.ammaryasser.portsaidtourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurants, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(R.string.pizza_hut, R.string.pizza_hut_description, 9, 22,
                R.drawable.pizza_hut));
        cards.add(new Card(R.string.pizza_pino, R.string.pizza_pino_description, 9, 22,
                R.drawable.pizza_pino));


        CardAdapter cardAdapter = new CardAdapter(getContext(), cards);
        ListView listView = (ListView) getView().findViewById(R.id.restaurantsListView);
        listView.setAdapter(cardAdapter);
    }

}
