package com.example.sha.agro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity  {



    GridLayout Maingrid;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



      Maingrid =(GridLayout) findViewById(R.id.gridlayout);

      setSingleEvent(Maingrid);



    }

    public void setSingleEvent(GridLayout Maingrid) {
        int i;

        for ( i=0;i<Maingrid.getChildCount();i++)
        {
            CardView cardView = (CardView)Maingrid.getChildAt(i);
            final int finalI=i;

            cardView.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v)
                {
                    if(finalI ==0)
                    {
                       Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                       startActivity(intent);
                    }

                    else if(finalI ==1)
                    {
                        Intent intent = new Intent(Main2Activity.this,AgriNewsActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI ==2)
                    {
                        Intent intent = new Intent(Main2Activity.this,BankLoanActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI ==3)
                    {
                        Intent intent = new Intent(Main2Activity.this,HospitalsActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI ==4)
                    {
                        Intent intent = new Intent(Main2Activity.this,ResearchCentreActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI ==5)
                    {
                        Intent intent = new Intent(Main2Activity.this,PharmacyActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI ==6)
                    {
                        Intent intent = new Intent(Main2Activity.this,HelplineActivity.class);
                        startActivity(intent);
                    }

                    else
                    {
                        Toast.makeText(Main2Activity.this, "the cardview "+ finalI,Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }

    }
}
