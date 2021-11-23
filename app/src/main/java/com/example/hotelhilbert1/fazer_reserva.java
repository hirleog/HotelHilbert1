package com.example.hotelhilbert1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;


public class fazer_reserva extends AppCompatActivity {

    private TextView textDate;
    private Button selectDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_reserva);
        getSupportActionBar().hide();

        textDate   = findViewById(R.id.deseja_reservar);
        selectDate = findViewById(R.id.button);

        MaterialDatePicker datePicker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Selecione a data").setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build();

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker.show(getSupportFragmentManager(), "Material_Date_Picker");
                datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        textDate.setText(datePicker.getHeaderText());
                    }
                });
            }
        });
    }
}

