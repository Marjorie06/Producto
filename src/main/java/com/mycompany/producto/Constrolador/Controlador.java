/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Constrolador;

import com.mycompany.producto.Modelo.GestorProducto;
import com.mycompany.producto.Modelo.Producto;
import com.mycompany.producto.Vista.ListaProducto;
import com.mycompany.producto.Vista.Vista;

/**
 *
 * @author Marjorie
 */
public class Controlador {
    
    private Vista Producto;
    private GestorProducto gestorProducto;
    private ListaProducto listarIU;
    
    public Controlador(Vista Producto, ListaProducto listarIU) {
        this.Producto = Producto;
        this.listarIU= listarIU;
        //Cambia el constructor de la clase modelo
        
        this.gestorProducto = new GestorProducto();
    }
    
    public void agregarProducto() {

        try {
            if (this.Producto != null) {
                Producto objProducto = new Producto();
                objProducto.setTitulo(this.Producto.getTitulo());
                objProducto.setDescripcion(this.Producto.getDescripcion());
                objProducto.setEstado(this.Producto.getEstado());
                String msm = gestorProducto.agregarProducto(objProducto);
                Producto.error(msm);

            } else {
                Producto.error("Completa los datos!");
            }
        } catch (Exception e) {
            Producto.error("Error controlado:" + e);
        }
    }
    
     public void listaProducto() {

        try {
            String msm = "";
            Producto[] tareas = new Producto [5];
            tareas = gestorProducto.listarTareas();
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
