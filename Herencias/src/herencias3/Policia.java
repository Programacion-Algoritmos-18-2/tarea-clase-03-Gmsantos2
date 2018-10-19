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
public class Policia extends Persona {
    private String rango;
    public Policia(String n, String a, int e,  String rango){ 
        super(n, a, e);// se utiliza los valores  y funciones de la otra clase (super)
        setRango(rango);// llama a obtener rango
    }
    public void setRango(String r){ //agregar rango 
        rango = r  ;  
        
    }
    public String getRango(){//obtener rango 
        return rango; 
        
    }
    
    @Override //decorador
    public String toString(){ // metodo sobreescribir
    
        return String.format("%s - %s", super.toString(), getRango());
    }
}
