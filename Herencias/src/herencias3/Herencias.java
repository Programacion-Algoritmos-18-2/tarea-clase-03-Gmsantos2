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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2); //creo el objeto e de la clase estudiante
        System.out.println(e); //presento valores resultantes de estudiante
        
        Docente d = new Docente("Luis", "Alvarez", 33, 1000); // creo objeto d de la clae docente y mando valores
        System.out.println(d);  //presento con los valores resutantes de docente
        
        Policia p = new Policia("ALEX", "MENDOZA", 33, "Cabo"); // falta implementar
        System.out.println(p); // presento valores resultantes policia
        
    }
    
}
