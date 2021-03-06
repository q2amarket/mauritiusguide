package com.codepaints.mauritiusguide;


import android.content.Context;
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

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mPlaces = new ArrayList<>();

        mPlaces.add(new Place(
                getResources().getString(R.string.crystal_rock_title),
                getResources().getString(R.string.crystal_rock_content),
                R.drawable.img_crystal_rock,
                R.drawable.img_crystal_rock_large,
                4.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.garden_title),
                getResources().getString(R.string.garden_content),
                R.drawable.img_pamplemousse_garden,
                R.drawable.img_pamplemousse_garden_large,
                4.7f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.casela_title),
                getResources().getString(R.string.casela_content),
                R.drawable.img_casela,
                R.drawable.img_casela_large,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.alexandra_title),
                getResources().getString(R.string.alexandra_content),
                R.drawable.img_waterfall,
                R.drawable.img_waterfall_large,
                3.8f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.church_title),
                getResources().getString(R.string.church_content),
                R.drawable.img_church,
                R.drawable.img_church_large,
                3.2f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.seven_colors_land_title),
                getResources().getString(R.string.seven_colors_land_content),
                R.drawable.img_seven_colors_land,
                R.drawable.img_seven_colors_land_large,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.champ_de_mars_title),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_champ_de_mars,
                R.drawable.img_champ_de_mars_large,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.casela_title),
                getResources().getString(R.string.casela_content),
                R.drawable.img_casela,
                R.drawable.img_casela_large,
                5.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.caudan_title),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_caudan,
                R.drawable.img_caudan_large,
                4.5f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.albion_title),
                getResources().getString(R.string.dummy_content_short),
                R.drawable.img_light_house,
                R.drawable.img_light_house_large,
                3.0f
        ));

        mPlaces.add(new Place(
                getResources().getString(R.string.le_morne_title),
                getResources().getString(R.string.dummy_content_medium),
                R.drawable.img_le_morne,
                R.drawable.img_le_morne_large,
                4.8f
        ));

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new PlacesAdapter(getContext(), mPlaces);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;

    }

}
