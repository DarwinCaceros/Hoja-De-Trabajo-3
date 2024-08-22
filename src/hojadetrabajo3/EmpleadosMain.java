
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public class EmpleadosMain {
    public static void main(String[] args){
        Empleado empleado1 = new EmpleadoAsalariado("Luis Pedro", "1010", 3500.00);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Jessica Paola", "2020", 5000.00, 20.00, 200);
        
        System.out.println("Esta es la informacion de el empleado asalariado: ");
        empleado1.showInfo();
        System.out.println("El salario calculado es de: " + empleado1.calcSalario());
        
        System.out.println("Esta es la informacion de el empleado por horas: ");
        empleado2.showInfo();
        System.out.println("El salario calculado es de: " + empleado2.calcSalario());
    }
}
