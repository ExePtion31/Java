package beans;

import javax.jws.*;

@WebService
public interface ServicioSumarWS {
    
    @WebMethod
    int sumar(int a, int b);
}
