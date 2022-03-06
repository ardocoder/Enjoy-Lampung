package com.dicoding.ardocoder.enjoylampung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView tvSplash;
    private ImageView imgSplash;
    private Typeface faceSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvSplash = (TextView) findViewById(R.id.tv_splash);
        imgSplash = (ImageView) findViewById(R.id.img_splash);

        faceSplash = Typeface.createFromAsset(this.getAssets(), "fonts/KaushanScript-Regular.ttf");
        tvSplash.setTypeface(faceSplash);

        final Intent splashIntent = new Intent(Splash.this, MainActivity.class);

        Animation splashAnim = AnimationUtils.loadAnimation(this, R.anim.splash_transition);
        tvSplash.startAnimation(splashAnim);
        imgSplash.startAnimation(splashAnim);

        Thread timer = new Thread() {
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(splashIntent);
                    finish();
                }
            }
        };
                timer.start();;
    }
}
