package com.ahmed.salah.portsaiduniversity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ahmed on 3/14/2018.
 */

public class Rss_Main extends android.support.v4.app.Fragment {

    RecyclerView recyclerView;
    TextView markz;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.rss_main,null);

        recyclerView=(RecyclerView)view.findViewById(R.id.rssRec);
        markz=(TextView)view.findViewById(R.id.markz);
        Typeface typeface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/DroidKufi-Bold.ttf");
        markz.setTypeface(typeface);

            CheckInternetConnection connection=new CheckInternetConnection(getContext());
            boolean check=connection.isConnect();

            if (!check){


                AlertDialog.Builder a = new AlertDialog.Builder(getContext());
                a.setMessage("تاكد من الاتصال بالانترنت واعد المحاوله").setCancelable(false).setPositiveButton("موافق", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                       getFragmentManager().beginTransaction().replace(R.id.fram, new About_Uni()).commit();
                    }
                });

                a.show();

            }
            else {

                Rss_Reader rss_reader=new Rss_Reader(getContext(),recyclerView);
                rss_reader.execute();
            }





        return view;
    }










}
