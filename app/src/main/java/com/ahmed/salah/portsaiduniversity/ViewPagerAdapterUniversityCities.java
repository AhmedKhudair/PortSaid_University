package com.ahmed.salah.portsaiduniversity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ahmed on 3/13/2018.
 */

public class ViewPagerAdapterUniversityCities extends FragmentStatePagerAdapter {


    public ViewPagerAdapterUniversityCities(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Cities_ٍٍٍSector cities_ٍٍٍSector = new Cities_ٍٍٍSector();
                return cities_ٍٍٍSector;
            case 1:
                Activities_and_Services activities_and_services = new Activities_and_Services();
                return activities_and_services;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
