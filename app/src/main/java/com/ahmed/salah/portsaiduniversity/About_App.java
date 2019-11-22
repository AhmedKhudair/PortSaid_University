package com.ahmed.salah.portsaiduniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed on 3/15/2018.
 */

public class About_App extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.about_app,null);
        TextView about_Txt = (TextView) view.findViewById(R.id.about_App_txt);
        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");
        about_Txt.setTypeface(typeface);

        return view;
    }
}
