package com.example.mystoryapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
   private final String [] data;
   private RecyclerViewClickInterface recyclerViewClickInterface;

    public CustomAdapter(String[] data , RecyclerViewClickInterface recyclerViewClickInterface) {
        this.data = data;
        this.recyclerViewClickInterface = recyclerViewClickInterface;


    }
//   public CustomAdapter(String [] data , Context context){
//     this.data = data;
//     this.context = context;
//
// }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row,parent,false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle.setText(title);



    }
    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class CustomViewHolder extends RecyclerView.ViewHolder{
    TextView  txtTitle;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        txtTitle = itemView.findViewById(R.id.rowtxt);
       itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               recyclerViewClickInterface.onItemClick(getAdapterPosition());
           }
       });
    }
}


}
