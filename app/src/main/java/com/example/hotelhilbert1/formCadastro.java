package com.example.hotelhilbert1;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class formCadastro extends AppCompatActivity {
Connection connection;

    private EditText edit_nome, edit_cpf, edit_email, edit_senha;
    private androidx.appcompat.widget.AppCompatButton btn_cadastrar;

    String[] mensagens = {"Preencha todos os campos!", "Cadastro realizado com sucesso!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        iniciarComponentes();

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView Name = (TextView) findViewById(R.id.edit_nome_cadastrasse);

                connectSQL c = new connectSQL();
                    if(c != null) {
                        try {
                            String sqlstatement = "Select * from Usuarios";
                            Statement smt = connection.createStatement();
                            ResultSet set = smt.executeQuery(sqlstatement);
                            while (set.next()) {
//                            String nome   = edit_nome.getText().toString();
//                            String cpf    = edit_cpf.getText().toString();
//                            String email  = edit_email.getText().toString();
//                            String senha  = edit_senha.getText().toString();
                                Name.setText(set.getString(2));
                            }
                            connection.close();
                        } catch (Exception e)
                        {
                            Log.e("Error: ", e.getMessage());
                        }
                    }

//                if (nome.isEmpty() || cpf.isEmpty() ||
//                   email.isEmpty() || senha.isEmpty()){
//                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
//                    snackbar.setBackgroundTint(Color.WHITE);
//                    snackbar.setTextColor(Color.BLACK);
//                    snackbar.show();
//                }else{
//            }       cadastrarUsuario();
       }
    });
    }

    private void cadastrarUsuario(){
        String nome   = edit_nome. getText().toString();
        String cpf    = edit_cpf.  getText().toString();
        String email  = edit_email.getText().toString();
        String senha  = edit_senha.getText().toString();
    }

    private void iniciarComponentes(){
        edit_nome     = findViewById(R.id.edit_nome_cadastrasse);
        edit_cpf      = findViewById(R.id.edit_cpf);
        edit_email    = findViewById(R.id.edit_email);
        edit_senha    = findViewById(R.id.edit_senha);
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
    }

    }
