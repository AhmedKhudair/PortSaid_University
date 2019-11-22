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

public class Ro2ya_Fragment extends android.support.v4.app.Fragment {


    TextView title1,title2,content1,content2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.ro2ya_fragment,null);


        title1=(TextView)view.findViewById(R.id.titleRo2ya);
        content1=(TextView)view.findViewById(R.id.contentro2ya);

        title2=(TextView)view.findViewById(R.id.titleResala);
        content2=(TextView)view.findViewById(R.id.contentResala);

        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Bold.ttf");
        Typeface typeface2=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");

        title1.setTypeface(typeface);
        title2.setTypeface(typeface);

        content1.setTypeface(typeface2);
        content2.setTypeface(typeface2);




        return view;
    }
}
