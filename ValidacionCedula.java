package validacioncedula;

/**
 *
 * @author bayon
 */
public class ValidacionCedula {

    /**
     * @param args the command line arguments
     */
    private String cedula;
    private String cedulaCompleta; // almacena la cedula completa despues de verificarla

    ValidacionCedula(){}

    
    ValidacionCedula(String cedula) {
        
        this.cedula = cedula;
        
    }

    public String getCedula() {

        return cedula;
    }

       public void setCedula(String cedula){
        if (cedulaCorrecta(cedula)){
            this.cedula=cedula;
        }else{
            System.out.println("Su numero de cedula no es correcta");
        }
    }
   
    private boolean cedulaCorrecta(String cedula){

        int coeficientes[] = {2,1,2,1,2,1,2,1,2};
        int ced[] = {0,0,0,0,0,0,0,0,0};
        int auxiliar = 0; 
        int acumulador = 0; 

        for (int i = 0;i < 9; ++i){
            ced[i] = Integer.valueOf(cedula.substring(i, i+1));
        }
        if (ced[0] < 0 || ced[0] > 2){
            System.out.println("Primer digito de cedula incorrecto");
            return false;
        }
        if (ced[0] == 2 && ced[1] > 4){
            System.out.println("Segundo digito de cedula incorrecto");
            return false;

        }
        if (ced[2] < 0 || ced[2] > 5){
            System.out.println("Tercer digito de cedula incorrecto");
            return false;
        }

        for (int i = 0; i < 9; i++){
            ced[i] = ced[i] * coeficientes[i];
            if(ced[i] > 10 || ced[i] == 10){
                ced[i] = ced[i] - 9;
            }
            acumulador = acumulador + ced[i];
            auxiliar = acumulador;

        }
        System.out.println();
        while(auxiliar % 10!= 0){
            auxiliar++;
        }
        auxiliar = auxiliar - acumulador;
        cedula = cedula + Integer.toString(auxiliar);
        cedulaCompleta = cedula;
        return true;

    }

    public static void main(String[] args){
        ValidacionCedula p1= new ValidacionCedula();
               
        p1.setCedula("175342514-");
        System.out.println("Su Numero De Cedula Es: "+p1.cedulaCompleta);

    }
}