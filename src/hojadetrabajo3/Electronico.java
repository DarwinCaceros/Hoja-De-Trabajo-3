
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
    public class Electronico extends Producto{
    
    public Electronico(String nombre, double precio, int cantidad){
        super(nombre, precio, cantidad);
        
    }
    //metood abstracto para agregar la cantidad al inventario
    @Override
    public void addCantidad(int cantidad){
        this.cantidad += cantidad;
        System.out.println("Se ha agredado " + cantidad + "de unidades a el inventario");
    }
    //metodo abstracto para la venta
    @Override
    public void sell(int cantidad){
        if (this.cantidad >= cantidad){
            this.cantidad -= cantidad;
            System.out.println("Se han vendido " + cantidad + "unidades de el producto " + nombre + ".");
        }else{
            System.out.println("No se puede hacer esta venta, la cantidad solicitada no esta disponible en el inventario: " + this.cantidad);
        }
    }
}

