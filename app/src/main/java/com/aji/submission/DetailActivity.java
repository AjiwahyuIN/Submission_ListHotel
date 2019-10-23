package com.aji.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_HOTEL = "extra_hotel";
    TextView tvTitle, tvStart, tvDesc;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.hotel_name_detail);
        tvStart = findViewById(R.id.hotel_star_detail);
        tvDesc = findViewById(R.id.hotel_description_detail);
        imgPhoto = findViewById(R.id.img_hotel_detail);

        Hotel hotel = getIntent().getParcelableExtra(EXTRA_HOTEL);
        assert hotel != null;
        setTitle(hotel.getNama());

        tvTitle.setText(hotel.getNama());
        tvStart.setText(hotel.getDetail());
        tvDesc.setText(hotel.getDeskripsi());
        Picasso.with(this)
                .load(hotel.getPhoto())
                .into(imgPhoto);
    }
}
