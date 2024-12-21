package com.yusfisyawali.mywaifuapps;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_ANIME = "extra_anime";
    public static final String EXTRA_BIRTH = "extra_birth";
    public static final String EXTRA_ZODIAK = "extra_zodiak";
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_BLOOD = "extra_blood";
    public static final String EXTRA_HEIGHTBODY = "extra_heightbody";
    public static final String EXTRA_ABOUTWIFU = "extra_aboutwifu";
    public static final String EXTRA_ANIMEDETAIL = "extra_animedetail";
    ImageView imgPhoto;
    TextView tvName, tvAnime, tvBirth, tvZodiak, tvAge, tvBlood, tvHeightBody, tvAboutWaifu, tvAnimeDetail;
    Button btnWaifuWall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();assert actionBar != null;
        actionBar.setTitle("Detail Chara");

        imgPhoto = findViewById(R.id.img_chara_photo);
        tvName = findViewById(R.id.tv_name);
        tvAnime = findViewById(R.id.tv_anime);
        tvBirth = findViewById(R.id.tv_birth);
        tvZodiak = findViewById(R.id.tv_zodiak);
        tvAge = findViewById(R.id.tv_age);
        tvBlood = findViewById(R.id.tv_blood);
        tvHeightBody = findViewById(R.id.tv_height_body);
        tvAboutWaifu = findViewById(R.id.tv_about_waifu);
        tvAnimeDetail = findViewById(R.id.tv_anime_detail);
        btnWaifuWall = findViewById(R.id.btn_wall_waifu);

        imgPhoto.setImageResource(getIntent().getIntExtra(EXTRA_PHOTO, 0));
        tvName.setText(getIntent().getStringExtra(EXTRA_NAME));
        tvAnime.setText(getIntent().getStringExtra(EXTRA_ANIME));
        tvBirth.setText(getIntent().getStringExtra(EXTRA_BIRTH));
        tvZodiak.setText(getIntent().getStringExtra(EXTRA_ZODIAK));
        tvAge.setText(getIntent().getStringExtra(EXTRA_AGE));
        tvBlood.setText(getIntent().getStringExtra(EXTRA_BLOOD));
        tvHeightBody.setText(getIntent().getStringExtra(EXTRA_HEIGHTBODY));
        tvAboutWaifu.setText(getIntent().getStringExtra(EXTRA_ABOUTWIFU));
        tvAnimeDetail.setText(getIntent().getStringExtra(EXTRA_ANIMEDETAIL));

        btnWaifuWall = findViewById(R.id.btn_wall_waifu);
        btnWaifuWall.setOnClickListener(this);
    }

    void updateWallpaper(int wallpaper){
        try{
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
            wallpaperManager.setResource(wallpaper);
            Toast.makeText(this, "Wallpaper berhasil diubah", Toast.LENGTH_LONG).show();
        } catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Wallpaper gagal diubah", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_wall_waifu){
            updateWallpaper(getIntent().getIntExtra(EXTRA_PHOTO, 0));
        }
    }
}