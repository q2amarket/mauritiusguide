package com.codepaints.mauritiusguide;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder> {

    private List<Place> mPlaces;
    private Context     mContext;

    public PlacesAdapter(Context context, List<Place> mPlaces) {

        this.mPlaces = mPlaces;
        this.mContext = context;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_list_item, viewGroup, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlacesViewHolder viewHolder, int i) {

        final Place place = mPlaces.get(i);

        viewHolder.itemHeading.setText(place.getPlaceTitle());
        viewHolder.itemExcerpt.setText(place.getPlaceExcerpt());
        viewHolder.itemRatings.setText(place.getPlaceRatings());
        viewHolder.itemRatingBar.setRating(Float.parseFloat(place.getPlaceRatings()));
        viewHolder.itemImage.setImageResource(place.getPlaceImage());

        viewHolder.itemCardVIew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, place.getPlaceTitle(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, PlaceActivity.class);
                intent.putExtra("place_image", place.getPlaceImageLarge());
                intent.putExtra("place_heading", place.getPlaceTitle());
                intent.putExtra("place_content", place.getPlaceExcerpt());
                intent.putExtra("place_ratings", place.getPlaceRatings());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public class PlacesViewHolder extends RecyclerView.ViewHolder {

        public TextView  itemHeading;
        public TextView  itemExcerpt;
        public ImageView itemImage;
        public TextView  itemRatings;
        public RatingBar itemRatingBar;
        public CardView  itemCardVIew;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);

            itemHeading = itemView.findViewById(R.id.place_item_heading);
            itemExcerpt = itemView.findViewById(R.id.place_item_excerpt);
            itemRatings = itemView.findViewById(R.id.place_item_rating_text);
            itemRatingBar = itemView.findViewById(R.id.place_item_rating_bar);
            itemImage = itemView.findViewById(R.id.place_item_image);
            itemCardVIew = itemView.findViewById(R.id.place_card_view);
        }
    }
}
