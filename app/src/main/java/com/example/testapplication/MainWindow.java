package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
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

        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.images2);
        list.add(R.drawable.images3);
        ImageAdapter adapter = new ImageAdapter(this, list);
        viewPager.setAdapter(adapter);//refreshing photos

        ImageView backButton = findViewById(R.id.backButton);
        ImageView addButton = findViewById(R.id.addButton);
        ImageView menuButton = findViewById(R.id.menuButton);
        TextView text = findViewById(R.id.text);



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Integer> list = new ArrayList<>();
                list.add(R.drawable.images);
                list.add(R.drawable.images1);
                adapter.setImageList(list);
                adapter.notifyDataSetChanged();
                viewPager.setAdapter(adapter);//refreshing photos

            }
        });
    }
}