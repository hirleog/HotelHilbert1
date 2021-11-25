package com.example.hotelhilbert1;

import androidx.appcompat.app.AppCompatActivity;

import androidx.core.util.Pair;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;


public class fazer_reserva extends AppCompatActivity {

    private TextView textDate;
    private Button selectDate;
    private ImageView right_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_reserva);
        getSupportActionBar().hide();
        home();

//        textDate = findViewById(R.id.deseja_reservar);
        selectDate = findViewById(R.id.button);

        MaterialDatePicker datePicker = MaterialDatePicker.Builder.dateRangePicker()
                .setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),
                        MaterialDatePicker.todayInUtcMilliseconds())).build();

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker.show(getSupportFragmentManager(), "Material_Range");
                datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        textDate.setText(datePicker.getHeaderText());
                    }
                });
            }
        });
        right_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fazer_reserva.this, quartos.class);
                startActivity(intent);
            }
        });

//        textDate   = findViewById(R.id.deseja_reservar);
//        selectDate = findViewById(R.id.button);
//
//        MaterialDatePicker datePicker = MaterialDatePicker.Builder.datePicker()
//                .setTitleText("Selecione a data").setSelection(MaterialDatePicker.todayInUtcMilliseconds())
//                .build();
//
//        selectDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                datePicker.show(getSupportFragmentManager(), "Material_Date_Picker");
//                datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
//                    @Override
//                    public void onPositiveButtonClick(Object selection) {
//                        textDate.setText(datePicker.getHeaderText());
//                    }
//                });
//            }
//        });
    }
    public void home() {
        right_icon = findViewById(R.id.right_icon);
    }
}

