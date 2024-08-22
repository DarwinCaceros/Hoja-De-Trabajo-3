
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
import java.util.Scanner;
public class DiferenciaEdad {

    
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        //se imprime en pantalla la bienvenida y solicitud de los datos al usuario
        System.out.println("Bienvenido al programa de calculo de edades:");
        
        //asignacion de variables a los daton ingresados
        System.out.println("Ingrese el anio de nacimiento de la persona numero uno: ");
        int persona1 = scanner.nextInt();
        
        System.out.println("Ingrese el anio de nacimiento de la persona numero dos: ");
        int persona2 = scanner.nextInt();
        
        //calculo de la diferencia
        int diferencia = Math.abs(persona1 - persona2);
        
        //proceso para determinar quien es mayo
        
        if (persona1 < persona2){
            System.out.println("La persona numero uno es mayor por la diferencia de edad de "+ diferencia + " anios.");
                    
        } else if(persona2 < persona1){
            System.out.println("La persona numero dos es mayor por la diferencia de edad de "+ diferencia + " anios.");
            
        } else {
                 System.out.println("Segun los anios ingresados las personas tienen la misma edad.");
           }      
        
        
    }
    
}
