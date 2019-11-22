package com.ahmed.salah.portsaiduniversity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class CollegeRecyclerViewAdapter extends RecyclerView.Adapter<CollegeRecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<CollegeModel>collegeModels=new ArrayList<>();

    public CollegeRecyclerViewAdapter(Context context, List<CollegeModel> collegeModels) {
        this.context = context;
        this.collegeModels = collegeModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.college_row,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        CollegeModel collegeModel=collegeModels.get(position);

        Picasso.get().load(collegeModel.getCollImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return collegeModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView=(ImageView)itemView.findViewById(R.id.imgColl);


        }
    }
}
