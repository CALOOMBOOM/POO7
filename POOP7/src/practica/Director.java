
package practica;

/**
 * Clase subhija de persona y despues de trabajador
 *@author Colon Palacios Emmanuel y Roldán Sánchez Alexis 
 */
  class Director extends Trabajador{
    private String facultadDir;
    
    public Director(){
        
    }
    
    public Director(String nombre, int edad,int sueldo,int aniostrabajando, String facultadDir){
        super(nombre,edad,sueldo,aniostrabajando);
        this.facultadDir = facultadDir;
    }

    public String getFacultadDir() {
        return facultadDir;
    }
    /**
     * 
     * setFacultadDir
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * 
     * @param facultadDir
     */
    public void setFacultadDir(String facultadDir) {
        this.facultadDir = facultadDir;
    }
    /**
     * 
     * setCalificacionesG
     * Al ser una variable privada es necesario este metodo para pedir los datos
     * Sobrecarga
     * @param destituido
     */
        //Sobrecarga
    public void setCalificacionG(boolean destituido){
        if (destituido == false){
            facultadDir = "Ahora no es director";
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "Director{" + "facultadDir=" + facultadDir + '}';
        // Sobreescritura
    }
    
}
