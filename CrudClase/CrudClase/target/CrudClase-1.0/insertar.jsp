<%-- 
    Document   : insertar
    Created on : 29 nov. 2023, 11:59:53
    Author     : Daniel
--%>

<%@page import="java.net.URI"%>
<%@page import="java.net.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"></jsp:include>
        <body>
            <div>
            <jsp:include page="navbar.jsp"></jsp:include>
            </div>
            <form method="POST">
                <div class="mb-3">
                    <label>Cédula</label>
                    <input type="text" class="form-control" id="cedula" name="cedula" required>
                </div>
                <div class="mb-3">
                    <label>Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre"  required>
                </div>
                <div class="mb-3">
                    <label>Apellido</label>
                    <input type="text" class="form-control" id="apellido" name="apellido" required>
                </div>
                <div class="mb-3">
                    <label>Direccion</label>
                    <input type="text" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label>Telefono</label>
                    <input type="text" class="form-control" id="telefono" name="telefono" required>
                </div>

                <button type="submit" class="btn btn-primary">Agregar</button>
            </form>
        <%
            if (request.getMethod().equals("POST")) {
                String api = "http://localhost/QUINTO/api.php";
                String cedula = request.getParameter("cedula");
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String direccion = request.getParameter("email");
                String telefono = request.getParameter("telefono");

                String postDAta = "cedula=" + cedula + "&nombre=" + nombre + "&apellido=" + apellido + "&email=" + direccion + "&telefono=" + telefono;
                //CLIENTE
                HttpClient cliente = HttpClient.newHttpClient();
                HttpRequest solicitud = HttpRequest.newBuilder()
                        .uri(URI.create(api))
                        .header("Content-Type", "application/x-www-form-urlencoded")
                        .POST(HttpRequest.BodyPublishers.ofString(postDAta))
                        .build();

                //Respuesta
                HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
                if (respuesta.statusCode() == 200) {
                    out.print("<br>");
                    out.print("<div class='alert alert-success' " + "role='alert'>Registrado con Exito");
                }
            }

        %>
    </body>
</html>
