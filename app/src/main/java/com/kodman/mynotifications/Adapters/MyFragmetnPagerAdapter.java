package com.kodman.mynotifications.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;

import android.support.v4.app.FragmentPagerAdapter;

import com.kodman.mynotifications.Fragments.PageFragment;

import java.util.ArrayList;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private long baseId = 0;
    private ArrayList<String> listFragments;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = PageFragment.newInstance(position);
        Bundle b = new Bundle();
        //b.putParcelable("sd", selectedDate);
        //f.getArguments().putParcelable("sd", selectedDate);

        return f;
    }

    @Override
    public int getCount() {
        return listFragments.size();
    }


    @Override
    public int getItemPosition(Object object) {

        return PagerAdapter.POSITION_NONE;
    }


    @Override
    public long getItemId(int position) {

        return baseId + position;
    }

    public void notifyChangeInPosition(int n) {

        baseId += getCount() + n;
        //Log.d(TAG, "baseId = " + baseId + "  n = " + n + "   getCount" + getCount());

    }
}
