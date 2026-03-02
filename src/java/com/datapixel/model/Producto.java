/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//entidad producto 
package com.datapixel.model;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;

    // Constructor vacío (necesario siempre)
    public Producto() {
    }

    // Constructor con datos
    public Producto(String codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    // Getters y Setters (Para que el Servlet pueda leer los datos)
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
