
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
import java.util.Scanner;

public class MainInventario {
    public static void main(String[] args){
    
    Electronico producto1 = new Electronico("ROG Strix 4090", 950.00,15);
    
    Scanner scanner = new Scanner(System.in);
    int opcion;
    
    do{
        System.out.println("Bienvenido al menu de gestion de inventario");
        System.out.println("Elija una opcion valida de las que se le presenta a continuacion: ");
        System.out.println("1. Inventario Consulta");
        System.out.println("2. Agregar prodcuto al inventario");       
        System.out.println("3. Venta");
        System.out.println("4. Salir de el sistema");
        opcion = scanner.nextInt();
        
        switch (opcion){
            case 1:
                producto1.consulta();
                break;
            case 2:
                System.out.println("Ingrese la cantidad de producto que desea agregar a el inventario");
                int cantidadAgregar = scanner.nextInt();
                producto1.addCantidad(cantidadAgregar);
                break;
            case 3:
                System.out.println("Ingrese la cantidad que desea vender de producto: ");
                int cantidadVender = scanner.nextInt();
                producto1.sell(cantidadVender);
                break;
            case 4:
                System.out.println("Saliendo de el programa de venta. ");
                break;
            default:
                System.out.println("Opcion no es valida, por favor seleccionar una corrrecta para continuar: ");
                
        }
    }while (opcion !=4);
    
    scanner.close();


    }
    
    }
    

