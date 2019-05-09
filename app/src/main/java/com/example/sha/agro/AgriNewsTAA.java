package com.example.sha.agro;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sha on 22-02-2019.
 */

public class AgriNewsTAA extends FragmentPagerAdapter
{

    public AgriNewsTAA(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {


        switch (i)
        {
            case 0:
                DailyNewsFragment dailyNewsFragment = new DailyNewsFragment();
                return  dailyNewsFragment;

            case 1:
                MonthlyUpdatesFragment monthlyUpdatesFragment = new MonthlyUpdatesFragment();
                return monthlyUpdatesFragment;

                default:

                    return null;



        }




    }

    @Override
    public int getCount()
    {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {

        switch (position)
        {
            case 0:

                return "Daily News";

            case 1:

                return "Monthly Updates";



            default:

                return null;
        }
    }
}
