/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Modelo;

/**
 *
 * @author Marjorie
 */
public class Producto {
    
      private int id;
    private String nombre;
    private String precio;
    private boolean disponible;
    int length;

    public Producto (int id, String nombre, String precio, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return disponible;
    }
    
    public void setEstado(boolean estado) {
        this.disponible = disponible;
    }

}
