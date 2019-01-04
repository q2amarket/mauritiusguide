package com.codepaints.mauritiusguide;

import android.content.Context;


public class Utils {
    private Context context;

    public Utils(Context context) {
        this.context = context;
    }

    public String getStringItem(String resource) {
        String packageName = context.getPackageName();
        int    resId       = context.getResources().getIdentifier(resource, "string", packageName);
        return context.getString(resId);
    }

    public int getDrawableItem(String resource, boolean list) {
        String prefix = "";
        if (list) {
            prefix = "img_";
        }
        String packageName = context.getPackageName();
        return context.getResources().getIdentifier(prefix + resource, "drawable", packageName);
    }
}
