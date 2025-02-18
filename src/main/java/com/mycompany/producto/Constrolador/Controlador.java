/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Constrolador;

import com.mycompany.producto.Modelo.GestorProducto;
import com.mycompany.producto.Modelo.Producto;
import com.mycompany.producto.Vista.Vista;

/**
 *
 * @author Marjorie
 */
public class Controlador {
    
    private Vista principal;
    private GestorProducto gestorTarea;
    private ListaProducto listarIU;
    
    public Controlador(Vista principal, ListaProducto listarIU) {
        this.principal = principal;
        this.listarIU= listarIU;
        //Cambia el constructor de la clase modelo
        this.gestorTarea = new GestorProducto();
    }
    
    public void agregarTarea() {

        try {
            if (this.principal != null) {
                Producto objTarea = new Producto();
                objTarea.setTitulo(this.principal.getTitulo());
                objTarea.setDescripcion(this.principal.getDescripcion());
                objTarea.setEstado(this.principal.getEstado());
                String msm = gestorTarea.agregarTarea(objTarea);
                principal.error(msm);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado:" + e);
        }
    }
    
     public void listarTarea() {

        try {
            String msm = "";
            Producto[] tareas = new Producto [5];
            tareas = gestorTarea.listarTareas();
            if (tareas != null) {
                String lista = "";
                for (int i = 0; i < tareas.length; i++) {
                    if (tareas[i] != null) {
                        lista = lista + "id:" + tareas[i].getId() + "\n"
                                + "Titulo:" + tareas[i].getTitulo() + "\n"
                                + "Descripcion:" + tareas[i].getDescripcion() + "\n"
                                + "Estado:" + tareas[i].getEstado() + "\n";
                    }
                }
                msm = lista;
                } else {
                msm = "No hay datos que mostrar";
            }
            listarIU.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
    
}
