package com.example.rashil.room;

import android.app.FragmentManager;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static android.support.v4.app.FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"userdb").allowMainThreadQueries().build();

        if (findViewById(R.id.frameLayout)!=null){
            if (savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.frameLayout,new HomeFragment()).commit();
        }
    }
}
