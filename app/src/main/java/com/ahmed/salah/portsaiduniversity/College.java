package com.ahmed.salah.portsaiduniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class College extends android.support.v4.app.Fragment {

    TextView kolyat;

    RecyclerView recyclerView;
    List<CollegeModel>collegeModels=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.college,null);


        kolyat = (TextView) view.findViewById(R.id.Kolyat);
        kolyat.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "fonts/DroidKufi-Bold.ttf"));

        recyclerView=(RecyclerView)view.findViewById(R.id.recyCollege);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        int[] posters = new int[]{R.drawable.alom1, R.drawable.adap, R.drawable.handsa, R.drawable.haseb,
                                  R.drawable.noaya, R.drawable.ryada, R.drawable.ryadatfal, R.drawable.tamryd,
                                  R.drawable.tarbya, R.drawable.teb, R.drawable.tegara};



        for (int i = 0; i <posters.length ; i++) {

            CollegeModel collegeModel=new CollegeModel();
            collegeModel.setCollImage(posters[i]);
            collegeModels.add(collegeModel);
        }

        CollegeRecyclerViewAdapter collegeRecyclerViewAdapter=new CollegeRecyclerViewAdapter(getContext(),collegeModels);
        recyclerView.setAdapter(collegeRecyclerViewAdapter);



        return view;


    }
}
