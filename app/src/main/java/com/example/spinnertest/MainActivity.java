package com.example.spinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    List<String> list;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner)findViewById(R.id.levelspinner);
        textView=(TextView)findViewById(R.id.textView);

        list=new ArrayList<String>();
        list.add("Choose Subject");
        list.add("Maths");
        list.add("Physics");
        list.add("Biology");

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    str="No Result";
                    textView.setText(str);
                    break;
                    case 1:
                        str="Maths";
                        textView.setText("My Favourite Subject is "+str);
                        break;

                    case 2:
                        str="Physics";
                        textView.setText("My Favourite Subject is "+str);
                        break;


                    case 3:
                        str="Biology";
                        textView.setText("My Favourite Subject is "+str);
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}