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
public class Persona {
    //declaro las variables a a utilizar para la clase
    protected String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String n, String a,  int e){ // llamo al obtejo persona y  obtengo  nombre,apellido y edad
        setNombre(n);
        setApellido(a);
        setEdad(e);
    }
    //FUNCIONES  DONDE SE OBTIENEN LOS  DATOS Y SE AGREGAN A LA VARIABLE CORRESPONDIENTE
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setApellido(String n){
        apellido = n;
    }
    
    public void setEdad(int n){
        edad = n;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    @Override //decorador reescribir 
    public String toString(){ //metodo para retornar un valor string (tostring es la funcion padre)
        return String.format("Nombre: %s - Apellido %s - Edad %d", 
                getNombre(), getApellido(), getEdad());
    }
    
    
}
