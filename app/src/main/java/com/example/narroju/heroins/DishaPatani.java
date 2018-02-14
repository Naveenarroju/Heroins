package com.example.narroju.heroins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class DishaPatani extends MainActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disha_patani);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = intent.getStringExtra(dishaBaby(null).EXTRA_MESSAGE);
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

         TextView text = (TextView) findViewById(R.id.Disha_Button);

        text.setText(message);

    }
}
