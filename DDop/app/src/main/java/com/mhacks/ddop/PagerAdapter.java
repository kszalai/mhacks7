package com.mhacks.ddop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kielzucchini on 2/20/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm){
        super(fm);
    }

    //Gets the Fragment we need
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 0:
                fragment = MainFragment.newInstance(position);
                break;
            case 1:
                fragment = SecondFragment.newInstance(position);
                break;
            case 2:
                fragment = ThirdFragment.newInstance(position);
                break;
            case 3:
                fragment = FourthFragment.newInstance(position);
                break;
        }

        return fragment;
    }

    //Gets how many fragments we have total in the app
    @Override
    public int getCount() {
        return 4;
    }

    //Contains the titles to each of the tabs
    @Override
    public CharSequence getPageTitle(int position) {
        String sectionTitle = "";
        switch (position){
            case 0:
                sectionTitle = "Tab1";
                break;
            case 1:
                sectionTitle = "Tab2";
                break;
            case 2:
                sectionTitle = "Tab3";
                break;
            case 3:
                sectionTitle = "Tab4";
                break;
        }
        return sectionTitle;
    }
}
