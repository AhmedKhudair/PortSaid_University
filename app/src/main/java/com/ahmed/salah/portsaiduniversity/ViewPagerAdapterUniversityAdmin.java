package com.ahmed.salah.portsaiduniversity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Ahmed on 3/12/2018.
 */

public class ViewPagerAdapterUniversityAdmin extends FragmentStatePagerAdapter {

    View view;

    public ViewPagerAdapterUniversityAdmin(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                President_Fragment president_fragment = new President_Fragment();
                return president_fragment;
            case 1:
                Members members = new Members();
                return members;
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 2;
    }
}
