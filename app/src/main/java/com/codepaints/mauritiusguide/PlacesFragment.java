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
public class PlacesFragment extends Fragment {

    ArrayList<Place>           mPlaces;
    RecyclerView               mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter       mAdapter;


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_places, container, false);

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mPlaces = new ArrayList<>();

        mPlaces.add(new Place(
                "Ganga Talao",
                "One of the most sacrade place of Mauritius lies on the higher platu of the island. This is the must visit place.",
                0,
                4.3f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(mPlaces);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;

    }

}
