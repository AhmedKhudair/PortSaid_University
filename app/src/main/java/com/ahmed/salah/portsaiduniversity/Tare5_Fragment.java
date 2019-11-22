package com.ahmed.salah.portsaiduniversity;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed on 3/10/2018.
 */



public class Tare5_Fragment extends android.support.v4.app.Fragment {

    TextView content;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tare5_fragment,null);

        content=(TextView)view.findViewById(R.id.contentTare5);

        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");
        content.setTypeface(typeface);
        return view;
    }
}
