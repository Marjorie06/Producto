/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto.Constrolador;

import com.mycompany.producto.Modelo.GestorProducto;
import com.mycompany.producto.Modelo.Producto;
import com.mycompany.producto.Productos;
import com.mycompany.producto.Vista.ListarProductos;
import com.mycompany.producto.Vista.Vista;

/**
 *
 * @author Marjorie
 */
public class Controlador {
 
    private Vista vista;
    private GestorProducto gestorProducto;
    private ListarProductos listarProductos;
    
    public Controlador(Vista vista, ListarProductos listarProductos) {
        this.vista = vista;
        this.listarProductos= listarProductos;
        //Cambia el constructor de la clase modelo
        
        this.gestorProducto = new GestorProducto();
    }
    
    public void agregarProducto() {

        try {
            if (this.vista != null) {
                Producto objProducto = new Producto();
                objProducto.setNombre(this.vista.getNombre());
                objProducto.setPrecio(this.vista.getPrecio());
                objProducto.setDisponible(this.vista.getDisponible());
                String msm = gestorProducto.agregarProducto(objProducto);
                vista.error(msm);

            } else {
                vista.error("Completa los datos!");
            }
        } catch (Exception e) {
            vista.error("Error controlado:" + e);
        }
    }
    
     public void listarProductos() {

        try {
            String msm = "";
            Producto[] objProductos= new Producto [5];
            objProductos = gestorProducto.listarProductos();
            if (objProductos != null) {
                String lista = "";
                for (int i = 0; i < objProductos.length; i++) {
                    if (objProductos[i] != null) {
                        lista = lista + "id:" + objProductos[i].getId() + "\n"
                                + "Titulo:" + objProductos[i].getNombre() + "\n"
                                + "Descripcion:" + objProductos[i].getPrecio() + "\n"
                                + "Estado:" + objProductos[i].getDisponible() + "\n";
                    }
                }
                msm = lista;
                } else {
                msm = "No hay datos que mostrar";
            }
            listarProductos.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
   }
}
