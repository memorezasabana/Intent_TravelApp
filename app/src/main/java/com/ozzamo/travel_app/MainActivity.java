package com.ozzamo.travel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Untuk memanggil image view supaya bisa diklik dan digunakan untuk intent
        img1 = (ImageView) findViewById(R.id.hehaskyview_btn);
        img1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        // Untuk membuat intent, saat diklik pindah ke class lain
        switch (view.getId()) {
            case R.id.hehaskyview_btn:
                i = new Intent(MainActivity.this, GalleryHeha.class);
                startActivity(i);
                break;
        }
    }
}