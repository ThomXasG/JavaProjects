<%-- 
    Document   : lista_estudiantes
    Created on : 4 dic. 2023, 10:22:44
    Author     : Daniel
--%>

<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="java.net.http.HttpResponse"%>
<%@page import="java.net.URI"%>
<%@page import="java.net.http.HttpRequest"%>
<%@page import="java.net.http.HttpClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"></jsp:include>
        <body>
            <div>
            <jsp:include page="navbar.jsp"></jsp:include>
            </div>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Cedula</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Apellido</th>
                        <th scope="col">Direccion</th>
                        <th scope="col">Telefono</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    try {
                        String api = "http://localhost/QUINTO/api.php";
                        HttpClient cliente = HttpClient.newHttpClient();
                        HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(api)).GET().build();
                        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
                        JSONArray jsonArray = new JSONArray(respuesta.body());
                        StringBuilder tablaBody = new StringBuilder();
                        JSONObject jsonObject = new JSONObject();

                        for (int i = 0; i < jsonArray.length(); i++) {
                            jsonObject = jsonArray.getJSONObject(i);
                            String fila = "<tr>"
                                    + "<td>" + jsonObject.getString("cedula").toString() + "</td>"
                                    + "<td>" + jsonObject.getString("nombre").toString() + "</td>"
                                    + "<td>" + jsonObject.getString("apellido").toString() + "</td>"
                                    + "<td>" + jsonObject.getString("email").toString() + "</td>"
                                    + "<td>" + jsonObject.getString("telefono").toString() + "</td>"
                                    + "<td>"
                                    + "<a href=\"update_person.jsp?cedula=" + jsonObject.getString("cedula").toString() + "\">"
                                    + "<button type=\"button\" class=\"btn btn-primary\">ACTUALIZAR</button></a>\t"
                                    + "<a href=\"delete_person.jsp?cedula=" + jsonObject.getString("cedula").toString() + "\">"
                                    + "<button type=\"button\" class=\"btn btn-danger\">ELIMINAR</button></a>\t"
                                    + "</td>"
                                    + "</tr>";
                            tablaBody.append(fila);
                        }
                        out.print(tablaBody.toString());
                    } catch (Exception e) {
                        out.print("ERROR:"+e);
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
