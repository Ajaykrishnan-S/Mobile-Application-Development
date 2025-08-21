package com.example.facebook__5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookView = findViewById(R.id.imageView);
        ImageView likeImgView = findViewById(R.id.imageView3);
        ImageView commentImgView = findViewById(R.id.imageView4);
        ImageView shareImgView = findViewById(R.id.imageView5);

        likeImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Like button");
            }
        });

        commentImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Comment button");
            }
        });

        shareImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the Share button");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
