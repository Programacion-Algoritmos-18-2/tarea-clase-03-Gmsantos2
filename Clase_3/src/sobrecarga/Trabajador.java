/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author reroes
 */
public class Trabajador {
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    private double[] n_suma;
    private int suma;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
     
    
    public void agregar_sueldo_semanal(double sueldo){ // recibe un valor y se va agregando en un arreglo
       for (int i = 0 ;i <= 4 ;i++ ){
         n_suma[i] = sueldo;
       }
       }
    
      public void sumar_sueldo(double[] n_suma){// este recibe un arreglo  y suma sus elementos
          for (int i = 0 ;i <= 3;i++ ){
          sueldo_mensual = sueldo_mensual + n_suma[i];
          }
    }     
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    public void agregar_sueldo_semanal(double s1, double s2, double s3,double s4){ // recibe 4 doubles y los suma 
        sueldo_mensual = s1 +s2 + s3 + s4;
    }
    
    
    public String presentar_datos(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}
