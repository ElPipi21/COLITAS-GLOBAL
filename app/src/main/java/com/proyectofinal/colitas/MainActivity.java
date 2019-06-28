package com.proyectofinal.colitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fuente> lista = new ArrayList<Fuente>();
        lista.add(new Fuente("Conejos", R.drawable.conejitos, 0));
        lista.add(new Fuente("Perrito", R.drawable.perrito, 0));
        lista.add(new Fuente("Perrito2", R.drawable.perrito2, 0));
        lista.add(new Fuente("Perrito3", R.drawable.perrito3, 0));
        lista.add(new Fuente("Perrito4", R.drawable.perrito4, 0));
        lista.add(new Fuente("Hamster", R.drawable.hamster, 0));
        lista.add(new Fuente("Loro", R.drawable.lorito, 0));
        lista.add(new Fuente("Loro2", R.drawable.lorito2, 0));
        lista.add(new Fuente("Loro3", R.drawable.lorito3, 0));
        lista.add(new Fuente("Gato", R.drawable.gatito, 0));
        lista.add(new Fuente("Gato", R.drawable.gatito2, 0));
        lista.add(new Fuente("Gato", R.drawable.gatito3, 0));
        lista.add(new Fuente("Cuy", R.drawable.cuy, 0));

        RecyclerView contenedor = findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layout);



    }
}
