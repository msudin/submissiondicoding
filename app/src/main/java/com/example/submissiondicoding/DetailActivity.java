package com.example.submissiondicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private TextView dtName, dtby, dtDate, dtDesc;
    private ImageView imgView;
    private String proPhoto;
    private Button btnHarga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dtName = findViewById(R.id.dt_posted_name_phone);
        dtby = findViewById(R.id.dt_posted_by);
        dtDate = findViewById(R.id.dt_posted_date);
        dtDesc = findViewById(R.id.dt_posted_desc);
        imgView = findViewById(R.id.dt_image_view);
        btnHarga = findViewById(R.id.btn_sale);

        getSupportActionBar().setTitle("Detail Gadget");

        dtName.setText(getIntent().getStringExtra("data1"));
        dtby.setText(getIntent().getStringExtra("data2"));
       dtDate.setText(getIntent().getStringExtra("data3"));
        dtDesc.setText(getIntent().getStringExtra("data4"));
        proPhoto = getIntent().getStringExtra("data5");
        Picasso.get().load(proPhoto).into(imgView);
        btnHarga.setText(getIntent().getStringExtra("data6"));


    }
}
