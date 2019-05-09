package com.example.sha.agro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelplineActivity extends AppCompatActivity {


    private ViewPager helpViewPager;
    private TabLayout helpTabLayout;
    private HelplineTAA helpTabAccessorAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);


        helpViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_H);
        helpTabAccessorAdapter = new HelplineTAA(getSupportFragmentManager());
        helpViewPager.setAdapter(helpTabAccessorAdapter);

        helpTabLayout = (TabLayout) findViewById(R.id.main_tabs_H);
        helpTabLayout.setupWithViewPager(helpViewPager);









    }
}
