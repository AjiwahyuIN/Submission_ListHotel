package com.aji.submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHotel;
    private ArrayList<Hotel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Daftar Hotel");

        rvHotel = findViewById(R.id.rv);
        rvHotel.setHasFixedSize(true);

        list.addAll(HotelData.getListData());
        showRecylerList();
    }

    private void showRecylerList() {
        rvHotel.setLayoutManager(new LinearLayoutManager(this));
        HotelAdapter hotelAdapter = new HotelAdapter(list, this);
        rvHotel.setAdapter(hotelAdapter);

        hotelAdapter.SetOnItemClickCallback(new HotelAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hotel data) {
                showSelectedHotel(data);
            }
        });
    }

    private void showSelectedHotel(Hotel hotel) {
        Intent move = new Intent(this, DetailActivity.class);
        move.putExtra(DetailActivity.EXTRA_HOTEL, hotel);
        startActivity(move);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        if (itemId == R.id.ic_profil) {
            startActivity(new Intent(this, ProfilActivity.class));
        }
    }
}
