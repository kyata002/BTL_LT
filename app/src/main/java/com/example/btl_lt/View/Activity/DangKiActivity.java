package com.example.btl_lt.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.btl_lt.R;

public class DangKiActivity extends AppCompatActivity {
    ImageView btnBackDK;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
        AnhXa();
        viewEvent();
    }

    private void AnhXa() {
        btnBackDK = findViewById(R.id.btnBackDK);

    }

    private void viewEvent() {
        btnBackDK.setOnClickListener(view -> {
            Intent intent = new Intent(this,DangNhapActivity.class);
            this.startActivity(intent);
            finish();
        });
    }
}
