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

        //region Teeth
        ImageButton button_toothUpperFirst = (ImageButton) rootView.findViewById(R.id.imageButton1);
        ImageButton button_toothUpperSecond = (ImageButton) rootView.findViewById(R.id.imageButton2);
        ImageButton button_toothUpperThird = (ImageButton) rootView.findViewById(R.id.imageButton3);
        ImageButton button_toothUpperFourth = (ImageButton) rootView.findViewById(R.id.imageButton4);
        ImageButton button_toothUpperFifth = (ImageButton) rootView.findViewById(R.id.imageButton5);
        ImageButton button_toothUpperSixth = (ImageButton) rootView.findViewById(R.id.imageButton6);
        ImageButton button_toothUpperSeventh = (ImageButton) rootView.findViewById(R.id.imageButton7);
        ImageButton button_toothUpperEighth = (ImageButton) rootView.findViewById(R.id.imageButton8);
        ImageButton button_toothBottomFirst = (ImageButton) rootView.findViewById(R.id.imageButton9);
        ImageButton button_toothBottomSecond = (ImageButton) rootView.findViewById(R.id.imageButton10);
        ImageButton button_toothBottomThird = (ImageButton) rootView.findViewById(R.id.imageButton11);
        ImageButton button_toothBottomFourth = (ImageButton) rootView.findViewById(R.id.imageButton12);
        ImageButton button_toothBottomFifth = (ImageButton) rootView.findViewById(R.id.imageButton13);
        ImageButton button_toothBottomSixth = (ImageButton) rootView.findViewById(R.id.imageButton14);
        ImageButton button_toothBottomSeventh = (ImageButton) rootView.findViewById(R.id.imageButton15);
        ImageButton button_toothBottomEighth = (ImageButton) rootView.findViewById(R.id.imageButton16);

        //upperPart
        button_toothUpperFirst.setOnClickListener(this);
        button_toothUpperSecond.setOnClickListener(this);
        button_toothUpperThird.setOnClickListener(this);
        button_toothUpperFourth.setOnClickListener(this);
        button_toothUpperFifth.setOnClickListener(this);
        button_toothUpperSixth.setOnClickListener(this);
        button_toothUpperSeventh.setOnClickListener(this);
        button_toothUpperEighth.setOnClickListener(this);
        //bottomPart
        button_toothBottomFirst.setOnClickListener(this);
        button_toothBottomSecond.setOnClickListener(this);
        button_toothBottomThird.setOnClickListener(this);
        button_toothBottomFourth.setOnClickListener(this);
        button_toothBottomFifth.setOnClickListener(this);
        button_toothBottomSixth.setOnClickListener(this);
        button_toothBottomSeventh.setOnClickListener(this);
        button_toothBottomEighth.setOnClickListener(this);
        //endregion

        return rootView;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imageButton1:
                toothNumber = 1;
                startDialog();
                break;
            case R.id.imageButton2:
                toothNumber = 2;
                startDialog();
                break;
            case R.id.imageButton3:
                toothNumber = 3;
                startDialog();
                break;
            case R.id.imageButton4:
                toothNumber = 4;
                startDialog();
                break;
            case R.id.imageButton5:
                toothNumber = 5;
                startDialog();
                break;
            case R.id.imageButton6:
                toothNumber = 6;
                startDialog();
                break;
            case R.id.imageButton7:
                toothNumber = 7;
                startDialog();
                break;
            case R.id.imageButton8:
                toothNumber = 8;
                startDialog();
                break;
            case R.id.imageButton9:
                toothNumber = 1;
                startDialog();
                break;
            case R.id.imageButton10:
                toothNumber = 2;
                startDialog();
                break;
            case R.id.imageButton11:
                toothNumber = 3;
                startDialog();
                break;
            case R.id.imageButton12:
                toothNumber = 4;
                startDialog();
                break;
            case R.id.imageButton13:
                toothNumber = 5;
                startDialog();
                break;
            case R.id.imageButton14:
                toothNumber = 6;
                startDialog();
                break;
            case R.id.imageButton15:
                toothNumber = 7;
                startDialog();
                break;
            case R.id.imageButton16:
                toothNumber = 8;
                startDialog();
                break;
        }
    }

    private void startDialog() {
        Intent intent = new Intent(getContext(), InfoActivity.class);
        intent.putExtra("numberOfTooth", toothNumber);
        startActivity(intent);
    }


}