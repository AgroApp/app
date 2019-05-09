package com.example.sha.agro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BankLoanActivity extends AppCompatActivity {

    private ViewPager banViewPager;
    private TabLayout banTabLayout;
    private BankloanTAA banTabAccessorAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_loan);



        banViewPager =(ViewPager) findViewById(R.id.main_tabs_pager_bl);
        banTabAccessorAdapter = new BankloanTAA(getSupportFragmentManager());
        banViewPager.setAdapter(banTabAccessorAdapter);

        banTabLayout = (TabLayout) findViewById(R.id.main_tabs_bl);
        banTabLayout.setupWithViewPager(banViewPager);



    }
}
