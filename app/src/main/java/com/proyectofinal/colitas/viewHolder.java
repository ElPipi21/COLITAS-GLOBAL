package com.proyectofinal.colitas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class viewHolder extends RecyclerView.ViewHolder {

    Button btn_megusta;
    Button btn_estado;
    ImageView imagen;
    TextView nombre;


    public viewHolder(@NonNull View itemView) {
        super(itemView);

        btn_megusta= itemView.findViewById(R.id.btn_megusta);
        btn_estado= itemView.findViewById(R.id.btn_estado);
        imagen= itemView.findViewById(R.id.img_mascota);
        nombre =itemView.findViewById(R.id.txt_nombreMascota);

        btn_megusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_estado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
