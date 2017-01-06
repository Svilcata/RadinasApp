package com.svilcata.radinasapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_info);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        textView = (TextView) findViewById(R.id.showNumberTooth);
        textView1 = (TextView) findViewById(R.id.showTextForNumberTooth);

        Intent intent = getIntent();
        int toothNumber = intent.getExtras().getInt("numberOfTooth");

        textView.setText(String.valueOf(toothNumber));

        switch (toothNumber) {
            case 0:
                textView1.setText(R.string.calculate);
            case 1:
                textView1.setText(R.string.chooseTooth);
                break;
        }


    }
}
