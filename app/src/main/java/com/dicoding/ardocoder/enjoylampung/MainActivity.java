package com.dicoding.ardocoder.enjoylampung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlaces;
    private ArrayList<Place> list = new ArrayList<>();
    private String title = "Enjoy Lampung";
    private String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvPlaces = findViewById(R.id.rv_places);
        rvPlaces.setHasFixedSize(true);

        list.addAll(PlacesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPlaces.setLayoutManager(new LinearLayoutManager(this));
        ListPlaceAdapter listPlaceAdapter = new ListPlaceAdapter(list);
        rvPlaces.setAdapter(listPlaceAdapter);
    }

    private void showRecyclerGrid() {
        rvPlaces.setLayoutManager(new GridLayoutManager(this, 2));
        GridPlaceAdapter gridPlaceAdapter = new GridPlaceAdapter(list);
        rvPlaces.setAdapter(gridPlaceAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "List Lokasi";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Grid Lokasi";
                showRecyclerGrid();
                break;
            case R.id.action_about:
                title = "My Profile";
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
