package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu2Activity extends ListActivity {
    String[] hello ={"MAIN ACTIVITY"  ,"EXIT"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1,hello);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i= null;
        if(position == 0)
        {

           i  =new Intent  (this,MainActivity.class);
        }

        if(position == 1)
        {
            finish();
        }
        startActivity(i);
        Toast.makeText(this,"Clicked On :"+hello[position] ,Toast.LENGTH_LONG).show();

    }
}
