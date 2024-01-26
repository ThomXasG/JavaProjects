<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic CRUD Application - jQuery EasyUI CRUD Demo</title>
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.10.17/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.10.17/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.10.17/themes/color.css">
    <script type="text/javascript" src="jquery-easyui-1.10.17/jquery.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.10.17/jquery.easyui.min.js"></script>
</head>
<body>
    <h2>UTA</h2>
    <p>UTA</p>
    
    <table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:250px" method="GET"
            url="http://localhost/Quinto/api.php"
            toolbar="#toolbar" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
            <tr>
                <th field="cedula" width="50">cedula</th>
                <th field="nombre" width="50">nombre</th>
                <th field="apellido" width="50">apellido</th>
                <th field="direccion" width="50">direccion</th>
                <th field="telefono" width="50">telefono</th>
            </tr>
        </thead>
    </table>
    <div id="toolbar">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
    </div>
    
    <div id="dlg" class="easyui-dialog" style="width:400px" data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
        <form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
            <h3>User Information</h3>
            <div style="margin-bottom:10px">
                <input name="cedula" class="easyui-textbox" required="true" label="Cedula:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="nombre" class="easyui-textbox" required="true" label="Nombre:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="apellido" class="easyui-textbox" required="true" label="Apellido:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="direccion" class="easyui-textbox" required="true"  label="Direccion:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="telefono" class="easyui-textbox" required="true"  label="Telefono:" style="width:100%">
            </div>
            
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">Save</a>
        <a href="javascript:void(0)" id="botonAct" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="actualizar()"
            style="width:90px">actualizar</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
    </div>
    <script type="text/javascript">
        var url;
        function newUser(){
            $('#dlg').dialog('open').dialog('center').dialog('setTitle','New User');
            $('#fm').form('clear');
            url = 'http://localhost/Quinto/api.php';
        }
        var urlAct;

function editUser() {
    var row = $('#dg').datagrid('getSelected');
    $('#botonAct').show();
    $('#botonGuardar').hide();
    if (row) {
        $('#dlg').dialog('open').dialog('center').dialog('setTitle', 'Edit User');
        $('#fm').form('load', row);
        urlAct = 'http://localhost/Quinto/api.php?var=' + row.cedula;
    };

}

function actualizar() {
    var formData = $('#fm').serializeArray();
    var data = formData.reduce(function (obj, item) {
        obj[item.name] = item.value;
        return obj;
    }, {});

    $.ajax({
        url: urlAct,
        type: 'PUT',
        data: JSON.stringify(data),  // Convierte los datos a una cadena JSON
        contentType: 'application/json',  // Establece el tipo de contenido como JSON
        success: function (result) {
            if (result == "Se actualizó correctamente") {
                console.log("Se actualizó correctamente");
                $('#dg').datagrid('reload'); // Recarga los datos de usuario
                $('#dlg').dialog('close');
            } else {
                $.messager.show({
                    title: 'Error',
                    msg: result.errorMsg
                });
            }
        },
        dataType: 'json'
    });
}



        function saveUser(){
           
            $('#fm').form('submit',{
                url: url,
                method: "POST", 
                iframe: false,
                onSubmit: function(){
                    return $(this).form('validate');
                },
                success: function(result){
                    var result = eval('('+result+')');
                    if (result.errorMsg){
                        $.messager.show({
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    } else {
                        $('#dlg').dialog('close');        // close the dialog
                        $('#dg').datagrid('reload');    // reload the user data
                    }
                }
            });
        }
        function destroyUser() {
    var row = $('#dg').datagrid('getSelected');
    if (row) {
        $.messager.confirm('Confirm', 'Are you sure you want to destroy this user?', function (r) {
            if (r) {
                $.ajax({
                    url: 'http://localhost/Quinto/api.php?var=' + row.cedula,
                    type: 'DELETE',
                    success: function (result) {
                        if (result.success) {
                            $('#dg').datagrid('deleteRow', $('#dg').datagrid('getRowIndex', row));
                        } else {
                            $.messager.show({ // show error message
                                title: 'Error',
                                msg: result.errorMsg
                            });
                        }
                    },
                    dataType: 'json'
                });
            }
        });
    }
}


    </script>
</body>
</html>