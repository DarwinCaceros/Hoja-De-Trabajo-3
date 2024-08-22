
package hojadetrabajo3;

/**
 *
 * @author Gio
 */
public class PrestaLibro {
    
    private String titulo;
    private String autor;
    private boolean dispo;
    
    //creamos el constructor para libro
    public PrestaLibro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.dispo = true;
        
    }
    
    //para prestar libro
    public void alquilar(){
        if (dispo){
            dispo = false;
            System.out.println("El libro de nombre " + titulo + "ha sido alquilado con exito. ");
        }else{
            System.out.println("El libro de nombre " + titulo + "no esta en disponibilidad de ser alquilado. ");
            
        }
    }
    
    public void regresar(){
        if (!dispo){
            dispo = true;
            System.out.println("El libro " + titulo + "a regresado con exito ahora esta disponible nuevamente.");
        }else{
            System.out.println("El libro " + titulo + "estaba ya disponible para se alquilado. ");
        }
    }
    
    public void consulta(){
        if (dispo){
            System.out.println("El libro " + titulo + "esta disponible. ");
        }else{
            System.out.println("El libro " + titulo + "no esta disponible. ");
        }
    }
    
    //getters para titulo y autor
    public String getNombre(){
        return titulo;
    }
    
    public String getEscritor(){
        return autor;
    }
}
