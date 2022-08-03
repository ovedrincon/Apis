package com.example.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    RecyclerView recyclerViewMenu;
    List<Integer> lista = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewMenu= findViewById(R.id.rvHobbies);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        AdapterMenu adaptadorMenu = new AdapterMenu(lista);

        recyclerViewMenu.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL,false));
        recyclerViewMenu.setAdapter(adaptadorMenu);

    }
}