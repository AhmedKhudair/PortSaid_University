package com.ahmed.salah.portsaiduniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class Cities_ٍٍٍSector extends android.support.v4.app.Fragment {
    TextView Malf;
    TextView aty;
    TextView egmaly;
    TextView egmaly2;
    TextView kobra;
    TextView mabnabh;
    TextView mnah;
    TextView mo5asas1;
    TextView mo5asas2;
    TextView mo5asas3;
    TextView mo5asas4;
    TextView mo5asas5;
    TextView mo5asaskobra;
    TextView sum;
    TextView tafsyly1;
    TextView tafsyly2;
    TextView talbatdomayat;
    TextView yasto3b1;
    TextView yasto3b2;
    TextView zwgy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.cities_sector,null);

        this.tafsyly1 = (TextView) v.findViewById(R.id.tafsyly1);
        this.Malf = (TextView) v.findViewById(R.id.Malf);
        this.mo5asas1 = (TextView) v.findViewById(R.id.mo5asas1);
        this.mo5asas2 = (TextView) v.findViewById(R.id.mo5asas2);
        this.mo5asas3 = (TextView) v.findViewById(R.id.mo5asas3);
        this.mo5asas4 = (TextView) v.findViewById(R.id.mo5asas4);
        this.tafsyly2 = (TextView) v.findViewById(R.id.tafsyly2);
        this.yasto3b1 = (TextView) v.findViewById(R.id.yasto3b1);
        this.mabnabh = (TextView) v.findViewById(R.id.mabnabh);
        this.mo5asas5 = (TextView) v.findViewById(R.id.mo5asas5);
        this.mnah = (TextView) v.findViewById(R.id.mnah);
        this.yasto3b2 = (TextView) v.findViewById(R.id.yasto3b2);
        this.sum = (TextView) v.findViewById(R.id.sum);
        this.kobra = (TextView) v.findViewById(R.id.kobra);
        this.mo5asaskobra = (TextView) v.findViewById(R.id.mo5asaskobra);
        this.egmaly = (TextView) v.findViewById(R.id.egmaly);
        this.talbatdomayat = (TextView) v.findViewById(R.id.talbatdomayat);
        this.aty = (TextView) v.findViewById(R.id.aty);
        this.zwgy = (TextView) v.findViewById(R.id.zwgy);
        this.egmaly2 = (TextView) v.findViewById(R.id.egmaly2);

        Typeface typeface1=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Bold.ttf");
        Typeface typeface2=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");


        this.tafsyly1.setTypeface(typeface1);
        this.tafsyly2.setTypeface(typeface1);
        this.Malf.setTypeface(typeface1);
        this.mo5asas1.setTypeface(typeface2);
        this.mo5asas2.setTypeface(typeface2);
        this.mo5asas3.setTypeface(typeface2);
        this.mo5asas4.setTypeface(typeface2);
        this.yasto3b1.setTypeface(typeface2);
        this.mabnabh.setTypeface(typeface1);
        this.mo5asas5.setTypeface(typeface2);
        this.mnah.setTypeface(typeface2);
        this.yasto3b2.setTypeface(typeface2);
        this.sum.setTypeface(typeface2);
        this.kobra.setTypeface(typeface1);
        this.mo5asaskobra.setTypeface(typeface2);
        this.egmaly.setTypeface(typeface2);
        this.talbatdomayat.setTypeface(typeface1);
        this.aty.setTypeface(typeface2);
        this.zwgy.setTypeface(typeface2);
        this.egmaly2.setTypeface(typeface2);


        return v;
    }
}
