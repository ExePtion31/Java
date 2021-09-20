package com.cmc.directorio.entidades;

public class AdminTelefono {

    public void activarMensajeria(Telefono telf) {
        if (telf.getOperadora().equals("movi")) {
            telf.setTieneWhatsapp(true);
        }
    }

    public int contarMovi(Telefono[] telefonos) {
        int contadorMovi = 0;
        for (int i = 0; i < telefonos.length; i++) {
            if (telefonos[i].getOperadora().equals("movi")) {
                contadorMovi++;
            }
        }

        return contadorMovi;
    }

    public int contarClaro(Telefono[] telefonos) {
        int contadorMovi = 0;
        for (int i = 0; i < telefonos.length; i++) {
            if (telefonos[i].getOperadora().equals("claro")) {
                contadorMovi++;
            }
        }

        return contadorMovi;
    }
}
