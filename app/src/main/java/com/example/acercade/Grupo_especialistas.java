package com.example.acercade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Grupo_especialistas extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> titles;
    private List<Integer> mImages;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_especialistas);

 mRecyclerView = findViewById(R.id.recyclerview);

 adapter = new MyAdapter(this, titles, mImages);

 titles = new ArrayList<>();
 mImages = new ArrayList<>();

        adapter = new MyAdapter(this, titles, mImages);



        mImages.add(R.drawable.leticia);
        mImages.add(R.drawable.leticia);
        mImages.add(R.drawable.leticia);
        mImages.add(R.drawable.leticia);
        mImages.add(R.drawable.leticia);
        mImages.add(R.drawable.leticia);

        titles.add("especialista 1");
        titles.add("especialista 2");
        titles.add("especialista 3");
        titles.add("especialista 4");
        titles.add("especialista 5");
        titles.add("especialista 5");

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
   mRecyclerView.setLayoutManager(gridLayoutManager);
   mRecyclerView.setHasFixedSize(true);

mRecyclerView.setAdapter(adapter);
    }
}