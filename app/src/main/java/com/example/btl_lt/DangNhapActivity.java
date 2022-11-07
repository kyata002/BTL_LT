package com.example.btl_lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DangNhapActivity extends AppCompatActivity {
    EditText sTenDN,sMatk;
    TextView btnDangN,btnDangK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        AnhXa();
        viewEvent();
    }

    private void viewEvent() {
        btnDangK.setOnClickListener(view -> {
            Intent intent = new Intent(this,DangKiActivity.class);
            this.startActivity(intent);
        });

    }

    private void AnhXa() {
        sTenDN = findViewById(R.id.sTenDN);
        sMatk = findViewById(R.id.sMatK);
        btnDangN = findViewById(R.id.btnDangN);
        btnDangK = findViewById(R.id.btnDangK);
    }
}