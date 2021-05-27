package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickInterface {
     RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rc  = findViewById(R.id.recycleview);
//
         String [] storyName = getResources().getStringArray(R.array.stories_names);
        CustomAdapter mAdapter = new CustomAdapter(storyName,this);
        rc.setLayoutManager(new LinearLayoutManager(this));
         rc.setAdapter(mAdapter);


    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("story key",position);
        startActivity(intent);
    }
}