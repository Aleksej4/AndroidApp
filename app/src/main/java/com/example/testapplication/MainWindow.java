package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

        ViewPager viewPager = findViewById(R.id.images);

        ImageList imageList = new ImageList(this);
        imageList.getAdsIds();

        ImageAdapter adapter = new ImageAdapter(this, imageList.getImages());
        viewPager.setAdapter(adapter);//refreshing photos

        ImageView backButton = findViewById(R.id.backButton);
        ImageView addButton = findViewById(R.id.addButton);
        ImageView menuButton = findViewById(R.id.menuButton);
        TextView text = findViewById(R.id.adText);



        backButton.setOnClickListener(view -> finish());

        addButton.setOnClickListener(view -> {

            adapter.setImageList(imageList.getImages());
            adapter.notifyDataSetChanged();
            viewPager.setAdapter(adapter);//refreshing photos

        });
    }
}