package com.siems.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.popularMoviesButton) Button mPopularMoviesButton;
    @Bind(R.id.stockHawkButton) Button mStockHawkButton;
    @Bind(R.id.buildItBiggerButton) Button mBuildItBiggerButton;
    @Bind(R.id.makeYourAppMaterialButton) Button mMakeYourAppMaterialButton;
    @Bind(R.id.goUbiquitousButton) Button mGoUbiquitousButton;
    @Bind(R.id.capstoneButton) Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //click listeners
        mPopularMoviesButton.setOnClickListener(this);
        mStockHawkButton.setOnClickListener(this);
        mBuildItBiggerButton.setOnClickListener(this);
        mMakeYourAppMaterialButton.setOnClickListener(this);
        mGoUbiquitousButton.setOnClickListener(this);
        mCapstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mPopularMoviesButton) {
            notificationToast("This button will launch my Popular Movies app!");
        }
        if (v == mStockHawkButton) {
            notificationToast("This button will launch my Stock Hawk app!");
        }
        if (v == mBuildItBiggerButton) {
            notificationToast("This button will launch my Build It Bigger app!");
        }
        if (v == mMakeYourAppMaterialButton) {
            notificationToast("This button will launch my Make Your App Material app!");
        }
        if (v == mGoUbiquitousButton) {
            notificationToast("This button will launch my Go Ubiquitous app!");
        }
        if (v == mCapstoneButton) {
            notificationToast("This button will launch my Capstone Project app!");
        }
    }

    public void notificationToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
