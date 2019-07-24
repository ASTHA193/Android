package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class AutoActivity extends AppCompatActivity implements View.OnClickListener {
    AutoCompleteTextView auto;
    String[] arr = {"abhishek" ," abhi" ,"abhinandan" ,"alok" ,"abhishesh" ,"abhinash"};
    EditText et1, et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        auto= findViewById(R.id.autoCompleteTextView);
        et1 = findViewById(R.id.editText5);
        et2 = findViewById(R.id.editText6);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        auto.setAdapter(adapter);
        et1.setOnClickListener(this);
        et2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==et1)
        {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            MyDate mydate = new MyDate();
            DatePickerDialog dp = new DatePickerDialog(this,mydate ,year,month,day);
            dp.show();

        }
        else
        {
            MyTime mytime = new MyTime();
            Date d =new Date();
            int hr=d.getHours();
            int min = d.getMinutes();
            TimePickerDialog td = new TimePickerDialog(this,mytime,hr,min,true);
            td.show();
        }

    }

    private class MyDate implements DatePickerDialog.OnDateSetListener {

        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            String data =i+"/"+(i1+1)+"/"+i2;
            et1.setText(data);
        }
    }

    private class MyTime implements TimePickerDialog.OnTimeSetListener {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            String data =i+" : "+i1;
            et2.setText(data);
        }
    }
}
