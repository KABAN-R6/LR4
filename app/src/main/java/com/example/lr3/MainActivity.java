package com.example.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity   {
    //обьявляем статическую переменую
    private static MainActivity instance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //в статическую перменную передаётся данный мэйн активити
        instance = this;
        ListFragment fragment = new ListFragment();
        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.mainfragment,ListFragment.class,null)
                    .commit();
        }

    }
    //возрасшает переменную
    public static MainActivity getInstance(){
        return instance;
    }



}