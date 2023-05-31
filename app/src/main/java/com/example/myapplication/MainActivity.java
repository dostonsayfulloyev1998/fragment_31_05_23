package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.fr1);
        btn2 = findViewById(R.id.fr2);
        btn3 = findViewById(R.id.fr3);

        btn1.setOnClickListener(v -> {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.container,new FirstFragment());
            ft.addToBackStack(null);
            ft.commit();


        });

        btn2.setOnClickListener(v -> {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.container,new SecondFragment());
            ft.addToBackStack(null);
            ft.commit();

        });

        btn3.setOnClickListener(v -> {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.container,new ThirdFragment());
            ft.addToBackStack(null);
            ft.commit();

        });
    }
}