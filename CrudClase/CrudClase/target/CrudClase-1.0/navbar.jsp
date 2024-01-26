<%-- 
    Document   : navbar
    Created on : 29 nov. 2023, 11:49:11
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.jsp">SOA</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="insertar.jsp">Agregar</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="lista_estudiantes.jsp">Listar</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="buscar_estudiantes.jsp">Buscar</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>
