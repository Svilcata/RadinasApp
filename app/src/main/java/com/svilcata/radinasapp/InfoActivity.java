package com.svilcata.radinasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textView = (TextView) findViewById(R.id.showNumberTooth);
        Intent intent = getIntent();
        int toothNumber = intent.getExtras().getInt("numberOfTooth");

        textView.setText(String.valueOf(toothNumber));

    }
}
