package com.example.catchphraseassgn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView. Adapter progadapter;
ArrayList<String> items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items=new ArrayList<>();
        items.add("First CardView Item");
        items.add("Sec.CardView Item");
        items.add("Third CardView Item");
        items.add("Fourth CardView Item");
        items.add("Fivth CardView Item");

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        progadapter=new Programadapter(this,items);
        recyclerView.setAdapter(progadapter);//attach adapter with rec.view






    }
}