/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Dinows
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1******************");
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("2*****************");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("César");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("NumEmpleado "+ gerente1.getNumEmpleado());
        System.out.println("Sueldo "+gerente1.getSueldo());
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("3*****************");
        Gerente gerente2 = new Gerente("Julio", 88, 200000, 500000);
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("NumEmpleado "+ gerente1.getNumEmpleado());
        System.out.println("Sueldo "+gerente1.getSueldo());
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("4********************");
        //Sobrescritura
        System.out.println(gerente2);
        
        System.out.println("5********************");
        //Sobrecarga
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());

    }
    
}
