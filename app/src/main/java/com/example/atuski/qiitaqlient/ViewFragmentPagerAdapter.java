package com.example.atuski.qiitaqlient;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by atuski on 2018/04/13.
 */
public class ViewFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    public ViewFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragments(Fragment fragments, String tabTitles){
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
