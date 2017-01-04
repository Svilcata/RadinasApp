package com.svilcata.radinasapp;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class TabTwoPainSupress extends Fragment implements View.OnClickListener {

    int toothNumber = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_painsupress_02, container, false);
        ImageButton button_zub_one = (ImageButton) rootView.findViewById(R.id.imageButton1);
        button_zub_one.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageButton1:
                toothNumber = 1;
                Intent intent = new Intent(getContext(), InfoActivity.class);
                intent.putExtra("numberOfTooth", toothNumber);
                startActivity(intent);
                break;
        }
    }


}