/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Modelo;

import com.mycompany.producto.Productos;

/**
 *
 * @author Marjorie
 */
public class GestorProducto {
    
   int tamanoVector = 5;
    Producto[] Producto = new Producto[tamanoVector];
    int cont = 0;

    public String agregarProducto(Productos Productos) {
        String msg = "Ingreso exitoso";
        if (Producto.length != cont) {
            for (int i = 0; i < Producto.length; i++) {
                if (Producto[i] == null) {
                    //inicializar el objeto
                    Producto[i] = new Producto();
                    Producto[i].setId(i);
                    Producto[i].setNombre(Producto.getNombre());
                    Producto[i].setPrecio(Producto.getPrecio());
                    Producto[i].setDisponible(Producto.getDisponible());
                    cont++;
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }
        public Producto[] listarProductos() {

        Producto[] auxProducto = new Producto[tamanoVector];
        for (int i = 0; i < cont; i++) {

            //if (tareas[i].getEstado()) {
            auxProducto[i] = new Producto();
            auxProducto[i].setId(Producto[i].getId());
            auxProducto[i].setNombre(Producto[i].getNombre());
            auxProducto[i].setPrecio(Producto[i].getPrecio());
            auxProducto[i].setDisponible(Producto[i].getDisponible());
            System.out.println("Modelo-listarProducto" + auxProducto[i].getDisponible());
            // }
        }
        return auxProducto;
    }
}
