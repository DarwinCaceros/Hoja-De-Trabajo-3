
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public class EmpleadoAsalariado extends Empleado{
    
    public EmpleadoAsalariado(String nombre, String ident, double Sbase){
        super(nombre, ident, Sbase);
        
    }
    
    @Override
    public double calcSalario(){
        return Sbase;
    }
}
