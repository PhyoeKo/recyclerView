package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView;
LinearLayoutManager linearLayoutManager;
MovieRecyclerAdapter movieRecyclerAdapter;

ArrayList<String> movieListData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);
        addData();
        movieRecyclerAdapter = new MovieRecyclerAdapter(movieListData,this);
        recyclerView.setAdapter(movieRecyclerAdapter);



    }
    private void addData(){
        movieListData.add("Titanic");
        movieListData.add("First Love");
        movieListData.add("MR. Bean");
        movieListData.add("Civil War");
        movieListData.add("Robot");
        movieListData.add("The White House");
        movieListData.add("Tom and Jerry");



    }

}