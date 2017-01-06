package com.svilcata.radinasapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Svilcata on 07-Dec-16.
 */

public class TabThreeInformation extends Fragment {

    private ArrayAdapter<CharSequence> adapter2;
    private int techniqueSpinnerPosition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_information_03, container, false);

        Spinner spinnerTechniques = (Spinner) rootView.findViewById(R.id.SpinnerTwo);
        adapter2 = ArrayAdapter.createFromResource(getContext(), R.array.Anesthetics, android.R.layout.simple_spinner_item);
        spinnerTechniques.setAdapter(adapter2);

        spinnerTechniques.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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
