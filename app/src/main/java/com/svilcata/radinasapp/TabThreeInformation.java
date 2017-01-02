package com.svilcata.radinasapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Svilcata on 07-Dec-16.
 */

public class TabThreeInformation extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_information_03, container, false);
        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.setType("message/plain");
                Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"svilen.strahilov19@gmail.com"});
                startActivity(Intent.createChooser(Email, "Send Feedback: "));
            }
        });

        return rootView;
    }
}
