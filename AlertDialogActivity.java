package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    int selectedItem =-1;
ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        layout = findViewById(R.id.ashtha);
    }

    public void SimpleDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.star_big_on);
        builder.setTitle("RCPL INDIA");
        builder.setMessage("Do you want to play");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText( AlertDialogActivity.this,

                    "yes , i want to play",
                    Toast.LENGTH_SHORT).show();
                }

            });
        builder.setNeutralButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(AlertDialogActivity.this, "No , i dont want ", Toast.LENGTH_SHORT).show();
            }
            });
        builder.setNegativeButton("remind me later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(AlertDialogActivity.this, "Remind me later", Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void Singlechoice(View view) {
        final String color[]={"RED" ,"GREEN" ,"BLUE", "YELLOW"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.star_big_on);
        builder.setTitle("SELECT COLOR");
        builder.setSingleChoiceItems(color, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                selectedItem = which;
            }
          });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "Selected color:"+color[selectedItem], Toast.LENGTH_SHORT).show();
                if(selectedItem==0)
                {
                    layout.setBackgroundColor(Color.RED);
                }
                if(selectedItem==1)
                {
                    layout.setBackgroundColor(Color.GREEN);
                }
                if(selectedItem==2)
                {
                    layout.setBackgroundColor(Color.BLUE);
                }
                if(selectedItem==3)
                {
                    layout.setBackgroundColor(Color.YELLOW);
                }


            }
        });
        builder.setNeutralButton("CANCEl", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();


    }




}