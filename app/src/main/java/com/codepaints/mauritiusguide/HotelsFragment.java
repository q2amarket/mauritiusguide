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
public class HotelsFragment extends Fragment {

    ArrayList<Place>           mHotels;
    RecyclerView               mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter       mAdapter;


    public HotelsFragment() {
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

        mHotels = new ArrayList<>();

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_a),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_hotel_a,
                R.drawable.img_hotel_large_a,
                4.6f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_b),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_hotel_b,
                R.drawable.img_hotel_large_b,
                4.1f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_c),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_hotel_c,
                R.drawable.img_hotel_large_c,
                3.3f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_d),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_hotel_d,
                R.drawable.img_hotel_large_d,
                5.0f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_e),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_hotel_e,
                R.drawable.img_hotel_large_e,
                2.8f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_f),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_hotel_f,
                R.drawable.img_hotel_large_f,
                2.3f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_g),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_hotel_g,
                R.drawable.img_hotel_large_g,
                4.9f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_h),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_hotel_h,
                R.drawable.img_hotel_large_h,
                1.6f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_i),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_hotel_i,
                R.drawable.img_hotel_large_i,
                4.8f
        ));

        mHotels.add(new Place(
                getResources().getString(R.string.hotel_j),
                getResources().getString(R.string.dummy_content_long),
                R.drawable.img_hotel_j,
                R.drawable.img_hotel_large_j,
                4.6f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(getContext(), mHotels);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
