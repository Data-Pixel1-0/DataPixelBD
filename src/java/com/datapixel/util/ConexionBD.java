/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datapixel.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    public static Connection getConexion() {
        try {
            // Driver para MySQL moderno
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Cambia 'datapixel_db' si tu base de datos tiene otro nombre
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/datapixel_db", "root", "");
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
// Gestión de pool de conexiones - Por: Stivensson
//resolvido por kenner 