package com.example.jennifer1.dolphincatalogue;


import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;

import android.widget.TextView;


public class appmain extends AppCompatActivity {
    private DrawerLayout navigation;
    private ActionBarDrawerToggle mToggle;
    private Toolbar tolbar;
//when back pressed goback


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appmain);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fram, new products()).commit();
        navigation = (DrawerLayout) findViewById(R.id.drawer_layout);
        tolbar = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(tolbar);
        mToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                navigation,         /* DrawerLayout object */
                 /* nav drawer icon to replace 'Up' caret */
                R.string.open,  /* "open drawer" description */
                R.string.close  /* "close drawer" description */
        );
        mToggle.setDrawerIndicatorEnabled(true);
        navigation.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_settings_black_48dp);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;

        }
        return super.onOptionsItemSelected(item);


    }


}

















