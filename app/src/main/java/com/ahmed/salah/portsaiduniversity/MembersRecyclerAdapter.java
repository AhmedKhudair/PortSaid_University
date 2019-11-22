package com.ahmed.salah.portsaiduniversity;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Ahmed on 3/12/2018.
 */

public class MembersRecyclerAdapter extends RecyclerView.Adapter<MembersRecyclerAdapter.MyViewHolder>{

    Context context;
    List<MembersModel>membersModels=new ArrayList<>();

    public MembersRecyclerAdapter(Context context, List<MembersModel> membersModels) {
        this.context = context;
        this.membersModels = membersModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.member_row,parent,false);
        MyViewHolder members_row=new MyViewHolder(view);
        return members_row;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        MembersModel membersModel=membersModels.get(position);
        holder.Name.setText(membersModel.getName());
        holder.CollName.setText(membersModel.getCollName());
    }

    @Override
    public int getItemCount() {
        return membersModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Name,CollName;

        public MyViewHolder(View itemView) {
            super(itemView);


            Name=(TextView)itemView.findViewById(R.id.name);
            CollName=(TextView)itemView.findViewById(R.id.collName);

            Typeface typeface=Typeface.createFromAsset(context.getAssets(),"fonts/DroidKufi-Regular.ttf");

            Name.setTypeface(typeface);
            CollName.setTypeface(typeface);

        }
    }
}
