package com.example.vitomisur.praguetour;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // creating the array of icons for the tabs
    private int[] imageResId = {
            R.drawable.ic_visibility_white_24dp,
            R.drawable.ic_restaurant_white_24dp,
            R.drawable.ic_local_bar_white_24dp,
            R.drawable.ic_hotel_white_24dp
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // get & set viewpager(allows to scroll through the tabs(fragments))
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        // get & set tablayout
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        // setup viewpager for tablayout
        tabLayout.setupWithViewPager(viewPager);
        //set up the icons for each tab
        for (int i = 0; i < imageResId.length; i++) {
            tabLayout.getTabAt(i).setIcon(imageResId[i]);
        }
    }
}
