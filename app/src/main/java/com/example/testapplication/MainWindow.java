package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

        ViewPager viewPager = findViewById(R.id.images);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        ImageView backButton = findViewById(R.id.backButton);
        ImageView menuButton = findViewById(R.id.menuButton);
        TextView text = findViewById(R.id.text);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}