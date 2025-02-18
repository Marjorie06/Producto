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
      private Vista principal;

    public TesterVista(Vista principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Vista();
        try {
            System.out.println("Titulo: " + principal.getTitulo());
            System.out.println("Descripcion: " + principal.getDescripcion());
            System.out.println("Estado: " + principal.getEstado());

        } catch (NumberFormatException e) {
            
            
            //vista.mostrarError("Error");
        }

    }
    
}
