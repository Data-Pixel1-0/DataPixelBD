/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datapixel.dao;

import com.datapixel.util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductoDAO {
    public void crear(String codigo, String nombre, int stock) {
        // SQL optimizado
        String sql = "INSERT INTO productos (codigo_barras, nombre, stock) VALUES (?, ?, ?)";
        try (Connection con = ConexionBD.getConexion(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, stock);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }
}
// Lógica de persistencia