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

public class Activities_and_Services extends android.support.v4.app.Fragment {

    TextView es3af;
    TextView masgd;
    TextView masgd2;
    TextView net;
    TextView shasha;
    TextView sodasyat;
    TextView ta2men;
    TextView ta2men2;
    TextView ta3am;
    TextView tayra;
    TextView title1;
    TextView title2;
    TextView z;
    TextView z2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.activities_and_services,null);



        this.title1 = (TextView) v.findViewById(R.id.title1);
        this.sodasyat = (TextView) v.findViewById(R.id.sodasyat);
        this.tayra = (TextView) v.findViewById(R.id.tayra);
        this.ta3am = (TextView) v.findViewById(R.id.ta3am);
        this.shasha = (TextView) v.findViewById(R.id.shasha);
        this.masgd = (TextView) v.findViewById(R.id.masgd);
        this.z = (TextView) v.findViewById(R.id.z);
        this.es3af = (TextView) v.findViewById(R.id.es3af);
        this.ta2men = (TextView) v.findViewById(R.id.ta2men);
        this.title2 = (TextView) v.findViewById(R.id.title2);
        this.net = (TextView) v.findViewById(R.id.net);
        this.masgd2 = (TextView) v.findViewById(R.id.masgd2);
        this.z2 = (TextView) v.findViewById(R.id.z2);
        this.ta2men2 = (TextView) v.findViewById(R.id.ta2men2);


        Typeface typeface0=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Bold.ttf");
        Typeface typeface00=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Regular.ttf");


        this.title1.setTypeface(typeface0);
        this.title2.setTypeface(typeface0);
        this.sodasyat.setTypeface(typeface00);
        this.tayra.setTypeface(typeface00);
        this.ta3am.setTypeface(typeface00);
        this.shasha.setTypeface(typeface00);
        this.masgd.setTypeface(typeface00);
        this.z.setTypeface(typeface00);
        this.es3af.setTypeface(typeface00);
        this.ta2men.setTypeface(typeface00);
        this.net.setTypeface(typeface00);
        this.masgd2.setTypeface(typeface00);
        this.z2.setTypeface(typeface00);
        this.ta2men2.setTypeface(typeface00);









        return v;
    }
}
