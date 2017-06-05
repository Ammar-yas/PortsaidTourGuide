package com.example.ammaryasser.portsaidtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_relax, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(R.string.resta_port_said, R.string.resta_port_said_description, 1, 23,
                R.drawable.resta_port_said));
        cards.add(new Card(R.string.doaiah_beach, R.string.doaiah_beach_description, 11, 20,
                R.drawable.doaiah_beach));


        CardAdapter cardAdapter = new CardAdapter(getContext(), cards);
        ListView listView = (ListView) getView().findViewById(R.id.relaxListView);
        listView.setAdapter(cardAdapter);
    }

}
