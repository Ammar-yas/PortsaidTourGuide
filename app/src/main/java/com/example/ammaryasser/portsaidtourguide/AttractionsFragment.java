package com.example.ammaryasser.portsaidtourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_attractions, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(R.string.lighthouse, R.string.lighthouse_description, 9, 22,
                R.drawable.light_house));
        cards.add(new Card(R.string.museum, R.string.museum_description, 9, 22,
                R.drawable.museum));


        CardAdapter cardAdapter = new CardAdapter(getContext(), cards);
        ListView listView = (ListView) getView().findViewById(R.id.attractionsListView);
        listView.setAdapter(cardAdapter);
    }
}
