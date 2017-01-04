package com.svilcata.radinasapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class TabTwoPainSupress extends Fragment implements View.OnClickListener {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_painsupress_02, container, false);
            ImageButton button_zub_one = (ImageButton) rootView.findViewById(R.id.imageButton1);
            button_zub_one.setOnClickListener(this);

            return rootView;
        }



        @Override
        public void onClick(View view) {
            MyDialogFragment myDialogFragment = new MyDialogFragment();
            switch (view.getId()) {
                case R.id.imageButton1:

                    break;

            }
        }
    }
