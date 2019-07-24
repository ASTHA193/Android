package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    RadioGroup rg;
    Button btn;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rg= findViewById(R.id.radioGroup);
        btn =findViewById(R.id.button5);
        tv= findViewById(R.id.textView4);

        rg.setOnCheckedChangeListener(this);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        rg.clearCheck();
        tv.setText("SELECTED :");
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        String branch=" ";
        switch(i)
        {
            case R.id.radioButton:
                branch="comp sc.";
                break;
            case R.id.radioButton2:
                branch="mechanical";
                break;
            case R.id.radioButton4:
                branch="info  tech";
                break;
            case R.id.radioButton3:
                branch="electronics";
                break;

        }
    tv.setText("SELECTED :" +branch);
    }
}
