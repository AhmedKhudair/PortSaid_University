package com.ahmed.salah.portsaiduniversity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmed on 3/10/2018.
 */

public class About_Uni extends android.support.v4.app.Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.about_uni,null);
        tabLayout=(TabLayout)view.findViewById(R.id.tab);
        viewPager=(ViewPager) view.findViewById(R.id.pager);

        tabLayout.addTab(tabLayout.newTab().setText("النشأه"));
        tabLayout.addTab(tabLayout.newTab().setText("الرؤيه والرساله"));
        tabLayout.addTab(tabLayout.newTab().setText("الاهداف"));

        final ViewPagerAdapterAboutUni adapter = new ViewPagerAdapterAboutUni(getFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });


        return view;



    }
}
