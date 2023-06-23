package com.example.my_application;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;//  for plain text
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class UnitConverter extends AppCompatActivity {
    private Button button;
    private EditText edittext;
    private TextView textview, textview1;// all these are objects

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView);
        edittext=findViewById(R.id.editTextText2);
        textview1=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(UnitConverter.this, "hi click listener worked!", Toast.LENGTH_SHORT).show(); // toast appears once button is clicked
                String s=edittext.getText().toString(); // getting the no we put in kg in form of string
                int kg=Integer.parseInt(s); // converting the string into integer
                double pound=kg*2.205; // converting into pound
                textview1.setText("The corresponding value in pound is "+pound);
            }
        });
    }
}