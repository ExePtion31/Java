package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {

    private static final String FORMATO_FECHA = "dd-MM-yyyy";

    public static String fecha(Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }

    public static String fecha(String fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
