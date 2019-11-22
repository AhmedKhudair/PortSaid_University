package com.ahmed.salah.portsaiduniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed on 3/11/2018.
 */

public class Ahdaf_fragment extends android.support.v4.app.Fragment {

    TextView title,title2,content;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ahdaf_fragment,null);


        title=(TextView)view.findViewById(R.id.titleAhdaf);
        title2=(TextView)view.findViewById(R.id.title2Ahdaf) ;
        content=(TextView)view.findViewById(R.id.contentAhdaf);

        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Bold.ttf");
        Typeface typeface2=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");

        title.setTypeface(typeface);
        title2.setTypeface(typeface2);
        content.setTypeface(typeface2);
        return view;
    }
}
