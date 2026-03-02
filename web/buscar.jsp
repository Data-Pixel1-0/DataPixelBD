<%-- 
    Document   : buscar
    Created on : 2/03/2026, 1:33:27 p. m.
    Author     : Kenner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Buscar Producto</title>
    </head>
    <body>
        <h2>Consultar Producto</h2>
        <form action="ControladorProducto" method="GET">
            <label>Ingrese el Código a buscar:</label><br>
            <input type="text" name="txtCodigoBusqueda" required>
            <button type="submit">Buscar</button>
        </form>
        <br>
        <a href="index.jsp">Volver al Inicio</a>
    </body>
</html>
