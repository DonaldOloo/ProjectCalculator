package com.example.projectcalculatordon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myButton (View view){

        EditText number1 = (EditText) findViewById(R.id.editText) ;
        
         EditText number2 = (EditText) findViewById(R.id.editText2) ;
         
        TextView Display = (TextView) findViewById(R.id.textView2) ;

        int editTextNumber1 =Integer.parseInt(number1.getText().toString());

        int editTextNumber2 =Integer.parseInt(number2.getText().toString());

        int results = editTextNumber1 + editTextNumber2 ;

        Display.setText(results + "");



    }



}
