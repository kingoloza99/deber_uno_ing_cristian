package com.example.deberuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tareaunodatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareaunodatos);


        TextView txtSaludo = (TextView) findViewById(R.id.txtmostrar);
        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("usuario") +"\n" +bundle.getString("cedula")+"\n" +bundle.getString("email")+"\n" +bundle.getString("telefono")+"\n" +bundle.getString("fecha"));



    }
}