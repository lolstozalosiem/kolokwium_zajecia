package com.example.student.kolos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<coffee> kawki = new ArrayList<>();
        kawki.add(new coffee("latte", "12"));
        kawki.add(new coffee("czarna", "8"));
        kawki.add(new coffee("biała", "9"));
        kawki.add(new coffee("cappucino", "15"));
    }




}
