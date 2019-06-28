package com.proyectofinal.colitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    ImageView imagen;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imagen= findViewById(R.id.imgDetalle);
        titulo = findViewById(R.id.txtDetalle);

       Fuente fuente= (Fuente) getIntent().getExtras().getSerializable("Datos");
       imagen.setImageResource(fuente.getImagen());
       titulo.setText(fuente.getTitulo().toString());

    }
}
