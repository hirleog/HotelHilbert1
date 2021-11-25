package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detalhes_vip extends AppCompatActivity {

    private ImageView right_icon;
    private androidx.appcompat.widget.AppCompatButton reservar_vip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_vip);

        getSupportActionBar().hide();
        home();
        reservar();

        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_vip.this, quartos.class);
                startActivity(intent);
            }
        });

        reservar_vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_vip.this, fazer_reserva.class);
                startActivity(intent);
            }
        });
    }
    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }
    public void reservar() {
        reservar_vip  = findViewById(R.id.btn_vip);
    }
}