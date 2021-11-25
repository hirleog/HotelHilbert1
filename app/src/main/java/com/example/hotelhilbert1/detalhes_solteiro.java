package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class detalhes_solteiro extends AppCompatActivity {

    private ImageView right_icon;
    private androidx.appcompat.widget.AppCompatButton reserva_solteiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_solteiro);

        getSupportActionBar().hide();
        home();
        reservar();


        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_solteiro.this, quartos.class);
                startActivity(intent);
            }
        });

        reserva_solteiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_solteiro.this, fazer_reserva.class);
                startActivity(intent);
            }
        });
    }
    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }

    public void reservar(){ reserva_solteiro = findViewById(R.id.btn_solteiro); }
}
