package com.example.rendimiento_ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //método para accesar a la menú de camara
    public void AccesoCamara (View view){
        Intent accesoC = new Intent(this, CamaraActivity.class);
        startActivity(accesoC);
    }
    //método para accesar a la lista de los mejores
    public void AccesoLista (View view){
        Intent accesoL = new Intent(this, ListaActivity.class);
        startActivity(accesoL);
    }
    //método para accesar a la gráfica
    public void AccesoGrafica (View view){
        Intent accesoE = new Intent(this, EstadisticasActivity.class);
        startActivity(accesoE);
    }
}