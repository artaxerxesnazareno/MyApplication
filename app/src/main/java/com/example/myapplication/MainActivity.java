package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    TextView respota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.txtId); // liga a variavel nome ao componente com o id "txtId"
        respota = (TextView) findViewById(R.id.respostaId);
    }


    public void precionado(View view) {
        String n = nome.getText().toString();
        String frase = "É um prazer te conhecer, "+ n + "!!";
        respota.setText(frase);
    }
}