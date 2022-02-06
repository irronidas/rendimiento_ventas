package com.example.rendimiento_ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    ListView lista;
    String [] datos = {
            "Felipe","Alex","Susan", };

        int [] datosImg = {R.drawable.alex, R.drawable.felipe, R.drawable.susan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lista = (ListView) findViewById(R.id.lv1);
        lista.setAdapter(new AdaptadorActivity(this, datos, datosImg));
    }
}