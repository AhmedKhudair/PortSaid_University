package com.ahmed.salah.portsaiduniversity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ahmed on 3/11/2018.
 */

public class ViewPagerAdapterAboutUni extends FragmentStatePagerAdapter {


    public ViewPagerAdapterAboutUni(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                Tare5_Fragment tare5 = new Tare5_Fragment();
                return tare5;
            case 1:
                Ro2ya_Fragment ro2ya = new Ro2ya_Fragment();
                return ro2ya;
            case 2:
                Ahdaf_fragment ahdaf = new Ahdaf_fragment();
                return ahdaf;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


}
