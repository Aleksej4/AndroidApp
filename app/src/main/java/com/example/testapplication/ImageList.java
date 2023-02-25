package com.example.testapplication;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImageList {
    private static List<String> adIds;//stores all given ids
    private final Context context;
    public ImageList(Context context){
        this.context = context;
    }

    public void getAdsIds(){
        adIds = new ArrayList<>();
        adIds.add("1");//test
        adIds.add("2");//test
        adIds.add("3");//test
    }//will get ids from database

    public List<Integer> getImages(){//will get images from database by given specific id

        if (adIds.isEmpty()){
            CharSequence text = "Too fast, you checked all ads";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            getAdsIds();
        }
        List<Integer> images = new ArrayList<>();

        String adId = getRandomElement();

        switch (adId) {
            case "1":
                images.add(R.drawable.five);
                break;
            case "2":
                images.add(R.drawable.);
                images.add(R.drawable);
                break;
            case "3":
                images.add(R.drawable.images3);
                break;
        }
        adIds.remove(adId);
        return images;

    }
    public String getRandomElement()
    {
        Random r = new Random();

        int randomItem = r.nextInt(adIds.size());
        return  adIds.get(randomItem);
    }
}
