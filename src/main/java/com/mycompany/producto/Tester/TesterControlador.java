/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Tester;

import com.mycompany.producto.Modelo.Producto;

/**
 *
 * @author Marjorie
 */
public class TesterControlador {
     public void prueba(Producto objTarea) {
        System.out.println("Nombre: " + objTarea.getNombre());
        System.out.println("Precio: " + objTarea.getPrecio());
        System.out.println("Estado: " + objTarea.getDisponible());
    }
    
}
