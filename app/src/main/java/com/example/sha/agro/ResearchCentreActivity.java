package com.example.sha.agro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResearchCentreActivity extends AppCompatActivity {


    private ViewPager resViewPager;
    private TabLayout resTabLayout;
    private ResearchCentresTAA resTabAccessorAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_centre);


        resViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_rc);
        resTabAccessorAdapter = new ResearchCentresTAA(getSupportFragmentManager());
        resViewPager.setAdapter(resTabAccessorAdapter);

        resTabLayout = (TabLayout) findViewById(R.id.main_tabs_rc);
        resTabLayout.setupWithViewPager(resViewPager);





    }
}
