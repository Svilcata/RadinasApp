package com.svilcata.radinasapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by Svilcata on 07-Dec-16.
 */

public class TabOneFormula extends Fragment {

    private ArrayAdapter<CharSequence> adapter;
    private int anesthSpinnerPosition;
    private Button calculate_Btn;
    private LinearLayout formulaLayout;
    private TextView firstConstant_TxT, secondConstant_TxT, textInformation_TxT;
    private EditText weight_ET, mililit_ET;
    private double firstConstant = 0, secondConstant = 0;
    private String myEditValueAsStringOne, myEditValueAsStringTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_formula_01, container, false);
        Spinner spinnerAnesthetics = (Spinner) rootView.findViewById(R.id.spinnerOne);
        firstConstant_TxT = (TextView) rootView.findViewById(R.id.formulaFirstConstant);
        secondConstant_TxT = (TextView) rootView.findViewById(R.id.formulaSecondConstant);
        formulaLayout = (LinearLayout) rootView.findViewById(R.id.layout_formula);
        weight_ET = (EditText) rootView.findViewById(R.id.weight_EditText);
        mililit_ET = (EditText) rootView.findViewById(R.id.mililiteres_EditText);
        textInformation_TxT = (TextView) rootView.findViewById(R.id.textDisplay);

        adapter = ArrayAdapter.createFromResource(getContext(), R.array.Anesthetics, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnesthetics.setAdapter(adapter);

        spinnerAnesthetics.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TabOneFormula.this.anesthSpinnerPosition = position;

                switch (position) {
                    case 0:
                        formulaLayout.setVisibility(LinearLayout.VISIBLE);
                        firstConstant = 4.5;
                        secondConstant = 20;
                        //weight_ET.setFilters(new InputFilter[]{new CustomRangeInputFilter(0f, 66.7f)});
                        textInformation_TxT.setText(R.string.Lidocaine);
                        calculate_Btn.setText("изчисли");
                        firstConstant_TxT.setText(firstConstant + "mg/kg" + " * ");
                        secondConstant_TxT.setText(secondConstant + "mg" + " * ");
                        break;
                    case 1:
                        formulaLayout.setVisibility(LinearLayout.VISIBLE);
                        firstConstant = 7;
                        secondConstant = 20;
                        calculate_Btn.setText("изчисли");
                        firstConstant_TxT.setText(firstConstant + "mg/kg" + " * ");
                        secondConstant_TxT.setText(secondConstant + "mg" + " * ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        calculate_Btn = (Button) rootView.findViewById(R.id.calculateButton);
        calculate_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(weight_ET.getText().toString()) && TextUtils.isEmpty(mililit_ET.getText().toString())) {
                    Toast.makeText(getContext(), "празни полета", Toast.LENGTH_SHORT).show();
                } else {
                    myEditValueAsStringOne = weight_ET.getText().toString();
                    double firstValue = Double.parseDouble(myEditValueAsStringOne);
                    myEditValueAsStringTwo = mililit_ET.getText().toString();
                    double secondValue = Double.parseDouble(myEditValueAsStringTwo);
                    selectedAnesthetic(firstValue, secondValue, firstConstant, secondConstant);
                }
            }
        });


        return rootView;
    }

    private void selectedAnesthetic(double firstValue, double secondValue, double firstConstant,
                                    double secondConstant) {
        double formula = (firstConstant * firstValue) / (secondConstant * secondValue);
        DecimalFormat df = new DecimalFormat("###.#");
        String formulaAsText = String.valueOf(df.format(formula));
        calculate_Btn.setText(formulaAsText + " Броя карпули");
    }
}
