package com.codes.tugas_8_wildan_gits;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView topBar;
    private TextView nama;
    private TextView nim;
    private TextView ttl;
    private TextView jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();

        topBar.setText("Detail Register");
        nama.setText("Nama    : "+getIntent().getStringExtra("nama"));
        nim.setText("Nim    : "+getIntent().getStringExtra("nim"));
        ttl.setText("TTL    : "+getIntent().getStringExtra("ttl"));
        jk.setText("Jenis Kelamin    : "+getIntent().getStringExtra("jk"));

    }

    private void initView() {
        topBar = (TextView) findViewById(R.id.top_bar);
        nama = (TextView) findViewById(R.id.nama);
        nim = (TextView) findViewById(R.id.nim);
        ttl = (TextView) findViewById(R.id.ttl);
        jk = (TextView) findViewById(R.id.jk);
    }
}