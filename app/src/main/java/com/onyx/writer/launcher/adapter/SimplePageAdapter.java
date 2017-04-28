package com.onyx.writer.launcher.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.onyx.writer.launcher.TabPageFragment;

/**
 * Created by 12345 on 2017/4/28.
 */

public class SimplePageAdapter extends FragmentPagerAdapter {
    private String[] names;

    public SimplePageAdapter(FragmentManager fm, String[] names) {
        super(fm);
        this.names = names;
    }

    @Override
    public Fragment getItem(int position) {
        return TabPageFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}