<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenación: <%= "Saludos" + " JSP" %>
        <br>
        Operación matemática: <%= 2 * 3 / 2 %>
        <br>
        ID de la sesión: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
