package com.example.lr3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    ListView GameList;
    ArrayList<Games> games = new ArrayList<Games>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated( View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setInitialData();
        // получаем элемент ListView
        GameList = view.findViewById(R.id.GameList);
        // создаем адаптер
        GamesAdapter gamesAdapter = new GamesAdapter(MainActivity.getInstance(), R.layout.listitem, games);
        // устанавливаем адаптер
        GameList.setAdapter(gamesAdapter);
        Button crt = view.findViewById(R.id.createBtn);



    }

    private void setInitialData(){

        games.add(new Games ("Darksiders II",  R.drawable.darksiders));
        games.add(new Games ("Футбол",  R.drawable.futbol));
        games.add(new Games ("Футбол",  R.drawable.futbol));
    }

}
