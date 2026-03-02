/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.datapixel.servlet;

import com.datapixel.dao.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ControladorProducto", urlPatterns = {"/ControladorProducto"})
public class ControladorProducto extends HttpServlet {

    // Captura de parámetros del formulario
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Obtener datos del formulario
        String nom = request.getParameter("txtNombre");
        String cod = request.getParameter("txtCodigo");
        String stockStr = request.getParameter("txtStock");

        if (nom != null && cod != null && stockStr != null) {
            try {
                int stk = Integer.parseInt(stockStr);
                // 2. Ejecutar la inserción
                ProductoDAO dao = new ProductoDAO();
                dao.crear(cod, nom, stk);
            } catch (NumberFormatException e) {
                System.out.println("Error en el número: " + e.getMessage());
            }
        }

        // 3. Respuesta visual
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h2> ¡Producto guardado con éxito!</h2>");
            out.println("<a href='index.html'>Registrar otro producto</a>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}