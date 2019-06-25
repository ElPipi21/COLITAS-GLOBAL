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
    String nombre;
    String especie;
    String ubicacion;
    int valoración;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getValoración() {
        return valoración;
    }

    public void setValoración(int valoración) {
        this.valoración = valoración;
    }


    public Fuente(String titulo, int imagen, int estado, String nombre, String especie, String ubicacion, int valoración) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.estado = estado;
        this.nombre = nombre;
        this.especie = especie;
        this.ubicacion = ubicacion;
        this.valoración = valoración;
    }
}
