/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.datapixel.servlet;

import com.datapixel.dao.ProductoDAO;
import com.datapixel.model.Producto;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ControladorProducto", urlPatterns = {"/ControladorProducto"})
public class ControladorProducto extends HttpServlet {

    // PUNTO 2 DE LA GUÍA: Manejo de método GET (Para Búsqueda)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigoBusqueda = request.getParameter("txtCodigoBusqueda");
        
        // Aquí iría la lógica para buscar en la BD usando el DAO
        // Por ahora, redirigimos para confirmar que el GET funciona
        System.out.println("Buscando producto con código: " + codigoBusqueda);
        response.sendRedirect("index.jsp?msj=BusquedaRealizada");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recibimos los datos del formulario registro.jsp
        String codigo = request.getParameter("txtCodigo");
        String nombre = request.getParameter("txtNombre");
        int stock = Integer.parseInt(request.getParameter("txtStock"));

        // Creamos el objeto Modelo
        Producto p = new Producto();
        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setStock(stock);

        // Llamamos al DAO para persistir en la BD (Punto 4: Persistencia)
        ProductoDAO dao = new ProductoDAO();
        dao.crear(codigo, nombre, stock);

        // PLUS RECOMENDADO: Manejo de mensajes de éxito
        response.sendRedirect("registro.jsp?exito=1");
    }
}