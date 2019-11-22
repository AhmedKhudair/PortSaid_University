package com.ahmed.salah.portsaiduniversity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ahmed on 3/12/2018.
 */

public class University_Administration extends android.support.v4.app.Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=getLayoutInflater().inflate(R.layout.university_administration,null);

        tabLayout=(TabLayout)view.findViewById(R.id.tabAdmin);
        viewPager=(ViewPager)view.findViewById(R.id.pagerAdmin);

        tabLayout.addTab(tabLayout.newTab().setText("رئيس الجامعه"));
        tabLayout.addTab(tabLayout.newTab().setText("اعضاءالمجلس"));

        ViewPagerAdapterUniversityAdmin viewPagerAdapterUniversityAdmin=new ViewPagerAdapterUniversityAdmin(getFragmentManager());
        viewPager.setAdapter(viewPagerAdapterUniversityAdmin);

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
