package com.example.hotelhilbert1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class
detalhes_suite2 extends AppCompatActivity {

    private ImageView right_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_suite2);

        getSupportActionBar().hide();
        home();


        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalhes_suite2.this, quartos.class);
                startActivity(intent);
            }
        });
    }
    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }
}