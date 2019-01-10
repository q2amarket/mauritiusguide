package com.codepaints.mauritiusguide;


import android.os.Bundle;
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
public class BeachsFragment extends Fragment {

    ArrayList<Place>           mPlaces;
    RecyclerView               mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter       mAdapter;


    public BeachsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mPlaces = new ArrayList<>();

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_a),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_beach_a,
                R.drawable.img_beach_large_a,
                4.9f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_b),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_beach_b,
                R.drawable.img_beach_large_b,
                3.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_c),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_beach_c,
                R.drawable.img_beach_large_c,
                3.6f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_d),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_beach_d,
                R.drawable.img_beach_large_d,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_e),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_beach_e,
                R.drawable.img_beach_large_e,
                2.9f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_f),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_beach_f,
                R.drawable.img_beach_large_f,
                4.2f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_g),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_beach_g,
                R.drawable.img_beach_large_g,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_h),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_beach_h,
                R.drawable.img_beach_large_h,
                4.9f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_i),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_beach_i,
                R.drawable.img_beach_large_i,
                2.5f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.beach_j),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_beach_j,
                R.drawable.img_beach_large_j,
                3.3f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(getContext(), mPlaces);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;

    }

}
