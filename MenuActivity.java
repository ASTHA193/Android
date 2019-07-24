package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MenuActivity extends ListActivity {
    String[] frnds ={"alok" ,"anup" , "deepak" ,"jeet" , "somu" ,"EXIT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1,frnds);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(frnds[position].equals("EXIT"))
        {
        finish();
        }
        Toast.makeText(this,"Clicked On :"+frnds[position] ,Toast.LENGTH_LONG).show();
    }
}
