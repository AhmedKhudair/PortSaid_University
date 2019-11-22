package com.ahmed.salah.portsaiduniversity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed on 3/12/2018.
 */

public class Members extends android.support.v4.app.Fragment {

    RecyclerView recyclerView;
    List<MembersModel>membersModels=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.members,null);

        recyclerView=(RecyclerView)view.findViewById(R.id.membersRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));


        String Name[]={getString(R.string.a),getString(R.string.b),getString(R.string.c),getString(R.string.d),
                       getString(R.string.e),getString(R.string.f),getString(R.string.g),getString(R.string.h),
                       getString(R.string.i),getString(R.string.j),getString(R.string.k),getString(R.string.l),
                       getString(R.string.m)};

        String Collname[]={getString(R.string.aa),getString(R.string.bb),getString(R.string.cc),getString(R.string.dd),
                           getString(R.string.ee),getString(R.string.ff),getString(R.string.gg),getString(R.string.hh),
                           getString(R.string.ii),getString(R.string.jj),getString(R.string.kk),getString(R.string.ll),
                           getString(R.string.mm)};


        for (int i = 0; i <Name.length ; i++) {

            MembersModel membersModel = new MembersModel();
            membersModel.setName(Name[i]);
            membersModel.setCollName(Collname[i]);
            membersModels.add(membersModel);
        }


        MembersRecyclerAdapter adapter=new MembersRecyclerAdapter(view.getContext(),membersModels);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
