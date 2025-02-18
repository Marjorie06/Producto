/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Tester;

import com.mycompany.producto.Vista.Vista;

/**
 *
 * @author Marjorie
 */
public class TesterVista {
      private  Vista Producto;

    public TesterVista(Vista Producto) {
        this.Producto = Producto;
    }

    public void prueba() {
        //Principal principal=new Vista();
        try {
            System.out.println("Titulo: " + Producto.getNombre());
            System.out.println("Descripcion: " + Producto.getPrecio());
            System.out.println("Estado: " + Producto.getDisponible());

        } catch (NumberFormatException e) {
            
            
            //vista.mostrarError("Error") ;
        }

    }
    
}
