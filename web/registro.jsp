<%-- 
    Document   : registro
    Created on : 2/03/2026, 1:32:08 p. m.
    Author     : Kenner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro de Producto</title>
    </head>
    <body>
        <h2>Crear Nuevo Producto</h2>
        <form action="ControladorProducto" method="POST">
            
            <label>Código de Barras:</label><br>
            <input type="text" name="txtCodigo" required placeholder="Ej: 1010"><br><br>

            <label>Nombre del Producto:</label><br>
            <input type="text" name="txtNombre" required minlength="3"><br><br>

            <label>Stock Inicial:</label><br>
            <input type="number" name="txtStock" required min="1"><br><br>

            <button type="submit">Guardar Producto</button>
        </form>
        <br>
        <a href="index.jsp">Volver al Inicio</a>
    </body>
</html>
