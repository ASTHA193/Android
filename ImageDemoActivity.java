package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ImageDemoActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton b1,b2;
    EditText et1 ,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_demo);
        b1 = findViewById(R.id.imageButton);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.imageButton3);
        b1.setOnClickListener(this);
    }
            @Override
            public void onClick (View v) {

            String num1 = et1.getText().toString();
            String num2 = et2.getText().toString();
            if(v.equals(b1))

            {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+num1));
                startActivity(i);
            }
            if(v.equals(b2))

            {
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:" +num2));
            }


        }


    }




