package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    EditText et1, et2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et1 = findViewById(R.id.editText3);
        et1 = findViewById(R.id.editText4);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String num1 = et1.getText().toString();
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(et2.getText().toString());
        if (v.equals(b1)) {
            int a = x + y;
            tv.setText("result" + a);

        }
        if (v.equals(b2)) {
            int b = x - y;
            tv.setText("result" + b);

        }
        if (v.equals(b3)) {
            int c = x * y;
            tv.setText("result" + c);

        }
        if (v.equals(b4)) {
            int d = x / y;
            tv.setText("result" + d);

        }

    }
}

