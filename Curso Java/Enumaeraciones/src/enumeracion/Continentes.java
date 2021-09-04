package enumeracion;

public enum Continentes {
    AFRICA(53, "1.2Millones"),
    EUROPA(46, "1.3Millones"),
    ASIA(44, "1.0Millones"),
    AMERICA(34, "1.6Millones"),
    OSEANIA(14, "1.3Millones");
    
    private final int paises;
    private final String poblacion;
    
    Continentes(int paises, String poblacion){
        this.paises = paises;
        this.poblacion = poblacion;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getPoblacion(){
        return this.poblacion;
    }
}
