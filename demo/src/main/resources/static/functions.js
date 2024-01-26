$(document).ready(function () {
    loadUsers();
    $('#add-user-form').submit(function () {
        $.ajax({
            url: "http://localhost:8080/rest/save",
            type: "POST",
            dataType: "json",
            contentType: "application/json",
            data: JSON.stringify({
                "cedula": $('#CEDULA').val(),
                "nombre": $('#NOMBRE').val(),
                "apellido": $('#APELLIDO').val(),
                "direccion": $('#DIRECCION').val(),
                "telefono": $('#TELEFONO').val(),
            }),
            success: function (response) {
                loadUsers();
            }
        });
    });
    $('#search-form').submit(function (event) {
        event.preventDefault();
        loadUsersbyCedula();

    });
    $('#edit-user-form').submit(function (event) {
        event.preventDefault();
        $.ajax({
            url: "http://localhost:8080/rest/edit/" + $('#eCEDULA').val(),
            type: "PUT",
            dataType: "json",
            contentType: "application/json",
            data: JSON.stringify({
                "nombre": $('#eNOMBRE').val(),
                "apellido": $('#eAPELLIDO').val(),
                "direccion": $('#eDIRECCION').val(),
                "telefono": $('#eTELEFONO').val(),
            }),
            success: function (response) {
                loadUsers();
            }
        });
    });
});

function loadUsersbyCedula() {
    // Realizar la petición de búsqueda
    $.ajax({
        url: 'http://localhost:8080/rest/buscarPorCedula/' + $('#search-input').val(),
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Limpiar la tabla
            $('#tblUser tbody').html("");
            // Crear una fila con los resultados de la búsqueda
            var btnEdit = '<button type="button" class="btn btn-primary btnEdit" data-bs-toggle="modal" data-bs-target="#editUserModal"> Editar</button>';
            var btnDelete = '<button type="button" class="btn btn-danger btnDelete" data-bs-toggle="modal" data-bs-target="#deleteUserModal"> Eliminar</button>';
            var html = "<tr>";
            html += "<td>" + data.cedula + "</td>";
            html += "<td>" + data.nombre + "</td>";
            html += "<td>" + data.apellido + "</td>";
            html += "<td>" + data.direccion + "</td>";
            html += "<td>" + data.telefono + "</td>" + "<td>" + btnEdit + " " + btnDelete + "</td>";
            html += "</tr>";
            $('#tblUser tbody').html(html);

            // Asignar el evento click para los botones de editar y eliminar
            $('.btnEdit').click(function (event) {
                event.preventDefault();
                // Get the values from the row where the button was clicked
                var cedula = $(this).closest('tr').find('td:eq(0)').text();
                var nombre = $(this).closest('tr').find('td:eq(1)').text();
                var apellido = $(this).closest('tr').find('td:eq(2)').text();
                var direccion = $(this).closest('tr').find('td:eq(3)').text();
                var telefono = $(this).closest('tr').find('td:eq(4)').text();

                // Set the values in the modal inputs
                $('#eCEDULA').val(cedula);
                $('#eNOMBRE').val(nombre);
                $('#eAPELLIDO').val(apellido);
                $('#eDIRECCION').val(direccion);
                $('#eTELEFONO').val(telefono);
            });
            $('.btnDelete').click(function (event) {
                event.preventDefault();
                var cedula = $(this).closest('tr').find('td:eq(0)').text();
                // Realizar la petición de eliminación
                $.ajax({
                    url: 'http://localhost:8080/rest/delete/' + cedula,
                    type: 'DELETE',
                    success: function (result) {
                        loadUsers();
                    }
                });
            });
        }
    });
}

function loadUsers() {
    $.ajax({
        url: "http://localhost:8080/rest/all",
        type: "GET",
        dataType: "json",
        success: function (data) {
            var btnEdit = '<button type="button" class="btn btn-primary btnEdit" data-bs-toggle="modal" data-bs-target="#editUserModal"> Editar</button>';
            var btnDelete = '<button type="button" class="btn btn-danger btnDelete" data-bs-toggle="modal" data-bs-target="#deleteUserModal"> Eliminar</button>';
            var html = "";
            console.log(data);
            for (let i = 0; i < data.length; i++) {
                html += "<tr>";
                html += "<td>" + data[i].cedula + "</td>";
                html += "<td>" + data[i].nombre + "</td>";
                html += "<td>" + data[i].apellido + "</td>";
                html += "<td>" + data[i].direccion + "</td>";
                html += "<td>" + data[i].telefono + "</td>" + "<td>" + btnEdit + " " + btnDelete + "</td>";
                html += "</tr>";
            }
            $('#tblUser tbody').html(html);
            $('.btnEdit').off('click').on('click', function (event) {
                event.preventDefault();
                // Get the values from the row where the button was clicked
                var cedula = $(this).closest('tr').find('td:eq(0)').text();
                var nombre = $(this).closest('tr').find('td:eq(1)').text();
                var apellido = $(this).closest('tr').find('td:eq(2)').text();
                var direccion = $(this).closest('tr').find('td:eq(3)').text();
                var telefono = $(this).closest('tr').find('td:eq(4)').text();

                // Set the values in the modal inputs
                $('#eCEDULA').val(cedula);
                $('#eNOMBRE').val(nombre);
                $('#eAPELLIDO').val(apellido);
                $('#eDIRECCION').val(direccion);
                $('#eTELEFONO').val(telefono);
            });
            $('.btnDelete').off('click').on('click', function (event) {
                event.preventDefault();
                var cedula = $(this).closest('tr').find('td:eq(0)').text();
                // Realizar la petición de eliminación
                $.ajax({
                    url: 'http://localhost:8080/rest/delete/' + cedula,
                    type: 'DELETE',
                    success: function (result) {
                        loadUsers();
                    }
                });
            });
        }
    })
}