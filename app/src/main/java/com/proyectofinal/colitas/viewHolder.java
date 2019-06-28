package com.proyectofinal.colitas;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    Button btn1;
    Button btn2;
    ImageView imagen;
    TextView titulo;
    List<Fuente> ListaObjeto;

    public viewHolder(View itemView, List<Fuente> datos) {
        super(itemView);

        btn1= itemView.findViewById(R.id.btn1);
        btn2= itemView.findViewById(R.id.btn2);
        imagen= itemView.findViewById(R.id.imagen);
        titulo=  itemView.findViewById(R.id.texto);
        ListaObjeto= datos;

        btn1.setOnClickListener(this);
        imagen.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int position= getAdapterPosition();
        Fuente objeto = ListaObjeto.get(position);


        if (v.getId()==imagen.getId()){
            Toast.makeText(btn1.getContext(), "Apreto la imagen", Toast.LENGTH_SHORT).show();

            Intent nuevo = new Intent(v.getContext(), Detalle.class);




        }else{
            if (v.getId()==btn1.getId()){
                Toast.makeText(btn1.getContext(), "Apreto la opcion me gusta" + position + " de" + objeto.getTitulo(), Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(btn1.getContext(), "Apreto la opcion favorito", Toast.LENGTH_SHORT).show();

            }
        }
    }




}
