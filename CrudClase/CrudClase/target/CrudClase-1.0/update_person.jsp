<%-- 
    Document   : update_person
    Created on : 4 dic. 2023, 11:10:14
    Author     : Daniel
--%>

<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="java.net.http.HttpResponse.BodyHandlers"%>
<%@page import="java.net.http.HttpResponse"%>
<%@page import="java.net.http.HttpRequest"%>
<%@page import="java.net.URI"%>
<%@page import="java.net.http.HttpClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"></jsp:include>
        <body>
            <div>
            <jsp:include page="navbar.jsp"></jsp:include>
            </div>
        </body>
    <%
        String nombre = "", apellido = "", direccion = "", telefono = "", id = "";
        try {
            id = request.getParameter("cedula");
            String api = "http://localhost/QUINTO/select_by_id.php?cedula=" + id;
            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(api)).GET().build();

            HttpResponse<String> respuesta = cliente.send(solicitud, BodyHandlers.ofString());

            JSONArray jsonArray = new JSONArray(respuesta.body());
            JSONObject jsonObject;

            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = jsonArray.getJSONObject(i);
                nombre = jsonObject.getString("nombre");
                apellido = jsonObject.getString("apellido");
                direccion = jsonObject.getString("email");
                telefono = jsonObject.getString("telefono");
            }

        } catch (Exception e) {
        out.print("ERROR:"+e);
        }
    %>
    <h1>Actualizar Estudiante</h1>
    <form method="PUT" autocomplete="off" action="actualizar.jsp">

        <input type="hidden" class="form-control" id="cedula" name="cedula" required value="<%out.print(id);%>">
        <div class="mb-3">
            <label>Nombre</label>
            <input type="text" class="form-control" id="nombre" name="nombre"  required value="<%out.print(nombre);%>">
        </div>
        <div class="mb-3">
            <label>Apellido</label>
            <input type="text" class="form-control" id="apellido" name="apellido" required value="<%out.print(apellido);%>">
        </div>
        <div class="mb-3">
            <label>Direccion</label>
            <input type="text" class="form-control" id="email" name="email" required value="<%out.print(direccion);%>">
        </div>
        <div class="mb-3">
            <label>Telefono</label>
            <input type="text" class="form-control" id="telefono" name="telefono" required value="<%out.print(telefono);%>">
        </div>

        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
</html>
