package com.example.android.quakereport;

import android.net.Uri;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Tyler on 9/9/2017.
 */

public class Earthquake {
    // Create a fake list of earthquake locations.
    private double magnitude;
    private String location;
    private String locationOffset;
    private long mTimeInMilliseconds;
    private String date;
    private String urlString;


    public Earthquake(double magnitude, String initialLocation, long mTimeInMilliseconds, String urlString) {
        //initialize earthquake info
        this.magnitude = magnitude;
        if(initialLocation.contains("of")==false) {
            this.locationOffset = "Near the ";
            this.location = "Pacific-Antarctic Ridge";
        }
        else {
            this.locationOffset = initialLocation.substring(0, initialLocation.indexOf("of")+2);
            this.location = initialLocation.substring(initialLocation.indexOf("of") + 2);
        }
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        date = dateFormatter.format(mTimeInMilliseconds);
        this.urlString = urlString;
    }

    public double getMagnitude(){
        return magnitude;
    }

    public String getLocation(){
        return location;
    }

    public String getLocationOffset(){
        return locationOffset;
    }

    public String getDate(){
        return date;
    }

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}

    public String getUrl(){return urlString;}



}
