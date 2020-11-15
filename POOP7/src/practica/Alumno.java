package practica;


/**
 * Clase hija de Persona
 * @author Colon Palacios Emmanuel y Roldán Sánchez Alexis
 * 
 */
public class Alumno extends Persona {
    private int numeroCuenta;
    private String materiaFav;
    private int calificacionG;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, int edad, String materiaFav, int calificacionG, int numeroCuenta){
        super(nombre,edad);
        this.materiaFav = materiaFav;
        this.calificacionG = calificacionG;
        this.numeroCuenta = numeroCuenta;
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * 
     * setNumerocuenta
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     *  getMateriaFav
     * Al ser variables enteras, es necesario para poder retornarlas al principal.
    * @return 
     */
    public String getMateriaFav() {
        return materiaFav;
    }
    /**
     * 
     * setMateriaFav
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param materiaFav
     */
    public void setMateriaFav(String materiaFav) {
        this.materiaFav = materiaFav;
    }
    /**
     *  getCalificacionG
     * Al ser variables enteras, es necesario para poder retornarlas al principal.
    * @return 
     */
    public int getCalificacionG() {
        return calificacionG;
    }
/**
     * 
     * setCalificaciong
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param calificacionG
     */
    public void setCalificacionG(int calificacionG) {
        this.calificacionG = calificacionG;
    }
    /**
     * 
     * setCalificacion
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * Sobrecarga
     * @param calificacionG
     * @param extra
     */
    //Sobrecarga
    public void setCalificacionG(int calificacionG, float extra){
        this.calificacionG += (int) (calificacionG + extra);
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", materiaFav=" + materiaFav + ", calificacionG=" + calificacionG + '}';
    }
    
    
    
}
