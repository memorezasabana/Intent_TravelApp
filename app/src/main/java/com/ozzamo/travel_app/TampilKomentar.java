package com.ozzamo.travel_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class TampilKomentar extends AppCompatActivity {
    private TextView txtKomentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_komentar);
        txtKomentar = findViewById(R.id.txtkomentar);

        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(FormKomentar.EXTRA_DATA);
            txtKomentar.setText(data);

        }
    }

}