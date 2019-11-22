package com.ahmed.salah.portsaiduniversity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed on 3/14/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {



    Context context;
    List<FeedItem> feedItemList=new ArrayList<>();

    public MyAdapter(Context context, List<FeedItem> feedItemList) {
        this.context = context;
        this.feedItemList = feedItemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.row_news,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final FeedItem feedItem=feedItemList.get(position);
        holder.title.setText(feedItem.getTitle());
        holder.date.setText(feedItem.getPubDate());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, News.class);
                intent.putExtra("Link", feedItem.getLink());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return feedItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,date;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            title=(TextView)itemView.findViewById(R.id.titleRec);
            date=(TextView)itemView.findViewById(R.id.daterec);
            cardView=(CardView)itemView.findViewById(R.id.mycard);

            Typeface typefaceB=Typeface.createFromAsset(context.getAssets(),"fonts/DroidKufi-Bold.ttf");
            Typeface typefaceR=Typeface.createFromAsset(context.getAssets(),"fonts/DroidKufi-Regular.ttf");


            title.setTypeface(typefaceR);
            date.setTypeface(typefaceR);



        }
    }



}
