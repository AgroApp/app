package com.example.sha.agro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PharmacyActivity extends AppCompatActivity {


    private ViewPager pharViewPager;
    private TabLayout pharTabLayout;
    private AgriNewsTAA pharTabAccessorAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);


        pharViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_p);
        pharTabAccessorAdapter = new AgriNewsTAA(getSupportFragmentManager());
        pharViewPager.setAdapter(pharTabAccessorAdapter);

        pharTabLayout = (TabLayout) findViewById(R.id.main_tabs_p);
        pharTabLayout.setupWithViewPager(pharViewPager);



    }
}
