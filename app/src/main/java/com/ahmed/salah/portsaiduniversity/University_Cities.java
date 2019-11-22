package com.ahmed.salah.portsaiduniversity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class University_Cities extends android.support.v4.app.Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.university_cities, null);


        tabLayout=(TabLayout)view.findViewById(R.id.tabCities);
        viewPager=(ViewPager)view.findViewById(R.id.pagerCities);


        tabLayout.addTab(tabLayout.newTab().setText("قطاع مباني المدن الجامعية"));
        tabLayout.addTab(tabLayout.newTab().setText("الأنشطه والخدمات بالمدن"));

        ViewPagerAdapterUniversityCities adapterUniversityCities=new ViewPagerAdapterUniversityCities(getFragmentManager());
        viewPager.setAdapter(adapterUniversityCities);


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
