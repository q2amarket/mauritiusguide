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
                3.8f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(getContext(), mRestaurants);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}