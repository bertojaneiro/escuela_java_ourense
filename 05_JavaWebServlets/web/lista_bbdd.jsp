<%-- 
    Document   : lista_bbdd
    Created on : 22-nov-2019, 11:24:13
    Author     : Equipo 1
--%>

<%@page import="com.vn.appweb.modelo.ConsultaSQL"%>
<%@page import="java.util.List"%>
<%@page import="com.vn.appweb.modelo.DatosPersona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado jsp con DerbyDB</title>
    </head>
    <body>
        <h1>Listado jsp con DerbyDB</h1>
        <%
            out.println("<p>Hola desde Java en url: "+request.getContextPath()+"</p>");
            
          %>
        <br>
        <ul>
        <%
            for (int i = 0; i < 3; i++) {
          %>
                <li>Numero <%= i %></li>
        <%   
            }
            ConsultaSQL conSQL = new ConsultaSQL();
            //List<DatosPersona> listaPer = conSQL.leerTabla("Nombre de prueba");
            
          %>
        </ul>
        
        <form action="#" method="POST">
            <input type="text" id="nombre" name="nombre" placeholder="introduzca busqueda" size="10" required="required"/><br/>
            <input id="btn_jsp" type="submit" value="jsp submit"/>
        </form>
        <%
            String buscame = request.getParameter("nombre");
            if (buscame==null) {
                    buscame="";
                }
            buscame=buscame.toUpperCase().trim();
            buscame="%"+buscame+"%";
            List<DatosPersona> listaPer = conSQL.leerTabla(buscame);
          %>
        <table>
            <thead>
            <th>Nombre</th><th>Email</th> 
            </thead>
            <% for (DatosPersona dp : listaPer) { %>
            <tr>
                <td style="padding-right: 1em"><%=dp.getNombre() %></td><td><%=dp.getEmail() %></td>
            </tr>
            <% } %>
        </table>
    </body>
</html>
