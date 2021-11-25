package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detalhes_suite extends AppCompatActivity {

    private ImageView right_icon;
    private androidx.appcompat.widget.AppCompatButton reservar_suite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_suite);

        getSupportActionBar().hide();
        home();
        reservar();

        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_suite.this, quartos.class);
                startActivity(intent);
            }
        });

        reservar_suite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_suite.this, fazer_reserva.class);
                startActivity(intent);
            }
        });
    }
    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }
    public void reservar() {
        reservar_suite  = findViewById(R.id.btn_suite);
    }
}