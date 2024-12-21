package com.yusfisyawali.mywaifuapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.yusfisyawali.mywaifuapps.adapter.ListWaifuAdapter;
import com.yusfisyawali.mywaifuapps.model.Waifu;
import com.yusfisyawali.mywaifuapps.model.WaifuData;

import java.util.ArrayList;

import static com.yusfisyawali.mywaifuapps.R.id.rv_waifu;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWaifu;
    private final ArrayList<Waifu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWaifu = findViewById(rv_waifu);
        rvWaifu.setHasFixedSize(true);

        list.addAll(WaifuData.getListData());
        showRecyclerList();
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

    public void setMode(int selected){
        if (selected == R.id.about){
            Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
    }

    private void showRecyclerList(){
        rvWaifu.setLayoutManager(new LinearLayoutManager(this));
        ListWaifuAdapter listWaifuAdapter = new ListWaifuAdapter(list);
        rvWaifu.setAdapter(listWaifuAdapter);

        listWaifuAdapter.setOnItemClickCallback(waifu -> {
            Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
            detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, waifu.getPhoto());
            detailIntent.putExtra(DetailActivity.EXTRA_NAME, waifu.getName());
            detailIntent.putExtra(DetailActivity.EXTRA_ANIME, waifu.getAnime());
            detailIntent.putExtra(DetailActivity.EXTRA_BIRTH, waifu.getBirth());
            detailIntent.putExtra(DetailActivity.EXTRA_ZODIAK, waifu.getZodiak());
            detailIntent.putExtra(DetailActivity.EXTRA_AGE, waifu.getAge());
            detailIntent.putExtra(DetailActivity.EXTRA_BLOOD, waifu.getBlood());
            detailIntent.putExtra(DetailActivity.EXTRA_HEIGHTBODY, waifu.getHeightBody());
            detailIntent.putExtra(DetailActivity.EXTRA_ABOUTWIFU, waifu.getAboutWaifu());
            detailIntent.putExtra(DetailActivity.EXTRA_ANIMEDETAIL, waifu.getAnimeDetail());
            startActivity(detailIntent);
        });
    }
}