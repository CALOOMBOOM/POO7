
package practica;

import practica.Trabajador;
/**
 * Clase subhija de persona y trabajadador
 * @author Colon Palacios Emmanuel y Roldán Sánchez Alexis
 */
public class Profesor extends Trabajador{
    private int matricula;
    private String materiaImpartida;
    
    Profesor(){
        
    }
    
    public Profesor(String nombre, int edad, int sueldo, int aniostrabajando, int matricula, String materiaImpartida){
        super(nombre,edad,sueldo,aniostrabajando);
        this.matricula = matricula;
        this.materiaImpartida = materiaImpartida;
    }
    /**
    *  getMatricula
    * Al ser variables enteras, es necesario para poder retornarlas al principal.
     * @return 
    */
    public int getMatricula() {
        return matricula;
    }
    /**
     * 
     * setMatriculas
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    /**
    *  getMateriaImpartida
    * Al ser variables enteras, es necesario para poder retornarlas al principal.
     * @return 
    */
    public String getMateriaImpartida() {
        return materiaImpartida;
    }
    /**
     * 
     * setMateriaimpartida
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param materiaImpartida
     */
    public void setMateriaImpartida(String materiaImpartida) {
        this.materiaImpartida = materiaImpartida;
    }

    /**
     * 
     * setAniosTrabajando
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param cambio
     */
    public void setCalificacionG(String cambio){
        materiaImpartida = cambio;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "matricula=" + matricula + ", materiaImpartida=" + materiaImpartida + '}';
        //Sobrescritura
    }
    
    
}
