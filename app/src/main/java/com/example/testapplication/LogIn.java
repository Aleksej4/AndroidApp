package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void logIn(View view) {
        TextView password = findViewById(R.id.password);
        TextView email = findViewById(R.id.email);
        ImageView emailWarning = findViewById(R.id.email_empty);
        ImageView passwordWarning = findViewById(R.id.password_empty);

        if(isEmpty(email)){
            setColorRed(emailWarning);
        }else if (!isEmpty(email)) {
            setColorAccent(emailWarning);
        }
        if(isEmpty(password)){
            setColorRed(passwordWarning);
        } else if (!isEmpty(password)) {
            setColorAccent(passwordWarning);
        }
        if(!isEmpty(email) && !isEmpty(password)){
            startActivity(new Intent(LogIn.this, MainWindow.class));
        }
    }

    private boolean isEmpty(TextView text){
            return TextUtils.isEmpty(text.getText().toString());
    }

    private void setColorRed(ImageView image){
        image.setColorFilter(Color.argb(255, 255, 0, 0));
    }

    private void setColorAccent(ImageView image){
        image.setColorFilter(Color.argb(255, 244, 247, 251));
    }
}