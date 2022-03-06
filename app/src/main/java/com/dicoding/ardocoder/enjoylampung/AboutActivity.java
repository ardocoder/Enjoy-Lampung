package com.dicoding.ardocoder.enjoylampung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void Facebook (View view) {
        String url = "https://m.facebook.com/bonardo.sianturi";
        Intent followFacebook = new Intent(Intent.ACTION_VIEW);
        followFacebook.setData(Uri.parse(url));
        startActivity(followFacebook);
    }

    public void Twitter (View view) {
        String url = "https://twitter.com/ardosianturi";
        Intent followTwitter = new Intent(Intent.ACTION_VIEW);
        followTwitter.setData(Uri.parse(url));
        startActivity(followTwitter);
    }

    public void Instagram (View view) {
        String url = "https://www.instagram.com/ardosianturi/";
        Intent followInstagram = new Intent(Intent.ACTION_VIEW);
        followInstagram.setData(Uri.parse(url));
        startActivity(followInstagram);
    }
}
