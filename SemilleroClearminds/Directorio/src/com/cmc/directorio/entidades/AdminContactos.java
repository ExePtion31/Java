package com.cmc.directorio.entidades;

public class AdminContactos {

    public Contacto buscarMasPesado(Contacto[] contactos) {
        if (contactos[0].getPeso() > contactos[1].getPeso()) {
            return contactos[0];
        }
        return contactos[1];
    }

    public boolean compararOperadoras(Contacto[] contactos) {
        if (contactos[0].getTelefono().getOperadora().equals(contactos[1].getTelefono().getOperadora()) ) {
            return true;
        }
        return false;
    }
    
    public void ActivarUsuario(Contacto contacto){
        if(contacto.getTelefono().isTieneWhatsapp()){
            contacto.setActivo(true);
        }
    }
}
