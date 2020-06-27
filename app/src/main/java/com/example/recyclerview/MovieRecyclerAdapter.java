package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MyViewHolder> {

  ArrayList<String> movieNameList;
  Context context;

    public MovieRecyclerAdapter(ArrayList<String> movieNameList,Context context) {
        this.movieNameList = movieNameList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tvMovieName.setText(movieNameList.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You clicked "+ movieNameList.get(position),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return movieNameList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvMovieName;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            tvMovieName = itemView.findViewById(R.id.tv_movie_name);
            cardView = itemView.findViewById(R.id.recycler_item_view);

        }
    }

}