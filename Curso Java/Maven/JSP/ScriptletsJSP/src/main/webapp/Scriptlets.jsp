<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scriptlets para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        <br>
        <%-- Scriptlets para manipular los objetos explicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicación: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlets para condiciones --%>
        <%
            if (session != null && session.isNew()) {
        %>
        La sesión SI es nueva.
        <%
        } else if (session != null) {
        %>
        La sesión NO es nueva.
        <%
            }
        %>
        <br><br>
        <a href="index.html">Volver</a>

    </body>
</html>
