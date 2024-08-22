
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args){
        PrestaLibro libro1 = new PrestaLibro("El coach de Sillicon Valley ", "Jonathan Rosenberg y Eric Schmidt ");
        
        Scanner scanner = new Scanner(System.in);
        int elegir;
        
        do{
            System.out.println("Bienvenido a la gestion de libro elija una opcion valida para continuar: ");
            System.out.println("1. Consulta disponibilidad de libro ");
            System.out.println("2. Alquiler de libro ");
            System.out.println("3. Regresar libro ");
            System.out.println("4. Salir");
            System.out.println("A espera que seleccione una opcion correcta: ");
            elegir = scanner.nextInt();
            
            switch (elegir){
                case 1:
                    libro1.consulta();
                    break;
                case 2:
                    libro1.alquilar();
                    break;
                case 3:
                    libro1.regresar();
                    break;
                case 4:
                    System.out.println("Saliendo de la gestion de libro....");
                    break;
                default:
                    System.out.println("No es valida la eleccion, por favor seleccione una opcion valida...");
            }
        }while(elegir !=4);
        
        scanner.close();
    }
}
