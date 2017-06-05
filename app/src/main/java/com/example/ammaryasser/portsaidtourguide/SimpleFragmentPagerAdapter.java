package com.example.ammaryasser.portsaidtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final String TABTITLES[] = new String[]{"Attractions", "Entertain", "Relax", "Restaurants"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new EntertainFragment();
        } else if (position == 2) {
            return new RelaxFragment();
        } else {
            return new RestaurantsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TABTITLES[position];
    }
}
