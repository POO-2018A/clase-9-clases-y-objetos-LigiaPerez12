package clasearchivo;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author bayon
 */

public class ClaseArchivo {
    
    private String nombre;
    private String tipo;
    private Date fechaDeCreacion;
    private String contenido;
    
    public ClaseArchivo(String nombre, int año, int mes, int dia ){
        this.nombre = nombre;
        GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
        fechaDeCreacion = calendario.getTime();
    }
        
    public ClaseArchivo(String nombre, String tipo, int año, int mes, int dia ){
        this.nombre = nombre;
        this.tipo = tipo;
        GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
        fechaDeCreacion = calendario.getTime();
    }
    
    public ClaseArchivo(String nombre, String tipo, String contenido, int año, int mes, int dia ){
        this.nombre = nombre;
        this.tipo = tipo;
        this.contenido = contenido;
        GregorianCalendar calendario = new GregorianCalendar (año, mes-1, dia);
        fechaDeCreacion = calendario.getTime();
    }
    
    public String getNombre(){
        return "Nombre: " + nombre;
    }
    public String getTipo(){
        return "Tipo: " + tipo;
    }
    public String getFechaDeCreacion(){
        return "Fecha de Creacion: " + fechaDeCreacion;
        
    }
    
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public String getContenido(){
        return "Contenido: " + contenido;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseArchivo objeto1 = new ClaseArchivo ("Administracion", 2018,05,06);
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaDeCreacion());
        
        ClaseArchivo objeto2 = new ClaseArchivo ("Esfot", 2018,04,30);
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getTipo());
        System.out.println(objeto2.getFechaDeCreacion());
        
        ClaseArchivo objeto3 = new ClaseArchivo ("Cosas", 2018,04,29);
        System.out.println("Objeto1");
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaDeCreacion());
        
        
    }
    
}
