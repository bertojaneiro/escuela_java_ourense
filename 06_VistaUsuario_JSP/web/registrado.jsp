<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@page import="com.vn.appusuarios.modelo.logica.UsuarioServicio"%>
<html>
    <body>
        <h1>Registrado correctamente</h1>
        <h2 style="color: green">
            ID: <%= (new UsuarioServicio()).leer(session.getAttribute("emailUsuario").toString()).getId() %>
            <br>
            Nombre: <%= (new UsuarioServicio()).leer(session.getAttribute("emailUsuario").toString()).getNombre() %>
            
        </h2>
    </body>
</html>
