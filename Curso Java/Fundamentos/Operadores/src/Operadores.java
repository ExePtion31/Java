public class Operadores {
    public static void main(String args[]){
        //Cambio de tipo Bool
        var a = 3;
        var b = -a;
        System.out.println("Cambio de signo");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Cambio de tipo Bool
        var c = true;
        var d = !c;
        System.out.println("Cambio de tipo");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Postincremento
        var e = 3;
        var f = e++;
        System.out.println("Postincremento");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //Preincremento
        var g = 3;
        var h = ++e;
        System.out.println("Preincremento");
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Comparar contenido String
        var cadena = "Hola";
        var cadena2 = "Adios";
        var comparacion = cadena.equals(cadena2);
        System.out.println("Comparación de cadenas");
        System.out.println("comparacion = " + comparacion);
        
        //Valor ternario
        var resultado = (3 > 2) ? "El número es mayor que 2" : "El número es menor que 2";
        System.out.println("numero = " + resultado);
        
        var numero = 7;
        var numero2 = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println("numero2 = " + numero2);
    }
}
