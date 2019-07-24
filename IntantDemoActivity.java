package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IntantDemoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] screen={"CALL" ,"SMS" ,"WEB" ,"MAP" ,"CONTACT" ,"FINISH"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intant_demo);
        lv = findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1,screen);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,"Clicked On :"+screen[i] ,Toast.LENGTH_LONG).show();
        Intent intent =null;
        if(i==0)
        {
        intent  = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9430210694"));

    }
        else if(i==1) {

            intent = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9430210694"));
            intent.putExtra("sms_body" ,"it is developed by ASTHA");
        }
        else if(i==2)
        {
            intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.rcplindia.in"));

        }
        if(i==3)
        {
            intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo: 27.1750 , 78.0422"));

        }
        if(i==4)
        {
            intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));

        }
        startActivity(intent);
        }

}
