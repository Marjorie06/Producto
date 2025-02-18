/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Constrolador;

import com.mycompany.producto.Modelo.GestorProducto;
import com.mycompany.producto.Vista.Vista;

/**
 *
 * @author Marjorie
 */
public class Controlador {
 
    private Vista vista;
    private GestorProducto gestorProducto;
    private ListaProducto listarIU;
    
    public Controlador(Vista vista, ListaProducto listarIU) {
        this.vista = vista;
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
            Producto[] Productos= new Producto [5];
            Productos = gestorProducto.listaProducto();
            if (Productos != null) {
                String lista = "";
                for (int i = 0; i < producto.length; i++) {
                    if (Productos[i] != null) {
                        lista = lista + "id:" + Productos[i].getId() + "\n"
                                + "Titulo:" + Productos[i].getNombre() + "\n"
                                + "Descripcion:" + Productos[i].getPrecio() + "\n"
                                + "Estado:" + Productos[i].getDisponibilidad() + "\n";
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
