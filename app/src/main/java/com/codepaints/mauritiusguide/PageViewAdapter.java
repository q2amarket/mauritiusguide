package com.codepaints.mauritiusguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PageViewAdapter extends FragmentPagerAdapter {

    private Context context;

    private String tabTitle[];

    public PageViewAdapter(FragmentManager fm, Context context) {

        super(fm);
        this.context = context;

        // setting tab titles/labels
        tabTitle = new String[]{
                this.context.getResources().getString(R.string.tab_label_places),
                this.context.getResources().getString(R.string.tab_label_hotels),
                this.context.getResources().getString(R.string.tab_label_restaurants),
                this.context.getResources().getString(R.string.tab_label_beaches),
                this.context.getResources().getString(R.string.tab_label_shopping),
        };
    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0) {
            return new PlacesFragment();
        } else if (i == 1) {
            return new HotelsFragment();
        } else if (i == 2) {
            return new RestaurantsFragment();
        } else if (i == 3) {
            return new BeachsFragment();
        } else if (i == 4) {
            return new ShoppingsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

}
