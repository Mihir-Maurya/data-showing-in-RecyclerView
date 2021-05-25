package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity { //implements SelectionListener
     RecyclerView rc;
//     CustomAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rc  = findViewById(R.id.recycleview);
           rc.setLayoutManager(new LinearLayoutManager(this));
         String [] storyName = getResources().getStringArray(R.array.stories_names);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,)
         rc.setAdapter(new CustomAdapter(storyName)); //,this
//         mAdapter.setOnItemClickListner(new CustomAdapter.OnItemClickListener() {
//             @Override
//             public void onItemClick(int position) {
//                 Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                 intent.putExtra("story key",position);
//                 startActivity(intent);
//             }
//         });
    }

//    @Override
//    public void onFruitSelection(String FruitName) {
//
//    }
}