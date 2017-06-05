package com.example.ammaryasser.portsaidtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_entertain, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(R.string.karawan_cinema, R.string.karawan_cinema_description, 14, 23,
                R.drawable.karawan_cinema));
        cards.add(new Card(R.string.culture_entertainment_center,
                R.string.culture_entertainment_center_description, 18, 23,
                R.drawable.entertainment_center));


        CardAdapter cardAdapter = new CardAdapter(getContext(), cards);
        ListView listView = (ListView) getView().findViewById(R.id.entertainListView);
        listView.setAdapter(cardAdapter);
    }

}
