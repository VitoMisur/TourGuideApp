package com.example.vitomisur.praguetour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
    }

    // returning the fragment by the position
    // *to know what fragment to load in the tab
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new SightseeingFragment();
            case 1: return new RestaurantsFragment();
            case 2: return new BarsFragment();
            case 3: return new HotelsFragment();
            default: return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
    //returns the amount of fragments in the apk
    @Override
    public int getCount() {
        return 4;
    }
}
