package com.codepaints.mauritiusguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    ArrayList<Place>           mRestaurants;
    RecyclerView               mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter       mAdapter;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mRestaurants = new ArrayList<>();

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_a),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_restaurant_a,
                R.drawable.img_restaurant_large_a,
                3.8f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_b),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_restaurant_b,
                R.drawable.img_restaurant_large_b,
                2.9f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_c),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_restaurant_c,
                R.drawable.img_restaurant_large_c,
                4.9f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_d),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_restaurant_d,
                R.drawable.img_restaurant_large_d,
                5.0f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_e),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_restaurant_e,
                R.drawable.img_restaurant_large_e,
                3.6f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_f),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_restaurant_f,
                R.drawable.img_restaurant_large_f,
                4.5f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_g),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_restaurant_g,
                R.drawable.img_restaurant_large_g,
                4.7f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_h),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_restaurant_h,
                R.drawable.img_restaurant_large_h,
                1.6f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_i),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_restaurant_i,
                R.drawable.img_restaurant_large_i,
                3.0f
        ));

        mRestaurants.add(new Place(
                getResources().getString(R.string.restaurant_j),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_restaurant_j,
                R.drawable.img_restaurant_large_j,
                4.2f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(getContext(), mRestaurants);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}