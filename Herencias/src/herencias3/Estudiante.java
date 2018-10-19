/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;


/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{ //extendemos los valores de la clase 
    private double matricula;// declaracion de variables privadas
    
    public Estudiante(String n, String a, int e, double mat){ //constructor para la clase estudiante
        super(n, a, e);//uso de metodos de la clase padre
        setMatricula(mat); //metodo propio de la clase
    }
    
    @Override   //decorador para sobreescribir 
    public void setNombre(String n){ //funcion obtener nombre,que recibe un string y lo transforma en mayusculas
        nombre = n.toUpperCase();    
    }
    
    public void setMatricula(double mat){ //funcion obtener matricula, recibe un valosr double 
        matricula = mat;
    }
    
    public double getMatricula(){ // funcion que agrega matricula 
        return matricula;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override // decorador para reescribir 
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula()); // retornas la salida
    }
}
