package com.example.sha.agro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HospitalsActivity extends AppCompatActivity
{
    private ViewPager HospViewPager;
    private TabLayout HospTabLayout;
    private HospitalTAA HospTabAccessorAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);


        HospViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_h);
        HospTabAccessorAdapter = new HospitalTAA(getSupportFragmentManager());
        HospViewPager.setAdapter(HospTabAccessorAdapter);

        HospTabLayout = (TabLayout) findViewById(R.id.main_tabs_h);
        HospTabLayout.setupWithViewPager(HospViewPager);






    }
}
