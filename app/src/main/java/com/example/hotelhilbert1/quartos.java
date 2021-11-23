package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class quartos extends AppCompatActivity {

        private ImageView right_icon;
        private androidx.appcompat.widget.AppCompatButton quarto_solteiro;
        private androidx.appcompat.widget.AppCompatButton quarto_normal;
        private androidx.appcompat.widget.AppCompatButton quarto_suite;
        private androidx.appcompat.widget.AppCompatButton quarto_suite2;
        private androidx.appcompat.widget.AppCompatButton quarto_vip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartos);

        getSupportActionBar().hide();
        home();
        quarto_solteiro();
        quarto_normal();
        quarto_suite();
        quarto_suite2();
        quarto_vip();

        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, perfil.class);
                startActivity(intent);
            }
        });

       quarto_solteiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, detalhes_solteiro.class);
                startActivity(intent);
            }
        });
        quarto_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, detalhes_normal.class);
                startActivity(intent);
            }
        });
        quarto_suite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, detalhes_suite.class);
                startActivity(intent);
            }
        });
        quarto_suite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, detalhes_suite2.class);
                startActivity(intent);
            }
        });
        quarto_vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quartos.this, detalhes_vip.class);
                startActivity(intent);
            }
        });

    }

    //botao para voltar ao perfil
    public void home() {
                        right_icon                    = findViewById(R.id.right_icon);
    }
    public void quarto_solteiro() {
            quarto_solteiro    = findViewById(R.id.reservar_solteiro);
    }
    public void quarto_normal() {
                quarto_normal        = findViewById(R.id.reservar_normal);
    }
    public void quarto_suite() {
        quarto_suite          = findViewById(R.id.reservar_suite);
    }
    public void quarto_suite2() {
        quarto_suite2        = findViewById(R.id.reservar_suite2);
    }
    public void quarto_vip() {
        quarto_vip              = findViewById(R.id.reservar_vip);
    }
}

