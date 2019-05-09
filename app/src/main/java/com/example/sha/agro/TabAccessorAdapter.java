package com.example.sha.agro;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sha on 19-02-2019.
 */

public class TabAccessorAdapter extends FragmentPagerAdapter
{
    public TabAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                PesticideFragment pesticideFragment = new PesticideFragment();
                return pesticideFragment;

            case 1:
                FertilizersFragment fertilizersFragment = new FertilizersFragment();
                return fertilizersFragment;

            case 2:
                EquipmentsFragment equipmentsFragment = new EquipmentsFragment();
                return equipmentsFragment;

            default:

                return null;
        }

    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {




        switch (position)
        {
            case 0:

                return "Pesticide";

            case 1:

                return "Fertilizer";
            case 2:

                return "Equipments";

            default:

                return null;
        }
    }
}
