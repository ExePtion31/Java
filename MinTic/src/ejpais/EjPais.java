package ejpais;

public class EjPais {
    public static void main(String[] args) {
        double habitA = 25;
        double habitB = 18;
        int fecha = 2022;
        
        while(habitA >= habitB){
            habitA += (habitA * 0.02); 
            habitB += (habitB * 0.03); 
            fecha++;
        }
        
        System.out.println(fecha);
    }
}
