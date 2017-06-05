package com.example.ammaryasser.portsaidtourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.mainActivityViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.mainActivityTabs);
        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(simpleFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
