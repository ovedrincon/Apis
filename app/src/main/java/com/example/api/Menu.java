package com.example.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.api.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity implements OnItemCLickMenuList {

    private ActivityMenuBinding binding;


    List<Integer> lista = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        AdapterMenu adaptadorMenu = new AdapterMenu(lista, this);


        // with viewBinding
        binding.rvHobbies.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL,false));
        binding.rvHobbies.setAdapter(adaptadorMenu);

    }

    @Override
    public void onClick(Integer item) {
        Toast.makeText(this, "Se imprime el item elegido " + item, Toast.LENGTH_LONG).show();
    }
}