
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public abstract class Empleado {
    
    protected String nombre;
    protected String ident;
    protected double Sbase;
    
    public Empleado(String nombre, String ident, double Sbase){
        this.nombre = nombre;
        this.ident = ident;
        this.Sbase = Sbase;
        
    }
    
    public abstract double calcSalario();
    
    
    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificador: " + ident);
        System.out.println("Salario Base: Q. " + Sbase);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getId(){
        return ident;
    }
    
    public double getSalbase(){
        return Sbase;
    }
}
