package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckBoxDemoActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    CheckBox ch1,ch2,ch3,ch4;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_demo);
        tv1 = findViewById(R.id.textView6);
        b1 = findViewById(R.id.button1);
        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);
        b1.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        ArrayList a1=new ArrayList();
        if(ch1.isChecked())
        {
            a1.add(ch1.getText().toString());
        }
        if(ch2.isChecked())
        {
            a1.add(ch2.getText().toString());
        }
        if(ch3.isChecked())
        {
            a1.add(ch3.getText().toString());
        }
        if(ch4.isChecked())
        {
            a1.add(ch4.getText().toString());
        }
        tv1.setText("SELECTED :"+ a1);
    }
}
