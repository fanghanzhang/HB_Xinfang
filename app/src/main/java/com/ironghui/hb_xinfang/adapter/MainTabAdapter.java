package com.ironghui.hb_xinfang.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MainTabAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> mList;
    String[] mTitleStrings;

    public MainTabAdapter(FragmentManager fragmentManager, ArrayList<Fragment> list, String[] titleStrings) {
        super(fragmentManager);
        mList = list;
        mTitleStrings = titleStrings;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleStrings[position];
    }
}
