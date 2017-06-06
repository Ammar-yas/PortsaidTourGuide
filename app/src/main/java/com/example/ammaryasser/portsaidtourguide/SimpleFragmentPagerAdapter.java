package com.example.ammaryasser.portsaidtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    String tabTitles[] = new String[4];

    SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles[0] = context.getString(R.string.attractions);
        tabTitles[1] = context.getString(R.string.entertain);
        tabTitles[2] = context.getString(R.string.relax);
        tabTitles[3] = context.getString(R.string.restaurants);
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
        return tabTitles[position];
    }
}
