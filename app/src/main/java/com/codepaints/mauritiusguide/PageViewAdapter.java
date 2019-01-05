package com.codepaints.mauritiusguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PageViewAdapter extends FragmentPagerAdapter {

    private String tabTitle[] = new String[] {"Places", "Hotels", "Restaurants"};

    public PageViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0) {
            return new PlacesFragment();
        } else if (i == 1) {
            return new HotelsFragment();
        } else if (i == 2) {
            return new RestaurantsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
