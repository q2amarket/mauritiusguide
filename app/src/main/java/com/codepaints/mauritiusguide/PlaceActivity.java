package com.codepaints.mauritiusguide;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    private static final String TAG = "PlaceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        getIncomingIntent();
    }

    private void getIncomingIntent() {

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {

            if (intent.hasExtra("place_image") && intent.hasExtra("place_heading") && intent.hasExtra("place_content")) {
                int    placeImage   = bundle.getInt("place_image");
                String placeHeading = bundle.getString("place_heading");
                String placeContent = bundle.getString("place_content");
                String placeRatingsText = bundle.getString("place_ratings");

                setActivityData(placeImage, placeHeading, placeContent, placeRatingsText);
            }
        }
    }

    private void setActivityData(int imageResource, String headingText, String contentText, String placeRatings) {
        ImageView placeImage   = findViewById(R.id.place_single_image);
        TextView  placeContent = findViewById(R.id.place_single_content);
        TextView placeRatingsText = findViewById(R.id.place_single_rating_text);
        RatingBar placeRatingBar = findViewById(R.id.place_single_ratingBar);

        placeImage.setImageResource(imageResource);
        placeContent.setText(contentText);
        placeRatingsText.setText(placeRatings);
        placeRatingBar.setRating(Float.parseFloat(placeRatings));

        Toolbar toolbar = findViewById(R.id.place_single_appbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            // set back arrow with color
            final Drawable upArrow = getResources().getDrawable(R.drawable.ic_arrow_back_white);
            upArrow.setColorFilter(getResources().getColor(R.color.colorWhite), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
        }

        toolbar.setTitle(headingText);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
