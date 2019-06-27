package com.proyectofinal.colitas;

//de aca voy a sacar los datos para la tarjetita que mostrará el animalito
//quedaría pendiente jalar estos datos desde la base de datos
//de la base tiene que salir  esto y acoplarse
//de momento lo dejaré que vaya jalando de lo que tengo en local XD
//
public class Fuente {

    String titulo;
    int imagen;
    int estado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


    public Fuente(String titulo, int imagen, int estado) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.estado = estado;
    }
}
