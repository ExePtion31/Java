function validarForma(forma) {
    var usuario = forma.usuario;
    var password = forma.password;
    var tecnologias = forma.tecnologia;
    var tecnologiasSelect = false;
    var generos = forma.genero;
    var generoSelect = false;
    var ocupacion = forma.ocupacion;


    //Validación formulario
    if (usuario.value == "") {
        alert("Debe proporcionar un nombre de usuario.");
        usuario.focus();
        usuario.select();
        return false;
    }

    if (password.value == "" || password.value.length <= 3) {
        alert("Debe proporcionar una contraseña al menos de 3 carácteres.");
        password.focus();
        password.select();
        return false;
    }

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            tecnologiasSelect = true;
        }
    }

    if (!tecnologiasSelect) {
        alert("Debe seleccionar una tecnología.")
        return false;
    }

    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            generoSelect = true;
        }
    }

    if (!generoSelect) {
        alert("Debe seleccionar un genero.")
        return false;
    }
    
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupación.")
        return false;
    }
    
    //Formulario valido
    return true;
}

