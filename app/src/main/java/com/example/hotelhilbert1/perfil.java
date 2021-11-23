package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class perfil extends AppCompatActivity {

    private androidx.appcompat.widget.AppCompatButton deslogar;
    private androidx.appcompat.widget.AppCompatButton quartos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        getSupportActionBar().hide();
        deslog();
        acessa_room();

        deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(perfil.this, FormLogin.class);
                startActivity(intent);
            }
        });

       quartos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(perfil.this, quartos.class);
               startActivity(intent);
           }
       });
    }
    private void deslog(){
        deslogar = findViewById(R.id.deslogar);
    }
    private void acessa_room(){
        quartos = findViewById(R.id.quartos);
    }

}