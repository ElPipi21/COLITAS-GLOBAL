package com.proyectofinal.colitas;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<viewHolder> {

    List<Fuente> ListaObjeto;

    public Adaptador(List<Fuente> listaObjeto) {
        ListaObjeto = listaObjeto;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item, viewGroup, false);
        return new viewHolder(vista, ListaObjeto);
    }

    @Override
    public void onBindViewHolder( viewHolder viewHolder, int position) {
        viewHolder.titulo.setText(ListaObjeto.get(position).getTitulo());
        viewHolder.imagen.setImageResource(ListaObjeto.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return ListaObjeto.size();
    }
}
