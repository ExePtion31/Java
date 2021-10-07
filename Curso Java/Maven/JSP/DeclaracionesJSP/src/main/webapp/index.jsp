<%-- Agregamos una declaración de JSP --%>
<%!
    //Declaramos una variable con su metodo get
    private String usuario = "Giovanni";

    public String getUsuario() {
        return this.usuario;
    }

    //Declaramos contador de visitas
    private int contadorVisitas = 1;
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones JSP</h1>
        Nombre de la persona por medio del atributo: <%= this.usuario%>
        <br>
        Nombre de la persona por medio del método: <%= this.getUsuario()%>
        <br>
        Contador visitas: <%= this.contadorVisitas++%>
    </body>
</html>
