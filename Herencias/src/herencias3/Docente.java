/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author Usuario
 */
public class Docente extends Persona { //extendemos los valores de la clase
    private double sueldo; // inicializacion de variable privada (solo para esta clase)
    public Docente(String n, String a, int e, double sueldo){ // funcion docente 
        super(n, a, e); // se utiliza los valores  y funciones de la otra clase (super)
        setSueldo(sueldo); //llama a obtiene el sueldo 
        
    }
    public void setSueldo(double n){ //funcion donde agrego el sueldo 
        sueldo = n ;  
        
    }
    public  double getSueldo(){ // funcion donde obtengo el sueldo
        return sueldo; 
        
    }
   
    @Override // decorador  para el sobreescribir
    public String toString(){ //sobreescibir como tal 
    
        return String.format("%s - %f", super.toString(), getSueldo()); //salida
    }
}
