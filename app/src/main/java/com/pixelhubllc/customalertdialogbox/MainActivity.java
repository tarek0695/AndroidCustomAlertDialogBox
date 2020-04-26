package com.pixelhubllc.customalertdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.SQLException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView alertTv = findViewById(R.id.alert_tv);

        alertTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog builder = new AlertDialog.Builder(MainActivity.this).create();
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_layout, null);

                TextView canceTv, clearTv;
                canceTv = view.findViewById(R.id.cancel_tv);
                clearTv = view.findViewById(R.id.clear_tv);

                canceTv.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   Toast.makeText(MainActivity.this, "Cancel Clicked!", Toast.LENGTH_SHORT).show();
                                                   builder.dismiss();
                                               }
                                           }
                );

                clearTv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Clear clicked!", Toast.LENGTH_SHORT).show();
                        builder.dismiss();
                    }
                });

                builder.setView(view);
                builder.show();
            }
        });
    }
}
