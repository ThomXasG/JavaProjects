
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="java.net.http.HttpResponse.BodyHandlers"%>
<%@page import="java.net.http.*"%>
<%@page import="java.net.URI"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"></jsp:include>
        <body>
            <div>
            <jsp:include page="navbar.jsp"></jsp:include>
            </div>
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
                out.print("ERROR:" + e);
            }
        %>

        <form method="GET">
            <label>Buscar Estudiante</label>
            <input type="text" id="cedula" name="cedula">
        </form>
        <h4>Datos del Estudiante</h4>
        <div>
            <b>Nombre:</b>
            <%out.print(nombre);%>
        </div>
        <div>
            <b>Apellido:</b>
            <%out.print(apellido);%>
        </div>
        <div>
            <b>Dirección:</b>
            <%out.print(direccion);%>
        </div>
        <div>
            <b>Telefono:</b>
            <%out.print(telefono);%>
        </div>
    </body>
</html>