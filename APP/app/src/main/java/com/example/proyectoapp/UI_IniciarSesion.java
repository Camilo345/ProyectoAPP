package com.example.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UI_IniciarSesion extends AppCompatActivity {

    private EditText etNombreUsu, etContraseña;
    private Button btVolver, btIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_iniciar_sesion);

        etNombreUsu = (EditText)findViewById(R.id.IniciarSesion_EtNombreUsuario);
        etContraseña = (EditText)findViewById(R.id.IniciarSesion_ETContraseña);
        btIniciarSesion=(Button) findViewById(R.id.IniciarSesion_BtIniciarSesion);
        btVolver=(Button) findViewById(R.id.IniciarSesion_btVolver);
    }

    public void IniciarSesion(View view){
        String nombre = etNombreUsu.getText().toString();
        String contraseña = etContraseña.getText().toString();

        if(nombre=="User1" && contraseña=="12345"){
            Intent i = new Intent(UI_IniciarSesion.this,MainActivity.class);
            startActivity(i);
        }
    }
}