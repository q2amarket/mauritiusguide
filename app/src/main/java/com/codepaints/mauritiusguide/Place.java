package com.codepaints.mauritiusguide;

import java.util.Locale;

public class Place {

    private String placeTitle;
    private String placeExcerpt;
    private int placeImage;
    private float placeRatings;
    private int placeImageLarge;

    public Place(String placeTitle, String placeExcerpt, int placeImage, float placeRatings) {
        this.placeTitle = placeTitle;
        this.placeExcerpt = placeExcerpt;
        this.placeImage = placeImage;
        this.placeRatings = placeRatings;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public void setPlaceTitle(String placeTitle) {
        this.placeTitle = placeTitle;
    }

    public String getPlaceExcerpt() {
        return placeExcerpt;
    }

    public void setPlaceExcerpt(String placeExcerpt) {
        this.placeExcerpt = placeExcerpt;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

    public String getPlaceRatings() {
        return String.format(Locale.getDefault(), "%.1f", placeRatings);
    }

    public void setPlaceRatings(float placeRatings) {
        this.placeRatings = placeRatings;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeTitle='" + placeTitle + '\'' +
                ", placeExcerpt='" + placeExcerpt + '\'' +
                ", placeImage=" + placeImage +
                ", placeRatings=" + placeRatings +
                '}';
    }
}
