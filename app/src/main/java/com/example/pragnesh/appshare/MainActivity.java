package com.example.pragnesh.appshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share = findViewById(R.id.sharebtn);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareContent = "I like to use SISSU. It's very easy to use and incredible. You should also download from here: YOUR APP LINK #APP_NAME ";
            String shareTitle = "SISSU";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareTitle);
            shareIntent.putExtra(Intent.EXTRA_TEXT,shareContent);
            startActivity(Intent.createChooser(shareIntent,"Share via"));
            }
        });
    }
}
