package com.conversionic.metrique;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class weight extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);
        Button button = findViewById(R.id.Convert);
        Spinner spinner = findViewById(R.id.tunit_spinner);
        Spinner tspinner = findViewById(R.id.unit_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Weight, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        tspinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(weight.this, "select default and target units",Toast.LENGTH_SHORT).show();
    }
    public void calculate(){
        EditText value = findViewById(R.id.value);
        TextView result = findViewById(R.id.result);
        Spinner spinner = findViewById(R.id.tunit_spinner);
        Spinner tspinner = findViewById(R.id.unit_spinner);
        String s = value.getText().toString();
        double val1 = Double.parseDouble(s);
        int index=spinner.getSelectedItemPosition();
        int index1=tspinner.getSelectedItemPosition();
        double res = 0;
        if(index==0 && index1==1){
            res=val1/1000;
        } else if (index==0&&index1==2) {
            res=val1/453.6;
        } else if (index==1&&index1==0) {
            res=val1*1000;
        } else if (index==1&&index1==2) {
            res=val1*2.205;
        } else if (index==2&&index1==1) {
            res=val1/2.205;
        } else if (index==2&&index1==0) {
            res=val1*453.6;
        } else{
            res=val1;
            Toast.makeText(weight.this, "reconfirm units",Toast.LENGTH_SHORT).show();
        }
        result.setText("The converted value is "+res);

    }
}
