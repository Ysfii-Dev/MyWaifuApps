package com.yusfisyawali.mywaifuapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();assert actionBar != null;
        actionBar.setTitle("About Me");

        ImageButton btnGit = findViewById(R.id.git);
        btnGit.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Ysfii-Dev"));
            startActivity(browserIntent);
        });

        ImageButton btnLinkedin = findViewById(R.id.linkedin);
        btnLinkedin.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/yusfisyawali"));
            startActivity(browserIntent);
        });

        ImageButton btnWa = findViewById(R.id.wa);
        btnWa.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6283183433830"));
            startActivity(browserIntent);
        });

    }
}