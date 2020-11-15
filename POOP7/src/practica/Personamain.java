
package practica;

import java.util.Scanner;
/**
 * Clase principal.
 * @author Colon Palacios Emmanuel y Roldán Sánchez Alexis
 */
public class Personamain {
    public static void main(String args[]){     
        System.out.println("Existen 3 'tipos' de perosnas que trabajan aquí");
        
        System.out.println("Trabajador- Profesor");
        Profesor prof1= new Profesor();
        prof1.setNombre("Martin Monterrosa");
        prof1.setEdad(47);
        prof1.setAniosTrabajo(15);
        prof1.setSueldo(5000);
        prof1.setMatricula(124114343);
        prof1.setMateriaImpartida("Calculo");
        System.out.println(prof1);
        
        System.out.println("Director");
        Director direc=new Director();
        direc.setAniosTrabajo(18);
        direc.setEdad(54);
        direc.setSueldo(6700);
        direc.setFacultadDir("Facultad de ingeiería");
        direc.setNombre("Augusto Silva");
        System.out.println(direc);
        
        
        System.out.println("Alumno: ");
        Alumno alumn1=new Alumno();
        alumn1.setNombre("Alexa Jimenez");
        alumn1.setEdad(19);
        alumn1.setNumeroCuenta(1234567890);
        alumn1.setMateriaFav("Calculo");
        System.out.println(alumn1);
    }
    
}
