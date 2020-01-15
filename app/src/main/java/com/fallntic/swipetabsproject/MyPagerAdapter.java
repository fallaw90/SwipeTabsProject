package com.fallntic.swipetabsproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private int behavior;

    public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        //Log.d("PagerAdapter", "Get item is called " + position);
        if (position == 0){
            fragment = new FragmentA();
        }
        if (position == 1){
            fragment = new FragmentB();
        }
        if (position == 2){
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        //Log.d("PagerAdapter", "Get count is called ");
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Tab 1";
        }
        if (position == 1) {
            return "Tab 2";
        }
        if (position == 2) {
            return "Tab 3";
        }
        return null;
    }
}
