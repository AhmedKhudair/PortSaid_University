package com.ahmed.salah.portsaiduniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed on 3/12/2018.
 */

public class President_Fragment extends android.support.v4.app.Fragment {

    TextView dr,name,ra2es;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.president_fragment,null);

        dr=(TextView)view.findViewById(R.id.dr);
        name=(TextView)view.findViewById(R.id.shams);
        ra2es=(TextView)view.findViewById(R.id.ra2esgam3a);

        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");
        dr.setTypeface(typeface);
        name.setTypeface(typeface);
        ra2es.setTypeface(typeface);

        return view;
    }
}
