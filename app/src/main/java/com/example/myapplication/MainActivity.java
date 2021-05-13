package com.example.myapplication;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void onMyClick(View view)
    {

        EditText min = findViewById(R.id.min);
        EditText max = findViewById(R.id.max);

        if (min.getText().toString().equals(""))
        {
            min.setText("0");
            return;
        }
        if (max.getText().toString().equals(""))
        {
            max.setText("1000");
            return;
        }


            TextView tv = findViewById(R.id.textView);

            int ppp = Integer.parseInt(String.valueOf(min.getText()));
            int pppp = Integer.parseInt(String.valueOf(max.getText()));
            int qqq = (int) ((Math.random() * (pppp - ppp)) + ppp);
            tv.setText(Integer.toString(qqq));








    }

}