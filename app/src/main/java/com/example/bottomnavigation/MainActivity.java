package com.example.bottomnavigation;

import android.support.annotation.NonNull;


import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    TextView helloWorld;
    BottomNavigationView myBottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);
        myBottomNav.setOnNavigationItemSelectedListener(this);
        helloWorld = (TextView) findViewById(R.id.shit);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.nearby:
                helloWorld.setText("nearby icon was clicked");
                return true;
            case R.id.account:
                helloWorld.setText("account icon was clicked");
                return true;
            case R.id.hero:
                helloWorld.setText("hero icon was clicked");
                return true;

        }


        return false;
    }
}
