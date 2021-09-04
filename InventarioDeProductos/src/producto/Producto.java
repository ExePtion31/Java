package producto;

public class Producto {
    private long CodigoProducto;
    private String nombre;
    private int cantidad;
    private int precio;

    public Producto() {
    }

    public Producto(long CodigoProducto, String nombre, int cantidad, int precio) {
        this.CodigoProducto = CodigoProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public long getCodigoProducto() {
        return this.CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "-----Producto-----"
                + "\nCódigo: " + this.CodigoProducto
                + "\nNombre: " + this.nombre
                + "\nCantidad: " + this.cantidad
                + "\nPrecio: $" + this.precio + "\n";
    }  
}
