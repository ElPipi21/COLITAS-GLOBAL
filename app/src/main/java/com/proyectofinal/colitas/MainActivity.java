package com.proyectofinal.colitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fuente> lista = new ArrayList<Fuente>();
        lista.add(new Fuente("Conejito",R.drawable.conejitos, 1, "Pompas",
                "mamifero", "Trujillo", 10 ));


    }
}
