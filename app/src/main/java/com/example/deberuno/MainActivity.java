package com.example.deberuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void limpiar (View view){

        EditText usuario = (EditText)findViewById(R.id.txtusuario);
        EditText cedula = (EditText)findViewById(R.id.txtcedula);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText email = (EditText)findViewById(R.id.txtemail);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);
        RadioButton masculino = (RadioButton)findViewById(R.id.btmasculino);
        RadioButton femenino = (RadioButton)findViewById(R.id.btfemenino);
        usuario.setText("");
        cedula.setText("");
        ciudad.setText("");
        email.setText("");
        telefono.setText("");
        fecha.setText("");
        masculino.setText("");

    }

    public void enviar (View view){

        EditText usuario = (EditText)findViewById(R.id.txtusuario);
        EditText cedula = (EditText)findViewById(R.id.txtcedula);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText email = (EditText)findViewById(R.id.txtemail);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);
        String  Usuario, Cedula, Ciudad, Email,Telefono, Fecha;
        Usuario = usuario.getText().toString();
        Cedula = cedula.getText().toString();
        Ciudad = ciudad.getText().toString();
        Email = email.getText().toString();
        Telefono = telefono.getText().toString();
        Fecha = fecha.getText().toString();

        Intent intent = new Intent(MainActivity.this, tareaunodatos.class);
        Bundle envio = new Bundle();
        envio.putString("usuario",Usuario);
        envio.putString("cedula",Cedula);
        envio.putString("ciudad",Ciudad);
        envio.putString("email",Email);
        envio.putString("telefono",Telefono);
        envio.putString("fecha",Fecha);
        intent.putExtras(envio);
        startActivity(intent);



    }

}