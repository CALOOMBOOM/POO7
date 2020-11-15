/**
 * @autor Alexis Roldan y Emmanuel Colón
 */
package practica;

/**
 * Clase hija de Persona
 * @author Colon Palacios Emmanuel y Roldán Sánchez Alexis
 */
public class Trabajador extends Persona{
    private int sueldo;
    private int aniosTrabajo;
    
    Trabajador(){
        
    }
    public Trabajador(String nombre, int edad, int sueldo, int aniosTrabajo){
        super(nombre,edad);
        this.aniosTrabajo = aniosTrabajo;
        this.sueldo = sueldo;
    }

    /**
    *  getSueldo
    * Al ser variables enteras, es necesario para poder retornarlas al principal.
     * @return 
    */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * setSueldo
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     *  getAniosTrabajo
     * Al ser variables enteras, es necesario para poder retornarlas al principal.
    * @return 
     */
    public int getAniosTrabajo() {
        return aniosTrabajo;
    }
    /**
     * 
     * setAniosTrabajando
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param aniosTrabajo
     */
    public void setAniosTrabajo(int aniosTrabajo) {
        this.aniosTrabajo = aniosTrabajo;
    }
    /**
     * Sobrecarga
     * @param aniosTrabajo
     * @param anualidad 
     */
    public void setCalificacionG(int aniosTrabajo, float anualidad){
        this.sueldo += (int) (sueldo * (aniosTrabajo*anualidad));
    }
    
    @Override
    public String toString() {
        return super.toString() + "Trabajador{" + "sueldo=" + sueldo + ", aniosTrabajo=" + aniosTrabajo + '}';
    }
    
    
}
