package com.dicoding.ardocoder.enjoylampung;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_place);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("tv_name") && getIntent().hasExtra("tv_location")) {

            String textName = getIntent().getStringExtra("tv_name");
            String textLocation = getIntent().getStringExtra("tv_location");
            String textTime = getIntent().getStringExtra("tv_time");
            String textHTM = getIntent().getStringExtra("tv_htm");
            String textDetail = getIntent().getStringExtra("tv_detail");

            setPlace(textName, textLocation, textTime, textHTM, textDetail);
        }
    }

    private void setPlace(String textName, String textLocation, String textTime, String textHTM, String textDetail) {
        ImageView image = findViewById(R.id.img_place);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int imagePlace = bundle.getInt("img_place");
            image.setImageResource(imagePlace);
        }

        TextView name = findViewById(R.id.tv_name);
        name.setText(textName);

        TextView location = findViewById(R.id.tv_location);
        location.setText(textLocation);

        TextView time = findViewById(R.id.tv_time);
        time.setText(textTime);

        TextView ticket = findViewById(R.id.tv_HTM);
        ticket.setText(textHTM);

        TextView detail = findViewById(R.id.tv_detail);
        detail.setText(textDetail);
    }

}
