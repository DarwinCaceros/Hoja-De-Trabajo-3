
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public class EmpleadoPorHoras extends Empleado{
    private double porHora;
    private int Htrabajadas;
    
    public EmpleadoPorHoras(String nombre, String ident, double Sbase, double porHora, int Htrabajadas){
        super(nombre, ident, Sbase);
        this.porHora = porHora;
        this.Htrabajadas = Htrabajadas;
    }
    
    @Override
    public double calcSalario(){
        return Sbase + (porHora * Htrabajadas);
    }
    
    public void setHorasTrabajadas(int Htrabajadas){
        this.Htrabajadas = Htrabajadas;
    }
    
    public double getTarifaPorHora(){
        return porHora;
    }
    
    public int getHorasTrabajadas(){
        return Htrabajadas;
    }
}
