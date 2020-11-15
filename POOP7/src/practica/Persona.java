
package practica;

/**
 * Esta clase es la clase Padre, apartir de aquí generaremos las clases hijas
 * @author Colon Palacios Emmanuel y Roldán Sánchez Alexis
 */
public class Persona {
    /**
     * @param edad 
     * @param nombre
     * Son variables que heredaran cada una de las subclases
     */
    int edad;
    private String nombre;
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public Persona(){
    
        /**
         *  getEdad
         * Al ser variables enteras, es necesario para poder retornarlas al principal.
         */
    }
    public int getEdad() {
        return edad;
    }
    
    /**
     * 
     * setEdad
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
     /**
     *  getEdad
     * Al ser variables enteras, es necesario para poder retornarlas al principal.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * setEdad
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
}
