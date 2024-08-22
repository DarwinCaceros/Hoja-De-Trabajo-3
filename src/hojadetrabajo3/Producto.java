
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public abstract class Producto {
    
    protected String nombre;
    protected double precio;
    protected int cantidad;
    
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public abstract void addCantidad(int cantidad);
    public abstract void sell(int cantidad);
    
    public void consulta(){
        System.out.println("Nombre de el producto: " + nombre);
        System.out.println("Disponibilidad de: " + cantidad + " de el prodcuto.");
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
       return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
}
