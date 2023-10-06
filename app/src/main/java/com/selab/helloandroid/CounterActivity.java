package com.selab.helloandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        TextView tvNumber=(TextView) findViewById(R.id.textView_number);

        Button btnAdd = (Button) findViewById(R.id.button_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumber.setText(String.valueOf(Integer.parseInt(tvNumber.getText().toString())+1));
            }
        });

        Button btnReduce = (Button) findViewById(R.id.button_reduce);
        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumber.setText(String.valueOf(Integer.parseInt(tvNumber.getText().toString())-1));
            }
        });

        Button btnClear = (Button) findViewById(R.id.button_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNumber.setText(String.valueOf(0));
            }
        });
    }
}