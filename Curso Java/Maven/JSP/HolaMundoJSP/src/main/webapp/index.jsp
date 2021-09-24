<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
    </head>
    <body>
        <h1>HolaMundo JSP</h1>
        <ul>
            <li> <%out.print("Prueba en JSP");%> </li>
            <li> ${"Care nalga"} </li>  
            <li> <%= "Otro print" %> </li>
            <li> <c:out value="Usando JSTL"/></li>
        </ul>
    </body>
</html>
